package Java;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mrs. ", "Mr. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mrs. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
