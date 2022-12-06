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
            int max = 90000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr [i];
            }
        }
        int min = 210000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min);
            min = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
        //Задание 3
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = average + arr[i];
            if (i == arr.length - 1) {
                average = average / arr.length;
                System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
            }
        }
        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        }
}