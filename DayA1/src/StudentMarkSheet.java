import java.util.*;
public class StudentMarkSheet {
    public static void main(String args[]){
        int sum1 = 0;
        int sum2 = 0;
        int precentage1,precentage2;
        ArrayList<Integer> Marks=new ArrayList<Integer>();
        Marks.add(80);
        Marks.add(88);
        Marks.add(93);
        Marks.add(92);
        Marks.add(91);
        for(int i=0;i<Marks.size();i++)
        {
            sum1 = sum1 + Marks.get(i);
        }
        precentage1 = (sum1+100)/500;
        System.out.println("Total marks:"+sum1);
        System.out.println("precentage1:"+precentage1);
        try{
            Marks.remove(2);
        }
        catch(Exception e){
            System.out.println("occurs exception");
        }
        for (int i=0;i<Marks.size();i++)
        {
            sum2 = sum2 + Marks.get(i);
        }
        precentage2 = (sum1+100)/400;
        System.out.println("Total marks"+sum2);
        System.out.println("After removing precentage2:"+precentage2);
    }
}
