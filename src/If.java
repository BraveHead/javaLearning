public class If {
     public static  void main(String[] args) {
         double k = 82; // kg
         double h = 1.68; // m
         double BMI = k / (h * h);

         if(BMI < 18.5) {
             System.out.print("过轻：低于18.5, 当前为:" + BMI);
             return;
         }
         if(BMI >= 18.5 && BMI <= 25) {
             System.out.print("正常：18.5-25, 当前为:" + BMI);
             return;
         }
         if(BMI > 25 && BMI <= 28) {
             System.out.print("过重：25-28, 当前为:" + BMI);
             return;
         }
         if(BMI > 28 &&  BMI <= 32) {
             System.out.print("肥胖：28-32, 当前为:" + BMI);
             return;
         }
         System.out.print("非常肥胖：高于32, 当前为:" + BMI);
     }
}
