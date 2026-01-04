package ass1;

import java.util.Arrays;

public class parttwo11 {

    public static void executeDefragmentation(String[] array) {
        int index = 0;
        String[] temp = new String[array.length];

        for (String s : array) {
            if (s != null) {
                temp[index++] = s;
            }
        }

        System.arraycopy(temp, 0, array, 0, array.length);
    }
}
