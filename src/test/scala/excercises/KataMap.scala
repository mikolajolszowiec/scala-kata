package excercises

import org.scalatest.FunSuite

class KataTestMap extends FunSuite {

  test("define Map odds with 1,3,5,7,9") {
    //  HINT Map( Int -> String )
    //  begin
    val myMap: Map[Int, String] = null
    //  end

    assert(myMap.contains(1), true)
    assert(myMap.contains(3), true)
    assert(myMap.contains(5), true)
    assert(myMap.contains(7), true)
    assert(myMap.contains(9), true)
    assert(myMap(1).equals("one"), true)
    assert(myMap(3).equals("three"), true)
    assert(myMap(5).equals("five"), true)
    assert(myMap(7).equals("seven"), true)
    assert(myMap(9).equals("nine"), true)
  }

  test("add to defined map another pair (2->\"two\")") {
    var myMap: Map[Int, String] = Map(1 -> "one", 3 -> "three", 5 -> "five", 7 -> "seven", 9 -> "nine")
    //  HINT map + ()
    //  begin
    myMap = null
    //  end

    assert(myMap.contains(1), true)
    assert(myMap.contains(2), true)
    assert(myMap.contains(3), true)
    assert(myMap.contains(5), true)
    assert(myMap.contains(7), true)
    assert(myMap.contains(9), true)
    assert(myMap(1).equals("one"), true)
    assert(myMap(2).equals("two"), true)
    assert(myMap(3).equals("three"), true)
    assert(myMap(5).equals("five"), true)
    assert(myMap(7).equals("seven"), true)
    assert(myMap(9).equals("nine"), true)
  }

  test("remove key = 3 from defined pair") {
    var myMap: Map[Int, String] = Map(1 -> "one", 3 -> "three", 5 -> "five", 7 -> "seven", 9 -> "nine")
    //  HINT map - key
    //  begin
    myMap = null
    //  end

    assert(myMap.contains(1), true)
    assert(myMap.contains(3).equals(false))
    assert(myMap.contains(5), true)
    assert(myMap.contains(7), true)
    assert(myMap.contains(9), true)
  }

  test("remove List of keys (1,3) from defined pair") {
    var myMap: Map[Int, String] = Map(1 -> "one", 3 -> "three", 5 -> "five", 7 -> "seven", 9 -> "nine")
    //  HINT map -- List
    //  begin
    myMap = null
    //  end

    assert(myMap.contains(1).equals(false))
    assert(myMap.contains(3).equals(false))
    assert(myMap.contains(5))
    assert(myMap.contains(7))
    assert(myMap.contains(9))
  }

  test("get value form key") {
    val myMap: Map[Int, String] = Map(1 -> "one", 3 -> "three", 5 -> "five", 7 -> "seven", 9 -> "nine")
    //  HINT map(Int)
    //  begin
    val one: String = null
    //  end

    assert(one.equals("one"))
  }

  test("get head of a map") {
    val myMap: Map[Int, String] = Map(1 -> "one", 3 -> "three", 5 -> "five", 7 -> "seven", 9 -> "nine")
    //  HINT  .head
    //  begin
    val (key, value):(Int,String) = null
    //  end

    println("key: " + key)
    println("value: " + value)
  }

  test("get last element from map") {
    val myMap: Map[Int, String] = Map(1 -> "one", 3 -> "three", 5 -> "five", 7 -> "seven", 9 -> "nine")
    //  HINT .last
    //  begin
    val (key, value):(Int,String)  = null
    //  end

    println("key: " + key)
    println("value: " + value)
  }

  test("get size of map") {
    val myMap: Map[Int, String] = Map(1 -> "one", 3 -> "three", 5 -> "five", 7 -> "seven", 9 -> "nine")
    //  HINT  .size
    //  begin
    val size: Int = 0
    //  end

    assert(size.equals(5))
  }
}
