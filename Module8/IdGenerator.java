package Module8;


public class IdGenerator {

    private static long idNumber;

    public static long idGenerator() {

        return ++idNumber;
    }
}

