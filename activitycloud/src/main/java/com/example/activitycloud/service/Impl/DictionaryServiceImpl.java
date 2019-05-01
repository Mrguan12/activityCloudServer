package com.example.activitycloud.service.Impl;

import com.example.activitycloud.common.BaseResult;
import com.example.activitycloud.dao.DictionaryDao;
import com.example.activitycloud.model.Dictionary;
import com.example.activitycloud.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.activitycloud.common.ConstUtil.MESSAGE_FIND_FAILURE;
import static com.example.activitycloud.common.ConstUtil.MESSAGE_FIND_SUCCESS;

/**
 * @program: activitycloud
 * @description:
 * @author: 管庆增
 * @create: 2019-04-28 19:14
 **/
@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DictionaryDao dictionaryDao;

    @Override
    public void getAllRecords(BaseResult<List<Dictionary>> result) {
        try {
            List<Dictionary> dictionaryList = dictionaryDao.getAllRecords();
            result.construct(MESSAGE_FIND_SUCCESS,true,dictionaryList);
        }catch (Exception e){
            result.construct(MESSAGE_FIND_FAILURE,false,null);
        }
    }
}
