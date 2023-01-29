def f (arr: List [Int]): List [Int] =
  if (arr != Nil)
    f (arr.tail) ::: List (arr.head)
  else arr
