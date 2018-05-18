package design.proxy.steady;

/**
 * @Description: 实际的业务处理类
 *
 * @author lszhen
 * @date 2018/5/18下午2:09
 */
public class Vender implements Sell {
    @Override
    public void sell() {
        System.out.println("sell method");
    }
}
