import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!!!!! " + args[2] + " " + args[3]);

        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            aList.add(args[i]);

        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);
        System.out.println(args[2]);

        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        System.out.println(hSet);

        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        sSet.add("กขคง");
        System.out.println(sSet);

        Stack<String> stacko = new Stack();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);

        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);
        System.out.println(favoriteColors);

        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet) {
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }

        Map<String, Color> tfavoriteColors = new TreeMap<String, Color>();
        tfavoriteColors.put("Juliet", Color.BLUE);
        tfavoriteColors.put("Romeo", Color.GREEN);
        tfavoriteColors.put("Adam", Color.RED);
        tfavoriteColors.put("Eve", Color.BLUE);
        tfavoriteColors.put("Robert", Color.BLACK);
        tfavoriteColors.put("Mark", Color.WHITE);
        tfavoriteColors.put("Pedro", Color.YELLOW);
        tfavoriteColors.put("Cole", Color.BLUE);
        System.out.println(tfavoriteColors);

        Set<String> tkeySet = tfavoriteColors.keySet();
        for (String key : tkeySet) {
            Color value = tfavoriteColors.get(key);
            System.out.println(key + " : " + value);
        }

    }
}