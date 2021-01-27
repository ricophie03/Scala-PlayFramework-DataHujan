
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/prism.css")),format.raw/*16.98*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/style.css")),format.raw/*17.98*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*18.50*/routes/*18.56*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*18.106*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*19.55*/routes/*19.61*/.Assets.versioned("images/favicon.png")),format.raw/*19.100*/("""'>

    
</head>

<body>
    <section id="top">
        <div class="wrapper">
            <img class="resize" src="assets/images/play_icon_reverse.svg" alt="logo" />
            <h1>Perkiraan Cuaca Makassar - Final Scala</h1>
        </div>
    </section>
    <script src='"""),_display_(/*31.19*/routes/*31.25*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*31.71*/("""' type="text/javascript"></script>
    """),_display_(/*32.6*/content),format.raw/*32.13*/("""
"""),format.raw/*33.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-27T17:21:04.669524900
                  SOURCE: E:/Belajar Java (Dicoding)/scala-final-cuaca/app/views/main.scala.html
                  HASH: a2f0abb4b801828eb1fb029b0f44220924d1b9e1
                  MATRIX: 992->266|1117->296|1147->300|1231->357|1257->362|1419->497|1434->503|1496->544|1576->597|1591->603|1654->645|1734->698|1749->704|1812->746|1892->799|1907->805|1979->855|2064->913|2079->919|2140->958|2453->1244|2468->1250|2535->1296|2602->1337|2630->1344|2659->1346
                  LINES: 26->7|31->7|33->9|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|55->31|55->31|55->31|56->32|56->32|57->33
                  -- GENERATED --
              */
          