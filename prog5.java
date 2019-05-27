package main;
import Algorithm.search.*;
import Algorithm.sort.*;

class Sort extends Thread{
	String str;
	Sort(int i){
		if(i==1)
			str="Bub";
		else
			str="Sel";
	}
	public void run(){
		int arr[]={5,3,1,6,4};
		int arr1[]={25,23,21,26,24};
		
		int array[];
		int n=5;
		if(str.equals("Bub"))
			{
			bubble bubsort=new bubble();
			array=bubsort.bubbleSort(arr1, n);
			for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
			}
			else
			{
				selection selsort=new selection();
				array=selsort.selectionSort(arr,n);
				for(int i=0;i<array.length;i++)
				System.out.println(array[i]);
			}
		}
	}

class Search extends Thread{
	public void run(){
		int arr[]={15,13,11,16,14};
		int array[];
		int n=5,key=13;
		bubble bubsort=new bubble();
		array=bubsort.bubbleSort(arr, n);
		binary bs=new binary();
		bs.binarySearch(array, n, key);
	}
}

public class prog {
public static void main(String[] args) {
	Sort s1=new Sort(1);
	Sort s2=new Sort(2);
	s1.start();
	s2.start();
	Search s3=new Search();
	s3.start();
	}
}




package Algorithm.search;

public class binary {
	public void binarySearch(int array[],int n, int key)
	  {
	    int f, l, m, s;
	    System.out.println("Using Binary Search");
	    s = key;
	 
	    f  = 0;
	    l   = n - 1;
	    m = (f + l)/2;
	 
	    while( f <= l )
	    {
	      if ( array[m] < s )
	        f = m + 1;    
	      else if ( array[m] == s ) 
	      {
	        System.out.println(s + " found at location " + (m + 1) + ".");
	        break;
	      }
	      else
	         l = m - 1;
	 
	      m = (f + l)/2;
	   }
	   if ( f > l )
	      System.out.println(s + " is not present in the list.\n");
	  }
}





package Algorithm.sort;

public class bubble {

	public int[] bubbleSort(int arr[],int n){ 
	    int t = 0;  int i=0;
	     for(; i < n; i++){  
	             for(int j=1; j < (n-i); j++){  
	                      if(arr[j-1] > arr[j]){  
	                             
	                             t = arr[j-1];  
	                             arr[j-1] = arr[j];  
	                             arr[j] = t;  
	                      		}  
	                      
	             	}  
	             try {
	     			Thread.sleep(1000);
	     		} catch (InterruptedException e) {
	     		
	     			e.printStackTrace();
	     		}
	     }
	     System.out.println("Sorting using Bubble Sort");
	          return arr;
		}
}






package Algorithm.sort;

public class selection {

	public int[] selectionSort(int arr[],int n){
		 int i = 0;
		   for (; i < n - 1; i++)  
	       {  
	           int index = i;  
	           for (int j = i + 1; j < n; j++){  
	               if (arr[j] < arr[index]){  
	                   index = j;
	               }  
	           }  
	           int smallerNumber = arr[index];   
	           arr[index] = arr[i];  
	           arr[i] = smallerNumber;  
	           try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
	       } 
		   System.out.println("Sorting using Selection Sort");
		 return arr;
	 }
}