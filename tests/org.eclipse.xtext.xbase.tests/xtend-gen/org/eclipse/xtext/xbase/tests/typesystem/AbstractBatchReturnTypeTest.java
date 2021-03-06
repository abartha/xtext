/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.tests.typesystem;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.tests.typesystem.AbstractReturnTypeTest;
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.FunctionTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.ParameterizedTypeReference;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow
 */
@SuppressWarnings("all")
public abstract class AbstractBatchReturnTypeTest extends AbstractReturnTypeTest<LightweightTypeReference> {
  public LightweightTypeReference resolvesTo(final String expression, final String type) {
    try {
      final String replacedExpressionText = expression.replace("$$", "org::eclipse::xtext::xbase::lib::");
      final XExpression xExpression = this.expression(replacedExpressionText, false);
      Resource _eResource = xExpression.eResource();
      EList<Diagnostic> _errors = _eResource.getErrors();
      String _string = _errors.toString();
      Resource _eResource_1 = xExpression.eResource();
      EList<Diagnostic> _errors_1 = _eResource_1.getErrors();
      boolean _isEmpty = _errors_1.isEmpty();
      Assert.assertTrue(_string, _isEmpty);
      Resource _eResource_2 = xExpression.eResource();
      EList<Diagnostic> _warnings = _eResource_2.getWarnings();
      String _string_1 = _warnings.toString();
      Resource _eResource_3 = xExpression.eResource();
      EList<Diagnostic> _warnings_1 = _eResource_3.getWarnings();
      boolean _isEmpty_1 = _warnings_1.isEmpty();
      Assert.assertTrue(_string_1, _isEmpty_1);
      IBatchTypeResolver _typeResolver = this.getTypeResolver();
      final IResolvedTypes resolvedTypes = _typeResolver.resolveTypes(xExpression);
      final LightweightTypeReference resolvedType = resolvedTypes.getReturnType(xExpression);
      String _simpleName = resolvedType.getSimpleName();
      Assert.assertEquals(replacedExpressionText, type, _simpleName);
      Resource _eResource_4 = xExpression.eResource();
      Iterable<Diagnostic> _linkingAndSyntaxErrors = this.getLinkingAndSyntaxErrors(_eResource_4);
      String _string_2 = _linkingAndSyntaxErrors.toString();
      Resource _eResource_5 = xExpression.eResource();
      Iterable<Diagnostic> _linkingAndSyntaxErrors_1 = this.getLinkingAndSyntaxErrors(_eResource_5);
      boolean _isEmpty_2 = IterableExtensions.isEmpty(_linkingAndSyntaxErrors_1);
      Assert.assertTrue(_string_2, _isEmpty_2);
      Resource _eResource_6 = xExpression.eResource();
      EList<Diagnostic> _warnings_2 = _eResource_6.getWarnings();
      String _string_3 = _warnings_2.toString();
      Resource _eResource_7 = xExpression.eResource();
      EList<Diagnostic> _warnings_3 = _eResource_7.getWarnings();
      boolean _isEmpty_3 = _warnings_3.isEmpty();
      Assert.assertTrue(_string_3, _isEmpty_3);
      return resolvedType;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doResolvesTo(final String expression, final String type) {
    try {
      final XExpression parsedExpression = this.expression(expression, false);
      IBatchTypeResolver _typeResolver = this.getTypeResolver();
      final IResolvedTypes resolvedTypes = _typeResolver.resolveTypes(parsedExpression);
      final LightweightTypeReference resolvedType = resolvedTypes.getReturnType(parsedExpression);
      String _simpleName = resolvedType.getSimpleName();
      Assert.assertEquals(expression, type, _simpleName);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean hasReturnExpression(final XExpression expression) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (expression instanceof XReturnExpression) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (expression instanceof XThrowExpression) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (expression instanceof XClosure) {
        _matched=true;
        _switchResult = false;
      }
    }
    if (!_matched) {
      EList<EObject> _eContents = expression.eContents();
      final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject content) {
          boolean _switchResult = false;
          boolean _matched = false;
          if (!_matched) {
            if (content instanceof XExpression) {
              _matched=true;
              boolean _hasReturnExpression = AbstractBatchReturnTypeTest.this.hasReturnExpression(((XExpression)content));
              _switchResult = _hasReturnExpression;
            }
          }
          if (!_matched) {
            _switchResult = false;
          }
          return Boolean.valueOf(_switchResult);
        }
      };
      boolean _exists = IterableExtensions.<EObject>exists(_eContents, _function);
      _switchResult = _exists;
    }
    return _switchResult;
  }
  
  public void isFunctionAndEquivalentTo(final LightweightTypeReference reference, final String type) {
    Assert.assertTrue((reference instanceof FunctionTypeReference));
    String _equivalent = this.getEquivalent(((FunctionTypeReference) reference));
    Assert.assertEquals(type, _equivalent);
  }
  
  public String getEquivalent(final ParameterizedTypeReference type) {
    StringConcatenation _builder = new StringConcatenation();
    JvmType _type = type.getType();
    String _simpleName = _type.getSimpleName();
    _builder.append(_simpleName, "");
    List<LightweightTypeReference> _typeArguments = type.getTypeArguments();
    final Function1<LightweightTypeReference,String> _function = new Function1<LightweightTypeReference,String>() {
      public String apply(final LightweightTypeReference it) {
        String _simpleName = it.getSimpleName();
        return _simpleName;
      }
    };
    String _join = IterableExtensions.<LightweightTypeReference>join(_typeArguments, "<", ", ", ">", _function);
    _builder.append(_join, "");
    return _builder.toString();
  }
  
  public void assertExpressionTypeIsResolved(final XExpression expression, final IResolvedTypes types) {
    final LightweightTypeReference type = types.getActualType(expression);
    String _string = expression.toString();
    String _plus = ("Type is not resolved. Expression: " + _string);
    Assert.assertNotNull(_plus, type);
    String _string_1 = expression.toString();
    String _plus_1 = (_string_1 + " / ");
    String _plus_2 = (_plus_1 + type);
    String _identifier = type.getIdentifier();
    Assert.assertNotNull(_plus_2, _identifier);
  }
  
  public void assertIdentifiableTypeIsResolved(final JvmIdentifiableElement identifiable, final IResolvedTypes types) {
    final LightweightTypeReference type = types.getActualType(identifiable);
    String _string = identifiable.toString();
    Assert.assertNotNull(_string, type);
    String _string_1 = identifiable.toString();
    String _plus = (_string_1 + " / ");
    String _plus_1 = (_plus + type);
    String _identifier = type.getIdentifier();
    Assert.assertNotNull(_plus_1, _identifier);
  }
  
  public abstract IBatchTypeResolver getTypeResolver();
  
  @Test
  public void testNull() throws Exception {
    IBatchTypeResolver _typeResolver = this.getTypeResolver();
    final IResolvedTypes typeResolution = _typeResolver.resolveTypes(null);
    Assert.assertNotNull(typeResolution);
    Assert.assertEquals(IResolvedTypes.NULL, typeResolution);
  }
  
  @Test
  public void testProxy() throws Exception {
    final XFeatureCall proxy = XbaseFactory.eINSTANCE.createXFeatureCall();
    URI _createURI = URI.createURI("path#fragment");
    ((InternalEObject) proxy).eSetProxyURI(_createURI);
    IBatchTypeResolver _typeResolver = this.getTypeResolver();
    final IResolvedTypes typeResolution = _typeResolver.resolveTypes(proxy);
    Assert.assertNotNull(typeResolution);
    Assert.assertEquals(IResolvedTypes.NULL, typeResolution);
  }
}
