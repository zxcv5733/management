package com.ld.edu.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import com.ld.edu.entity.NewsDxts;
import com.ld.edu.service.NewsDxtsService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Ling dong.
 * @Date 2020/7/11 - 8:19
 */
@Component
public class NewsDxtsResolver implements GraphQLQueryResolver {

    @Resource
    NewsDxtsService newsDxtsService;

    public List<NewsDxts> findByCategory(){
        return newsDxtsService.findByCategory("DXTS", 0, 10);
    }

    public NewsDxts findByUid(String id){
        return newsDxtsService.findByUid(id);
    }

    public List<NewsDxts> findByTitle(String title){
        return newsDxtsService.findByTitle(title);
    }

}
