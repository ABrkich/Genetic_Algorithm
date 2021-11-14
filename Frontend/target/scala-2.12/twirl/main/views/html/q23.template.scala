
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

object q23 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>

    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
    integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
    crossorigin=""/>
        <!-- Make sure you put this AFTER Leaflet's CSS -->
    <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"
    integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
    crossorigin=""></script>

    <style>
            .button """),format.raw/*15.21*/("""{"""),format.raw/*15.22*/("""
                """),format.raw/*16.17*/("""background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""

            """),format.raw/*28.13*/("""#mapid """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/(""" """),format.raw/*28.22*/("""height: 600px; """),format.raw/*28.37*/("""}"""),format.raw/*28.38*/("""
    """),format.raw/*29.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                Query 2.3 Map Search
            </h1>

        </header>

        <div>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">
                """),_display_(/*44.18*/message),format.raw/*44.25*/("""
            """),format.raw/*45.13*/("""</p>

        </div>

        <form action = """"),_display_(/*49.26*/routes/*49.32*/.HomeController.q23Handler()),format.raw/*49.60*/("""" method="GET">
            <label>Conference</label>
            <input type = "text" maxlength="100" id="conference" name="conference">
            <label>Years</label>
            <input type = "text" maxlength="100" id="years" name="years">
            <button id="api-get-page"  class="button" type="submit">2.3 Map Search</button>
        </form>

        <div id="mapid"></div>
        <script>

                let icws = """),format.raw/*60.28*/("""{"""),format.raw/*60.29*/("""
                    """),format.raw/*61.21*/("""LVx: 36.1699,//vegas 2003
                    LVy: -115.1398,
                    SDx: 32.7157,//san diego 2004
                    SDy: -117.611,
                    OFx: 28.5384,//orlando florida 2005
                    OFy: -81.3789,
                    CIx: 41.8781,//chicago illinois 2006
                    CIy: -87.6298,
                    SLx: 40.7608,//salt lake city utah 2007
                    SLy: -111.8910,
                    BCx: 39.9042,//beijing china 2008
                    BCy: 116.4074,
                    LAx: 34.0522,//los angeles 2009
                    LAy: -118.2437,
                    MFx: 25.7617,//miami florida 2010
                    MFy: -80.1918,
                    DCx: 38.9072,//washington dc 2011
                    DCy: -77.0369,
                    HHx: 21.3069,//honolulu hawaii 2012
                    HHy: -157.8583,
                    SCx: 37.3541,//santa clara california 2013
                    SCy: -121.9552,
                    AAx: 61.2181,//anchorage alaska 2014
                    AAy: -149.9003,
                    NYx: 40.7128,//new york city 2015
                    NYy: -74.0060,
                    SFx: 37.7749,//san francisco 2016
                    SFy: -122.4194,
                    HH2x: 21.3069,//honolulu hawaii 2017 (duplicate)
                    HH2y: -157.8583,
                    SF2x: 37.7749,//san francisco 2018 (duplicate)
                    SF2y: -122.4194,
                    MIx: 45.4642,//milan italy 2019
                    MIy: 9.1900,
                    BC2x: 39.9042,//beijing china 2020 (duplicate)
                    BC2y: 116.4074,
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""

                """),format.raw/*99.17*/("""let scc = """),format.raw/*99.27*/("""{"""),format.raw/*99.28*/("""
                    """),format.raw/*100.21*/("""LVx: 36.1699,//vegas 2003
                    LVy: -115.1398,
                    SDx: 32.7157,//san diego 2004
                    SDy: -117.611,
                    OFx: 28.5384,//orlando florida 2005
                    OFy: -81.3789,
                    CIx: 41.8781,//chicago illinois 2006
                    CIy: -87.6298,
                    SLx: 40.7608,//salt lake city utah 2007
                    SLy: -111.8910,
                    BCx: 39.9042,//beijing china 2008
                    BCy: 116.4074,
                    BIx: 12.9716,//bangalore india
                    BIy: 77.5946,
                    MFx: 25.7617,//miami florida 2010
                    MFy: -80.1918,
                    DCx: 38.9072,//washington dc 2011
                    DCy: -77.0369,
                    HHx: 21.3069,//honolulu hawaii 2012
                    HHy: -157.8583,
                    SCx: 37.3541,//santa clara california 2013
                    SCy: -121.9552,
                    AAx: 61.2181,//anchorage alaska 2014
                    AAy: -149.9003,
                    NYx: 40.7128,//new york city 2015
                    NYy: -74.0060,
                    SFx: 37.7749,//san francisco 2016
                    SFy: -122.4194,
                    HH2x: 21.3069,//honolulu hawaii 2017 (duplicate)
                    HH2y: -157.8583,
                    SF2x: 37.7749,//san francisco 2018 (duplicate)
                    SF2y: -122.4194,
                    MIx: 45.4642,//milan italy 2019
                    MIy: 9.1900,
                    BC2x: 39.9042,//beijing china 2020 (duplicate)
                    BC2y: 116.4074,
                    //bangalore is only unique value (2009) in scc
                    //the rest of the values appear in icws with the same year
                """),format.raw/*138.17*/("""}"""),format.raw/*138.18*/("""

                """),format.raw/*140.17*/("""var mymap = L.map('mapid').setView([0, 0], 2);

                L.tileLayer('https://api.maptiler.com/maps/streets/"""),format.raw/*142.68*/("""{"""),format.raw/*142.69*/("""z"""),format.raw/*142.70*/("""}"""),format.raw/*142.71*/("""/"""),format.raw/*142.72*/("""{"""),format.raw/*142.73*/("""x"""),format.raw/*142.74*/("""}"""),format.raw/*142.75*/("""/"""),format.raw/*142.76*/("""{"""),format.raw/*142.77*/("""y"""),format.raw/*142.78*/("""}"""),format.raw/*142.79*/(""".png?key=dcj0rBj8ACT4YDvql2hH', """),format.raw/*142.111*/("""{"""),format.raw/*142.112*/("""
                    """),format.raw/*143.21*/("""attribution: '<a href="https://www.maptiler.com/copyright/" target="_blank">&copy; MapTiler</a> <a href="https://www.openstreetmap.org/copyright" target="_blank">&copy; OpenStreetMap contributors</a>',
                """),format.raw/*144.17*/("""}"""),format.raw/*144.18*/(""").addTo(mymap);

                //var marker = L.marker([51.5, -.09]).addTo(mymap); //londok UK test marker
                var LV = L.marker([icws["LVx"], icws["LVy"]]).addTo(mymap);
                var SD = L.marker([icws["SDx"], icws["SDy"]]).addTo(mymap);
                var OF = L.marker([icws["OFx"], icws["OFy"]]).addTo(mymap);
                var BC = L.marker([icws["BCx"], icws["BCy"]]).addTo(mymap);
                var HH = L.marker([icws["HHx"], icws["HHy"]]).addTo(mymap);
                var SF = L.marker([icws["SFx"], icws["SFy"]]).addTo(mymap);
                var SC = L.marker([icws["SCx"], icws["SCy"]]).addTo(mymap);
                var MF = L.marker([icws["MFx"], icws["MFy"]]).addTo(mymap);
                var DC = L.marker([icws["DCx"], icws["DCy"]]).addTo(mymap);
                var MI = L.marker([icws["MIx"], icws["MIy"]]).addTo(mymap);
                var LA = L.marker([icws["LAx"], icws["LAy"]]).addTo(mymap);
                var AA = L.marker([icws["AAx"], icws["AAy"]]).addTo(mymap);
                var SL = L.marker([icws["SLx"], icws["SLy"]]).addTo(mymap);
                var CI = L.marker([icws["CIx"], icws["CIy"]]).addTo(mymap);
                var NY = L.marker([icws["NYx"], icws["NYy"]]).addTo(mymap);

                var BI = L.marker([scc["BIx"], scc["BIy"]]).addTo(mymap);
        </script>

    </body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-08T12:12:05.326
                  SOURCE: C:/Users/User/Desktop/8391/lab2/Frontend/app/views/q23.scala.html
                  HASH: 92717e89dc336f0daac871208d0ce35e93e37acc
                  MATRIX: 946->1|1058->18|1086->20|1668->576|1697->577|1743->595|2141->965|2170->966|2214->982|2249->989|2278->990|2307->991|2350->1006|2379->1007|2412->1013|2791->1365|2819->1372|2861->1386|2939->1437|2954->1443|3003->1471|3472->1912|3501->1913|3551->1935|5273->3629|5302->3630|5350->3650|5388->3660|5417->3661|5468->3683|7336->5522|7366->5523|7415->5543|7561->5660|7591->5661|7621->5662|7651->5663|7681->5664|7711->5665|7741->5666|7771->5667|7801->5668|7831->5669|7861->5670|7891->5671|7953->5703|7984->5704|8035->5726|8283->5945|8313->5946
                  LINES: 28->1|33->1|34->2|47->15|47->15|48->16|58->26|58->26|60->28|60->28|60->28|60->28|60->28|60->28|61->29|76->44|76->44|77->45|81->49|81->49|81->49|92->60|92->60|93->61|129->97|129->97|131->99|131->99|131->99|132->100|170->138|170->138|172->140|174->142|174->142|174->142|174->142|174->142|174->142|174->142|174->142|174->142|174->142|174->142|174->142|174->142|174->142|175->143|176->144|176->144
                  -- GENERATED --
              */
          