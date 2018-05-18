package design.proxy.steady;

import java.util.Date;

/**
 * @Description: 静态代理类
 *
 * @author lszhen
 * @date 2018/5/18下午2:12
 */
public class BusinessAgent implements Sell {
    private Sell sell;

    public BusinessAgent(Sell sell) {
        this.sell = sell;
    }

    @Override
    public void sell() {
        System.out.println("before sell,开始执行时间："+new Date());
        sell.sell();
        System.out.println("after sell,结束执行时间："+new Date());
    }
    
}
