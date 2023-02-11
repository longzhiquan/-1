import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class regist_map {
    static void login() throws IOException {//注册
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("输入7 继续注册 输入其他终止注册");
            int a = scanner.nextInt();
            if (a == 7) {
                System.out.println("请输入注册的账号");
                String s1 = scanner.next();
                System.out.println("请输入注册的密码");
                String s2 = scanner.next();
                map.put(s1, s2);//将账号密码存到map里面
            } else break;
        }
        FileOutputStream out = new FileOutputStream("C:\\Users\\账户和密码.txt");
        ObjectOutputStream Wout = new ObjectOutputStream(out);
        Wout.writeObject(map);//将map流入到磁盘
        out.flush();//刷新流
        out.close();//关闭流
    }

    static void logon() throws IOException, ClassNotFoundException {//登录
        Scanner scanner = new Scanner(System.in);
        FileInputStream reader = new FileInputStream("C:\\Users\\账号密码.txt");
        ObjectInputStream oin = new ObjectInputStream(reader);
        Map<String, String> map = (Map<String, String>) oin.readObject();//把map读出来
        System.out.println("请输入账号");
        String z = scanner.next();
        System.out.println("请输入密码");
        String m = scanner.next();
        if (!map.containsKey(z)) {//判断map里面有没有输入的键
            System.out.println("账号错误或查无此账号");
        } else {
            if (map.get(z).equals(m)) {
                System.out.println("登陆成功");
            } else System.out.println("密码错误");
        }
    }
}
