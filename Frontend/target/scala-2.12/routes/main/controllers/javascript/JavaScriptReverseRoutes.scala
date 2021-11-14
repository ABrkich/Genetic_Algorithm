// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/lab2/Frontend/conf/routes
// @DATE:Fri Oct 08 12:12:04 CDT 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def q23Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q23Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query23Handler"})
        }
      """
    )
  
    // @LINE:15
    def query14: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query14",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query14"})
        }
      """
    )
  
    // @LINE:20
    def q22Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q22Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query22Handler"})
        }
      """
    )
  
    // @LINE:16
    def q15Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q15Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query15Handler"})
        }
      """
    )
  
    // @LINE:18
    def q21Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q21Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query21Handler"})
        }
      """
    )
  
    // @LINE:14
    def q14Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q14Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query14Handler"})
        }
      """
    )
  
    // @LINE:9
    def query11: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query11",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query11"})
        }
      """
    )
  
    // @LINE:8
    def q11Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q11Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query11Handler"})
        }
      """
    )
  
    // @LINE:11
    def query12: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query12",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query12"})
        }
      """
    )
  
    // @LINE:17
    def query15: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query15",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query15"})
        }
      """
    )
  
    // @LINE:13
    def query13: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query13",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query13"})
        }
      """
    )
  
    // @LINE:10
    def q12Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q12Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query12Handler"})
        }
      """
    )
  
    // @LINE:23
    def query23: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query23",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query23"})
        }
      """
    )
  
    // @LINE:19
    def query21: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query21",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query21"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:21
    def query22: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query22",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query22"})
        }
      """
    )
  
    // @LINE:12
    def q13Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q13Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query13Handler"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
