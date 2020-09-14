package com.oracle.demo01;

import java.util.Arrays;

public class BubbleSort {
public static void Bsort(int a[]) {
	for(int i=0;i<=a.length-1;i++){
		boolean flag=false;
		for(int j=0;j<a.length-1-i;j++){
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=true;
				
			}
		}
		if(!flag)
			break;
	}
}
public static void main(String[] args) {
	int a[]={3,2,4,66,11,5,8};
	Bsort(a);
	System.out.println(Arrays.toString(a));
}
}
