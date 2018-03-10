package ch6_methods;

/**
 * Created by hansoljeong on 2018. 2. 23..
 */
public class PrimeNumberMethod {
    private static PrimeNumberMethod ourInstance = new PrimeNumberMethod();

    public static PrimeNumberMethod getInstance() {
        return ourInstance;
    }

    private PrimeNumberMethod() {
    }
}
