public class Number_Format_Exception {
    public static void main(String[] args){
        String s = "xyz";
        try{
            Integer.parseInt(s);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of code ..");
    }
}