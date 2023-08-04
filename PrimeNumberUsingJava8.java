package com.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberUsingJava8 {

	public static void main (String [] args) {
		
List<Integer> numbers=new ArrayList<Integer>();
for(int i=10;i<1000;i++) {
	numbers.add(i);
}
numbers.stream().filter(n->Example.isPrime(n)).collect(Collectors.toList()).forEach(System.out::println);

			}
	public static boolean isPrime(int number) {
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}}
		return true;
		}}
	
	
