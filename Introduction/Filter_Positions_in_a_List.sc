def f (arr: List [Int]): List [Int] = {
  arr.zipWithIndex.filter (x => x._2 % 2 == 1).map (_._1);
}
