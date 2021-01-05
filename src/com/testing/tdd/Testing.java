package com.testing.tdd;

import org.testng.Assert;
import org.testng.annotations.*;
public class Testing {
    @Test
	public static void main(String[] args){
		int sum=0;
		int a=56;
		int b=45;
		Testing obj=new Testing();
		sum=obj.sumMethod(a,b);
		Assert.assertEquals(101, sum);
		System.out.println(sum);
	}
	public int sumMethod(int a,int b){
		return a+b;
	}
	
}
