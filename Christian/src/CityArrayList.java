import java.util.*;

public class CityArrayList {

    public static void main(String[] args) {

        ArrayList < String > cityList = new ArrayList < String > ();

        cityList.add("Bregenz");
        cityList.add("Salzburg");
        cityList.add("Lienz");
        cityList.add("Wien");
        cityList.add("Bludenz");
        cityList.add("Graz");

        ArrayList < String > villageList = new ArrayList <String > (Arrays.asList ("Schruns", "Lech", "Tschagguns", "Vandans"));

        cityList.addAll(villageList);
        Collections.sort(cityList);

        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i));
        }


        cityList.add(0, "Klagenfurt");

        System.out.println(cityList);
        System.out.println(villageList);


    }




}
