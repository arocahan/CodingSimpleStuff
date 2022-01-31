public class Test {
    public int solution(String[] array) {
        int counter = 0;
        int size = 15;

        String[] array2 = new String[size];

        for (int i = 0; i + 2 < array.length; i++) {
            array2[i] = array[i + 1] + array[i + 2];
            System.out.println(array2[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 1; j < array2.length; j++) {
                if (array2[i] != array2[j]) {
                    counter++;
                }
                return counter;
            }
        }
        return -1;
    }

    public int solution(int[] array) {
        int counter = 0;
        if (array == null) {
            return 0;
        }
        if (array[0] == 1 || array[0] == 2) {
            for (int i = 2; i < array.length; i++) {
                if (array[i] < array[i + 1]) {
                    counter++;
                }
                return counter + 2;
            }
        } else {
            return 0;
        }
        return 0;
    }
}
