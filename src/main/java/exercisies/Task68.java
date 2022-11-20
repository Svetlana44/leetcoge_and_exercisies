/*
для сборки результирующей строки с выводом значений
через пробел нужно использовать StringJoiner
 */
package exercisies;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner strJoiner = new StringJoiner(" ");
        for(int i=0;i<arr.length;i++){
            strJoiner.add(String.valueOf(arr[i]));
        }
        System.out.println(strJoiner);
    }
}
