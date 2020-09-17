package com.ld.edu.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;


/**
 * Created by lenovo on 2019/3/7.
 */
@Document(collection = "dxts")//连接你需要的集合
@AllArgsConstructor
@Data
@NoArgsConstructor
public class NewsDxts implements Serializable {
    @Id
    private String id;
    @Field("added_date")
    private String addedDate;
    private String author;
    private String category;
    private List<NewsImages> images;
    private String content;
    private String importance;
    @Field("news_key_word")
    private String newsKeyWord;
    @Field("original_label")
    private String originalLabel;
    @Field("post_date")
    private String postDate;
    private String reliability;
    private String score;
    private String site;
    @Field("site_id")
    private String siteId;
    private String title;
    private String uid;
    private String url;
    private String tags;
    private String files;
    private String hotWord;
    private String language;
    private String ideas;
}
