
object EntryPoint extends App {
    // def main(params:Array[String]) = {
        println("Hello Bass")
    // }

    import scalaj.http._
    val response: HttpResponse[String] = Http("http://feeds.bbci.co.uk/news/rss.xml").asString

    import scala.xml.XML
    import scala.xml.Elem
    val elems: Elem = XML.loadString(response.body)

    import scala.xml.NodeSeq
    val nodes: NodeSeq = elems \\ "item" \ "title"
    
    val queens: NodeSeq = for (
    node <-  nodes
    if node.text.contains("Queen")
    ) yield node

    queens.foreach(queen => println(queen.text))
}


// Load Rss feed มาจาก 3 ที่ ให้ filter ด้วย keyword แล้ว save ลงไฟล์ DD-MM-YYYY-HH-MM-SS-{KEY-WORD}