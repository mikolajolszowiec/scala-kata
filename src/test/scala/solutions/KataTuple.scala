package solutions

import org.scalatest.FunSuite

class KataTestTuple extends FunSuite {
  
  test("define Tuple (\"Dog\", 1, \"Rex\")") {

    //  HINT ()
    //  begin
    val tuple:(String, Int, String) = ("Dog", 1, "Rex")
    //  end

    assert(tuple._1.equals("Dog"))
    assert(tuple._2.equals(1))
    assert(tuple._3.equals("Rex"))
  }
}
