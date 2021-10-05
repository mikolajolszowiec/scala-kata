package excercises

import java.io.File

import org.scalatest.FunSuite
import utils.Estate

import scala.io.Source

class KataStream extends FunSuite {

  test("define Stream ") {
    val estates: List[Estate] = getEstatesList

    //  begin
    val stream:Stream[Estate] = null
    //  end

    assert(stream.getClass.getTypeName == "scala.collection.immutable.Stream$Cons")
  }

  test("filter Stream for SACRAMENTO") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val sacramentos: List[Estate] = null
    //  end

    assert(sacramentos.size == 439)
  }

  test("filter Stream for estates with price < 40000") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val cheap: List[Estate] = null
    //  end

    assert(cheap.size == 53)
  }

  test("find most west estate") {
    val estates: List[Estate] = getEstatesList

    //  HINT
    //  begin
    val mostWest: Estate = null
    //  end

    assert(mostWest.street == "14 CASA VATONI PL")
    assert(mostWest.city == "SACRAMENTO")
    assert(mostWest.longitude == -121.551704)
  }

  test("find 5 estate with lowest price for sqr ft") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val cheapest: List[Tuple2[Estate, Int]] = null
    //  end

    assert(cheapest.size == 5)
    assert(cheapest(0)._1.street == "14151 INDIO DR")
    assert(cheapest(0)._1.city == "SLOUGHHOUSE")
    assert(cheapest(0)._2 == 0)
    assert(cheapest(4)._1.street == "51 OMAHA CT")
    assert(cheapest(4)._1.city == "SACRAMENTO")
    assert(cheapest(4)._2 == 58)
  }

  test("find estate with highest price for sqr ft") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val cheapest: List[Tuple2[Estate, Int]] = null
    //  end

    assert(cheapest.size == 5)
    assert(cheapest(0)._1.street == "5411 10TH AVE")
    assert(cheapest(0)._1.city == "SACRAMENTO")
    assert(cheapest(0)._2 == 619)
    assert(cheapest(4)._1.street == "1500 ORANGE HILL LN")
    assert(cheapest(4)._1.city == "PENRYN")
    assert(cheapest(4)._2 == 383)
  }

  test("count offers in each city, sorted desc") {
    val estates: List[Estate] = getEstatesList

    //  HINT
    //  begin
    val collected: List[(String, Int)] = null
    //  end

    assert(collected.size == 39)
    assert(collected(0)._1 == "SACRAMENTO")
    assert(collected(0)._2 == 439)
    assert(collected(1)._1 == "ELK GROVE")
    assert(collected(1)._2 == 114)
    assert(collected(38)._1 == "SHINGLE SPRINGS")
    assert(collected(38)._2 == 1)
  }

  test("get list with average price for sqr ft in each city") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val collected: List[(String, Int)] = null
    //  end

    assert(collected.size == 39)
    assert(collected(0)._1 == "SHINGLE SPRINGS")
    assert(collected(0)._2 == 0)
    assert(collected(1)._1 == "FORESTHILL")
    assert(collected(1)._2 == 0)
    assert(collected(38)._1 == "PENRYN")
    assert(collected(38)._2 == 383)
  }

  test("get list with average price for sqr meter for each zipcode (zip, city, price/sqr_ft), sorted by price/sqr_ft, only with places where avg price > 0") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val collected: List[(String, String, Int)] = null
    //  end

    assert(collected.size == 66)
    assert(collected(0)._1 == "95648")
    assert(collected(0)._2 == "LINCOLN")
    assert(collected(0)._3 == 13)
    assert(collected(1)._1 == "95682")
    assert(collected(1)._2 == "CAMERON PARK")
    assert(collected(1)._3 == 19)
    assert(collected(65)._1 == "95663")
    assert(collected(65)._2 == "PENRYN")
    assert(collected(65)._3 == 383)
  }

  test("count flattypes, grouped by city (city, flattype, number_of_beds), sorted desc by number of beds") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val grouped: List[(String, String, Int)] = null
    //  end

    assert(grouped.size == 56)
    assert(grouped(0)._1 == "SACRAMENTO")
    assert(grouped(0)._2 == "Residential")
    assert(grouped(0)._3 == 402)
    assert(grouped(1)._1 == "ELK GROVE")
    assert(grouped(1)._2 == "Residential")
    assert(grouped(1)._3 == 108)
    assert(grouped(6)._1 == "SACRAMENTO")
    assert(grouped(6)._2 == "Condo")
    assert(grouped(6)._3 == 27)
  }

  test("get max distance between estates in each city") {
    val estates: List[Estate] = getEstatesList
    val calc_distance = (e1: Estate, e2: Estate) => theHaversineFormula(e1.latitude, e1.longitude, e2.latitude, e2.longitude)
    //  HINT stream in stream
    //  begin
    val groupByCities: List[(String, Double)] = null
    //  end

    assert(groupByCities.size == 39)
    assert(groupByCities(0)._1 == "SACRAMENTO")
    assert(groupByCities(1)._1 == "PLACERVILLE")
    assert(groupByCities(2)._1 == "ELK GROVE")
    assert(groupByCities(3)._1 == "ROSEVILLE")
  }

  test("get middle point in each city") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val groupByCities: List[(String, (Double,Double))] = null
    //  end

    assert(groupByCities.size == 39)
    assert(groupByCities(0)._1 == "SACRAMENTO")
    assert(groupByCities(0)._2._1 == -121.44305899544423)
    assert(groupByCities(0)._2._2 == 38.562167492027314)
    assert(groupByCities(1)._1 == "CITRUS HEIGHTS")
    assert(groupByCities(1)._2._1 == -121.30020405714282)
    assert(groupByCities(1)._2._2 == 38.701382514285726)
    assert(groupByCities(0)._1 == "RANCHO MURIETA")
    assert(groupByCities(0)._2._1 == -121.08746466666666)
    assert(groupByCities(0)._2._2 == 38.49742966666667)
  }

  test("count beds in each city") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val groupByCities: Map[String, Int] = null
    //  end
    println(groupByCities)
    assert(groupByCities.size == 39)
    assert(groupByCities.get("SACRAMENTO") == 1329)
    assert(groupByCities.get("CARMICHAEL") == 61)
  }

  test("count avg beds in each city, and take top 3 with highest avg") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val citiesWithBaths: List[(String, Double)] = null
    //  end
    println(citiesWithBaths)
    assert(citiesWithBaths.size == 3)
    assert(citiesWithBaths(0)._1 == "GRANITE BAY")
    assert(citiesWithBaths(0)._2 == 4.666666666666667)
    assert(citiesWithBaths(1)._1 == "LOOMIS")
    assert(citiesWithBaths(1)._2 == 4.0)
    assert(citiesWithBaths(2)._1 == "EL DORADO HILLS")
    assert(citiesWithBaths(2)._2 == 3.4347826086956523)
  }

  test("in which 5 cities is highest average price") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val expensiveCities: List[(String,Double)] = null
    //  end
    println(expensiveCities)
    assert(expensiveCities.size == 5)
    assert(expensiveCities(0)._1 == "GRANITE BAY")
    assert(expensiveCities(0)._2 == 678733.3333333334)
    assert(expensiveCities(1)._1 == "WILTON")
    assert(expensiveCities(1)._2 == 617508.4)
    assert(expensiveCities(2)._1 == "LOOMIS")
    assert(expensiveCities(2)._2 == 567000.0)
    assert(expensiveCities(3)._1 == "PENRYN")
    assert(expensiveCities(3)._2 == 506688.0)
    assert(expensiveCities(4)._1 == "EL DORADO HILLS")
    assert(expensiveCities(4)._2 == 491698.95652173914)
  }

  test("what is smallest price for 2 baths and 2 beds") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val cheapest: Estate = null
    //  end

    assert(cheapest.street == "3720 VISTA DE MADERA")
    assert(cheapest.city == "LINCOLN")
    assert(cheapest.price == 1551)
  }

  test("get number of zipcodes for each city") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val cities_zips: List[(String, Int)] = null
    //  end

    assert(cities_zips.size == 39)
    assert(cities_zips(0)._1 == "SACRAMENTO")
    assert(cities_zips(0)._2 == 26)
    assert(cities_zips(1)._1 == "ELK GROVE")
    assert(cities_zips(1)._2 == 3)
    assert(cities_zips(2)._1 == "ROSEVILLE")
    assert(cities_zips(2)._2 == 3)
  }

  test("find what type of estate is cheapest") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val flat_types: List[(String,Double)] = null
    //  end

    assert(flat_types.size == 4)
    assert(flat_types(0)._1 == "Condo")
    assert(flat_types(0)._2 == 150082.1851851852)
    assert(flat_types(1)._1 == "Multi-Family")
    assert(flat_types(1)._2 == 224534.6923076923)
    assert(flat_types(2)._1 == "Residential")
    assert(flat_types(2)._2 == 239186.1624863686)
    assert(flat_types(3)._1 == "Unkown")
    assert(flat_types(3)._2 == 275000.0)
  }

  test("find if there are any duplicates in addresses, sorted by alphabeticall order") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val addresses: List[(String, Int)] = null
    //  end

    assert(addresses.size == 4)
    assert(addresses(0)._1 == "4734 14TH AVE SACRAMENTO")
    assert(addresses(0)._2 == 2)
    assert(addresses(1)._1 == "7 CRYSTALWOOD CIR LINCOLN")
    assert(addresses(2)._1 == "1223 LAMBERTON CIR SACRAMENTO")
    assert(addresses(3)._1 == "8306 CURLEW CT CITRUS HEIGHTS")

  }

  test("find if there are any duplicates in street names") {
    val estates: List[String] = getEstatesList.map(_.street)
      .map(street => street.substring(street.indexOf(" ") + 1))
    //  HINT
    //  begin
    val duplicated_streets: List[(String, Int)] = null
    //  end
    println(duplicated_streets)
    assert(duplicated_streets.size == 62)
    assert(duplicated_streets(0)._1 == "CRYSTALWOOD CIR")
    assert(duplicated_streets(0)._2 == 33)
    assert(duplicated_streets(1)._1 == "E ST")
    assert(duplicated_streets(1)._2 == 9)
    assert(duplicated_streets(2)._1 == "22ND AVE")
    assert(duplicated_streets(2)._2 == 4)
  }

  test("count middle point for each city, and for all cities, check which city is in middle") {
    val estates: List[Estate] = getEstatesList
    //  HINT
    //  begin
    val sacramentoList: Map[String, (Double, Double)] = null
    //  end

    assert(sacramentoList("SACRAMENTO") == (-121.44305899544423,38.562167492027314))
  }

  def theHaversineFormula(lat_1: Double, lon_1: Double, lat_2: Double, lon_2: Double): Double = {
    val GLOBE_RADIUS = 6371
    val y: Double = Math.toRadians(lat_2 - lat_1)
    val x: Double = Math.toRadians(lon_2 - lon_1)
    val a = Math.sin(y / 2) * Math.sin(y / 2) + Math.cos(Math.toRadians(lat_1)) * Math.cos(Math.toRadians(lat_2)) *
      Math.sin(x / 2) * Math.sin(x / 2)
    GLOBE_RADIUS * 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))
  }

  def getEstatesList: List[Estate] = {
    val dir: String = System.getProperty("user.dir")
    val f: File = new File(dir + "/files/test5.csv")
    Source
      .fromFile(f)
      .getLines()
      .toList
      .tail.
      toStream.map(line => {
      val words = line.split(",")
      Estate(words(0), words(1), words(2), words(3), Integer.valueOf(words(4)), Integer.valueOf(words(5)), Integer.valueOf(words(6)), words(7), words(8), Integer.valueOf(words(9)), words(10).toDouble, words(11).toDouble)
    }
    ).toList

  }

}
