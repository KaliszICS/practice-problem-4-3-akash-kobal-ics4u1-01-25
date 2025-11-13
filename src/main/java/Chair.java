/** 
 * The Chair class represents the material used, and the amount of legs on a chair.
 * @author Akash
 * @version 1.0
*/
public class Chair {
    //instance variables
    int legs;
    String material;

/**
 * Creates an example object with specified values
 * @param legs the number of legs on a chair
 * @param material the material that is on the chair
 */
//constructor - params
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    //method - 0 params, intialized values
    /**
     * @return returns the value of legs (4), and material (wood)
     */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }
    //method - 1 param, legs is input, material is initialized
    /**
     * @return - returns value of legs (input), and material (wood)
     * @param legs - num of legs
     */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }
    //getter variable for legs
    public int getLegs() {
        return legs;
    }
    //getter variable for material
    public String getMaterial() {
        return material;
    }
}
