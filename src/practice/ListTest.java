package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListTest {

	public static void Show(List<String>li){
		for(int i=0; i<li.size(); i++){
			System.out.println(i+":"+li.get(i).toString());
		}
		System.out.println();
	}
	public static void main(String[] args) {
		List<String>ls=new ArrayList<String>();
		ls.add("Hi");
		ls.add("have");
		ls.add("a Nice Day!");
		Show(ls);
		ls.add(3,"Everybody~");
		Show(ls);
		ls.remove(0);
		Show(ls);
		Iterator<String> iter=ls.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		ls.clear();
		if(ls.isEmpty()){
			System.out.println("list Empty");
		}
	}
}
