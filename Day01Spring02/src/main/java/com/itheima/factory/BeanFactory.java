package com.itheima.factory;

/**
 * @author zack
 * @create 2019-12-30-13:21
 */

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 配置文件配置service和dao  唯一限定类名==全限定类名
 * 通过读取配置文件得内容，反射创建对象
 */
public class BeanFactory {
    private static Properties props;
    private static Map<String, Object> beans;

    /**
     *使用静态代码块为properties赋值
     */
    static {
        try {
            props = new Properties();

            //获取properties文件得流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            beans = new HashMap<>();
            //取出配置文件中所有的Keys
            Enumeration keys = props.keys();
            //遍历枚举
            while (keys.hasMoreElements()) {
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                //存入hashmap
                beans.put(key, value);
            }

        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化失败");
        }
    }

    public static Object getBean(String beanName) {

        return beans.get(beanName);
    }


    /**
     * 根据bean名字获取bean对象
     *
     * @param beanName
     * @return
     */
//    public static Object getBean(String beanName) {
//        Object bean = null;
//        try {
//            String beanPath = props.getProperty(beanName);
//            System.out.println(beanPath);
//            bean = Class.forName(beanPath).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return bean;
//    }
}
