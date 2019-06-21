package CeShi;

public class zhouCe2_3 {
    public static void main(String[] args){
        int sum=0;
        int num=2;
        int i=1;
        do{
            sum=i*(i-1);
            num=num+2;
            i++;

        }while (num<=50);
        System.out.println("50以内的偶数的和为："+sum);
    }
}
