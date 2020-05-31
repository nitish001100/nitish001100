package hackerRankTest;

import java.util.*;

public class Trax {

    static String fat = "FAT";
    static String fiber = "FIBER";
    static String carb = "CARB";
    static String[] ingredients;
    static List<String> ingredientTrace = new ArrayList<>();
    static Map<String, Integer> traceMap = new HashMap<>();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numIngredients = Integer.valueOf(scanner.nextLine());

        String[] arr = scanner.nextLine().split(" ");
        ingredients = new String[numIngredients];

        for (int i = 0; i < arr.length; i++)
            ingredients[i] = arr[i];


        for (int i = 0; i < ingredients.length; i++) {
            if (possibleToMakeDish(ingredients[i]) == true) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }

    private static void addInTraceMap(String cat) {
        if (traceMap.containsKey(cat)) {
            int value = traceMap.get(cat);
            traceMap.put(cat, value + 1);
        } else {
            traceMap.put(cat, 1);
        }
    }

    private static boolean possibleToMakeDish(String ingredient) {

        addInTraceMap(returnSubString(ingredient));

        String key = mapContainsTwoIngredient();

        if(key != null) {
            traceMap.remove(key);
            remove(ingredient);
            return true;
        }

        ingredientTrace.add(ingredient);
        return false;
    }

    private static String mapContainsTwoIngredient() {
        Iterator<Map.Entry<String, Integer>> var = traceMap.entrySet().iterator();
        while (var.hasNext()) {
            Map.Entry<String, Integer> var0 = var.next();
            if (var0.getValue() == 2) {
                return var0.getKey();
            }
        }
        return null;
    }

    private static void remove(String ingredient) {

        for (int i = 0; i < ingredientTrace.size(); i++) {
            if (returnSubString(ingredientTrace.get(i)) == returnSubString(ingredient)) {
                ingredientTrace.remove(i);
                break;
            }
        }


        for (int i = 0; i < ingredientTrace.size(); i++) {
            String cat = (returnSubString(ingredientTrace.get(i)));
            if (returnSubString(ingredientTrace.get(i)) != returnSubString(ingredient)) {
                ingredientTrace.remove(i);
                traceMap.remove(cat);
                break;
            }
        }
        return;
    }

    private static String returnSubString(String ingredient) {
        String buffer = null;
        if (ingredient.startsWith(fat))
            buffer = fat;
        if (ingredient.startsWith(fiber))
            buffer = fiber;
        if (ingredient.startsWith(carb))
            buffer = carb;

        return buffer;
    }

}
