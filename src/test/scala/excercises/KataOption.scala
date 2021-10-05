package excercises

import org.scalatest.FunSuite

class KataTestOption extends FunSuite {

  test("getOrElss") {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    //  HINT getOrElse
    //  begin
    val unit_5: Int = 0
    val unit_10: Int = 0
    //  end

    assert(unit_5.equals(5))
    assert(unit_10.equals(10))
  }

  test("isEmpty") {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    //  HINT isEmpty
    //  begin
    val is_A_Empty: Boolean = false
    val is_B_Empty: Boolean = false
    //  end

    assert(is_A_Empty.equals(false))
    assert(is_B_Empty.equals(true))
  }
}
