import java.io.IOException;
import java.util.Scanner;

public class Reigist_1 {
    /*2.实现注册，登录。
      用户信息:用户名(userName),密码(password)
     （1）注册功能：输入自己的个人信息，保存到文件。
     （2）登录：输入自己的个人信息，与文件中的每行用户信息比较,判断登录是否成功.*/
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" 输入1 进入注册功能");
            System.out.println(" 输入2进入登录功能");
            System.out.println(" 输入3退出");
            int i = scanner.nextInt();
            if (i == 1)
                regist_map.login();
            if (i == 2)
                regist_map.logon();
            if (i == 3)
                break;
        }
    }
}
