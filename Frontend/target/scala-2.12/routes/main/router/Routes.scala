// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/lab2/Frontend/conf/routes
// @DATE:Fri Oct 08 12:12:04 CDT 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:27
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:27
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query11Handler""", """controllers.HomeController.q11Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query11""", """controllers.HomeController.query11()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query12Handler""", """controllers.HomeController.q12Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query12""", """controllers.HomeController.query12()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query13Handler""", """controllers.HomeController.q13Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query13""", """controllers.HomeController.query13()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query14Handler""", """controllers.HomeController.q14Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query14""", """controllers.HomeController.query14()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query15Handler""", """controllers.HomeController.q15Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query15""", """controllers.HomeController.query15()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query21Handler""", """controllers.HomeController.q21Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query21""", """controllers.HomeController.query21()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query22Handler""", """controllers.HomeController.q22Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query22""", """controllers.HomeController.query22()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query23Handler""", """controllers.HomeController.q23Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query23""", """controllers.HomeController.query23()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_q11Handler1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query11Handler")))
  )
  private[this] lazy val controllers_HomeController_q11Handler1_invoker = createInvoker(
    HomeController_1.q11Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "q11Handler",
      Nil,
      "GET",
      this.prefix + """query11Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_query112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query11")))
  )
  private[this] lazy val controllers_HomeController_query112_invoker = createInvoker(
    HomeController_1.query11(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query11",
      Nil,
      "GET",
      this.prefix + """query11""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_q12Handler3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query12Handler")))
  )
  private[this] lazy val controllers_HomeController_q12Handler3_invoker = createInvoker(
    HomeController_1.q12Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "q12Handler",
      Nil,
      "GET",
      this.prefix + """query12Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_query124_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query12")))
  )
  private[this] lazy val controllers_HomeController_query124_invoker = createInvoker(
    HomeController_1.query12(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query12",
      Nil,
      "GET",
      this.prefix + """query12""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_q13Handler5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query13Handler")))
  )
  private[this] lazy val controllers_HomeController_q13Handler5_invoker = createInvoker(
    HomeController_1.q13Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "q13Handler",
      Nil,
      "GET",
      this.prefix + """query13Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_query136_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query13")))
  )
  private[this] lazy val controllers_HomeController_query136_invoker = createInvoker(
    HomeController_1.query13(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query13",
      Nil,
      "GET",
      this.prefix + """query13""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_q14Handler7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query14Handler")))
  )
  private[this] lazy val controllers_HomeController_q14Handler7_invoker = createInvoker(
    HomeController_1.q14Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "q14Handler",
      Nil,
      "GET",
      this.prefix + """query14Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_query148_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query14")))
  )
  private[this] lazy val controllers_HomeController_query148_invoker = createInvoker(
    HomeController_1.query14(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query14",
      Nil,
      "GET",
      this.prefix + """query14""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_q15Handler9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query15Handler")))
  )
  private[this] lazy val controllers_HomeController_q15Handler9_invoker = createInvoker(
    HomeController_1.q15Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "q15Handler",
      Nil,
      "GET",
      this.prefix + """query15Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_query1510_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query15")))
  )
  private[this] lazy val controllers_HomeController_query1510_invoker = createInvoker(
    HomeController_1.query15(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query15",
      Nil,
      "GET",
      this.prefix + """query15""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_q21Handler11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query21Handler")))
  )
  private[this] lazy val controllers_HomeController_q21Handler11_invoker = createInvoker(
    HomeController_1.q21Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "q21Handler",
      Nil,
      "GET",
      this.prefix + """query21Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_query2112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query21")))
  )
  private[this] lazy val controllers_HomeController_query2112_invoker = createInvoker(
    HomeController_1.query21(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query21",
      Nil,
      "GET",
      this.prefix + """query21""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_q22Handler13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query22Handler")))
  )
  private[this] lazy val controllers_HomeController_q22Handler13_invoker = createInvoker(
    HomeController_1.q22Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "q22Handler",
      Nil,
      "GET",
      this.prefix + """query22Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_query2214_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query22")))
  )
  private[this] lazy val controllers_HomeController_query2214_invoker = createInvoker(
    HomeController_1.query22(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query22",
      Nil,
      "GET",
      this.prefix + """query22""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_q23Handler15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query23Handler")))
  )
  private[this] lazy val controllers_HomeController_q23Handler15_invoker = createInvoker(
    HomeController_1.q23Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "q23Handler",
      Nil,
      "GET",
      this.prefix + """query23Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_query2316_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query23")))
  )
  private[this] lazy val controllers_HomeController_query2316_invoker = createInvoker(
    HomeController_1.query23(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query23",
      Nil,
      "GET",
      this.prefix + """query23""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:8
    case controllers_HomeController_q11Handler1_route(params@_) =>
      call { 
        controllers_HomeController_q11Handler1_invoker.call(HomeController_1.q11Handler())
      }
  
    // @LINE:9
    case controllers_HomeController_query112_route(params@_) =>
      call { 
        controllers_HomeController_query112_invoker.call(HomeController_1.query11())
      }
  
    // @LINE:10
    case controllers_HomeController_q12Handler3_route(params@_) =>
      call { 
        controllers_HomeController_q12Handler3_invoker.call(HomeController_1.q12Handler())
      }
  
    // @LINE:11
    case controllers_HomeController_query124_route(params@_) =>
      call { 
        controllers_HomeController_query124_invoker.call(HomeController_1.query12())
      }
  
    // @LINE:12
    case controllers_HomeController_q13Handler5_route(params@_) =>
      call { 
        controllers_HomeController_q13Handler5_invoker.call(HomeController_1.q13Handler())
      }
  
    // @LINE:13
    case controllers_HomeController_query136_route(params@_) =>
      call { 
        controllers_HomeController_query136_invoker.call(HomeController_1.query13())
      }
  
    // @LINE:14
    case controllers_HomeController_q14Handler7_route(params@_) =>
      call { 
        controllers_HomeController_q14Handler7_invoker.call(HomeController_1.q14Handler())
      }
  
    // @LINE:15
    case controllers_HomeController_query148_route(params@_) =>
      call { 
        controllers_HomeController_query148_invoker.call(HomeController_1.query14())
      }
  
    // @LINE:16
    case controllers_HomeController_q15Handler9_route(params@_) =>
      call { 
        controllers_HomeController_q15Handler9_invoker.call(HomeController_1.q15Handler())
      }
  
    // @LINE:17
    case controllers_HomeController_query1510_route(params@_) =>
      call { 
        controllers_HomeController_query1510_invoker.call(HomeController_1.query15())
      }
  
    // @LINE:18
    case controllers_HomeController_q21Handler11_route(params@_) =>
      call { 
        controllers_HomeController_q21Handler11_invoker.call(HomeController_1.q21Handler())
      }
  
    // @LINE:19
    case controllers_HomeController_query2112_route(params@_) =>
      call { 
        controllers_HomeController_query2112_invoker.call(HomeController_1.query21())
      }
  
    // @LINE:20
    case controllers_HomeController_q22Handler13_route(params@_) =>
      call { 
        controllers_HomeController_q22Handler13_invoker.call(HomeController_1.q22Handler())
      }
  
    // @LINE:21
    case controllers_HomeController_query2214_route(params@_) =>
      call { 
        controllers_HomeController_query2214_invoker.call(HomeController_1.query22())
      }
  
    // @LINE:22
    case controllers_HomeController_q23Handler15_route(params@_) =>
      call { 
        controllers_HomeController_q23Handler15_invoker.call(HomeController_1.q23Handler())
      }
  
    // @LINE:23
    case controllers_HomeController_query2316_route(params@_) =>
      call { 
        controllers_HomeController_query2316_invoker.call(HomeController_1.query23())
      }
  
    // @LINE:27
    case controllers_Assets_at17_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_0.at(path, file))
      }
  }
}
