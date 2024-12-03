package com.itheima.student.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;  //引入Serializable接口

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageQueryDTO implements Serializable {
    private String studentName;
//    private String studentId;
    //页码
    private int page;
    //每页显示条数
    private int pageSize;
}
