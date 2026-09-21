public class ArrayPractice {

  public static void main(String[] args) {
    
    String[][] cropsToHarvest = {
      {"Mango, Apple, Banana"},
      {"Okra", "Eggplant", "Squash"}
    };

    for (String[] rows : cropsToHarvest){
      for (String item : rows) {
        System.out.print(item + ", ");
      }
    }
  }
}