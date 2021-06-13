package com.ly.springannotation.annotation.importa;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author luoyong
 * @Description: MyImportSelector
 * @create 2019-12-29 10:20
 * @last modify by [LuoYong 2019-12-29 10:20]
 **/
public class MyImportSelector implements ImportSelector {
    /**
     * @param importingClassMetadata 当前标注@Import注解的类的所有注解信息
     * @return
     * @Description: 返回值：就是要导入到容器中的组件全类名
     * @author luoyong
     * @create 10:20 2019/12/29
     * @last modify by [LuoYong 10:20 2019/12/29 ]
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.ly.springannotation.bean.Blue", "com.ly.springannotation.bean.Yellow"};
    }
}
