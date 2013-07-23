import java.util.*;
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListTest
{
    public void Array(){
        Scanner input = new Scanner(System.in);
        int selec;
        do{
            System.out.println("1.add      2.get      3.remove      4.set    5.종료");
            selec = input.nextInt();
            switch(selec){
                case 1:
                    System.out.println("-------------add--------------");
                    makeArray();
                    makeArray2();
                    break;
                case 2:
                    System.out.println("---------------get--------------");
                    getArray();
                    break;
                case 3:
                    System.out.println("--------------remove--------------");
                    removeArray();
                    break;
                case 4:
                    System.out.println("--------------set--------------");
                    setArray();
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }
        }while(selec != 5);
    }
    public void makeArray(){
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> list1 = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add(1,"A1");
    list1.add("0");
    for(String data : list){
        System.out.println("list : " + data);
    }
    list1.addAll(list);
    System.out.println("------------------addAll-------------------");
    for(String data : list1){
        System.out.println("list1 : " + data);
    }
    }
    public void makeArray2(){
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add(1,"A1");
    ArrayList<String> list1 = list;
    list.add("E");
    System.out.println("-------------------list1=list------------------");
    for(String data : list1){
        System.out.println("list1 : " + data);
    }
    }
    public void getArray(){
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add(1,"A1");
    ArrayList list1 = list;
    list.add("E");
    int size = list1.size();
    for(int i = 0; i < size; i++){
        System.out.println("get : "+list1.get(i));
    }
    }
    public void removeArray(){
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add(1,"A1");
    ArrayList list1 = list;
    list.add("E");
    int size = list1.size();
    for(int i = 0; i < size; i++){
        System.out.println("before remove : "+list1.get(i));
    }
    list.remove(3);
    list.remove("E");
    size = list1.size();
    for(int i = 0; i < size; i++){
        System.out.println("after remove : "+list1.get(i));
    }
    }
    public void setArray(){
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add(1,"A1");
    ArrayList list1 = list;
    list.add("E");
    int size = list1.size();
    for(int i = 0; i < size; i++){
        System.out.println("before set : "+list1.get(i));
    }
    list.set(2,"A3");
    list.set(5,"EEE");
    for(int i = 0; i < size; i++){
        System.out.println("after set : "+list1.get(i));
    }
    }
    }
