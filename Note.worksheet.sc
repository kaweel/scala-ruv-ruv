println("HELLO NOTE")

val x = 0;

if (x < 0) {
  println("zero")
} else if (x > 0) {
  println("positive")
} else {
  println("zero")
}


val people = List("Rockman","Robocop")

people.foreach(p => println(p))

for(p <- people) println(p)

val integers: List[Int] = List(1,2,3,4,5,6,7,8)
val int1 = for (i <- integers) yield i+1

val moreThan5 = for (
    i <- integers
    if i > 5
) yield i
