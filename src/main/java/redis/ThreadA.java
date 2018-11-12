package redis;

/**
 * @author Administrator
 * @version 1.0
 * @className ThreadA
 * @description TODO
 * @date 2018/11/12 17:16
 **/
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.seckill();
    }
}
