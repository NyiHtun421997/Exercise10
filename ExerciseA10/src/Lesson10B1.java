/**.
 * Lesson10B1 Class
 * 
 *
 * @author NyiNyiHtun
 */
public class Lesson10B1 {
  /**.
   * Main method
   */
  public static void main(String[] arg) {

    Lesson10B1 lesson10b1 = new Lesson10B1();
    System.out.println("四捨五入前：100÷3=" + lesson10b1.divideBy3(100));
    System.out.println("四捨五入後：100÷3=" + lesson10b1.divideBy3AndRound(100));

    System.out.println("四捨五入前：77÷9=" + lesson10b1.divideBy9(77));
    System.out.println("四捨五入後：77÷9=" + lesson10b1.divideBy9AndRound(77));
  }

  public double divideBy3(int number) {
    return (double) number / 3;
  }

  public long divideBy3AndRound(int number) {
    return Math.round((double) number / 3);
  }

  public double divideBy9(int number) {
    return (double) number / 9;
  }

  public long divideBy9AndRound(int number) {
    return Math.round((double) number / 9);
  }
}