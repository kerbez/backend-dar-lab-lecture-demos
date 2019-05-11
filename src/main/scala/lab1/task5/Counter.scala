package lab1.task5

case class Counter(v:Int = 0){
  def inc(cnt:Int = 1):Counter=copy(v + cnt)
  def dec(cnt:Int = 1):Counter=new Counter(v-cnt);
  def count:Int=v;
}
