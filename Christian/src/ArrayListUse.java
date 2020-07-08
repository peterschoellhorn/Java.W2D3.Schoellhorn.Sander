import java.util.ArrayList;

public class ArrayListUse extends ArrayListMethods{

    public static void main(String[] args) {
        ArrayListMethods newArray = new ArrayListMethods();

        ArrayList<String> cityList = new ArrayList<String>();

        cityList.add("Bregenz");
        cityList.add("Salzburg");
        cityList.add("Lienz");
        cityList.add("Wien");
        cityList.add("Bludenz");
        cityList.add("Graz");


        newArray.allArrayElements(cityList);
        newArray.everySecondElement(cityList);
        newArray.addAtFirstPosition(cityList, "Eisenstadt");
        newArray.removeEveryThirdEl(cityList);
    }
}
