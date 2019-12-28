package com.ly.springannotation.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author luoyong
 * @Description: MyTypeFilter
 * 自定义类型过滤器
 * @create 2019-12-28 22:04
 * @last modify by [LuoYong 2019-12-28 22:04]
 **/
public class MyTypeFilter implements TypeFilter {

    /**
     * @param metadataReader        读取到的当前正在扫描类的信息
     * @param metadataReaderFactory 可以获取到其他任何类的信息
     * @return boolean
     * @Description:
     * @author luoyong
     * @create 22:05 2019/12/28
     * @last modify by [LuoYong 22:05 2019/12/28 ]
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //1:获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //2:获取当前正在扫描类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类资源（类的路径）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("---->" + className);
        if (className.contains("ers")) {
            return true;
        }
        return false;
    }
}
