// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        double d = 2.6;
        int n = (int)(d + 5);
        System.out.println("n = " +  n);

        double a = 1.0;
        double b = 3.0;
        double c = -4.0;

        double r1 = 0;
        double r2 = 0;

        double e = b * b - 4 * a * c;

       r1 = (-b + Math.sqrt(e)) / (2 * a);
       r2 =  (-b - Math.sqrt(e)) / (2 * a);
       System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}