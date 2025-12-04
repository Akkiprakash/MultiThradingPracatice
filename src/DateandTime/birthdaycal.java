package DateandTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class birthdaycal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Year year = Year.of(n);
        LocalDate birth = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
        LocalDate now = LocalDate.now();
        ///  Period which give the diiference

        Period p = Period.between(birth,now);

        System.out.printf("the age is till now %d year %d months %d days",p.getYears(),p.getMonths(),p.getDays());
    }
}
