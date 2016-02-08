//Will Gilbert
//February 7, 2016
//HW 2
//CSE 2

//first compile the program
//  javac Arithmetic.java
//run the program
//  java Arithmetic//
public class Arithmetic{
    public static void main(String[] args) {
        //Number of pairs of pants
        int numPants = 3;
        //Cost per pair of 
        double pantsPrice = 34.98;
        
        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;
        
        //Number of belts
        int numBelts = 1;
        //cost per box of envelopes
        double beltCost = 33.99;
        
        //the tax rate
        double paSalesTax = 0.06;
        
        System.out.println("The number of pairs of pants you bought is " + numPants + " pairs.");
        System.out.println("The pants cost " + pantsPrice + " per pair");
        double totalPants = (numPants*pantsPrice);
        System.out.println("The total cost of pants = $" + totalPants);
        double PantsTax = Math.floor((paSalesTax*totalPants)*100)/100;
        System.out.println("The sales tax on Pants = $" + PantsTax);
        double finalPantsCost = Math.floor(PantsTax+totalPants);
        System.out.println("The final cost of pants = $" + finalPantsCost);
        
        System.out.println("The number of sweatshirts you bought is " + numShirts + " sweatshirts.");
        System.out.println("The sweatshirts cost " + shirtPrice + " per sweatshirt");
        double totalShirts = (numShirts*shirtPrice);
        System.out.println("The total cost of sweatshirts = $" + totalShirts);
        double ShirtsTax = Math.floor((paSalesTax*totalShirts)*100)/100;
        System.out.println("The sales tax on sweatshirts = $" + ShirtsTax);
        double finalShirtsCost = Math.floor(ShirtsTax+totalShirts);
        System.out.println("The final cost of sweatshirts = $" + finalShirtsCost);
        
        System.out.println("The number of belts you bought is " + numBelts + " belts.");
        System.out.println("The belts cost " + beltCost + " per belt");
        double totalBelts = (numBelts*beltCost);
        System.out.println("The total cost of belts = $" + totalBelts);
        double BeltTax = Math.floor((paSalesTax*totalBelts)*100)/100;
        System.out.println("The sales tax on belts = $" + BeltTax);
        double finalBeltCost = Math.floor(BeltTax+totalBelts);
        System.out.println("The final cost of belts = $" + finalBeltCost);
        
        double totalPurchase = Math.floor(totalBelts + totalShirts + totalPants);
        System.out.println("The total cost of everything without tax = $" + totalPurchase);
        double totalTax = Math.floor(BeltTax + PantsTax + ShirtsTax);
        System.out.println("The total sales tax on items = $" + totalTax); 
        double FinalPurchase = Math.floor(finalBeltCost + finalPantsCost + finalShirtsCost);
        System.out.println("The final cost of everything with tax = $" + FinalPurchase);
    }
}
