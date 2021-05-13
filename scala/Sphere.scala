import scala.math.pow
object Sphere extends App{
  def SphereV(r:Double)=(4/3)*math.Pi*pow(r,3);
  println("\nSphere's Volume is: " +SphereV(5) + "\n");
}
