import java.util.ArrayList;
import java.util.List;

public class List {
    public static void main(String[] args) {
    List<String> foodList = new ArrayList<>();
    foodList.add("Pizza");
    foodList.add("Burger");
    foodList.add("Salad");

    System.out.println("Food List:");
    for (String food : foodList) {
        System.out.println(food);
    }
}
}