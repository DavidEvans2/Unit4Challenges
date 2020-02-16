package Unit4Challenges;
import Unit4Challenges.WesternNBA;
import java.util.Scanner;

public class Teams {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Who's your favorite team from the NBA West?");
        String faveTeam = keyboard.nextLine();
        String teamMascot = keyboard.nextLine();
        boolean notFound = true;

        for (WesternNBA teams : WesternNBA.values()) {
            if (faveTeam.substring(0,3).equalsIgnoreCase(teams.getCity().substring(0,3))){
                faveTeam = teams.getTeamName();
                teamMascot = teams.getMascot();
                notFound = false;
            }
            if (faveTeam.substring(0,3).equalsIgnoreCase(teams.getCity().substring(0,3))){
                faveTeam = teams.getTeamName();
                teamMascot = teams.getMascot();
                notFound = false;
            }
        }
        if (notFound)
        {
            System.out.println("Hmm. I don't think that team is in this region. Try again");
        } else {
            System.out.println("Gnarly! Your favorite team is the  " + faveTeam + " " + teamMascot);
        }
    }
}