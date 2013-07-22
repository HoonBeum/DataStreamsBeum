package spring;

import java.util.*;
 
public class Customer 
{
	private Map<String,Select> maps;

	public Map<String,Select> getMaps() {
		return maps;
	}

	public void setMaps(Map<String,Select> maps) {
		this.maps = maps;
	}
	
	public void run(){
		Scanner input = new Scanner(System.in);
		String get = "";
	while(!get.equals("z")){
		System.out.println("1~4 까지 입력.");
		get = input.next();
		Select select = maps.get(get);
		select.Print();
	}
	}
}