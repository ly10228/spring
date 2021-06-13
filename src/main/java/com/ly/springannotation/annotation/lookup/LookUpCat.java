package com.ly.springannotation.annotation.lookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * @author luoyong
 *  * @create 2021-06-13 10:51 上午
 *  * @last modify by [luoyong 2021-06-13 10:51 上午]
 * @Description: LookUpCat
 **/
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class LookUpCat {


}
