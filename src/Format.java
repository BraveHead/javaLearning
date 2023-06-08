import java.util.Scanner;

public class Format {
    public static  void main(String[] args) {
        // 请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），
        // 然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
        int prev = 0;
        int cure = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("输入上次考试成绩:");
        prev  = scanner.nextInt();
        System.out.print("输入本次考试成绩:");
        cure = scanner.nextInt();
        double precent = (double)(cure - prev) / prev * 100;
        System.out.printf("你的成绩本次提高%.2f%% \n", precent);
    }
}
