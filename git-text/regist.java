import java.util.HashMap;
import java.util.Scanner;

public class regist {

    public static void main(String[] args) {
        HashMap<String, String> User = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择你的操作/1.注册操作2.登录操作");
            int i = scanner.nextInt();
            if (i == 1) {//注册方法
                System.out.println("请输入账号");
                String account = scanner.next();
                System.out.println("请输入密码");
                String passWord = scanner.next();
                User.put(account, passWord);
            }
            if (i == 2) {//登录方法
                System.out.println("请输入账号");
                String account = scanner.next();
                System.out.println("请输入密码");
                String passWord = scanner.next();
                if (!User.containsKey(account)) {//判断map里面有没有输入的键
                    System.out.println("账号错误或查无此账号");
                }
                else{
                    if(User.get(account).equals(passWord))
                    {
                        System.out.println("登陆成功");
                        break;
                    }
                    else System.out.println("密码错误");
                }
            }
        }
    }
}
