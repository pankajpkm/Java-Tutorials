package src.main.java.tutorials.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test13 {

	public int buyMaxItems(int[] priceList, int maxBudget) {
		List<Integer> itemsCount= new ArrayList<>();
		
		for(int i=0; i<priceList.length; i++) {
			int boughtItems=0;
			for(int j=i; j<priceList.length; j++) {
				boughtItems+=priceList[i]+priceList[j];
				if(boughtItems>=maxBudget)
					itemsCount.add(j+1);
				
			}
		}
		Collections.sort(itemsCount);
		return itemsCount.get(itemsCount.size()-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Price_List = new int[] {1,2,3,4};
		int Max_Budget = 7;
		Test13 t =new Test13();
		System.out.println(t.buyMaxItems(Price_List, Max_Budget));
		
	}

}
