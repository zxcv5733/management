package com.ld.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Ling dong.
 * @Date 2020/7/10 - 11:01
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Serializable {

    private Integer id;
    private String name;
    private Integer age;

}
