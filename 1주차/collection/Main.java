import java.util.*;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] areg){
        Scanner input = new Scanner(System.in);
        int selec;
        do{
            System.out.println();
            System.out.println();
            System.out.println("실행하고 싶은 컬렉션을 선택하세요.");
            System.out.println("1. ArrayList    2. HashSet    3. LinkedList    4. HashMap    5. 종료");
            selec = input.nextInt();
            switch(selec){
                   case 1:
                        ArrayListTest a = new ArrayListTest();
                        a.Array();
                        break;
                   case 2:
                        SetTest t = new SetTest();
                        t.TestSet();
                        break;
                   case 3:
                        QueueTest q = new QueueTest();
                        q.makeLinked();
                        break;
                   case 4:
                        MapTest m = new MapTest();
                        m.makeMap();
                        break;
                   case 5:
                        System.out.println("종료합니다.");
                        break;
                   default :
                        System.out.println("다시 입력하여 주세요.");
                        break;
            }
        }while(selec != 5);
    }
}
