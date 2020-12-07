
public class Coffee extends Beverage {
	
	private boolean extraShot;
	private boolean extraSyrup;
	private final double SHOT_PRICE = .5;
	private final double SYRUP_PRICE = .5;
	  

	public Coffee(String n,  boolean shot, boolean syrup, SIZE s) {
		super(n, TYPE.COFFEE, s);
		extraShot = shot;
        extraSyrup = syrup;
	}

	
	/**An Overridden  toString method: String representation of Coffee beverage, 
	 * including the name , size ,  whether it
	 *  contains extra shot, extra syrup and the price of the coffee 
	 *  */
	
	
    public String toString() {
            String s = getBevName() +", " +getSize();
            
            if (extraShot) {
                    s += " extra shot";
            }
            if (extraSyrup) {
                    s += " Extra syrup";
            }
            
            s += ", $" +calcPrice();
            
            return s;
    }
    
    /*•	An Overridden calcPrice method.
     * 
     */
    
    public double calcPrice() {
        double price = super.getBasePrice();
        
        if (super.getSize() == SIZE.MEDIUM) {
                price += super.getSizePrice();
        }
        else if (super.getSize() == SIZE.LARGE) {
                price += 2 * super.getSizePrice();
        }
        
        if (extraShot) {
                price += SHOT_PRICE;
        }
        if (extraSyrup) {
                price += SYRUP_PRICE;
        }
        
        return price;
}
    
    /**An Overridden  equals method: checks equality based on the Beverage 
     * class equals method and additional instance variables for this class.
     * @param c
     * @return
     */
    
    
   public boolean equals(Coffee c) {
        if (super.equals(c) && extraShot==c.getExtraShot() && extraSyrup==c.getExtraSyrup()) {
                return true;
        }
        else {
                return false;
        }
   }
        /**	getters   and any other methods that
         *  are needed for your design. 
         */
        
        
        public boolean getExtraShot() {
                return extraShot;
        }
        public boolean getExtraSyrup() {
                return extraSyrup;
        }
        public double getShotCost() {
                return SHOT_PRICE;
        }
        public double getSyrupCost() {
                return SYRUP_PRICE;
        }
        
        /**	setters  and any other
         *  methods that are needed for your design.
         */
        
        public void setExtraShot(boolean shot) {
            extraShot = shot;
    }
         public void setExtraSyrup(boolean syrup) {
            extraSyrup = syrup;
    }
}
   
   
	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   