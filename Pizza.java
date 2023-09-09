
public class Pizza {
private int price;
private Boolean veg;

private int extraCheesePrice=100;
private int extratoppingsPrice=150;
private int backpackPrice=20;

private int basePizzaPrice;

private boolean isExtraCheeseAdded=false;
private boolean isExtraToppingsAdded=false;
private boolean isOptedForTakeaway=false;

public Pizza(Boolean veg) {
	this.veg=veg;
	if(this.veg) {
		this.price =300;
	}else {
		this.price=400;
	}
	basePizzaPrice=this.price;
}
public void addextracheese() {
	isExtraCheeseAdded=true;
	this.price+=extraCheesePrice;
}
public void addextratoppings() {
	isExtraToppingsAdded=true;
	this.price+=extratoppingsPrice;
}
public void takeaway() {
	isOptedForTakeaway=true;
	this.price+=backpackPrice;
}
public void Getbill() {
	String Bill="";
	System.out.println("Pizza: "+basePizzaPrice);
	if(isExtraCheeseAdded) {
		Bill+="Extra Cheese Added: "+extraCheesePrice+ "\n";
	}
	if(isExtraToppingsAdded) {
		Bill+="Extra Topping Added: "+extratoppingsPrice+ "\n";
	}
	if(isOptedForTakeaway) {
		Bill+="Take away: "+backpackPrice+ "\n";
	}
	Bill +="Bill: "+this.price+"\n";
	System.out.println(Bill);
	
}
}
