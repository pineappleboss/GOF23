package BaseKnownledge;

import java.io.Serializable;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/1/12 18:21
 * @describe Equals 可以认为equals与==相同，因为在object对象中
 * public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 *  由此可见如果一个对象没有进行重写equals的话和==相同，==来比较其是否是同一个对象，即对象指向地址是否相同
 *  ，hashcode的产生在同一个JVM中是固定不变的，但是不同对象有可能产生相同的hashcode，所以同一个对象的hashcode一定相同，但
 *  hashcode相同不一定同一个对象
 */
public class TestEquals implements Serializable{
    public static void main(String[] args) {

    }
}