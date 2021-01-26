package BaseKnownledge;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/1/19 15:50
 * @describe
 */
public class TestLamda {
    public static void main(String[] args) {
        User user1 = new User("Tom",15,"96968686");
        User user2 = new User("Cat",24,"10086000");
        User user3 = new User("Storm",25,"89898989");
        User user4 = new User("HBase",26,"85858585");
        User user5 = new User("Hadoop",26,"78787878");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        //遍历集合
        list.stream().forEach(x->System.out.println(x));
        list.stream().forEach(System.out::println);
        //分组
        Map<String,List<User>> map=list.stream().collect(Collectors.groupingBy(x->x.getName()));
        map.forEach((k,v)->{System.out.println("分组"+k+"---"+v);});
        //映射为map
        Map<String, Integer> stringMap=list.stream().collect(Collectors.toMap(User::getName,User::getAge));
        //将某个属性拿出来进行映射
        List list1=list.stream().map(x->x.getAge()).collect(Collectors.toList());//将年龄映射为链表（int类型自动装箱）
        list.stream().map(x->x.getAge()).reduce(0,Integer::sum);//计算年龄总和
        Integer age=list.stream().map(x->x.getAge()).reduce(0,Integer::max);//计算最大值,0为初始值
        //取最值
        Optional<User> user=list.stream().max(Comparator.comparing(User::getAge));//年龄最大的
        //过滤
        list.stream().filter(x->x.getAge()>20).collect(Collectors.toList());

    }
}
class User{
    //姓名
    private String name;
    //年龄
    private int age;
    //学号
    private String number;

    public User() {
    }

    public User(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}