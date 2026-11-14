package quarter_of_the_year;

import static quarter_of_the_year.QuarterOfTheYear.quarterOf;

public class Main {
    static void main() {
        System.out.println(quarterOf(1));   // Expected: 1
        System.out.println(quarterOf(2));   // Expected: 1
        System.out.println(quarterOf(3));   // Expected: 1

        System.out.println(quarterOf(4));   // Expected: 2
        System.out.println(quarterOf(5));   // Expected: 2
        System.out.println(quarterOf(6));   // Expected: 2

        System.out.println(quarterOf(7));   // Expected: 3
        System.out.println(quarterOf(8));   // Expected: 3
        System.out.println(quarterOf(9));   // Expected: 3

        System.out.println(quarterOf(10));  // Expected: 4
        System.out.println(quarterOf(11));  // Expected: 4
        System.out.println(quarterOf(12));  // Expected: 4
    }
}
