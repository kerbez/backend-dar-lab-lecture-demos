package lab1.task1

//class Counter(val v:Int) {
//  def inc:Counter=new Counter(v+1);
//  def dec:Counter=new Counter(v-1);
//  def count:Int=v;
//
//}

class Counter(val v:Int) {
  def inc(cnt:Int = 1):Counter=new Counter(v+cnt);
  def dec(cnt:Int = 1):Counter=new Counter(v-cnt);
  def count:Int=v;
  def copy(vv: Int = v):Counter = new Counter(vv);
}
