import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		
		Pizza basepizza=new Pizza(true);
		basepizza.addextracheese();
		basepizza.addextratoppings();
		basepizza.takeaway();
		basepizza.Getbill();
		
			
				
			
		
		
		
	DeluxePizza dp=new DeluxePizza(false);
	dp.takeaway();
	dp.Getbill();
	
		
		

	}

}
