import java.util.ArrayList;

public class ArrayListMethods {

    public void everySecondElement(ArrayList x) {
        System.out.println("This prints out every second element of our ArrayList: ");
        for (int i = 0; i < x.size(); ++i) {
            if (i % 2 == 0) {
                System.out.print(x.get(i) + " ");
            }
        }
        System.out.println("\n");
    }

    public void allArrayElements(ArrayList x) {
        System.out.println("This are all elements within the ArrayList: ");
        System.out.println("\n");

    }

    public void addAtFirstPosition(ArrayList x, String cityName) {
        System.out.println("This adds " + cityName + " to our ArrayList: ");
        x.add(0, cityName);
        System.out.println(x);
        System.out.println("\n");
    }

    public void removeEveryThirdEl(ArrayList x) {
        System.out.println("This removes every third element of our ArrayList: ");
        for (int i = 0; i < x.size(); ++i) {
            if (i % 3 == 0) {
                System.out.println(x.remove(i)+ " is removed");
            }
        }System.out.println("This elements are left: "+ x);



    }
}

