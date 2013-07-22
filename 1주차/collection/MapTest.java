import java.util.*;
/**
 * Write a description of class MapTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapTest
{
    public void makeMap(){
        Scanner input = new Scanner(System.in);
        int select;
        do{
            System.out.println("1. HashMap     2. TreeMap     3. 종료");
            select = input.nextInt();
            switch(select){
                case 1 :
                    Hash();
                    break;
                case 2 :
                    Tree();
                    break;
                case 3 :
                    System.out.println("종료합니다.");
                    break;
                default : 
                    System.out.println("다시 입력하세요.");
                    break;
            }
        }while(select != 3);
    }
    public void Hash(){
        HashMap<String , String> map = new HashMap<String , String>();
        map.put("A","a");
        map.put("A","1");
        System.out.println("Key A : "+map.get("A"));
        map.put("C","c");
        map.put("D","d");
        System.out.println("------Set형으로 쓸 때");
        Set<String> keySet = map.keySet();
        for(String tempKey : keySet){
            System.out.println(tempKey+" = "+map.get(tempKey));
        }
        System.out.println("------값만 필요할 때");
        Collection<String> values = map.values();
        for(String tempvalue : values){
            System.out.println(tempvalue);
        }        
        System.out.println("-------존재 여부 확인");
        System.out.println("Key A : "+map.containsKey("A"));
        System.out.println("Key Z : "+map.containsKey("Z"));
        System.out.println("value a : "+map.containsValue("a"));
        System.out.println("value z : "+map.containsValue("z"));
        System.out.println("-------삭제");
        map.remove("A");
        Set<String> keySet1 = map.keySet();
        for(String tempKey1 : keySet1){
            System.out.println(tempKey1+" = "+map.get(tempKey1));
        }
    }
    public void Tree(){
        TreeMap<String , String> map = new TreeMap<String , String>();
         map.put("A","a");
         map.put("C","c");
        map.put("D","d");
        map.put("가","f");
        map.put("1","g");
        map.put("e","e");
        Set<String> keySet1 = map.keySet();
        for(String tempKey1 : keySet1){
            System.out.println(tempKey1+" = "+map.get(tempKey1));
        }
    }
}
