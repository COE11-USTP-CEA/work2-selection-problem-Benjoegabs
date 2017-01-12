import java.util.List;
import java.util.ArrayList;

public class inventory{
 
 public static void main(String args[]){  
      item t1 = new item("Safe Guard", "Soap", 11.00f);
      item t2 = new item("Palmolive", "Shampoo", 9.50f);
      
      List<item> inv = new ArrayList<item>();
      inv.add(t1);
      inv.add(t2);
      
      for(item 1 : inv);
            System.out.println("Item:" + i.getName());
            System.out.println("Type:" + i.getCategory());
            System.out.println("Price:" + i.getPrice());
      }
  }
}  
