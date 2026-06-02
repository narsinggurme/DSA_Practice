package com.may01;

public class MajorityElement {

    public static int majorityElement(int[] nums)
    {
    	int majorityElement = 0;
    	int count = 0;
    	
    	for (int a : nums)
    	{
    		if(count == 0)
    		{
    			majorityElement = a;
    		}
    		
    		if(majorityElement == a)
    		{
    			count ++;
    		}
    		else
    		{
    			count --;
    		}
    		
    	}
    	
    	return majorityElement;
    }
    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1};

        System.out.println("Majority element: " + majorityElement(arr));
    }
}