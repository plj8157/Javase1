package ZhouCe2;

public class DiYiTi {
    public static void main(String[] args) {
        String names[][]=new String[2][3];
        names[0][0]="tom";
        names[0][1]="jack";
        names[0][2]="mike";
        names[1][0]="zhangsan";
        names[1][1]="lisi";
        names[1][2]="wangwu";
for (int i=0;i<2;i++){
    for(int j=0;j<names[i].length;j++){
        System.out.println(names[i][j]);
    }
}  System.out.println();




    }
}
