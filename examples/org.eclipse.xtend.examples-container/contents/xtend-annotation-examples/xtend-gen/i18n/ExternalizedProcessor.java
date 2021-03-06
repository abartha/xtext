package i18n;

import com.google.common.base.Objects;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.eclipse.xtend.lib.macro.AbstractClassProcessor;
import org.eclipse.xtend.lib.macro.CodeGenerationContext;
import org.eclipse.xtend.lib.macro.CodeGenerationParticipant;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.CompilationStrategy;
import org.eclipse.xtend.lib.macro.declaration.CompilationStrategy.CompilationContext;
import org.eclipse.xtend.lib.macro.declaration.CompilationUnit;
import org.eclipse.xtend.lib.macro.declaration.FieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableParameterDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeReference;
import org.eclipse.xtend.lib.macro.expression.Expression;
import org.eclipse.xtend.lib.macro.file.Path;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class ExternalizedProcessor extends AbstractClassProcessor implements CodeGenerationParticipant<ClassDeclaration> {
  public void doTransform(final MutableClassDeclaration annotatedClass, @Extension final TransformationContext context) {
    Iterable<? extends MutableFieldDeclaration> _declaredFields = annotatedClass.getDeclaredFields();
    for (final MutableFieldDeclaration field : _declaredFields) {
      {
        final String initializer = this.getInitializerAsString(field);
        MessageFormat _xtrycatchfinallyexpression = null;
        try {
          MessageFormat _messageFormat = new MessageFormat(initializer);
          _xtrycatchfinallyexpression = _messageFormat;
        } catch (final Throwable _t) {
          if (_t instanceof IllegalArgumentException) {
            final IllegalArgumentException e = (IllegalArgumentException)_t;
            MessageFormat _xblockexpression = null;
            {
              Expression _initializer = field.getInitializer();
              String _message = e.getMessage();
              String _plus = ("invalid format : " + _message);
              context.addError(_initializer, _plus);
              MessageFormat _messageFormat_1 = new MessageFormat("");
              _xblockexpression = (_messageFormat_1);
            }
            _xtrycatchfinallyexpression = _xblockexpression;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        final MessageFormat msgFormat = _xtrycatchfinallyexpression;
        final Format[] formats = msgFormat.getFormatsByArgumentIndex();
        Format[] _formats = msgFormat.getFormats();
        int _length = _formats.length;
        int _length_1 = formats.length;
        boolean _notEquals = (_length != _length_1);
        if (_notEquals) {
          Expression _initializer = field.getInitializer();
          context.addWarning(_initializer, "Unused placeholders. They should start at index 0.");
        }
        String _simpleName = field.getSimpleName();
        final Procedure1<MutableMethodDeclaration> _function = new Procedure1<MutableMethodDeclaration>() {
          public void apply(final MutableMethodDeclaration it) {
            final Procedure2<Format,Integer> _function = new Procedure2<Format,Integer>() {
              public void apply(final Format format, final Integer idx) {
                TypeReference _switchResult = null;
                boolean _matched = false;
                if (!_matched) {
                  if (format instanceof NumberFormat) {
                    _matched=true;
                    TypeReference _primitiveInt = context.getPrimitiveInt();
                    _switchResult = _primitiveInt;
                  }
                }
                if (!_matched) {
                  if (format instanceof DateFormat) {
                    _matched=true;
                    TypeReference _newTypeReference = context.newTypeReference(Date.class);
                    _switchResult = _newTypeReference;
                  }
                }
                if (!_matched) {
                  TypeReference _string = context.getString();
                  _switchResult = _string;
                }
                it.addParameter(("arg" + idx), _switchResult);
              }
            };
            IterableExtensions.<Format>forEach(((Iterable<Format>)Conversions.doWrapArray(formats)), _function);
            TypeReference _string = context.getString();
            it.setReturnType(_string);
            it.setDocComment(initializer);
            it.setStatic(true);
            final List<MutableParameterDeclaration> params = it.getParameters();
            final CompilationStrategy _function_1 = new CompilationStrategy() {
              public CharSequence compile(final CompilationContext it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("String msg = RESOURCE_BUNDLE.getString(\"");
                String _simpleName = field.getSimpleName();
                _builder.append(_simpleName, "\t");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
                {
                  int _length = formats.length;
                  boolean _greaterThan = (_length > 0);
                  if (_greaterThan) {
                    _builder.append("\t");
                    _builder.append("msg = ");
                    TypeReference _newTypeReference = context.newTypeReference(MessageFormat.class);
                    String _javaCode = it.toJavaCode(_newTypeReference);
                    _builder.append(_javaCode, "\t");
                    _builder.append(".format(msg,");
                    final Function1<MutableParameterDeclaration,String> _function = new Function1<MutableParameterDeclaration,String>() {
                      public String apply(final MutableParameterDeclaration it) {
                        String _simpleName = it.getSimpleName();
                        return _simpleName;
                      }
                    };
                    List<String> _map = ListExtensions.<MutableParameterDeclaration, String>map(params, _function);
                    String _join = IterableExtensions.join(_map, ",");
                    _builder.append(_join, "\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("return msg;");
                _builder.newLine();
                _builder.append("} catch (");
                TypeReference _newTypeReference_1 = context.newTypeReference(MissingResourceException.class);
                String _javaCode_1 = it.toJavaCode(_newTypeReference_1);
                _builder.append(_javaCode_1, "");
                _builder.append(" e) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("// TODO error logging");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("return \"");
                _builder.append(initializer, "\t");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                return _builder;
              }
            };
            it.setBody(_function_1);
          }
        };
        annotatedClass.addMethod(_simpleName, _function);
      }
    }
    Iterable<? extends MutableFieldDeclaration> _declaredFields_1 = annotatedClass.getDeclaredFields();
    final Procedure1<MutableFieldDeclaration> _function = new Procedure1<MutableFieldDeclaration>() {
      public void apply(final MutableFieldDeclaration it) {
        it.remove();
      }
    };
    IterableExtensions.forEach(_declaredFields_1, _function);
    final Procedure1<MutableFieldDeclaration> _function_1 = new Procedure1<MutableFieldDeclaration>() {
      public void apply(final MutableFieldDeclaration it) {
        it.setStatic(true);
        it.setFinal(true);
        TypeReference _newTypeReference = context.newTypeReference(ResourceBundle.class);
        it.setType(_newTypeReference);
        final CompilationStrategy _function = new CompilationStrategy() {
          public CharSequence compile(final CompilationContext it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("ResourceBundle.getBundle(\"");
            String _qualifiedName = annotatedClass.getQualifiedName();
            _builder.append(_qualifiedName, "");
            _builder.append("\")");
            return _builder;
          }
        };
        it.setInitializer(_function);
      }
    };
    annotatedClass.addField("RESOURCE_BUNDLE", _function_1);
  }
  
  public void doGenerateCode(final List<? extends ClassDeclaration> annotatedSourceElements, @Extension final CodeGenerationContext context) {
    for (final ClassDeclaration clazz : annotatedSourceElements) {
      {
        CompilationUnit _compilationUnit = clazz.getCompilationUnit();
        final Path filePath = _compilationUnit.getFilePath();
        Path _targetFolder = context.getTargetFolder(filePath);
        String _qualifiedName = clazz.getQualifiedName();
        String _replace = _qualifiedName.replace(".", "/");
        String _plus = (_replace + ".properties");
        final Path file = _targetFolder.append(_plus);
        StringConcatenation _builder = new StringConcatenation();
        {
          Iterable<? extends FieldDeclaration> _declaredFields = clazz.getDeclaredFields();
          for(final FieldDeclaration field : _declaredFields) {
            String _simpleName = field.getSimpleName();
            _builder.append(_simpleName, "");
            _builder.append(" = ");
            String _initializerAsString = this.getInitializerAsString(field);
            _builder.append(_initializerAsString, "");
            _builder.newLineIfNotEmpty();
          }
        }
        context.setContents(file, _builder);
      }
    }
  }
  
  public String getInitializerAsString(final FieldDeclaration f) {
    Expression _initializer = f.getInitializer();
    String _string = null;
    if (_initializer!=null) {
      _string=_initializer.toString();
    }
    final String string = _string;
    boolean _equals = Objects.equal(string, null);
    if (_equals) {
      return "empty string";
    }
    int _length = string.length();
    int _minus = (_length - 1);
    return string.substring(1, _minus);
  }
}
