package PracticumTask1;

import java.util.ArrayList;
import java.util.Objects;

public class LostAndFoundOffice {
    private final ArrayList<Object> things = new ArrayList<>();

    public void put(Object element) {
        things.add(element);
    }

    public boolean check(Object target) {
        if (target == null) {
            return false;
        }

        for (Object object : things) {
            if (Objects.equals(object, target)) {
                return true;
            }
        }

        return false;
    }
}