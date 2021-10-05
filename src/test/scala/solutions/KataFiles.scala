package solutions

import java.io.File

import org.scalatest.FunSuite

import scala.io.Source

class KataTestFiles extends FunSuite {

  test("get dir path") {

    //  HINT System.getPoperty() user.dir
    //  begin
    val dir: String = System.getProperty("user.dir")
    //  end

    assert(dir != null)
  }

  test("get file") {

    //  HINT use new File(path)
    //  begin
    val dir: String = System.getProperty("user.dir")
    val f: File = new File(dir + "/files/test1")
    //  end

    assert(f != null)
  }

  test("load text from ../files/test1") {

    //  HINT Source.fromFile(file)
    //  begin
    val dir: String = System.getProperty("user.dir")
    val f: File = new File(dir + "/files/test1")
    val str: List[String] = Source
      .fromFile(f)
      .getLines()
      .toList
    //  end

    assert(f != null)
    assert(str.size == 4)
  }

  test("load files from ../files/") {
    val dir: String = System.getProperty("user.dir")
    val f: File = new File(dir + "/files")

    //  HINT  listFiles()
    //  begin
    val filesList: List[String] = f.listFiles().filter(_.isFile).map(_.getName).toList
    //  end

    assert(filesList.contains("test1").equals(true))
    assert(filesList.contains("test2").equals(true))
    assert(filesList.contains("test3").equals(true))
    assert(filesList.contains("test4").equals(false))
  }

  test("load csv from ../files/test5.csv") {

    // HINT Source.fromFile()
    //  begin
    val dir: String = System.getProperty("user.dir")
    val f: File = new File(dir + "/files/test5.csv")
    val strList: List[String] = Source
      .fromFile(f)
      .getLines()
      .toList
    //  end

    assert(strList.size == 986)
  }

}