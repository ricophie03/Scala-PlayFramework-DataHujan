
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Final scalable")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

"""),format.raw/*6.1*/("""<section id="content ">
  <div class="wrapper doc">
    <article>
      <div class="weather">
        <div class="row">
          
        </div>
      </div>
      <script src='"""),_display_(/*14.21*/routes/*14.27*/.Assets.versioned("/javascripts/jquery.min.js")),format.raw/*14.74*/("""' type="text/javascript"></script>
      <script>
        $(document).ready(function() """),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""
          """),format.raw/*17.11*/("""var data_hu = '';
          var data_tem = '';
          var data_wea = '';
      
          $.ajax("""),format.raw/*21.18*/("""{"""),format.raw/*21.19*/("""
            """),format.raw/*22.13*/("""type: 'GET',
            url: "https://data.bmkg.go.id/datamkg/MEWS/DigitalForecast/DigitalForecast-SulawesiSelatan.xml",
            success: function(data) """),format.raw/*24.37*/("""{"""),format.raw/*24.38*/("""
      
              """),format.raw/*26.15*/("""//Weather
              var semua_wea = $(data).find('#501495 #weather timerange');
              var data_cuaca = '';
              semua_wea.each(function()"""),format.raw/*29.40*/("""{"""),format.raw/*29.41*/("""
                """),format.raw/*30.17*/("""var waktu = $(this).attr('datetime');
                var hum = $(data).find("#501495 #hu timerange[datetime="+waktu+"] value[unit='%']").text();
                var cel = $(data).find("#501495 #t timerange[datetime="+waktu+"] value[unit='C']").text();
                var fah = $(data).find("#501495 #t timerange[datetime="+waktu+"] value[unit='F']").text();
                var cuaca = $(this).find("value").text();
      
                switch (cuaca) """),format.raw/*36.32*/("""{"""),format.raw/*36.33*/("""
                  case "0":
                    data_cuaca = "Cerah / Clear Skies"
                    break;
                  case "100":
                    data_cuaca = "Cerah / Clear Skies"
                    break;
                  case "1":
                    data_cuaca = "Cerah Berawan / Partly Cloudy"
                    break;
                  case "101":
                    data_cuaca = "Cerah Berawan / Partly Cloudy"
                    break;
                  case "2":
                    data_cuaca = "Cerah Berawan / Partly Cloudy"
                    break;
                  case "102":
                    data_cuaca = "Cerah Berawan / Partly Cloudy"
                    break;
                  case "3":
                    data_cuaca = "Berawan / Mostly Cloudy"
                    break;
                  case "103":
                    data_cuaca = "Berawan / Mostly Cloudy"
                    break;
                  case "4":
                    data_cuaca = "Berawan Tebal / Overcast"
                    break;
                  case "104":
                    data_cuaca = "Berawan Tebal / Overcast"
                    break;
                  case "5":
                    data_cuaca = "Udara Kabur / Haze"
                    break;
                  case "10":
                    data_cuaca = "Asap / Smoke"
                    break;
                  case "45":
                    data_cuaca = "Kabut / Fog"
                    break;
                  case "60":
                    data_cuaca = "Hujan Ringan / Light Rain"
                    break;
                  case "61":
                    data_cuaca = "Hujan Sedang / Rain"
                    break;
                  case "63":
                    data_cuaca = "Hujan Lebat / Heavy Rain"
                    break;
                  case "80":
                    data_cuaca = "Hujan Lokal / Isolated Shower"
                    break;
                  case "95":
                    data_cuaca = "Hujan Petir / Severe Thunderstorm"
                    break;
                  case "97":
                    data_cuaca = "Hujan Petir / Severe Thunderstorm"
                    break;
                
                  default:
                    break;
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""
      
                """),format.raw/*99.17*/("""data_wea += `
                  <div class="wrapper col-3 border p-3">
                    <h6>`+waktu.slice(0,4)+`-`+waktu.slice(4,6)+`-`+waktu.slice(6,8)+` / `+waktu.slice(8,10)+`:`+waktu.slice(10,12)+` WIB</h6>
                    <h5 class="text-danger">`+ data_cuaca+`</h5>
                    <h5 class="text-primary">Humidity : `+ hum+`%</h5>
                    <h5>Temperature : `+ cel+`°C / `+ fah +`°F</h5>
                  </div>
                `;
              """),format.raw/*107.15*/("""}"""),format.raw/*107.16*/(""");
      
              $('.weather .row').html(data_wea);
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/("""
          """),format.raw/*111.11*/("""}"""),format.raw/*111.12*/(""");
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/(""");
      </script>
    </article>
  </div>
</section>
""")))}),format.raw/*117.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-27T17:21:04.650536500
                  SOURCE: E:/Belajar Java (Dicoding)/scala-final-cuaca/app/views/index.scala.html
                  HASH: efd1daa548bf8645428e3369e7c0738a77f428cd
                  MATRIX: 722->1|818->3|848->8|878->30|917->32|945->35|992->74|1042->87|1072->91|1286->278|1301->284|1369->331|1486->420|1515->421|1555->433|1687->537|1716->538|1758->552|1946->712|1975->713|2027->737|2216->898|2245->899|2291->917|2781->1379|2810->1380|5186->3728|5215->3729|5269->3755|5782->4239|5812->4240|5915->4314|5945->4315|5986->4327|6016->4328|6056->4340|6086->4341|6177->4401
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|39->14|39->14|39->14|41->16|41->16|42->17|46->21|46->21|47->22|49->24|49->24|51->26|54->29|54->29|55->30|61->36|61->36|122->97|122->97|124->99|132->107|132->107|135->110|135->110|136->111|136->111|137->112|137->112|142->117
                  -- GENERATED --
              */
          