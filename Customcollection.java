package epam.Collections;
import java.util.*;

public class Customcollection {
			public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			List<Integer> list = new List<Integer>();
			
			boolean n = true;
			while(n) {
				System.out.println("Enter your choice : \n1. Add element \n2. Get element by index\n3. Remove element \n4. Display all the elements \n5. No operation required");
				int num;
				num = s.nextInt();
				switch(num) {
				case 1 : System.out.println("Enter element to be added : ");
				int e = s.nextInt();
				list.add(e);
				break;
				case 2 : System.out.println("Enter the index of the element to be found : ");
				int ind = s.nextInt();
				if(ind > list.Size()-1) {
					System.out.println("List index out of bounds");
				} else {
					System.out.println(list.get(ind));
				}
				break;
				case 3 : System.out.println("Enter index of the element to be removed");
				int a = s.nextInt();
				if(a > list.Size()-1) {
					System.out.println("List index out of bounds");
				} else {
				list.remove(a);
				}
				break;
				case 4 : System.out.println("The list is : " + list);
				break;
				case 5 : n = false;
				break;
				}
			}
		}
}