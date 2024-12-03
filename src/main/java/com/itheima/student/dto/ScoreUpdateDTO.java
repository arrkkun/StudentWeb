package com.itheima.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreUpdateDTO implements Serializable {
    private String studentId;      // 学生ID
    private String subject;        // 科目
    private Integer score;          // 分数
}
