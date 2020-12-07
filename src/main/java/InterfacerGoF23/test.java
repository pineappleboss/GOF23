package InterfacerGoF23;

import java.math.BigDecimal;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2020/12/3 18:03
 * @describe
 */
public class test {
    public static void main(String[] args) {
        //下降没达到 ture
        //达到false
        System.out.println((new BigDecimal(1-0.01).multiply(new BigDecimal(100)).compareTo(new BigDecimal(99.2)))<=BigDecimal.ZERO.intValue());
    }
}
