package solutions

import org.scalatest.FunSuite

class KataTestSet extends FunSuite {

  test("define Set with odds 1,3,5,7,9") {

    //  HINT Set()
    //  begin
    val mySet: Set[Int] = Set(1,3,5,7,9)
    //  end

    assert(mySet.contains(1), true)
    assert(mySet.contains(3), true)
    assert(mySet.contains(5), true)
    assert(mySet.contains(7), true)
    assert(mySet.contains(9), true)
  }

  test("get Set size") {
    val mySet: Set[Int] = Set(1,3,5,7,9)

    //  HINT .size
    //  begin
    val size = mySet.size
    //  end

    assert(size.equals(5))
  }

  test("define sets union") {
    val set1: Set[Int] = Set(5,7,9)
    val set2: Set[Int] = Set(1,3,5)

    //  HINT .union
    //  begin
    val mySet: Set[Int] = set1.union(set2)
    //  end

    assert(mySet.contains(1), true)
    assert(mySet.contains(3), true)
    assert(mySet.contains(5), true)
    assert(mySet.contains(7), true)
    assert(mySet.contains(9), true)
  }

  test("define sets intersection") {
    val set1: Set[Int] = Set(5,7,9)
    val set2: Set[Int] = Set(1,3,5)

    //  HINT intersect
    //  begin
    val mySet: Set[Int] = set1.intersect(set2)
    //  end

    assert(mySet.contains(1).equals(false), true)
    assert(mySet.contains(3).equals(false), true)
    assert(mySet.contains(5), true)
    assert(mySet.contains(7).equals(false), true)
    assert(mySet.contains(9).equals(false), true)
  }

  test("define sets difference") {
    val set1: Set[Int] = Set(5,7,9)
    val set2 : Set[Int]= Set(1,3,5)

    //  HINT diff
    //  begin
    val mySet: Set[Int] = set1.diff(set2)
    //  end

    assert(mySet.contains(1).equals(false), true)
    assert(mySet.contains(3).equals(false), true)
    assert(mySet.contains(5).equals(false), true)
    assert(mySet.contains(7), true)
    assert(mySet.contains(9), true)
  }

  test("comapre sets") {
    val set1: Set[Int] = Set(5,7,9)
    val set2: Set[Int] = Set(1,3,5)
    val set3: Set[Int] = Set(1,3,5)

    //  HINT equals
    //  begin
    val comparison1_2 = set1.equals(set2)
    val comparison3_2 = set3.equals(set2)
    //  end

    assert(comparison1_2.equals(false))
    assert(comparison3_2.equals(true))
  }

  test("check if set contain number") {
    val mySet: Set[Int] = Set(5,7,9)

    //  HINT set(Int)
    //  begin
    val comparison1: Boolean = mySet(1)
    val comparison3: Boolean = mySet(3)
    val comparison5: Boolean = mySet(5)
    //  end

    assert(comparison1.equals(false))
    assert(comparison3.equals(false))
    assert(comparison5.equals(true))
  }

  test("define List odds with 1,3,5 and size of 3") {
    val mySet: Set[Int] = Set(1,3,5,7,9)

    //  HINT .toList
    //  begin
    val odds : List[Int] = mySet.toList
    //  end

    assert(odds.contains(1), true)
    assert(odds.contains(3), true)
    assert(odds.contains(5), true)
    assert(odds.contains(7), true)
    assert(odds.contains(9), true)
  }
}