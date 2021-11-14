
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object q12 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <style>
            .button """),format.raw/*6.21*/("""{"""),format.raw/*6.22*/("""
                """),format.raw/*7.17*/("""background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
    """),format.raw/*18.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                Query 1.2 Journal Search
            </h1>

        </header>

        <div>
            <table>
                <tr>
                    <th>Title</th>
                    <th>Conference</th>
                    <th>Publisher</th>
                    <th>Year</th>
                    <th>Journal</th>
                    <th>Volume</th>
                    <th>Issue</th>
                    <th>Pages</th>
                    <th>URL</th>
                    <th>EE</th>
                    <th>CrossRef</th>
                    <th>ISBN</th>
                </tr>


                """),_display_(/*48.18*/for(article <- articles) yield /*48.42*/{_display_(Seq[Any](format.raw/*48.43*/("""
                    """),format.raw/*49.21*/("""<tr>
                    """),_display_(/*50.22*/for(element <- article) yield /*50.45*/{_display_(Seq[Any](format.raw/*50.46*/("""

                        """),format.raw/*52.25*/("""<td>"""),_display_(/*52.30*/element),format.raw/*52.37*/("""</td>

                    """)))}),format.raw/*54.22*/("""
                    """),format.raw/*55.21*/("""</tr>
                """)))}),format.raw/*56.18*/("""


            """),format.raw/*59.13*/("""</table>

        </div>

        <form action = """"),_display_(/*63.26*/routes/*63.32*/.HomeController.q12Handler()),format.raw/*63.60*/("""" method="GET">
            <label>Journal name</label>
            <input type = "text" maxlength="100" id="title" name="title">
            <label>Volume</label>
            <input type = "text" maxlength="100" id="volume" name="volume">
            <label>Journal issue</label>
            <input type = "text" maxlength="100" id="issue" name="issue">
            <button id="api-get-page"  class="button" type="submit">1.2 Journal Search</button>
        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(articles:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(articles)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (articles) => apply(articles)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-08T13:57:39.423
                  SOURCE: C:/Users/User/Desktop/8391/lab2/Frontend/app/views/q12.scala.html
                  HASH: 4e1f5c1a80932d2ff7e229fd91e9449309f2cada
                  MATRIX: 958->1|1083->31|1111->33|1198->93|1226->94|1271->112|1669->482|1698->483|1731->489|2534->1265|2574->1289|2613->1290|2663->1312|2717->1339|2756->1362|2795->1363|2851->1391|2883->1396|2911->1403|2972->1433|3022->1455|3077->1479|3123->1497|3205->1552|3220->1558|3269->1586
                  LINES: 28->1|33->1|34->2|38->6|38->6|39->7|49->17|49->17|50->18|80->48|80->48|80->48|81->49|82->50|82->50|82->50|84->52|84->52|84->52|86->54|87->55|88->56|91->59|95->63|95->63|95->63
                  -- GENERATED --
              */
          