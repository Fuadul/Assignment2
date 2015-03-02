import java.util.Arrays;
import java.util.Scanner;
public class SumAverage {
	public static void main(String[] args) {
	String num1, num2, num3, num4, num5;
	int n1, n2, n3, n4, n5, sum, max, max1, max2, max3, min, min1, min2, min3, middle, Median;
	double dbln1, dbln2, dbln3, dbln4, dbln5, average;
	
	System.out.println("Enter Five Numbers :");
	Scanner keyboard = new Scanner(System.in);
	
	num1 = keyboard.next();
	num2 = keyboard.next();
	num3 = keyboard.next();
	num4 = keyboard.next();
	num5 = keyboard.next();
	
	dbln1 = Double.parseDouble(num1);
	n1 = Integer.parseInt(num1);
	
	dbln2 = Double.parseDouble(num2);
	n2 = Integer.parseInt(num2);
	
	dbln3 = Double.parseDouble(num3);
	n3 = Integer.parseInt(num3);
	
	dbln4 = Double.parseDouble(num4);
	n4 = Integer.parseInt(num4);
	
	dbln5 = Double.parseDouble(num5);
	n5 = Integer.parseInt(num5);
	
	sum = n1+ n2+ n3+ n4+ n5;
	
	average = (dbln1+ dbln2+ dbln3+ dbln4+ dbln5)/5;
	
	max1 = Math.max(n1, n2);
	max2 = Math.max(n3, n4);
	max3 = Math.max(max1,max2);
	max = Math.max(max3, n5);
	
	min1 = Math.min(n1, n2);
	min2 = Math.min(n3, n4);
	min3 = Math.min(min1,min2);
	min = Math.min(min3, n5);		
	
	int list[] = {n1, n2, n3, n4, n5};
	Arrays.sort(list);
	middle = (list.length/2);
	Median = list[middle];
	
	System.out.println("The sum is: " + sum + "\nThe average is: " + average + "\nMax: " + max + "\nMin: " + min + "\nMedian: " + Median);
	keyboard.close();
		}

	}

