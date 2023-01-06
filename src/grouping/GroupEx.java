package grouping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GroupEx {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Group> list = new ArrayList<Group>();
		list.add(new Group("kim","java","10","aaa@aaa","male"));
		list.add(new Group("kim","java","10","bbb@aaa","fmale"));
		list.add(new Group("lee","java","20","ccc@aaa","fmale"));
		list.add(new Group("lee","java","20","ddd@aaa","fmale"));
		list.add(new Group("park","java","30","eeee@aaa","male"));
		
		for (Iterator<Group> iterator = list.iterator(); iterator.hasNext();) {
			Group group = (Group) iterator.next();
			System.out.println(group);
		}
		
		
		Group group0 = list.get(0);
		String kim = group0.getFn();
		System.out.println(kim);
		Group group1 = list.get(1);
		String kim2 = group1.getFn();
		System.out.println(kim2);
		Group group2 = list.get(2);
		Group group3= list.get(3);
		Group group4= list.get(4);
		
		if (condition) {
			
		}
		
//		Map<Integer,list> map = new HashMap<Integer, list>();
//		map.put(1, list.get(0));
//		map.put(2, "lee");
//		map.put(3, "park");

		
		
		
	}

}
