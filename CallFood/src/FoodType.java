public class FoodType {
   private static int nextId = 0;

   private String type;
   private int id;

   public FoodType(String foodType) {
      type = foodType;
      id = nextId;

      nextId += 5;
   }

   public void print() {
      System.out.println(id + ": " + type);
   }

   public static int getNextId(){
      return nextId;
   }
}