import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringutilsTest {

    public static void main(String[] args) {

        System.out.println("Type in a String plz: ");
        Scanner sc = new Scanner(System.in);
        String userChar = sc.nextLine();

        System.out.println(StringUtils.isNumeric(userChar));
        System.out.println(StringUtils.swapCase(userChar));
        System.out.println(StringUtils.reverse(userChar));

    }

}
