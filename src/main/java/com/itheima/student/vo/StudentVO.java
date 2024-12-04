package com.itheima.student.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO implements Serializable {
    private String studentId;                      // 学生 ID
    private String studentName;                    // 学生姓名
    private Integer e1;                             // e1
    private Integer e2;                             // e2
    private Integer e3;                             // e3
    private Integer calculus1_1;                   // 微积分 1 (部分 1)
    private Integer calculus1_2;                   // 微积分 1 (部分 2)
    private Integer linearAlgebra;                 // 线性代数
    private Integer physics;                        // 物理
    private Integer introInfoTech;                 // 信息技术导论
    private Integer advancedProgramDesign;         // 高级程序设计
    private Integer advancedProgramDesignLab;     // 高级程序设计实验
    private Integer objectOrientedProgramming;     // 面向对象程序设计
    private Integer computerArchitecture;          // 计算机体系结构
    private Integer discreteMath;                   // 离散数学
    private Integer assemblyLanguage;               // 汇编语言
    private Integer assemblyLanguageLab;            // 汇编语言实验
    private Integer programmingTraining;            // 编程训练
    private Integer computerArchitectureDesign;     // 计算机体系结构设计
    private Integer digitalSystemsLogicDesign;     // 数字系统逻辑设计
    private Integer digitalSystemsLogicLab;        // 数字系统逻辑实验
    private Integer javaProgramDesign;              // Java 程序设计
    private Integer computerProfessionRecognition; // 计算机职业认知
    private Integer moralAndLegalEducation;        // 思想道德与法治
    private Integer modernChineseHistory;          // 现代中国历史
    private Integer marxistPrinciple;              // 马克思主义基本原理
    private Integer maozedongThought;              // 毛泽东思想
    private Integer guizhouProvincialConditions;   // 贵州省情
    private Integer physicalEducation;              // 体育
    private Integer careerPlanning;                 // 职业规划
    private Integer militaryTheoryTraining;        // 军事理论训练
    private Integer collegeMentalHealth;           // 大学生心理健康
}
