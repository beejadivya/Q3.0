public class Holiday {
    public static void main(String[] args) {

    }
    private String name;
    private int day;
    private String month;
    public Holiday(String n, int d, String m){
        name = n;
        day = d;
        month = m;
    }
    public boolean inSameMonth (Holiday hol){
        return this.month.equals(hol.month);
    }
    public static double avgDate (Holiday[]hol) {
        int sum = 0;
        for (int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum) / hol.length;
    }
    Holiday in = new Holiday("Independence Day", 4, "July");
}
