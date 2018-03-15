package acm.t1002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nifeng on 2018/3/14.
 */
public class Main {
    private static Map<Character, Character> characterMap = new HashMap<Character, Character>();
    private static TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

    static {
        characterMap.put('A', '2');
        characterMap.put('B', '2');
        characterMap.put('C', '2');
        characterMap.put('D', '3');
        characterMap.put('E', '3');
        characterMap.put('F', '3');
        characterMap.put('G', '4');
        characterMap.put('H', '4');
        characterMap.put('I', '4');
        characterMap.put('J', '5');
        characterMap.put('K', '5');
        characterMap.put('L', '5');
        characterMap.put('M', '6');
        characterMap.put('N', '6');
        characterMap.put('O', '6');
        characterMap.put('P', '7');
        characterMap.put('R', '7');
        characterMap.put('S', '7');
        characterMap.put('T', '8');
        characterMap.put('U', '8');
        characterMap.put('V', '8');
        characterMap.put('W', '9');
        characterMap.put('X', '9');
        characterMap.put('Y', '9');
        characterMap.put('0', '0');
        characterMap.put('1', '1');
        characterMap.put('2', '2');
        characterMap.put('3', '3');
        characterMap.put('4', '4');
        characterMap.put('5', '5');
        characterMap.put('6', '6');
        characterMap.put('7', '7');
        characterMap.put('8', '8');
        characterMap.put('9', '9');
        characterMap.put('-', null);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(stdin.readLine());
        for (int i = 0; i < n; i++) {
            String phoneNo = stdin.readLine();
            StringBuilder builder = new StringBuilder(phoneNo.length());
            for (int j = 0; j < phoneNo.length(); j++) {
                Character character = characterMap.get(phoneNo.charAt(j));
                if(character != null) {
                    builder.append(characterMap.get(phoneNo.charAt(j)));
                }
            }
            String key = builder.toString();
            if (treeMap.containsKey(key)) {
                treeMap.put(key, treeMap.get(key) + 1);
            } else {
                treeMap.put(key, 1);
            }


        }
        Iterator<String> keyIntr = treeMap.keySet().iterator();
        boolean duplicates = false;
        while (keyIntr.hasNext()) {
            String key = keyIntr.next();
            int count = treeMap.get(key);
            if (count > 1) {
                System.out.println(key.substring(0,3) + "-" + key.substring(3) + " " + count);
                duplicates = true;
            }
        }
        if(!duplicates){
            System.out.println("No duplicates.");
        }

    }
}
