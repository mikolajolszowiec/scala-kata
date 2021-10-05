package solutions

import org.scalatest.FunSuite

class KataTest extends FunSuite {

  test("define List odds with 1,3,5 and size of 3") {

    //  HINT List()
    //  begin
    val odds :List[Int] = List(1,3,5)
    //  end

    assert(odds(0).equals(1), true)
    assert(odds(1).equals(3), true)
    assert(odds(2).equals(5), true)
  }

  test("Prepend int = 7 via ::") {
    var odds :List[Int] = List(1,3,5)

    //  HINT ::
    //  begin
    odds = 7 :: odds
    //  end

    assert(odds(0).equals(7), true)
    assert(odds(1).equals(1), true)
    assert(odds(2).equals(3), true)
    assert(odds(3).equals(5), true)
  }

  test("Prepend int = 7 via +:") {
    var odds :List[Int] = List(1,3,5)

    //  HINT +:
    //  begin
    odds = 7 +: odds
    //  end

    assert(odds(0).equals(7), true)
    assert(odds(1).equals(1), true)
    assert(odds(2).equals(3), true)
    assert(odds(3).equals(5), true)
  }

  test("Append int = 7 via :+") {
    var odds :List[Int] = List(1,3,5)

    //  HINT :+
    //  begin
    odds = odds :+ 7
    //  end

    assert(odds(0).equals(1), true)
    assert(odds(1).equals(3), true)
    assert(odds(2).equals(5), true)
    assert(odds(3).equals(7), true)
  }

  test("Filter list with condition (avoid 5)") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT .filterNot()
    //  begin
    val filteredOdds = odds.filterNot(v => v == 5)
    //  end

    assert(filteredOdds(0).equals(1), true)
    assert(filteredOdds(1).equals(3), true)
    assert(filteredOdds(2).equals(7), true)
    assert(filteredOdds(3).equals(9), true)
  }

  test("Filter list via v => v") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT
    //  begin
    val filteredOdds = odds.filter(v => v == 5)
    //  end

    assert(filteredOdds(0).equals(5), true)
  }

  test("Filter via _") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT .filter(_ == )
    //  begin
    val filteredOdds = odds.filter(_ == 5)
    //  end

    assert(filteredOdds(0).equals(5), true)
  }

 test("Increment via map using v=>v ") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT  .map(=>)
    //  begin
    val filteredOdds = odds.map(v => v + 1)
    //  end

    assert(filteredOdds(0).equals(2), true)
    assert(filteredOdds(1).equals(4), true)
    assert(filteredOdds(2).equals(6), true)
    assert(filteredOdds(3).equals(8), true)
    assert(filteredOdds(4).equals(10), true)
  }

  test("Increment via map using _") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT  .map(_)
    //  begin
    val filteredOdds = odds.map(_ + 1)
    //  end

    assert(filteredOdds(0).equals(2), true)
    assert(filteredOdds(1).equals(4), true)
    assert(filteredOdds(2).equals(6), true)
    assert(filteredOdds(3).equals(8), true)
    assert(filteredOdds(4).equals(10), true)
  }

  test("Reverse list") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT .reverse
    //  begin
    val reversedOdds = odds.reverse
    //  end

    assert(reversedOdds(4).equals(1), true)
    assert(reversedOdds(3).equals(3), true)
    assert(reversedOdds(2).equals(5), true)
    assert(reversedOdds(1).equals(7), true)
    assert(reversedOdds(0).equals(9), true)
  }

  test("Sum up all ints, using reduceLeft") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT .reduceLeft()
    //  begin
    val reduced = odds.reduceLeft(_ + _)
    //  end

    assert(reduced.equals(25), true)
  }

  test("Multiply all ints, using reduceLeft") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT .reduceLeft()
    //  begin
    val reduced = odds.reduceLeft(_ * _)
    //  end

    assert(reduced.equals(945), true)
  }

  test("Sum up all ints with start 10, using .foldLeft()") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT .foldLeft()
    //  begin
    val reduced = odds.foldLeft(10)(_ + _)
    //  end

    assert(reduced.equals(35), true)
  }

  test("Multiply all ints with start 10, using .foldLeft()") {
    val odds :List[Int] = List(1,3,5,7,9)

    //  HINT .foldLeft()
    //  begin
    val reduced = odds.foldLeft(10)(_ * _)
    //  end

    assert(reduced.equals(9450), true)
  }

  test("Generate list from range") {

    //  HINT ( to by ) .toList()
    //  begin
    val odds :List[Int] = (1 to 9 by 2).toList
    //  end

    assert(odds(0).equals(1), true)
    assert(odds(1).equals(3), true)
    assert(odds(2).equals(5), true)
    assert(odds(3).equals(7), true)
    assert(odds(4).equals(9), true)
  }

  test("Get head of list") {
    val odds :List[Int] = (1 to 9 by 2).toList

    //  HINT .head
    //  begin
    val head = odds.head
    //  end

    assert(head.equals(1), true)
  }

  test("Get tail of list") {
    val odds :List[Int] = (1 to 9 by 2).toList

    //  HINT .tail
    //  begin
    val oddsTail = odds.tail
    //  end

    assert(oddsTail(0).equals(3), true)
    assert(oddsTail(1).equals(5), true)
    assert(oddsTail(2).equals(7), true)
    assert(oddsTail(3).equals(9), true)
  }
}