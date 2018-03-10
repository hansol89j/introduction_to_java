package ch6_methods;

/**
 * Created by hansoljeong on 2018. 2. 21..
 */
public class TestMax {
    public static void main(String[] args){
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    public static int max(int n1, int n2){
        int result;

        if(n1 > n2){
            result = n1;
        }
        else {
            result = n2;
        }
        return result;
    }
}
