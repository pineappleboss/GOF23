package InterfacerGoF23;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2020/12/7 16:27
 * @describe 饿汉式单例模式
 */
public class Singleton {
    private static Singleton singleton=null;
    private void Singleton(){
    }
      synchronized  static Singleton getSingleton(){
            if(singleton == null){
                singleton=new Singleton();
                return singleton;
            }
            return singleton;

        }
}
