package com.testing.tdd;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.*;
public class Testing {
    @Test
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
		int sum=a+b;
		Testing obj=new Testing();
		Assert.assertEquals(sum, obj.sumMethod(a,b));
	}
	public int sumMethod(int a,int b){
		return a+b;
	}
}
