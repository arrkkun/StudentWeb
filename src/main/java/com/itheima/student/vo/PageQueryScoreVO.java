package com.itheima.student.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageQueryScoreVO implements Serializable {
    private String studentName;
    private String studentId;
    private int score;
}
