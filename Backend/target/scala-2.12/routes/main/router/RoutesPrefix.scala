// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/CS_8340_Lab4/Backend/conf/routes
// @DATE:Fri Nov 12 12:57:50 CST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
