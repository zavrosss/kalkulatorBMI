public class Main {
    public static void main(String[] args) {
        double masa = 100;
        double wzrost = 1.9;
        double bmi = masa / (wzrost * wzrost);
        double zaokragloneBMI = Math.round(bmi * 10.0) / 10.0;
        System.out.println("Twoje BMI wynosi: " + zaokragloneBMI);
    }
}