
	
	public class Alcohol extends Beverage{
		
        private boolean isWeekend;
        private final double WEEKEND_FEES = .6;
        
        /** •	A parametrized constructor   */
        
        public Alcohol(String n, SIZE s, boolean iw) {
                super(n, TYPE.ALCOHOL, s);
                isWeekend = iw;
        }
        
        /** An Overridden toString method: String 
         * representation of a alcohol drink including the name, 
         * size, whether or not beverage is offered in the weekend and the price
         *  */
        
        
        public String toString() {
                String s = getBevName() +", " +getSize();
                
                if (isWeekend) {
                        s += " Weekend";
                }
                
                s += ", $" +calcPrice();
                
                return s;
        }
        
        
        /**	An Overridden equals method:
         *  checks equality based on the Beverage class equals method and additional instance variables for this class.
         * @param a
         * @return
         */
        
        
        public boolean equals(Alcohol a) {
                if (super.equals(a) && isWeekend == a.getIsWeekend()) {
                        return true;
                }
                else {
                        return false;
                }
        }
        
        /**•	An Overridden calcPrice method.
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
                
                if (isWeekend) {
                        price += WEEKEND_FEES;
                }
                
                return price; 
        }
        
        /** 	getters   and any other
         *  methods that are needed for your design.
         */
        
        
        public boolean getIsWeekend() {
                return isWeekend;
        }
        public double getWeekendFee() {
                return WEEKEND_FEES;
        }
        
        /** •	 setters  and any other methods that are needed for your design. */ 
        
        
        public void setIsWeekend(boolean is) {
                isWeekend = is;
        }
}


