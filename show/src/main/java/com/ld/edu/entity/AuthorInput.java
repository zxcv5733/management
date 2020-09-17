package com.ld.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Ling dong.
 * @Date 2020/7/10 - 14:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorInput implements Serializable {
    private String name;
    private String age;
}
