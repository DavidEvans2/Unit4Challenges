
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Timecheck {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1987, 3, 9); //The Release date of Joshua Tree

        LocalDate date2 = LocalDate.of(1988, 10, 10);//The Release date of Rattle and Hum

        LocalDate date3 = LocalDate.of(1990, 5, 11);//Release date of "Screaming Life/Fopp" album by Soundgarden

        LocalDate currentDate = LocalDate.now();

        Period p1 = Period.between(date1, currentDate);//Length of Time between the Joshua Tree and today
        Period p2 = Period.between(date1, date2);// Length of time between the release of Joshua Tree and Rattle and Hum
        Period p3 = Period.between(date2, date3);//Length of time between Rattle and Hum, and Hot in the Shade

        System.out.println("The amount of time between the release of the Joshua Tree album, and today is " +
                p1.getYears() + " Years " +p1.getMonths() + " Months " + "and " + p1.getDays() + " Days\n");

        System.out.println("The amount of time between the release of the albums: The Joshua Tree, and Rattle and Hum is " +
                p2.getYears() + " Year " + p2. getMonths() + " Months" + " and "+p2.getDays() + " Days\n");

        System.out.println("The KISS album: Hot in the Shade, was released in a similar time frame as the U2 albums above.\n" +
                "They released their album " + p3.getYears() + " Year " + p3.getMonths() + " Months " + " and " +
                p2.getDays() + " Days apart as well ");
    }
}