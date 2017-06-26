package com.shawnyan.framework.bean;

import com.shawnyan.framework.annotation.Action;
import com.shawnyan.framework.helper.ClassHelper;
import com.shawnyan.framework.util.ArrayUtil;
import com.shawnyan.framework.util.CollectionUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 控制器助手类
 * 在 ControllerHelper 中封装了一个 Action Map ,
 * 通过它来存放 Request 与 Handler 之间的映射关系，
 * 然后通过 ClassHelper 来获取所有带有 Controller 注解的类，
 * 接着遍历 Controller 类，从 Action 注解中提取 URL ，
 * 最后初始化 Request 与 Handler 之间的映射关系。
 * <p>
 * Created by SHAWN on 6/26/2017.
 */
public class ControllerHelper {

    /**
     * 用于存放请求与处理器的映射关系(简称 Action Map)
     */
    private static final Map<Request, Handler> ACTION_MAP = new HashMap<Request, Handler>();

    static {
        //获取所有的 ControllerClass
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
        if (CollectionUtil.isNotEmpty(controllerClassSet)) {
            // 遍历ControllerClass
            for (Class<?> controllerClass : controllerClassSet) {
                // 获取该controller的所有方法
                Method[] methods = controllerClass.getDeclaredMethods();
                if (ArrayUtil.isNotEmpty(methods)) {
                    // 遍历congroller的所有方法
                    for (Method method : methods) {
                        // 判断方法中是否有action注解标记
                        if (method.isAnnotationPresent(Action.class)) {
                            // 获取 action 标记的一行注解
                            Action action = method.getAnnotation(Action.class);
                            // 获取action标记的内容
                            String mapping = action.value();
                            // 判断 url 映射规则
                            if (mapping.matches("\\w+:/\\w*")) {
                                // 将url分割成数组
                                String[] array = mapping.split(":");
                                if (ArrayUtil.isNotEmpty(array) && array.length == 2) {
                                    // 获取请求方法 get,post,delete,put
                                    String requestMethod = array[0];
                                    // 获取请求路径
                                    String requestPath = array[1];
                                    Request request = new Request(requestMethod, requestPath);
                                    Handler handler = new Handler(controllerClass, method);
                                    // 初始化 Action Map<Request, Handler>
                                    ACTION_MAP.put(request, handler);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * 获取handler
     *
     * @param requestMethod
     * @param requestPath
     * @return
     */
    public static Handler getHandler(String requestMethod, String requestPath) {
        //走的是request的构造方法
        Request request = new Request(requestMethod, requestPath);
        //map的key,value，根据key取value
        return ACTION_MAP.get(request);
    }
}
