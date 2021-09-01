package main.java;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input:
			List<String> list = Arrays.asList("2468","2466,2468,2470,2475","2466,2468,2470,2475,2478,2473,2479");
			System.out.println(list);
//			Output: 
//			List<String> list = Arrays.asList("2468","2466,2470,2475","2478,2473,2479");

			List<String> noDuplicateList= new ArrayList<String>();
			 

			Iterator itr = list.iterator();

			while(itr.hasNext()){
				
				String s= (String)itr.next();
				if( ! noDuplicateList.contains( s ) )
					{
						noDuplicateList.add(s);
					}
				
			}
			System.out.println(list);
//			list.clear();

			for(String s: noDuplicateList){
				
				list.add(s);
			}

	}

}
