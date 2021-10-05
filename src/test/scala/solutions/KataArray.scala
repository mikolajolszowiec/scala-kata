package solutions

import org.scalatest.FunSuite

class KataTestArray extends FunSuite {

  test("Define array") {

    //  HINT Array()
    //  begin
    val odds :Array[Int] = Array(1,3,5)
    //  end

    assert(odds(0).equals(1), true)
    assert(odds(1).equals(3), true)
    assert(odds(2).equals(5), true)
  }

  test("Convert list to array") {
    val odds :List[Int] = List(1,3,5)

    //  HINT .toArray
    //  begin
    val oddsArr:Array[Int] = odds.toArray;
    //  end

    assert(oddsArr(0).equals(1), true)
    assert(oddsArr(1).equals(3), true)
    assert(oddsArr(2).equals(5), true)
  }

 test("Convert array to sequence") {
    val oddsArr:Array[Int] = List(1,3,5).toArray

    //  HINT .toSeq
    //  begin
    val oddsSeq:Seq[Int] = oddsArr.toSeq
    //  end

    assert(oddsSeq(0).equals(1), true)
    assert(oddsSeq(1).equals(3), true)
    assert(oddsSeq(2).equals(5), true)
  }

  test("Generate sequence") {

    //  HINT for( v <- 1 to x) yield v
    //  begin
    val oddsSeq:Seq[Int] = for( v <- 1 to 4) yield v
    //  end

    assert(oddsSeq(0).equals(1), true)
    assert(oddsSeq(1).equals(2), true)
    assert(oddsSeq(2).equals(3), true)
    assert(oddsSeq(3).equals(4), true)
  }

  test("Generate sequence with condition") {

    //  HINT for( v <- 1 to x if bool) yield v
    //  begin
    val oddsSeq:Seq[Int] = for( v <- 1 to 12 if v % 3 ==0 ) yield v
    //  end

    assert(oddsSeq(0).equals(3), true)
    assert(oddsSeq(1).equals(6), true)
    assert(oddsSeq(2).equals(9), true)
    assert(oddsSeq(3).equals(12), true)
  }

  test("Filter sequence for i <20") {
    val oddsSeq:Seq[Int] = for( v <- 1 to 42 if v % 3 ==0 ) yield v

    //  HINT .filter
    //  begin
    val oddsSeqFiltered = oddsSeq.filter(_ < 20)
    //  end

    assert(oddsSeqFiltered(0).equals(3), true)
    assert(oddsSeqFiltered(1).equals(6), true)
    assert(oddsSeqFiltered(2).equals(9), true)
    assert(oddsSeqFiltered(3).equals(12), true)
    assert(oddsSeqFiltered(4).equals(15), true)
    assert(oddsSeqFiltered(5).equals(18), true)
    assert(oddsSeqFiltered.size.equals(6), true)
  }
}

