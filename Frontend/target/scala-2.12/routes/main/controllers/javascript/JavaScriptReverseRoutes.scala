// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/Genetic_Algorithm/Frontend/conf/routes
// @DATE:Mon Nov 15 11:14:45 CST 2021

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

  
    // @LINE:9
    def servicesHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.servicesHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "services"})
        }
      """
    )
  
    // @LINE:8
    def services: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.services",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "servicesHandler"})
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
  
  }


}
