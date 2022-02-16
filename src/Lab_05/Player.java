/*
 *   Name: Ngoc Duy Nguyen
 *   Date: 2/16/2022
 *   Description: Player class for a sport team
 * */
package Lab_05;
public class Player {
    private String name;
    private int position;
    /** get player's name
     * @return name*/
    public String getName() {
        return name;
    }
    /** Get player's position*/
    public int getPosition() {
        return position;
    }
    /** Set player's name
     * @param name */
    public void setName(String name) {
        this.name = name;
    }
    /** Set player's position
     * @param position*/
    public void setPosition(int position) {
        this.position = position;
    }
    /** Player constructor without parameters*/
    public Player() {
        this.name = "Player A";
        this.position = 0;
    }
    /** Player constructor with name and position
     * @params name, position */
    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }
    /** Override toString method*/
    public String toString() {
        return "Player's name: " + this.name + "/ Position: " + this.position;
    }
    /**
     * Check if player's name and position is the same or not
     * @param obj
     */
    @Override
    public boolean equals(Object obj) {
        if (((Player) obj).getName() == this.name && (((Player) obj).getPosition()) == this.position) {
            return true;
        } else {
            return false;
        }
    }
}
