public class Parts {

   private String name;
   private int id;
   private double price;
   public void setName(String PartsNames) {
       name = PartsNames;
   }
   public void setId(int partId) {
       id = partId;
   }
   public void setPrice(double partPrice) {
       price = partPrice;
   }
   
   public int getID() {
	   return id;
   }
   
   public String getName() {
	   return name;
   }
   
   public double getPrice() {
	   return price;
   }

}
