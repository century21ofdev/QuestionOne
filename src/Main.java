import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a = findMissing(new int[]{7581, 54, 2321, 4152, 0, 34, 6, 1}, new int[]{7581, 54, 0, 34, 1});
        System.out.println(Arrays.toString(a));
    }

    private static int[] findMissing(int[] arr1, int[] arr2) {
        int[] resultSet;
        ArrayList<Integer> accumList = new ArrayList<>();
        for (int value : arr1) {
            int bufferAndSecondArrVar;

            for (bufferAndSecondArrVar = 0; bufferAndSecondArrVar < arr2.length; bufferAndSecondArrVar++)
                if (value == arr2[bufferAndSecondArrVar])
                    break;

            if (bufferAndSecondArrVar == arr2.length) {
                accumList.add(value);
            }

        }
        resultSet = accumList.stream().mapToInt(Integer::intValue).toArray();
        return resultSet;
    }
}
