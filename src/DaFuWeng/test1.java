package DaFuWeng;

import java.util.Scanner;

import static DaFuWeng.Operation.zh;

public class test1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Users aa = new Users();
        System.out.println("即将开始游戏《大富翁》");
        for (; ; ) {
            System.out.println("请选择下列选项:");
            System.out.println("0退出");
            System.out.println("1注册");
            System.out.println("2登录");
            int bb = ss.nextInt();
            switch (bb) {
                case 0:
                    return;
                case 1:
                    Operation.zhuce(aa);
                    break;
                case 2:
                    System.out.println("请输入账号：");
                    int cc = ss.nextInt();
                    System.out.println("请输入密码：");
                    int dd = ss.nextInt();
                    if (Operation.denglu(cc, dd)) {
                        for (; ; ) {
                            System.out.println("请选择下列选项:");
                            System.out.println("0退出");
                            System.out.println("1开始游戏");
                            System.out.println("2抽奖");
                            System.out.println("3修改密码");
                            System.out.println("4删除账号");
                            bb = ss.nextInt();
                            switch (bb) {
                                case 0:
                                    return;
                                case 1:
                                    break;
                                case 2:
                                    Operation.cj();
                                    break;
                                case 3:
                                    System.out.println("请输入账号：");
                                    cc = ss.nextInt();
                                    System.out.println("请输入密码：");
                                    dd = ss.nextInt();
                                    Operation.xgmm(cc, dd);
                                    break;

                                case 4:
                                    System.out.println("请输入账号：");
                                    cc = ss.nextInt();
                                    System.out.println("请输入密码：");
                                    dd = ss.nextInt();
                                    Operation.sczh(cc, dd);
                                    break;
                                default:
                                    System.out.println("输入错误");
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }

        }

    }

}


//            }
//            for (; ; ) {
//
//            System.out.println("请选择下列选项:");
//            System.out.println("0退出");
//            System.out.println("1开始游戏");
//            System.out.println("2抽奖");
//            System.out.println("3修改密码");
//            System.out.println("4删除账号");
//            int bb = ss.nextInt();

