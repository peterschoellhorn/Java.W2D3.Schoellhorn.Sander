import java.util.*;

public class ArrayListTest {

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


        //prints every element of an arrayList
        for (String s : cityList) {
            System.out.println(s);
        }

        System.out.println("\n");


        //prints every second element of an arrayList

            for (int i = 0; i < cityList.size(); ++i) {
                if (i % 2 == 0) {
                    System.out.print(cityList.get(i) + " ");
                }
            }


        //add element at the beginning
        cityList.add(0, "Klagenfurt");

        System.out.println(cityList);
        System.out.println(villageList);

        cityList.removeAll(villageList);
        System.out.println(cityList);

    }




}
