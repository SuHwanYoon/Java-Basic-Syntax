package grouping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Answer01 {
	
	public static void main(String[] args) {
		
		//1.domin 
		List<Person2> personList = new ArrayList<>();
		//2. person info
		personList.add(new Person2("kim","jihun","10","man","aaa"));
		personList.add(new Person2("kim","jihun","10","female","aaa"));
		personList.add(new Person2("lee","jihun","20","man","aaa"));
		personList.add(new Person2("lee","jihun","20","man","aaa"));
		personList.add(new Person2("park","jihun","30","man","aaa"));
		//3. 사람정보 전체를 훑어봐서
		Map<String,List<Person2>> resultMap = new HashMap<>();
		for (Person2 person2 : personList) {
			
			if (person2.isFlag()) {
				continue;
			}
			String fn = person2.getFn();
			List<Person2> tempList = new ArrayList<>();
			
			for (Person2 person22 : personList) {
				
				String fn1 = person22.getFn();
				if (fn.equals(fn1)) {
					tempList.add(person22);
					person22.setFlag(true);
					
				}
				
			}
			resultMap.put(fn, tempList);
			
		}
		for (String key : resultMap.keySet()) {
			System.out.println("key: "+ key + "=");
			List<Person2> val = resultMap.get(key);
			for (Person2 person3 : val) {
				
			}
		}
		
		
		//4. 이사람의 정보가 이미 분류된 정보라면 넘어가고
		
		//4. 성씨를 발견하면 리스트 안에 있는 모든 성씨의 정보를 하나의 리스트로 모으기
	
		
		//6. 다음으로 진행
		
	}
}


class Person2{
	
	private String fn,sn,age,gender,mail;
	
	private boolean flag;
	
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Person2(String fn, String sn, String age, String gender, String mail) {
		super();
		this.fn = fn;
		this.sn = sn;
		this.age = age;
		this.gender = gender;
		this.mail = mail;
	}
	
	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
