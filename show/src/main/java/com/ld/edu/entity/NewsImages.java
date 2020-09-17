package com.ld.edu.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by lenovo on 2019/5/15.
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class NewsImages implements Serializable {
    private String image_url;
}
