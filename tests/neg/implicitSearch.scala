object Test {

  type T = String

  class Ord[T]
  implicit def listOrd[T](implicit o: Ord[T]): Ord[List[T]] = ???
  implicit def intOrd: Ord[Int] = ???

  def sort[T](xs: List[T])(implicit o: Ord[T]): List[T] = ???

  def g(xs: List[Int]) =
    sort(xs)

  def f[T](xs: List[List[List[T]]]) =
    sort(xs)  // error TODO: improve the -explain-implicts diagnostic

    listOrd(listOrd(implicitly[Ord[T]] /*not found*/)) // error
}
