package excercises

import java.io.File

import org.scalatest.FunSuite

import scala.io.Source

class KataTestFiles extends FunSuite {

  test("get dir path") {

    //  HINT System.getPoperty() user.dir
    //  begin
    val dir: String = null
    //  end

    //    println(f)
    println(dir)
    assert(dir != null)
  }

  test("get file") {

    //  HINT use new File(path)
    //  begin
    val dir: String = null
    val f: File = null
    //  end

    //    println(f)
    println(dir)
    assert(f != null)
  }

  test("load text from ../files/test1") {

    //  HINT Source.fromFile(file)
    //  begin
    val dir: String = null
    val f: File = null
    val str: List[String] = null
    //  end

    assert(f != null)
    assert(str.size == 4)
  }

  test("load files from ../files/") {

    val dir: String = System.getProperty("user.dir")
    val f: File = new File(dir + "/files")

    //  HINT  listFiles()
    //  begin
    val filesList: List[File] = null
    //  end
    assert(filesList.contains("test1").equals(true))
    assert(filesList.contains("test2").equals(true))
    assert(filesList.contains("test3").equals(true))
    assert(filesList.contains("test4").equals(false))
  }

  test("load csv from ../files/test5.csv") {

    //  begin
    val dir: String = null
    val f: File = null
    val strList: List[String] = null
    //  end
    assert(strList.size == 986)
  }

}