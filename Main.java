package exercise9;

import java.util.*;

public class Main {
  
	public static void main(String[] args) 
	{
    Scanner a = new Scanner(System.in);
	System.out.println("Введите длину массива: ");
		int n = a.nextInt();
		int b[] = new int[n];
		System.out.println("Заполните массив:");
		int i = 0;
		  while (i < b.length) {
			b[i] = a.nextInt();
			i++;
		  }   
   for (i = 0; i < b.length; i++) {
      b[i] *= 2;
    }
    System.out.println("Массив, умноженный на 2:");
    System.out.println(Arrays.toString(b));
     
  }
}
