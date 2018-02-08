package JavaIntro;

import java.util.Arrays;

/**
 * Created by hansoljeong on 2017. 12. 27..
 */
public class ShufleArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(array));

        int[] result = shuffle(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] shuffle (int[] result){
        int temp;
        int seed;

        for(int i  = 0; i < result.length; i++){
            seed = (int)(Math.random() * 8) + 1;

            temp = result[i];

            result[i] = result[seed];
            result[seed] = temp;

        }

        return result;
    }
}
