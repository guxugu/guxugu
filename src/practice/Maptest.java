package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Cow.t.jy.boolean1;

public class Maptest {

	public static void main(String[] args) {
		//1. 초기화 하기
		Map<String, String>myMap = new HashMap<String, String>();
	//	Map<String, String>myMap = new HashMap<>();
		//2. 값 넣기
		myMap.put("name", "legend");
		myMap.put("age","25");
		myMap.put("job","student");
		
		//3. 키를 이용해 밸류 알아내기
		System.out.println(myMap.get("name"));
		System.out.println(myMap.get("age"));
		System.out.println(myMap.get("job"));
		
		//4. 키의 유무 확인하기
		boolean isContainsKey = myMap.containsKey("name");
		if(isContainsKey){
			System.out.println("isContainsValue:"+isContainsKey);
		}
		System.out.println(myMap.containsKey("age"));
		System.out.println(myMap.containsKey("job"));
		//5. 밸류의 유무 확인하기
		boolean isContainsValue = myMap.containsValue("legend");
		if(isContainsKey){
			System.out.println("isContainsValue:"+isContainsValue);
		}
		System.out.println(myMap.containsValue("26"));
		System.out.println(myMap.containsValue("student"));
		//6. 밸류 삭제하기
//		myMap.remove("name","legend");
		//7. 길이 확인하기
		System.out.println(myMap.size());
		//9. while 순환문으로 hashMap의 모든값을 확인하기
		showHashMap(myMap);
		//10. remove 함수로 값을 삭제하기
		boolean removeResult = myMap.remove("name", "legend");
		System.out.println(removeResult);
		//11. 확인
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
	 * map.get("영구")
	 * 범례로 지도에서 찾는 느낌으로 범례에 해당되는 값이 하나 밖에 없음
	 * 초기화 : HashMap<String, String> myMap = new HashMap<>();
	 * key = 이름 , vlaue = 값 (네모안)
	 * 입력 : myMap.put(key, value);
	 * 읽기 : myMap.get(key);
	 * 확인 : myMap.containsKey(key);
	 * 특정 밸류 유무 확인 : myMap.containsValue(value);
	 * 삭제 : myMap.remove(key,vlaue);
	 * 길이 확인 : myMpa.size
	 * 순환하기 : iterator<String> keys= input.keySet().iterator();
	 * keys.hasNext(); : 아직 순회 할 키 밸류가 있는 것인가 유무 확인
	 * key.next
	 */
	
	
	
	
	
	
	
}
