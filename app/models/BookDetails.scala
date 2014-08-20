sealed abstract class Testament(val name: String)

case object OldTestament extends Testament("Old Testament")
case object NewTestamnet extends Testament("New Testament")
case class Book(name: String, synopsis: String, testament: Testament)

class BookDetails(bookmeta: Book) {

  val name: String = bookmeta.name





}