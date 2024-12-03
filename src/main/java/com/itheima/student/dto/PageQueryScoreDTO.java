package com.itheima.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageQueryScoreDTO implements Serializable {
    private String subject;
    //页码
    private int page;
    //每页显示条数
    private int pageSize;
}
