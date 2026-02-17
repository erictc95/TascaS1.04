package nivel2.ejercicio1234567.assertj;

import java.util.*;

public class ExampleData {


    public int[] getArray1() {
        return new int[]{1, 2, 3};
    }

    public int[] getArray2() {
        return new int[]{1, 2, 3};
    }

    public List<Object> getList() {
        List<Object> list = new ArrayList<>();
        list.add("Hola");
        list.add(42);
        list.add(3.14);
        return list;
    }

    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        return map;
    }

    public Optional<String> getEmptyOptional() {
        return Optional.empty();
    }

}
