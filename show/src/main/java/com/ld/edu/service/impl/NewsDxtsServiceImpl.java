package com.ld.edu.service.impl;


import com.ld.edu.entity.NewsDxts;
import com.ld.edu.service.NewsDxtsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author Ling dong.
 * @Date 2020/7/11 - 9:02
 */
@Service
@Slf4j
public class NewsDxtsServiceImpl implements NewsDxtsService {

    @Resource
    MongoTemplate mongoTemplate;

    @Override
    public List<NewsDxts> findByCategory(String category, Integer page, Integer size) {
        Criteria criteria = Criteria.where("category").is(category);
        Query query = Query.query(criteria);
        query.skip(page);// 从那条记录开始
        query.limit(size);// 取多少条记录
        List<NewsDxts> newsDxtsList = mongoTemplate.find(query, NewsDxts.class);
        log.info("查询dxts");
        return newsDxtsList;
    }


    @Override
    public NewsDxts findByUid(String uid) {
        log.info("查询uid:"+uid);
        Criteria criteria = Criteria.where("uid").is(uid);
        Query query = Query.query(criteria);
        NewsDxts newsDxts = mongoTemplate.findOne(query, NewsDxts.class);
        return newsDxts;
    }

    @Override
    public List<NewsDxts> findByTitle(String title) {
        log.info("查询title:"+title);

        Pattern pattern=Pattern.compile("^.*"+title+".*$", Pattern.CASE_INSENSITIVE);

        Criteria criteria = Criteria.where("title").regex(pattern);
        Query query = Query.query(criteria);
        List<NewsDxts> newsDxtsList = mongoTemplate.find(query, NewsDxts.class);
        return newsDxtsList;
    }


}
