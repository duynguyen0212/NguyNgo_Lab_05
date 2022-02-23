/*
 *   Name: Ngoc Duy Nguyen
 *   Date: 2/16/2022
 *   Description: Team class for a sport team
 * */
package Lab_05;

import java.util.ArrayList;
import java.util.Iterator;

public class Team {
    private String name;
    private int maxPlayers = 17;
    public ArrayList<Player> roasterPlayers = new ArrayList<>();

    /**
     * Get Team's name
     *
     * @return name
     */
    public String getTeamName() {
        return name;
    }

    /**
     * Set Team's name
     *
     * @param teamName
     */
    public void setTeamName(String teamName) {
        this.name = teamName;
    }

    /**
     * Get max players in a team
     *
     * @return maxPlayers
     */
    public int getMaxPlayers() {
        return maxPlayers;
    }

    /**
     * Set max players
     *
     * @param maxPlayers
     */
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    /**
     * Constructor of Team without parameters
     */
    public Team() {
        this.name = "Random Team";
    }

    /**
     * Constructor of team with team name
     *
     * @param teamName
     */
    public Team(String teamName) {
        this.name = teamName;
    }

    /**
     * Check if the player is on the team or not using iterator and equals
     *
     * @param playerInfo
     * @return flag
     */
    public boolean contains(Player playerInfo) {
        Iterator<Player> iterator = roasterPlayers.iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            if (iterator.next().equals(playerInfo)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    /**
     * Add player to the team when player is not contain in the team
     *
     * @param playerInfo
     */
    public void insertPlayer(Player playerInfo) throws Exception {
        if (roasterPlayers.size() < maxPlayers) {
            if (!contains(playerInfo)) {
                roasterPlayers.add(playerInfo);
            } else {
                throw new Exception("Cannot add duplicate player.");
            }
        } else {
            throw new Exception("Cannot add more player.");
        }
    }
}
