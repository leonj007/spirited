sealed abstract class Constraint(val name: String, val verifier: Int => Boolean)

case object NotTooBig extends Constraint("NotTooBig", (_ < 1000))
case object NonZero extends Constraint("NonZero", (_ != 0))
case class NotEquals(x: Int) extends Constraint("NotEquals " + x, (_ != x))case class Book(name: String, synopsis: String, testament: Testament)

class BookDetails(bookmeta: Book){

}