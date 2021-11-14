// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/lab2/Frontend/conf/routes
// @DATE:Fri Oct 08 12:12:04 CDT 2021

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

  
    // @LINE:22
    def q23Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query23Handler")
    }
  
    // @LINE:15
    def query14(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query14")
    }
  
    // @LINE:20
    def q22Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query22Handler")
    }
  
    // @LINE:16
    def q15Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query15Handler")
    }
  
    // @LINE:18
    def q21Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query21Handler")
    }
  
    // @LINE:14
    def q14Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query14Handler")
    }
  
    // @LINE:9
    def query11(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query11")
    }
  
    // @LINE:8
    def q11Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query11Handler")
    }
  
    // @LINE:11
    def query12(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query12")
    }
  
    // @LINE:17
    def query15(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query15")
    }
  
    // @LINE:13
    def query13(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query13")
    }
  
    // @LINE:10
    def q12Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query12Handler")
    }
  
    // @LINE:23
    def query23(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query23")
    }
  
    // @LINE:19
    def query21(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query21")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:21
    def query22(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query22")
    }
  
    // @LINE:12
    def q13Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query13Handler")
    }
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
