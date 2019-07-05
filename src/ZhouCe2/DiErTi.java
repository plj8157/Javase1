package ZhouCe2;

public class DiErTi {
    public static void main(String[] args) {
       String  hello =new String();

       double avg= calcAvg();
System.out.println("平均成绩为："+avg);
    }
    public static   double calcAvg(){
        double java =92.5;
        double php=83.0;
        double avg=(java+php)/2;
        return  avg;
    }
}
