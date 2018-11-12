package redis;

/**
 * @author Administrator
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2018/11/12 17:16
 **/
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 0; i < 50; i++) {
            ThreadA threadA = new ThreadA(service);
            threadA.start();
        }
    }
}
