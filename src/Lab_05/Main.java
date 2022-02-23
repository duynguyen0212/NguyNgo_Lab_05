/**
 * Name: Ngoc Duy Nguyen
 * Date: 2/16/2022
 * Description: Main class
 */
package Lab_05;

import java.util.Iterator;

public class Main {
    /**
     * Add players to teams and testing excepting handling and output result
     */
    public static void main(String args[]) throws Exception {
        Team teamA = new Team("Tigers");
        Team teamB = new Team();

        // testing try and catch statement
        try {
            teamA.insertPlayer(new Player("John", 1));
            teamA.insertPlayer(new Player("John", 1));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add players to team A, from position number 1 - 15
        for (int i = 1; i < (teamA.getMaxPlayers() - 1); i++) {
            teamA.insertPlayer(new Player("Player", 0 + i));
        }

        // Add players to team B, from position number 1 - 17
        for (int i = 1; i <= teamB.getMaxPlayers() - 1; i++) {
            teamB.insertPlayer(new Player("Random", 0 + i));
        }

        // Try to insert duplicate player to team A
        try {
            teamA.insertPlayer(new Player("Player", 10));
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Try to add more player to team B
        try {
            teamB.insertPlayer(new Player("Josh", 10));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test the contains method
        System.out.println("Check the consistent of contain method: ");
        for (int i = 0; i < 20; i += 2)
            if (!teamA.contains(new Player("Player", 0 + i))) {
                System.out.println("We don't have the player on the team. Position: " + i);
            } else {
                System.out.println("There's already this player. Position: " + i);
            }
        Iterator<Player> iterator = teamA.roasterPlayers.iterator();
        Iterator<Player> iterator2 = teamB.roasterPlayers.iterator();

        System.out.println("\nPrinting players of Team A and B");
        System.out.println(teamA.getTeamName() + ":");
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
        System.out.println(teamB.getTeamName() + ":");
        while (iterator2.hasNext()) {
            Object element1 = iterator2.next();
            System.out.println(element1);
        }
    }
}
