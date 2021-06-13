package com.ly.springannotation.annotation.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author luoyong
 *  * @create 2021-06-13 10:51 上午
 *  * @last modify by [luoyong 2021-06-13 10:51 上午]
 * @Description: LookUpPerson
 **/
@Component
public class LookUpPerson {

    private String name;

    @Autowired
    private LookUpCat lookUpCat;

    //    @Autowired 依赖的组件是多实例 就不能Autowired
    private LookUpCat1 lookUpCat1;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LookUpCat getLookUpCat() {
        return lookUpCat;
    }

    public void setLookUpCat(LookUpCat lookUpCat) {
        this.lookUpCat = lookUpCat;
    }

    /**
     * @return
     * @Lookup 去容器中找。@Bean的这种方式注册的Person @Lookup不生效
     */
    @Lookup
    public LookUpCat1 getLookUpCat1() {
        return lookUpCat1;
    }

    public void setLookUpCat1(LookUpCat1 lookUpCat1) {
        this.lookUpCat1 = lookUpCat1;
    }

    @Override
    public String toString() {
        return "LookUpPerson{" +
                "name='" + name + '\'' +
                ", lookUpCat=" + lookUpCat +
                ", lookUpCat1=" + lookUpCat1 +
                '}';
    }
}
