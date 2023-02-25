
import java.util.HashMap;

public class s5 {
    public static void main(String[] args) {
       HashMap<String, String> hashMap = new HashMap<>();
       hashMap.put("Первый","Вася");
       hashMap.put("Пятый", "Кеша");
       hashMap.put("Третий","Петя");
       hashMap.putIfAbsent("Четвертый","Катя");
       hashMap.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("-".repeat(15));
        for(String v: hashMap.values()){
            System.out.println(v+" ! !");
        }
        System.out.println("-".repeat(15));
        for(String k: hashMap.keySet()){
            System.out.println(k+": "+hashMap.get(k));
        }
        for(String key: hashMap.keySet()) {
            hashMap.compute(key, (k, v) -> "<" + v + ">");
            System.out.println(hashMap.get(key));
        }

        System.out.println(hashMap);
        System.out.println("-".repeat( 15));
        HashMap<String,String> hashMap2 = new HashMap<>();
        hashMap2.put("Первый", "Оля");
        hashMap2.put("Четвертый", "Маша");
        hashMap2.put("Пятый", "Марина");
        hashMap2.put("Шестой", "Елена");
        for(String k: hashMap2.keySet()){
            hashMap2.merge(k,hashMap.getOrDefault(k,"No"),String::concat);

//            if(hashMap2.get(k)!=null)
//            System.out.println(hashMap2.get(k) +"+"+hashMap2.get(k));
            System.out.println(hashMap2.get(k));
        }

//        hashMap.put(0, "z");
//        hashMap.putIfAbsent(1, "z");
//        hashMap.remove(1);
//        hashMap.put(1, "0");
//        hashMap.put(2, "a");
//        hashMap.put(3, "f");
//        hashMap.get(0);

//        System.out.println(hashMap.get(0));
//        hashMap.forEach(k, v) -> System.out.println(k + "" + v);

//        for(String s: hashMap.values()) {
//            System.out.println(s);
//
//        }

//        for(Integer s: hashMap.keySet()) {
//            System.out.println(s);
//
//        }


//        for(Integer s: hashMap.keySet()) {
//            System.out.println(hashMap.get(s));


//        for (int i = 0; i <hashMap.keySet().size(); i ++) {
//            System.out.println(hashMap.keySet().toArray()[i]);
//        }

//        hashMap.containsValue("z");
//        hashMap.compute(3, (k, v) -> v += "!");
//        hashMap.computeIfAbsent(5, -> "F!");
//        hashMap.computeIfPresent(5, (k, v) -> v += "!");
//        hashMap.forEach(k, v) System.out.println(k +" "+ v);
//        hashMap.merge(4, "?",(nV,tV) -> "<" + nV + tV + ">");
//        hashMap.forEach(k, v)-> System.out.println(k + " "+ v);


    }


}
