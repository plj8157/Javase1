package CeShi;

public class zhouCe2_3 {
    public static void main(String[] args){
        int sum=0;
        int num=2;
//        int i=2;
        do{
//            sum=i*(i-1);
//            num=num+2;
//            i++;
            sum=sum+num;
            num=num+2;


        }while (num<=50);
        System.out.println("50以内的偶数的和为："+sum);
    }
}
