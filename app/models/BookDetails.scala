

sealed abstract class Testament(val name: String)
case object OldTestament extends Testament("Old Testament")
case object NewTestament extends Testament("New Testament")


sealed abstract class BookGroup(val description: String)

case object Pentateuch extends BookGroup("THE PENTATEUCH")
case class Book(name: String, synopsis: String, testament: Testament)

class BookDetails(metaData: Book) {

  val name: String = metaData.name





}