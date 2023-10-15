public class CallFood {
   public static void main(String[] args) {
      FoodType order1 = new FoodType("Steak");
      FoodType order2 = new FoodType("Cake");
      FoodType order3 = new FoodType("Toast");
      FoodType order4 = new FoodType("Bread");

      order3.print();

      System.out.println("Next ID: " + FoodType.getNextId());
   }
}