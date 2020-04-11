
/**
 * Write a description of class Hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hero
{
    // instance variables - replace the example below with your own

    private String name;
    private int damage;
    private int defense;
    /**
     * Constructor for objects of class Hero
     */
    public Hero(){
        
    }
    public Hero(String name,int damage,int defense)
    {
        // initialise instance variables
        this.name=name;
        this.damage=damage;
        this.defense=defense;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName(){
     return this.name;   
    }
    
    public int getDamage(){
        return this.damage;
    }
    
    public int getDefense(){
        return this.defense;
    }
    
    public String toString(){
     return this.name;   
    }
}
