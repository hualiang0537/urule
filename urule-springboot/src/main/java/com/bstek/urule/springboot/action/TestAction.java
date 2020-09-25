package com.bstek.urule.springboot.action;

import com.bstek.urule.model.library.action.annotation.ActionBean;
import com.bstek.urule.model.library.action.annotation.ActionMethod;
import com.bstek.urule.model.library.action.annotation.ActionMethodParameter;
import org.springframework.stereotype.Component;

@Component
@ActionBean(name = "rpc")
public class TestAction {

    @ActionMethod(name = "test")
    @ActionMethodParameter(names = {"name", "phone"})
    public void test(String name, String phone) {

        System.out.println(name + "," + phone);
    }
}
