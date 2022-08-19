import java.util.Random;

public class Main {
    public static void main(String[] args) {task6 ();} {
    }
    //метод для формирования массива случайных чисел
    public static int[] initRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task6() {

    }
}