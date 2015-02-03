//Paige Howes
//HW 02
//February 3, 2015
//
//Find total cost of each item
//Sales tax for total cost
//Total cost before tax
//Total paid in transaction
//
//define the class
public class Arithmetic {
    //main method
    public static void main (String [] args) {
        
        //number of socks
        int nSocks = 3;
        //cost of socks
        double sockCost$ = 2.58;
        double totalSockCost$;
        
        //number of drinking glasses
        int nGlasses = 6;
        //cost per glass
        double glassCost$ = 2.29;
        double totalGlassCost$;
        
        //number of boxes of envelopes
        int nEnvelopes = 1;
        //cost per box of envelopes
        double envelopeCost$ = 3.25;
        double totalEnvelopeCost$;
        
        //tax rate
        double taxPercent = 0.06;
        double taxSock,
        taxGlass,
        taxEnvelope;
        
        //define total variables
        double totalWithoutTax,
        totalTax,
        totalWithTax;
        
        //print item being bought,number of items, and cost per item
        System.out.println("There are " + nSocks + " socks being purchased for $" + sockCost$ + " each");
        System.out.println("There are " + nGlasses + " glasses being purchased for $" + glassCost$ + " each");
        System.out.println("There is " + nEnvelopes + " box of envelopes being purchased for $" + envelopeCost$ + " each");
        
        //total cost for each item
        totalSockCost$ = nSocks * sockCost$;
        totalGlassCost$ = nGlasses * glassCost$;
        totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
        //sales tax for each item
        taxSock = (totalSockCost$ * taxPercent) * 100;
        taxSock = (int) taxSock/100.0;
        taxGlass = (totalGlassCost$ * taxPercent) * 100;
        taxGlass = (int) taxGlass/100.0;
        taxEnvelope = (totalEnvelopeCost$ * taxPercent) * 100;
        taxEnvelope = (int) taxEnvelope/100.0;
        
        //print cost per item and the sales tax for each item
        System.out.println("The total cost of the socks is $" + totalSockCost$ + " and the tax is $" + taxSock);
        System.out.println("The total cost of the glasses is $" + totalGlassCost$ + " and the tax is $" + taxGlass);
        System.out.println("The total cost of the envelopes is $" + totalEnvelopeCost$ + " and the tax is $" + taxEnvelope);
        
        //calculate totals
        totalWithoutTax = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
        totalTax = taxSock + taxGlass + taxEnvelope;
        totalWithTax = totalWithoutTax + totalTax;
        
        //print totals
        System.out.println("Total cost of items without tax: $ " + totalWithoutTax);
        System.out.println("Total sales tax: $" + totalTax);
        System.out.println("Total cost of item with tax: $" + totalWithTax);
    }
}