package InterfacerGoF23;

/**
 * 抽象一个工厂然后实现它，不同的类使用不同的工厂(核心)
 * @author tiankaiqiang
 * @version 1.0
 * @date 2020/12/7 15:31
 * @describe
 */
public class MethodFactory {
    public static void main(String[] args) {
        CirleFactory cirleFactory= new CirleFactory();
        cirleFactory.shape();
        SquareFactory squareFactory=new SquareFactory();
        squareFactory.shape();
    }
}
/**
* @Description: 工厂方法，实现将通用方法
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
abstract class Factory{
    public void logger(){
        System.out.println("打印日志");
    }
    abstract DrawShape shape();
}
/**
* @Description: 圆形工厂方法
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
class CirleFactory extends Factory{

    DrawShape shape() {
        return new cirle2();
    }
}
/**
* @Description: 正方形工厂方法
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
class SquareFactory extends Factory{

    DrawShape shape() {
        return new Square2();
    }
}

/**
 * 产生的对象，继承自某个类
 */
interface DrawShape{
     void shape();
}

class cirle2 implements DrawShape{

    public void shape() {
        System.out.println("圆");
    }
}
class Square2 implements DrawShape{
    public void shape() {
        System.out.println("正方形");
    }
}