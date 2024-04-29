package midterm.kamil_nuriev_1.task3;
import java.util.ArrayList;
import java.util.List;

public class CBMS {
    private List<Coffee> storage = new ArrayList<Coffee>();

    // adds the coffee to the storage
    public void addCoffee(Coffee coffee) {
        storage.add(coffee);
    }

    //adds weight to the exisiting coffee
    public void setWeight(String name, Integer weight) {
        for (int i = 0; i < storage.size(); i++) {
            Coffee c = storage.get(i);
            if (c.getName().equals(name)) {
                c.setWeight(weight);
                break;
            }
        }
    }
    // removes the coffee type from the storage
    public boolean removeCoffee(Coffee coffee) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Coffee c = storage.get(i);
            if (c.getName().equals(coffee.getName()) && c.getWeight().equals(coffee.getWeight())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Coffee c : storage) {
                System.out.printf("Coffee type: %s\nAmount(kg): %d\n", c.getName(), c.getWeight());
            }
        }

    }
}
