
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*3.1*/("""<!DOCTYPE html>
<html>

    <style>
        .grid-container """),format.raw/*7.25*/("""{"""),format.raw/*7.26*/("""
            """),format.raw/*8.13*/("""display: grid;
            grid-template-columns: auto auto auto;
            background-color: #2196F3;
            padding: 10px;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""

        """),format.raw/*14.9*/(""".grid-item """),format.raw/*14.20*/("""{"""),format.raw/*14.21*/("""
            """),format.raw/*15.13*/("""background-color: rgba(255, 255, 255, 0.8);
            border: 1px solid rgba(0, 0, 0, 0.8);
            padding: 5px;
            font-size: 30px;
            text-align: center;
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""

        """),format.raw/*22.9*/(""".button """),format.raw/*22.17*/("""{"""),format.raw/*22.18*/("""
            """),format.raw/*23.13*/("""background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Lab 4 Genetic Algorithm</strong>
            </h1>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">"""),_display_(/*44.34*/message),format.raw/*44.41*/("""</p>


            <form action = """"),_display_(/*47.30*/routes/*47.36*/.HomeController.services()),format.raw/*47.62*/("""" method="GET">
                 <button id="api-get-page"  class="button" type="submit">1.1 Paper Search</button>
            </form>

        </header>

    </body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-11-15T11:22:12.038
                  SOURCE: C:/Users/User/Desktop/8391/Genetic_Algorithm/Frontend/app/views/index.scala.html
                  HASH: 9340b1e3b3081d3990a93c516ddcfcac89b90e3e
                  MATRIX: 948->1|1038->25|1105->18|1137->64|1228->128|1256->129|1297->143|1468->287|1497->288|1536->300|1575->311|1604->312|1646->326|1867->520|1896->521|1935->533|1971->541|2000->542|2042->556|2399->886|2428->887|2461->893|2804->1209|2832->1216|2898->1255|2913->1261|2960->1287
                  LINES: 28->1|31->2|34->1|35->3|39->7|39->7|40->8|44->12|44->12|46->14|46->14|46->14|47->15|52->20|52->20|54->22|54->22|54->22|55->23|65->33|65->33|66->34|76->44|76->44|79->47|79->47|79->47
                  -- GENERATED --
              */
          