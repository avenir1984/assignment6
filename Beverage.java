
public abstract class Beverage {
	
	 private String name;
     private TYPE type;
     private SIZE size;
     private final double BASE_PRICE = 2.0;
     private final double SIZE_PRICE = 1.0;
     
     /**•	A parametrized constructor to create a
      *  Beverage object given its name, type and  size
      * @param n
      * @param t
      * @param s
      */
     
     public Beverage(String n, TYPE t, SIZE s) {
             name = n;
             type = t;
             size = s;

}
     
     /** •	An abstract methods called calcPrice
      *  that calculates and returns the beverage price. 
      */
     
     public abstract double calcPrice();
      public String toString() {
          return name +", " +size;
  }
      
      /**	An Overridden  equals method: checks equality
       *  based on name, type, size of the beverage
       * @param bev
       * @return
       */
  public boolean equals(Beverage bev) {
          if (name.equals(bev.getBevName()) && type==bev.getType() && size==bev.getSize()) {
                  return true;
          }
          else {
                  return false;
          }

}
  
/**•	getters and any other methods that are needed for your design.  */
    public String getBevName() {
    return name;
    }
     public TYPE getType() {
     return type;
          }
      public SIZE getSize() {
      return size;
             }
       public double getBasePrice() {
        return BASE_PRICE;
}
           public double getSizePrice() {
           return SIZE_PRICE;
       }
  
/**  setters  and any other methods that
 *  are needed for your design.  */

     public void setName(String n) {
      name = n;
  }
      public void setType(TYPE t) {
        type = t;
     }
        public void setSize(SIZE s) {
         size = s;
              }
}