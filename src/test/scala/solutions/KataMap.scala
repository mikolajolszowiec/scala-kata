package solutions

import org.scalatest.FunSuite

class KataTestMap extends FunSuite {

  test("define Map odds with 1,3,5,7,9") {

    //  HINT Map( Int -> String )
    //  begin
    val myMap : Map[Int,String] = Map(1->"one",3->"three",5->"five",7->"seven",9->"nine")
    //  end

    assert(myMap.contains(1), true)
    assert(myMap.contains(3), true)
    assert(myMap.contains(5), true)
    assert(myMap.contains(7), true)
    assert(myMap.contains(9), true)
  }

  test("add to defined map another pair") {
    var myMap : Map[Int,String] = Map(1->"one",3->"three",5->"five",7->"seven",9->"nine")

    //  HINT map + ()
    //  begin
    myMap = myMap + (2->"two")
    //  end

    assert(myMap.contains(1), true)
    assert(myMap.contains(2), true)
    assert(myMap.contains(3), true)
    assert(myMap.contains(5), true)
    assert(myMap.contains(7), true)
    assert(myMap.contains(9), true)
  }

  test("remove key from defined pair") {
    var myMap : Map[Int,String] = Map(1->"one",3->"three",5->"five",7->"seven",9->"nine")

    //  HINT map - key
    //  begin
    myMap = myMap - 3
    //  end

    assert(myMap.contains(1), true)
    assert(myMap.contains(3).equals(false))
    assert(myMap.contains(5), true)
    assert(myMap.contains(7), true)
    assert(myMap.contains(9), true)
  }

  test("remove List of keys from defined pair") {
    var myMap : Map[Int,String] = Map(1->"one",3->"three",5->"five",7->"seven",9->"nine")

    //  HINT map -- List
    //  begin
    myMap = myMap -- List(1,3)
    //  end

    assert(myMap.contains(1).equals(false))
    assert(myMap.contains(3).equals(false))
    assert(myMap.contains(5))
    assert(myMap.contains(7))
    assert(myMap.contains(9))
  }

  test("get value form key") {
    val myMap : Map[Int,String] = Map(1->"one",3->"three",5->"five",7->"seven",9->"nine")

    //  HINT map(Int)
    //  begin
    val one:String = myMap(1)
    //  end

    assert(one.equals("one"))
  }

  test("get size of map") {
    val myMap : Map[Int,String] = Map(1->"one",3->"three",5->"five",7->"seven",9->"nine")

    //  HINT  .size
    //  begin
    val size = myMap.size
    //  end

    assert(size.equals(5))
  }
}
