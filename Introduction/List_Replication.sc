def f (num: Int, arr: List [Int]): List [Int] =
  arr.flatMap (n => List.fill (num) (n))
