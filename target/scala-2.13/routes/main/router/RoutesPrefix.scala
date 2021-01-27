// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Belajar Java (Dicoding)/scala-final-cuaca/conf/routes
// @DATE:Wed Jan 27 17:21:04 SGT 2021


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
