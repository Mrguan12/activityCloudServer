package com.example.activitycloud.controller;

import com.example.activitycloud.common.BaseResult;
import com.example.activitycloud.model.Dictionary;
import com.example.activitycloud.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.example.activitycloud.common.ConstUtil.DICTIONARY_INTERFACE;
import static com.example.activitycloud.common.ConstUtil.GET_ALL_RECORDS;

/**
 * @program: activitycloud
 * @description:
 * @author: 管庆增
 * @create: 2019-04-28 19:13
 **/
@Controller
@RequestMapping(DICTIONARY_INTERFACE)
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping(GET_ALL_RECORDS)
    @ResponseBody
    public BaseResult<List<Dictionary>> getAllRecords(@RequestParam String id){
        BaseResult<List<Dictionary>> result = new BaseResult<List<Dictionary>>();
        dictionaryService.getAllRecords(result);
        return result;
    }

}
