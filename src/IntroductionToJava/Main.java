package IntroductionToJava;

public class Main {

    public static int task1(int n) {
        if (n > 0) {
            return n * n;
        }
        if (n < 0) {
            return -n;
        }
        if (n == 0) {
            return 0;
        }
        return n;
    }

    public static int task2(int n) {
        int data[] = {n % 10, n / 10 % 10, n / 100 % 10};
        for (int start = 0; start < data.length - 1; start++) {
            for (int index = 0; index < data.length - 1 - start; index++) {
                if (data[index] < data[index + 1]) {
                    swap(data, index);
                }
            }
        }
        data[0] *= 100;
        data[1] *= 10;
        n = data[0] + data[1] + data[2];
        return n;
    }

    private static void swap(int array[], int i) {
        int tmp = array[i];
        array[i] = array[(i + 1)];
        array[(i + 1)] = tmp;
    }
}
