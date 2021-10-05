package solutions

import org.scalatest.FunSuite

class KataTestRange extends FunSuite {

  test("define range 0 - 10") {

    //  HINT Range( , )
    //  begin
    val range :Range = Range(0,10)
    //  end

    assert(range(0).equals(0))
    assert(range(1).equals(1))
    assert(range(2).equals(2))
    assert(range(3).equals(3))
    assert(range(4).equals(4))
    assert(range(5).equals(5))
    assert(range(6).equals(6))
    assert(range(7).equals(7))
    assert(range(8).equals(8))
    assert(range(9).equals(9))
    assert(range.size.equals(10))
  }

  test("define range 0 - 10 wih step 3") {

    //  HINT Range( , , )
    //  begin
    val range :Range = Range(0,10,3)
    //  end

    assert(range(0).equals(0))
    assert(range(1).equals(3))
    assert(range(2).equals(6))
    assert(range(3).equals(9))
  }

  test("define range 0 - 10 with 10 inclusive") {

    //  HINT .inclusive
    //  begin
    val range :Range = Range(0,10).inclusive
    //  end

    assert(range(0).equals(0))
    assert(range(1).equals(1))
    assert(range(2).equals(2))
    assert(range(3).equals(3))
    assert(range(4).equals(4))
    assert(range(5).equals(5))
    assert(range(6).equals(6))
    assert(range(7).equals(7))
    assert(range(8).equals(8))
    assert(range(9).equals(9))
    assert(range(10).equals(10))
    assert(range.size.equals(11))
  }

  test("define range 0 to 10 (inclusive 10)") {

    //  HINT a to b
    //  begin
    val range :Range = 0 to 10
    //  end

    assert(range(0).equals(0))
    assert(range(1).equals(1))
    assert(range(2).equals(2))
    assert(range(3).equals(3))
    assert(range(4).equals(4))
    assert(range(5).equals(5))
    assert(range(6).equals(6))
    assert(range(7).equals(7))
    assert(range(8).equals(8))
    assert(range(9).equals(9))
    assert(range(10).equals(10))
    assert(range.size.equals(11))
  }

  test("define range: 0 until 10 (without 10)") {

    //  HINT a until b
    //  begin
    val range :Range = 0 until 10
    //  end

    assert(range(0).equals(0))
    assert(range(1).equals(1))
    assert(range(2).equals(2))
    assert(range(3).equals(3))
    assert(range(4).equals(4))
    assert(range(5).equals(5))
    assert(range(6).equals(6))
    assert(range(7).equals(7))
    assert(range(8).equals(8))
    assert(range(9).equals(9))
    assert(range.size.equals(10))
  }

  test("get last from range") {
    val range :Range = Range(0,10,3)

    //  HINT .last
    //  begin
    val last = range.last
    //  end

    assert(last.equals(9))
  }

  test("get head from range") {
    val range :Range = Range(0,10,3)

    //  HINT .head
    //  begin
    val last = range.head
    //  end

    assert(last.equals(0))
  }
}
