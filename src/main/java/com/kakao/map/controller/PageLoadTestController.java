package com.kakao.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageLoadTestController {

    @RequestMapping(value = "/t1", method = RequestMethod.GET)
    public String test1() {
        System.out.println("t1요청 들어옴?");
        return "test1";
    }
    // value "/t2"를 찾아와서 test2메소드를 요청함. return = 응답
    @RequestMapping(value = "/t2", method = RequestMethod.GET)
    public String test2() {
        System.out.println("t2요청 들어옴?");
        return "test1";
    }

    @RequestMapping(value = "/test/page", method = RequestMethod.GET)
    public String test3(){
        return "/test/test2";
    }

    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public String map(){
        return "/map";
    }
}
