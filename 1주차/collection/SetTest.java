import java.util.*;
/**
 * Write a description of class SetTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SetTest
{
    public void TestSet(){
        System.out.println(" Set크기 : "+getnumber());
        System.out.println("------------remove------------");
        remove();
    }
    public int getnumber(){
        SetTest set = new SetTest();
        String[] cars = new String[]{"SM5","BMW","SM7","I30","Benz","Tico","Lexus","Zeep","Carnibar","SM5","BMW","SM7","I30"};
        for(int i =0; i< cars.length; i++){
            System.out.print(" " + cars[i]);
        }
        System.out.println("");
        System.out.println(" 배열크기 : "+cars.length);
        System.out.println("위 배열을 HashSet에 add");
        HashSet<String> carSet = new HashSet<String>();
        for(String car : cars){
            carSet.add(car);
        }
        Iterator it = carSet.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        return carSet.size();
    }
    public void remove(){
        SetTest set = new SetTest();
        String[] cars = new String[]{"SM5","BMW","SM7","I30","Benz","Tico","Lexus","Zeep","Carnibar","SM5","BMW","SM7","I30"};
        for(int i =0; i< cars.length; i++){
            System.out.print(" " + cars[i]);
        }
        System.out.println("");
        System.out.println(" 배열크기 : "+cars.length);
        System.out.println("위 배열을 HashSet에 add");
        HashSet<String> carSet = new HashSet<String>();
        for(String car : cars){
            carSet.add(car);
        }
        Iterator it = carSet.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("BMW를 remove");
        carSet.remove("BMW");
        Iterator iter = carSet.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }
}
