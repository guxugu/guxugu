package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Cow.t.jy.boolean1;

public class Maptest {

	public static void main(String[] args) {
		//1. �ʱ�ȭ �ϱ�
		Map<String, String>myMap = new HashMap<String, String>();
	//	Map<String, String>myMap = new HashMap<>();
		//2. �� �ֱ�
		myMap.put("name", "legend");
		myMap.put("age","25");
		myMap.put("job","student");
		
		//3. Ű�� �̿��� ��� �˾Ƴ���
		System.out.println(myMap.get("name"));
		System.out.println(myMap.get("age"));
		System.out.println(myMap.get("job"));
		
		//4. Ű�� ���� Ȯ���ϱ�
		boolean isContainsKey = myMap.containsKey("name");
		if(isContainsKey){
			System.out.println("isContainsValue:"+isContainsKey);
		}
		System.out.println(myMap.containsKey("age"));
		System.out.println(myMap.containsKey("job"));
		//5. ����� ���� Ȯ���ϱ�
		boolean isContainsValue = myMap.containsValue("legend");
		if(isContainsKey){
			System.out.println("isContainsValue:"+isContainsValue);
		}
		System.out.println(myMap.containsValue("26"));
		System.out.println(myMap.containsValue("student"));
		//6. ��� �����ϱ�
//		myMap.remove("name","legend");
		//7. ���� Ȯ���ϱ�
		System.out.println(myMap.size());
		//9. while ��ȯ������ hashMap�� ��簪�� Ȯ���ϱ�
		showHashMap(myMap);
		//10. remove �Լ��� ���� �����ϱ�
		boolean removeResult = myMap.remove("name", "legend");
		System.out.println(removeResult);
		//11. Ȯ��
		showHashMap(myMap);
		
	}
	public static void showHashMap(Map<String,String>input){
		Iterator<String>keys=input.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			System.out.println("myMap.get(\""+key+"\")="+input.get(key));
		}
	}
	/*
	 * map.get("����")
	 * ���ʷ� �������� ã�� �������� ���ʿ� �ش�Ǵ� ���� �ϳ� �ۿ� ����
	 * �ʱ�ȭ : HashMap<String, String> myMap = new HashMap<>();
	 * key = �̸� , vlaue = �� (�׸��)
	 * �Է� : myMap.put(key, value);
	 * �б� : myMap.get(key);
	 * Ȯ�� : myMap.containsKey(key);
	 * Ư�� ��� ���� Ȯ�� : myMap.containsValue(value);
	 * ���� : myMap.remove(key,vlaue);
	 * ���� Ȯ�� : myMpa.size
	 * ��ȯ�ϱ� : iterator<String> keys= input.keySet().iterator();
	 * keys.hasNext(); : ���� ��ȸ �� Ű ����� �ִ� ���ΰ� ���� Ȯ��
	 * key.next
	 */
	
	
	
	
	
	
	
}
