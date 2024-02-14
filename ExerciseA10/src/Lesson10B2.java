import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**.
 * Lesson10B2 Class
 * 
 *
 * @author NyiNyiHtun
 */
public class Lesson10B2 {
  /**.
   * Main method
   */
  public static void main(String[] arg) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "SJIS"))) {
      String str = br.readLine();
      System.out.println("入力した文章は" + str + "です。");
      System.out.println("入力した文章を逆から読むと");

      for (int i = str.length() - 1; i >= 0; i--) {
        System.out.print(str.charAt(i));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
