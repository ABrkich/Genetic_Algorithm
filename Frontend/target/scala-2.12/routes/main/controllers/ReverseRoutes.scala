// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CJ/Desktop/8391/Lab4/Frontend/conf/routes
// @DATE:Mon Nov 15 16:05:21 CST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def servicesHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "services")
    }
  
    // @LINE:8
    def services(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "servicesHandler")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
