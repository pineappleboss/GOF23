package InterfacerGoF23;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2020/12/7 17:24
 * @describe
 */
public class Adapter {
    public static void main(String[] args) {
        AdapterInterger adapterInterger=new AdapterInterger();
        adapterInterger.getFriut();
    }
}
/**
* @Description: 提供的接口或方法，可看作被装饰着
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
interface Fruit{
    void getFruit();
}

 class Apple implements Fruit{
     public void getFruit(){
         System.out.println("获取苹果");
     }
}
class banana implements Fruit{
     public void getFruit(){
         System.out.println("获取香蕉");
     }
}
/**
* @Description: 创建适配器，将接口转换为需要的
* @Param:
* @return:
* @Author: tiankaiqiang
* @Date: 2020/12/7
*/
interface AdapterIntergerMethod{
    Fruit getFriut();
}
class AdapterInterger implements AdapterIntergerMethod{
    Fruit apple;
    Fruit banana;

    public Fruit getFriut() {

        return null;
    }
}
