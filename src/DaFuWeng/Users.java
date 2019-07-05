package DaFuWeng;

public class Users {
//    属性
private int name;
private  int password;
private  int huiyuan;
//赋值
    public int getName() {
        return name;
    }

    public int setName(int name) {
        this.name = name;
        return name;
    }

    public int getPassword() {
        return password;
    }

    public int setPassword(int password) {
        this.password = password;
        return password;
    }

    public int getHuiyuan() {
        return huiyuan;
    }

    public void setHuiyuan(int huiyuan) {
        this.huiyuan = huiyuan;
    }
//    构造方法
    public  void Users(){

    }
    public  void Users(int name,int password){
        this.name=name;
        this.password=password;

    }
//    方法
    public  void daying(){

    }
}
