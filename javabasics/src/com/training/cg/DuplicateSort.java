package com.training.cg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class DuplicateSort{
public static void main(String args[]) { 
	
	       List<String> listObject = new ArrayList<>();
            List<String> listObject2 = new ArrayList<>();
			listObject.add("swa");
			listObject.add("suraj");
			listObject.add("pamu");
			listObject.add("suraj");
			listObject.add("swe");
			
			listObject2.add("capegemini");
			listObject2.add("wipro");
			listObject2.add("infosys");
			listObject2.add("capegemini");
			listObject2.add("wipro");
			
			Iterator<String> itList = listObject.iterator();
			//Iterator<String>itObjectForList = listObject2.iterator();
			
			while (itList.hasNext())
			{
				System.out.println(itList.next());
			}

			     System.out.println("After converting into set ----");

			Set<String> set = new HashSet<String>(listObject);
			
			Iterator<String> itObjectForSet = set.iterator();
			while (itObjectForSet.hasNext()) {
				System.out.println(itObjectForSet.next());
			}
		}
	
}

