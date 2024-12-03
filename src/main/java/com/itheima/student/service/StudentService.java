package com.itheima.student.service;

import com.itheima.student.dto.PageQueryDTO;
import com.itheima.student.dto.PageQueryScoreDTO;
import com.itheima.student.dto.ScoreUpdateDTO;
import com.itheima.student.dto.StudentSaveDTO;
import com.itheima.student.entity.Student;
import com.itheima.student.result.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface StudentService {

    PageResult pageQuery(PageQueryDTO pageQueryDTO);

    void delete(String id);

    void save(StudentSaveDTO studentSaveDTO);

    void update(ScoreUpdateDTO scoreUpdateDTO);

    PageResult pageScoreSubject(PageQueryScoreDTO pageQueryScoreDTO);

    PageResult pageScoreSum(PageQueryDTO pageQueryDTO);

    PageResult pageAvgScore(PageQueryDTO pageQueryDTO);
}
