public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(25, 28));
        System.out.println(ageAndTemperature(21, 35));
        System.out.println(ageAndTemperature(76, 77));
        System.out.println(ageAndTemperature(10, 27));
        System.out.println(ageAndTemperature(25, 20));
        System.out.println(ageAndTemperature(generateRandomAge(),33));
        int aa=22+33;

    }

    public static String ageAndTemperature(int age, int temp) {
        String abc = "Можно идти гулять";
        String home = "Оставайтесь дома";
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 35) {
            return abc;
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return abc;
        }
        else if (age > 45 && temp >= -10 && temp <= 25){
            return abc;
        }
        else {
            return home;
        }
    }

    public static int generateRandomAge(){
        int a = 0+(int)(Math.random()*100);
        return a;
    }
}