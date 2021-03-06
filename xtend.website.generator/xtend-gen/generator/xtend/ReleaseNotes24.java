package generator.xtend;

import generator.xtend.AbstractXtendWebsite;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ReleaseNotes24 extends AbstractXtendWebsite {
  public String path() {
    return "releasenotes_2_4.html";
  }
  
  protected boolean isPrettyPrint() {
    return true;
  }
  
  public CharSequence contents() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    CharSequence _headline = this.headline("Release Notes - Version 2.4.2 (June 2013)");
    _builder.append(_headline, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div id=\"page\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<div class=\"inner\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"container clearfix\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<h2>Xtend 2.4.2 Release Notes (June 26th, 2013)</h2>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<hr>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"span1\">&nbsp;</div>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<div class=\"span9\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("The team is proud to present a release with ");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("more than <a href=\"https://bugs.eclipse.org/bugs/buglist.cgi?o5=anywordssubstr&f1=OP&f0=OP&resolution=FIXED&classification=Modeling&classification=Tools&f4=CP&v5=kepler&query_format=advanced&j1=OR&f3=CP&bug_status=RESOLVED&bug_status=VERIFIED&f5=flagtypes.name&component=Backlog&component=Common&component=Core&component=Releng&component=Website&component=Xtext&component=Xtext%20Backlog&product=TMF&product=Xtend&list_id=4768360\">450 bug fixes</a> and features.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<h2>Table of contents</h2>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<li><a href=\"#android_development\">Android Support</a>");
    _builder.newLine();
    _builder.append("          \t");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("          \t\t");
    _builder.append("<li><a href=\"#android_debugging\">Debugging</a>");
    _builder.newLine();
    _builder.append("          \t\t");
    _builder.append("<li><a href=\"#android_maven\">Maven Archetype</a>");
    _builder.newLine();
    _builder.append("          \t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<li><a href=\"#new_language_features\">New Language Features</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#streamlined\">Streamlined Syntax Changes</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#active_annotations\">Active Annotations</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#collection_literals\">Collection Literals and Array Access</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#extension_values\">Extension Values</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#interfaces_enums_annotations\">Interfaces, Enumerations and Annotations</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#sam_types\">SAM Type Conversion</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#new_operators\">New Operators</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<li><a href=\"#new_ide_features\">New Editor Features</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#organize_imports\">Organize Imports</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#extract_method\">Extract Method and Extract Local Variable</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#suppression_followup\">Supression of Follow-Up Errors</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#optional_errors\">Optional Errors and Warnings</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#quickfixes\">New Quickfixes</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#content_assist\">Improved Content Assist</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#formatter\">Code Formatter</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#javadoc\">JavaDoc</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<li><a href=\"#copy_qualifiedname\">Copy Qualified Name</a>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<section id=\"android_development\" style=\"padding-top: 68px; margin-top: -68px;\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<h2>Android Support</h2>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<p>Xtend is a great choice for Android application development because it compiles to Java source code ");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("and doesn\'t require a fat runtime library. With version 2.4 the Android support has been ");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("further improved.");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<h3 id=\"android_debugging\">Debugging</h3>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Debugging Android applications works now. Previously Xtend supported debugging through JSR-45 only, which is not supported by the ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Dalvik VM. Now you can configure the compiler to install the debug information in a Dalvik-compatible manner.");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<h3 id=\"android_maven\">Maven Archetype</h3>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("There is also a Maven archetype to set up a working Android project easily. If you ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("have installed Maven and the Android SDK you only need the following command to ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("get started:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint linenums\">");
    _builder.newLine();
    _builder.append("mvn archetype:generate -DarchetypeGroupId=org.eclipse.xtend \\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("-DarchetypeArtifactId=xtend-android-archetype \\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("-DarchetypeCatalog=http://repo.maven.apache.org/maven2");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</section>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<section id=\"new_language_features\" style=\"padding-top: 68px; margin-top: -68px;\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<h2>New Language Features</h2>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("The following new features have been added to the Xtend language.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<h3 id=\"streamlined\" >Streamlined Java syntax</h3>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("In 2.4.2 we have introduced new (more Java-like) ways to access nested classes and static members. Also ");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("type literals can be written by just using the class name.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("Here is an example for a static access of the generated methods in Android\'s ubiquitous R class:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("R.id.edit_message ");
    _builder.newLine();
    _builder.append("// previously it was (still supported) :");
    _builder.newLine();
    _builder.append("R$id::edit_message");
    _builder.newLine();
    _builder.append("</pre> ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("Type literals can now be written even shorter. Let\'s say you want to filter a list by type:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("myList.filter(MyType) ");
    _builder.newLine();
    _builder.append("// where previously you had to write (still supported) :");
    _builder.newLine();
    _builder.append("myList.filter(typeof(MyType)");
    _builder.newLine();
    _builder.append("</pre> ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("If you use the Java syntax (e.g. <i>MyType.class</i>), you\'ll get an error marker pointing you to the right syntax.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<h3 id=\"active_annotations\" >Active Annotations (Provisional API)</h3>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<em>Active Annotations</em> let developers particpate in the translation process");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("from Xtend code to Java source code. The developer declares an annotation and a call back for the compiler where ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("the generated Java code can be customized arbitrarily. This doesn\'t break static typing ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("or the IDE! Any changes made in an active annotation are completely reflected by the environment.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("A simple example would be a JavaBeans ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("property supporting the Observer pattern. Here you need a getter and a ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("setter method for each field and also an observer list and the proper code to notify ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("them about changes. In many software systems you have hundreds of these properties. ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Active Annotation allow you to define and automate the implementation of such patterns ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("and idioms at a single point and ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("let the compiler expand it on the fly. And all this based on lightweight, custom libraries. ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("You do no longer have to write nor ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("read the boiler plate code anymore. <a href=\"documentation.html#activeAnnotations\">Read more...</a>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<h3 id=\"collection_literals\">Collection Literals and Arrays</h3>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Xtend now has literals for unmodifiable collections.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("val listOfWords = #[\"Hello\", \"Xtend\"]");
    _builder.newLine();
    _builder.append("val setOfWords  = #{\"Hello\", \"Xtend\"}");
    _builder.newLine();
    _builder.append("val mapOfWords  = #{1->\"Hello\", 2->\"Xtend\"}");
    _builder.newLine();
    _builder.append("</pre> ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Collections created with a literal are immutable. The list literal can be used to natively create arrays, too. ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("If the target type is an array, it will compile to an array initializer.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("val String[] arrayOfWords = #[\"Hello\", \"Xtend\"]");
    _builder.newLine();
    _builder.append("</pre> ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("In addition to literals for arrays you can now also easily access and modify arrays ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("as well as create empty arrays of any size.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("val String[] arrayOfWords = newArrayOfSize(2)");
    _builder.newLine();
    _builder.append("arrayOfWords.set(0, \'Hello\')");
    _builder.newLine();
    _builder.append("arrayOfWords.set(1, \'Xtend\')");
    _builder.newLine();
    _builder.append("</pre> ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<h3 id=\"interfaces_enums_annotations\">Interfaces, Enums and Annotations</h3>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Interfaces, enumerations and annotation types can now be declared directly in Xtend. ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("interface Container<T> {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def T findChild((T)=>boolean matcher)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("enum Color {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("RED, GREEN, BLUE");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Retention(RetentionPolicy::RUNTIME)");
    _builder.newLine();
    _builder.append("@Target(ElementType::TYPE)");
    _builder.newLine();
    _builder.append("annotation DependsOn {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Class&lt;? extends Target&gt; value");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("val version = \"2.4.0\" // type \'String\' inferred ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<h3 id=\"extension_provider\">Extension Provider</h3>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Extension methods allow to add new methods to existing types without modifying them. ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Consider the omnipresent class <code class=\"prettyprint lang-java\">java.lang.String</code>.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("If you have to parse a string to a number, you could always write");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-java linenums\">");
    _builder.newLine();
    _builder.append("Integer::parseInt(\'42\')");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>but what you actually think of is</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("\'42\'.parseInt");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>To make that possible, you simply import the class <code class=\"prettyprint lang-java\">Integer</code> as a static extension:</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("import static extension java.lang.Integer.*");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>This enables to pass the base of the number as an argument, too:</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("\'2A\'.parseInt(16)");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Extension methods are available in other language such as C# as well, but Xtend can do better.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("The new <em>Extensions Providers</em> render a former limitiation obsolete: In Xtend 2.4, fields, ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("parameters and local variables can provide extensions, too. <a href=\"documentation.html#Extension_Provider\">Read more...</a>");
    _builder.newLine();
    _builder.append("<br><br>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<h3 id=\"sam_types\">SAM Type Conversion</h3>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Lambda expressions now work with interfaces and classes with a single abstract method ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("(SAM types). For example, the <code class=\"prettyprint lang-java\">AbstractIterator</code> ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("from the Guava library has a single abstract method ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<code class=\"prettyprint lang-java\">computeNext()</code>. A lambda can be used to implement that:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("val AbstractIterator&lt;Double&gt; infiniteRandomNumbers = [| Math::random]");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<h3 id=\"new_operators\">New Operators</h3>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Some new operators have been added. In addition to the usual <code>==</code> and <code>!=</code>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("operators which map to <code>Object.equals(Object)</code>, the operators <code>===</code> and");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<code>!==</code> respectively can be used to test for identity equality.");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("if (myObject === otherObject) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("println(\"same objects\")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Also new exclusive range operators have been introduced. In order to iterate over a list and");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("work with the index you can write:</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("for (idx : 0 ..&lt; list.size) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("println(\"(\"+idx+\") \"+list.get(idx))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Or if you want to iterate backwards :</p>");
    _builder.newLine();
    _builder.append("<pre class=\"prettyprint lang-xtend linenums\">");
    _builder.newLine();
    _builder.append("for (idx : list.size &gt;.. 0) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("println(\"(\"+idx+\") \"+list.get(idx))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</pre>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</section>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<section id=\"new_ide_features\" style=\"padding-top: 68px; margin-top: -68px;\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<h2>New IDE Features</h2>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<p>Being an Eclipse project Xtend has always been designed with IDE integration in ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("mind. The team is proud to announce that the editing support is now almost on par with ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Java\'s and in some aspects already even better. A user recently wrote in the newsgroup:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<blockquote>");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("Tooling for Xtend is unlike any other language for the JVM after Java. The IDE support ");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("is first class. It will take years for some languages to catch up. Some never will.");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("</blockquote>");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("The following new IDE features improve the editing experience significantly:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dl>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"organize_imports\">Organize Imports</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("With the new release we have overhauled the <em>Organize imports</em> action. It ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("processes all kinds of imports, asks to resolve conflicts, and shortens qualified names");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("automatically.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/organize_imports.png\"/>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"extract_method\">Extract Method and Extract Local Variable</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("New refactorings have been added. You can now extract code into a new local variable");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/extract_local_variable.png\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("or into a new method.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/extract_method_refactoring.png\"/>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"suppression_followup\">Supression of Follow-Up Errors</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Follow-up error markers are now suppressed and errors in general are much more local, ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("so it is very easy to spot the problem immediately.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/follow_up_errors.png\"/>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"optional_errors\">Optional Errors and Warnings</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>The severity of optional compiler errors can be configured globally as well as ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("individually for a single project. They can either be set explicitly or delegate to the equivalent");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("setting of the Java compiler.</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/issue_severities.png\"/>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"quickfixes\">More Quickfixes</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Xtend now offers to create missing fields, methods, and types through quick fix proposals.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/quickfixes.png\"/> ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"content_assist\">Improved Content Assist</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("The content assist has become much smarter. It now proposes lambda brackets if the method ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("accepts a single function and it offers hints on the parameter types when you ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("are working with overloaded methods.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/content_assist.png\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"formatter\">Formatter</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("A configurable formatter which pretty prints and indents code idiomatically is now available.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/formatter.png\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/formatter_preferences.png\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"javadoc\">JavaDoc</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("An Xtend editor now has validation and content assist within JavaDoc comments.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/javadoc_content_assist.png\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h3 id=\"copy_qualifiedname\">Copy Qualified Name</h3>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("You can use <em>Copy Qualified Name</em> in the editor and the outline view to copy the name");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("of types, fields and methods into the clipboard.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<img class=\"image_between_p\" src=\"images/releasenotes/copy_qualified_name.png\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dl>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</section>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</div>  ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"span1\">&nbsp;</div>  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
}
