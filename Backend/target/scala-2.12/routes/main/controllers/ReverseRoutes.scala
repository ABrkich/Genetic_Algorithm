// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/Genetic_Algorithm/Backend/conf/routes
// @DATE:Mon Nov 15 11:10:10 CST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:9
  class ReverseServiceController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def services(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "services")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
