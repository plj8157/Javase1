package DaFuWeng;

import java.util.Scanner;

public class Operation {
    static Scanner ss = new Scanner(System.in);

    //    构造方法
    public void Operation() {

    }

    //        导入用户
    static int count = 10;
    static int ys = 0;


    static Users[] zh = new Users[count];


    public static void zhuce(Users aa) {
        System.out.println("请选择：");
        System.out.println("1注册/0退出");
        int bb = ss.nextInt();
        switch (bb) {
            case 0:
                break;
            case 1:
                System.out.println("请输入账号：");
                int cc = ss.nextInt();
                System.out.println("请输入密码：");
                int dd = ss.nextInt();
                for (int i = 0; i < zh.length; i++) {
                    if (ys == 0) {
                        aa.setName(cc);
                        aa.setPassword(dd);
                        zh[i] = aa;
                        ys++;
                        System.out.println("注册成功。");
                        return;
                    }
                    if (ys != 0) {
                        for (int j = 0; j < zh.length; j++) {
                            if (cc == zh[j].getName()) {
                                System.out.println("该账号已存在！");
                                return;
                            } else {
                                aa.setName(cc);
                                aa.setPassword(dd);
                                zh[i] = aa;
                                ys++;
                                System.out.println("注册成功。");
                                if (ys == count) {
                                    System.out.println("请删除一些账号再进行注册");
                                }
                                return;
                            }
                        }

                    }
                }
            default:
                System.out.println("输入错误");
                break;
        }
    }


    //    登录用户
    public static boolean denglu(int aa, int bb) {
        for (int i = 0; i < zh.length; i++) {
            if (zh[i] != null) {
                if (aa == zh[i].getName() && bb == zh[i].getPassword()) {
                    System.out.println("登录成功!");
                    return true;
                }
            }
        }
        System.out.println("账号或密码错误！");
        return false;
    }

    //    修改密码
    public static void xgmm(int aa, int bb) {
        for (int i = 0; i < zh.length; i++) {
            if (zh[i] != null) {
                if (aa == zh[i].getName()) {
                    if (bb == zh[i].getPassword()) {
                        System.out.println("请输入新密码：");
                        int cc = ss.nextInt();
                        zh[i].setPassword(cc);
                        System.out.println("修改成功。");
                        return;
                    } else System.out.println("密码错误");
                }
            }

        }
        System.out.println("账号不存在!");

    }

    //    删除账号
    public static void sczh(int aa, int bb) {
        for (int i = 0; i < zh.length; i++) {
            if (zh[i] != null) {
                if (aa == zh[i].getName()) {
                    if (bb == zh[i].getPassword()) {
                        zh[i] = null;
                        System.out.println("删除成功。");
                        return;
                    } else System.out.println("密码错误");
                }
            }
        }
        System.out.println("账号不存在!");


    }
     public static void cj(){
        if (Math.round(Math.random()*100)%7==0) {
            System.out.println("获得宠物：皮卡丘一只");
            return;
        }
         if (Math.round(Math.random()*100)%5==0) {
             System.out.println("获得：狗粮一袋");
             return;
         }
         if(Math.round(Math.random()*100)%3==0){
             System.out.println("获得：满天星一束");
             return;
         }
         System.out.println("谢谢参与！");
     }

}


