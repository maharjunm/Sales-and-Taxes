import java.util.Scanner;

/**
 * Created by maharjun on 8/24/15.
 */
public class Receipt {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        String[] listOfItems=new String[number];
        for(int i=0;i<number;i++){
            listOfItems[i]=scanner.next();
        }
        Receipt receipt=new Receipt();
        receipt.getReceipt(listOfItems);
    }

    private double getReceipt(String[] listOfItems) {
        double tax=0;
        String[] receipts=new String[listOfItems.length+2];
        for(int i=0;i<listOfItems.length;i++){
            String[] contentList=listOfItems[i].split(" ");
            int noOfItems=Integer.parseInt(contentList[0]);
            int taxPercent=isItAImportedELement(contentList[1]);
            double itemRate=Double.parseDouble(contentList[contentList.length-1]);
            tax+=(itemRate*taxPercent)/100;
            String result=addItem(contentList);
        }
        return 0;
    }

    private String addItem(String[] contentList) {
        return null;
    }

    private int isItAImportedELement(String s) {
        if(s.equals("imported"))
            return 15;
        return 10;
    }
}
