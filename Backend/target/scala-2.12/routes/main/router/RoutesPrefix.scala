// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/Genetic_Algorithm/Backend/conf/routes
// @DATE:Mon Nov 15 11:10:10 CST 2021


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
