package com.shawnyan.framework;

import com.shawnyan.framework.bean.ControllerHelper;
import com.shawnyan.framework.helper.BeanHelper;
import com.shawnyan.framework.helper.ClassHelper;
import com.shawnyan.framework.helper.IocHelper;
import com.shawnyan.framework.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 * <p>
 * Created by SHAWN on 6/26/2017.
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
