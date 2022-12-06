public class Main {
    public static void main(String[] args) {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }

            //Задание 1
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            if (i == arr.length - 1) {
                System.out.println("Сумма трат за месяц составила " + total + " рублей.");
            }
            }
            //Задание 2

        }
}