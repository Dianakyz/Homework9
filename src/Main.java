public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int maxSum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.print("Максимальная сумма трат за день составила " + maxSum + " рублей. ");

        int minSum = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        double sum = 0;
        int allDays = 30;

        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Средняя сумма трат за месяц составила " + (sum / allDays) + " рублей в день");
    }

    public static void task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 10; i < reverseFullName.length; i--) {
            if (i >= 0) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}


