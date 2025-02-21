import java.util.ArrayList;
import java.util.Random;

class SortTest {
    public static ArrayList<Integer> generateRandomArray(int size, int bound) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array.add(rand.nextInt(bound));
        }
        return array;
    }

    public static void main(String[] args) {
        int arraySize = 10_000;
        int bound = 100_000;

        ArrayList<Integer> originalArray = generateRandomArray(arraySize, bound);

        ArrayList<Integer> array1 = new ArrayList<>(originalArray);
        ArrayList<Integer> array2 = new ArrayList<>(originalArray);

        System.out.println("BubbleSort1 performance:");
        PerformanceMetrics.measureRuntime(() -> Sort.bubbleSort1(array1));

        System.out.println("BubbleSort2 performance:");
        PerformanceMetrics.measureRuntime(() -> Sort.bubbleSort2(array2));
    }
}