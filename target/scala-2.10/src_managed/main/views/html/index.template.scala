
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

"""),_display_(Seq[Any](/*3.2*/main("TestRestApi")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  <h1>"""),_display_(Seq[Any](/*4.8*/users/*4.13*/.size)),format.raw/*4.18*/(""" users(s)</h1>
  """),_display_(Seq[Any](/*5.4*/users/*5.9*/.map/*5.13*/ {user =>_display_(Seq[Any](format.raw/*5.22*/(""" 
    <div>
      """),_display_(Seq[Any](/*7.8*/user/*7.12*/.email)),format.raw/*7.18*/(""" | """),_display_(Seq[Any](/*7.22*/user/*7.26*/.encrypted_password)),format.raw/*7.45*/("""
    </div>
  """)))})),format.raw/*9.4*/("""

""")))})),format.raw/*11.2*/("""
"""))}
    }
    
    def render(users:List[User]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[User]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 25 16:53:48 EST 2014
                    SOURCE: /Users/jason/Projects/Personal/testrestapi/app/views/index.scala.html
                    HASH: a8a9e709983a0e20773e176c8a3e672f7a00b50e
                    MATRIX: 560->1|673->20|710->23|737->42|776->44|818->52|831->57|857->62|909->80|921->85|933->89|979->98|1032->117|1044->121|1071->127|1110->131|1122->135|1162->154|1207->169|1241->172
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|26->5|26->5|26->5|26->5|28->7|28->7|28->7|28->7|28->7|28->7|30->9|32->11
                    -- GENERATED --
                */
            