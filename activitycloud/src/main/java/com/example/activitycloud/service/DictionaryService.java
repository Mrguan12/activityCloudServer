package com.example.activitycloud.service;

import com.example.activitycloud.common.BaseResult;
import com.example.activitycloud.model.Dictionary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: activitycloud
 * @description:
 * @author: 管庆增
 * @create: 2019-04-28 19:14
 **/
public interface DictionaryService {

    void getAllRecords (BaseResult<List<Dictionary>> result);

}
