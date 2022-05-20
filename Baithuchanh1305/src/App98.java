import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
public class App98 {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap1 = new TreeMap<>();
        Map<Float, Integer> map = new HashMap<>();
        TreeMap<Float, Integer> treeMap2 = new TreeMap<>(map);
    }
}