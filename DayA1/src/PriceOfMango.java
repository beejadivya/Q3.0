import java.util.*;
public class PriceOfMango {
    public static void main(String args[]) {
        HashMap<String, Double> MangoType = new HashMap<>();
        MangoType.put("Dhesari", 40.0);
        MangoType.put("Kesar", 55.0);
        MangoType.put("Badam", 45.0);
        MangoType.put("Banganpalli", 23.0);


        for (String iterator : MangoType.keySet()) {
            System.out.println("Mango type: " + iterator + " Price : " +  MangoType.get(iterator));
        }
        HashMap<String, Integer> mangoQuantity = new HashMap<>();
        mangoQuantity.put("Dhesari", 6);
        mangoQuantity.put("Kesar", 5);
        mangoQuantity.put("Badam", 5);
        mangoQuantity.put("Banganpalli", 5);
        for (String iterator : mangoQuantity.keySet()) {
            double price;
            price = mangoQuantity.get(iterator) + MangoType.get(iterator);
            System.out.println("Price of " + iterator + " = " + MangoType.get(iterator)*mangoQuantity.get(iterator));
        }

    }
}

