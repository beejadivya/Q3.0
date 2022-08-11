import java.util.*;
public class StudentMarkSheet {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        float percentage,percentage1;
        ArrayList<String> subject = new ArrayList<>();
        subject.add("Maths");
        subject.add("Physics");
        subject.add("Chemistry");
        subject.add("English");
        subject.add("Sanskrit");

        //subject.remove(2);
        System.out.println(subject);
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(93);
        marks.add(92);
        marks.add(63);
        marks.add(89);
        marks.add(99);
        //marks.remove(2);
        for (int position = 0; position < marks.size(); position++)

            sum1=sum1+ marks.get(position);
        {

            percentage=(sum1*100)/500;
            System.out.println("total marks: "+" "+sum1);
            System.out.println("total percentage: "+" "+percentage);
            try{
                marks.remove(2);
            }
            catch(Exception e){
                System.out.println("exception occurs");
            }
            for (int position = 0; position < marks.size(); position++){
                sum2=sum2+marks.get(position);
            }
            percentage1=(sum2*100)/400;
            System.out.println("After removing total marks: "+" "+sum2);
            System.out.println("After removing total percentage: "+" "+percentage1);
        }
    }
}