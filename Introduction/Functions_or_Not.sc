import scala.collection.mutable.HashSet;
import scala.io.StdIn


object Solution {
    def main(args: Array[String]) {
        var t = StdIn.readInt;
        while(t > 0) {
            t = t - 1;
            var s = new HashSet[Int]();
            var flag = true;
            var n = StdIn.readInt;
            for(i <- Range(0, n, 1)) {
                var x = StdIn.readLine().split(" ").map(_.toInt);
                if(!s.contains(x(0))) {
                    s.add(x(0));
                } else {
                    flag=false;
                }
            }
            if(flag) {
              println("YES");
            }
            else { 
              println("NO");
            }
        }
    }
}
