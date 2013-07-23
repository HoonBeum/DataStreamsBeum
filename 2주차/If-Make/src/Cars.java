import java.io.File;
import java.net.URL;
import java.util.*;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import java.lang.reflect.Method;

public class Cars {
    // 대상 Element추출
    static HashMap<String , String> map = new HashMap<String , String>();
    public static void getListAll(Document doc) {
        List list = doc.getRootElement().elements();
        for (int i = 0; i < list.size(); i++)
        {
            Element element = (Element) list.get(i);
            System.out.print("NAME : " + element.attributeValue("Key"));
            System.out.println("   VALUE : " + ((Element)element.elements().get(0)).getText());
            map.put(element.attributeValue("Key") , ((Element)element.elements().get(0)).getText());
        }
    }
    
    public static void main(String[] args) throws Exception{
        String select = "a";
        
        SAXReader reader = new SAXReader();
        
        Document document = reader.read(new File("C:\\Documents and Settings\\DSDS\\My Documents\\2주차\\Car.xml"));
        
        Cars selectAB = new Cars();
        
        Cars.getListAll(document);
        
        Scanner input = new Scanner(System.in);
        while(!select.equals("z")){
            select = input.next();
            try{
                Class<?> c = Class.forName(select);
                Object o = c.newInstance();
                Method m = o.getClass().getDeclaredMethod(map.get(select));
                m.invoke(o);
            }catch(Exception e){}
        }
        System.out.println("프로그램을 종료합니다.");
    }
 }