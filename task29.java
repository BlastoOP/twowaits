import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class remove_ele_arr
{

	public static void main(String[] args) 
	{
		 List<Integer> al = new ArrayList<>();
		    al.add(10);
	        al.add(20);
	        al.add(30);
	        al.add(1);
	        al.add(2);
  
	        System.out.println(al);
	        Iterator itr = al.iterator();
	        while (itr.hasNext()) 
	        {
	            int x = (Integer)itr.next();
	            if (x < 10)
	            {
	            	 itr.remove();
	            }
	           
	        }
	        System.out.print(al);
	}

}
