package CodeWars_8kyu.BMI;

public class Client {
    public static void main(String[] args) {
        String bmi = BMI.bmi(80, 1.80);
        System.out.println(bmi);
        String bmi2 = BMI.bmi(90, 1.80);
        System.out.println(bmi2);
        String bmi3 = BMI.bmi(100, 1.80);
        System.out.println(bmi3);
    }
}
