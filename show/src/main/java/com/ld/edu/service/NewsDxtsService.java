package com.ld.edu.service;



import com.ld.edu.entity.NewsDxts;

import java.util.List;

/**
 * @Author Ling dong.
 * @Date 2020/7/11 - 9:02
 */
public interface NewsDxtsService {

    public List<NewsDxts> findByCategory(String category, Integer page, Integer size);

    public NewsDxts findByUid(String uid);

    List<NewsDxts> findByTitle(String title);
}
