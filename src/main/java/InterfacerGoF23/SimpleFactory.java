package InterfacerGoF23;

/**
 * 简单工厂模式
 * 缺点：当有新的类加进来时就需要修改工厂方法。不符合“开闭原则”
 * @author tiankaiqiang
 * @version 1.0
 * @date 2020/12/7 10:08
 * @describe
 */
public class SimpleFactory {
    public static void main(String[] args) throws Exception {
        draw cirle=ShapeFactory.getShape("圆");
        cirle.draw();
        cirle.shape();
        cirle.erase();
    }
}
/**
* @Description: 抽象父类，抽象化，将私有方法也抽象化
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
abstract class draw{
    public void draw(){
        System.out.println("图画");
    }
    public void erase(){
        System.out.println("擦除");
    }

    abstract public void shape();
}
/**
* @Description:
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
class cirle extends draw{

    public void shape() {
        System.out.println("圆形");
    }
}
/**
* @Description:
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
class square extends draw{

    public void shape() {
        System.out.println("正方形");
    }
}
/**
* @Description: 工厂方法，不同输入参数返回不同类，不存在时抛出异常，异常可自定义
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
class ShapeFactory{
    public static draw getShape(String shape) throws Exception {
        if(shape.equals("圆")){
            return new cirle();
        }else if(shape.equals("正方形")){
            return new square();
        }else{
            throw new Exception();
        }
    }
}