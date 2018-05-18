package design.proxy.steady;

/**
 * @Description: 静态代理测试类
 *
 * @author lszhen
 * @date 2018/5/18下午2:14
 */
public class Client {
    public static void main(String[] args) {
        BusinessAgent businessAgent = new BusinessAgent(new Vender());
        businessAgent.sell();
    }
}
