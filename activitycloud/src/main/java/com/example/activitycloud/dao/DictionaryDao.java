package com.example.activitycloud.dao;

import com.example.activitycloud.model.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: activitycloud
 * @description:
 * @author: 管庆增
 * @create: 2019-04-28 19:15
 **/
@Repository
public interface DictionaryDao extends JpaRepository<Dictionary,String> {

    @Query("from Dictionary dic where dic.id is not null")
    List<Dictionary> getAllRecords();

}
