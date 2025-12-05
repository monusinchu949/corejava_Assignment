package corejava;

public class Countelement {
public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 3, 5, 5, 1};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }

        System.out.println("Count of adjacent equal elements: " + count);
    }
}

