

package com.example.api;

import com.example.dto.NewDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//dinh nghia api

public class NewAPI {
    //nhan request tu client vao
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    //kieu http Requestmethod, post dc dung trong cac truong hop chung ta them du lieu vao database
    //ResponseBody tra ve ket qua json tu server ve client
    @ResponseBody

    public NewDTO createNew(@RequestBody NewDTO model){
        return model;
    }


}
