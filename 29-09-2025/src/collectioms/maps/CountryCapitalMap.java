package collectioms.maps;

import java.util.HashMap;

public class CountryCapitalMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCityMap = new HashMap<>();
        capitalCityMap.put("England","London");
        capitalCityMap.put("Russia","Paris");
        capitalCityMap.put("Norway","Oslo");
        capitalCityMap.put("Switzerland","New York");
        capitalCityMap.put("California","Texas");

        System.out.println(capitalCityMap);

        System.out.println("Capital of England is: " + capitalCityMap.get("England"));

        capitalCityMap.remove("Norway");

        System.out.println(capitalCityMap);

    }
}
