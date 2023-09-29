package com.example.springmvcdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-29
 * Time: 12:22
 */
@Controller
@ResponseBody
public class CalcController {
    @RequestMapping("/calc")
    public String getCalc(Integer x, Integer y) {
        if (x != null || y != null) {
            return "参数错误";
        }
        return "结果为： "+(x+y);
    }
}
