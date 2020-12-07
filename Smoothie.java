

	public class Smoothie extends Beverage{
        private int numOfFruits;
        private boolean addProtein;
        private final double FRUIT_PRICE= .5;
        private final double PROTEIN_PRICE = 1.5;
        
        /** 	A parametrized constructor  */
        
        public Smoothie(String n, SIZE s, int qtyoffruits, boolean addp) {
            super(n, TYPE.SMOOTHIE, s);
            numOfFruits = qtyoffruits;
            addProtein = addp;
        }
        
        /** An Overridden toString method:
         *  String representation of a Smoothie drink
         *  including the name , size, whether or not protein 
         *  is added , number of fruits and the price
          */
        
        
        public String toString() {
                String s = getBevName() +", " +getSize() +" " +numOfFruits +" Fruits";
                
                if (addProtein) {
                        s += " Protein powder";
                }
                
                s += ", $" +calcPrice();
                
                return s;
        }
        
        
        /**•
         *	An Overridden equals method: checks equality based 
         * on the Beverage class equals method and additional instance variables for this class.
         * @param s
         * @return
         */
        
        
        public boolean equals(Smoothie s) {
                if (super.equals(s) && numOfFruits==s.getNumOfFruits() && addProtein==s.getAddProtien()) {
                        return true;
                }
                else {
                        return false;
                }
        }
        
        /**	An Overridden calcPrice method.*/
        
        
        public double calcPrice() {
                double price = super.getBasePrice();
                
                if (super.getSize() == SIZE.MEDIUM) {
                        price += super.getSizePrice();
                }
                else if (super.getSize() == SIZE.LARGE) {
                        price += 2 * super.getSizePrice();
                }
                
                price += numOfFruits * FRUIT_PRICE;
                if (addProtein) {
                        price += PROTEIN_PRICE;
                }
                
                return price;
        }
        
        /** 	getters   and any other methods that are needed for your design. */
        
        public int getNumOfFruits() {
                return numOfFruits;
        }
        public boolean getAddProtien() {
                return addProtein;
        }
        public double getFruitCost() {
                return FRUIT_PRICE;
        }
        public double getProteinCost() {
                return PROTEIN_PRICE;
        }
        
        /**  setters  and any other methods that are needed for your design.*/
        
        
        public void setNumOfFruits(int qtyoffruits) {
                numOfFruits = qtyoffruits;
        }
        public void setProteinPowder(boolean addp) {
                addProtein = addp;
        }
}


