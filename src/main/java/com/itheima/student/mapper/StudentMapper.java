package com.itheima.student.mapper;

import com.github.pagehelper.Page;
import com.itheima.student.dto.PageQueryDTO;
import com.itheima.student.dto.PageQueryScoreDTO;
import com.itheima.student.dto.ScoreUpdateDTO;
import com.itheima.student.dto.StudentSaveDTO;
import com.itheima.student.entity.Student;
import com.itheima.student.vo.PageQueryScoreVO;
import com.itheima.student.vo.PageQueryVO;
import com.itheima.student.vo.StudentVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
     /**
      * 分页查询学生信息
      * @param pageQueryDTO
      * @return
      */
     Page<PageQueryVO> pageQuery(PageQueryDTO pageQueryDTO);

     /**
      * 根据id删除
      * @param id
      * @return
      */
     void delete(String id);

     /**
      * 保存学生信息
      * @param studentSaveDTO
      */
     void save(StudentSaveDTO studentSaveDTO);

     /**
      * 更新学生信息
      * @param scoreUpdateDTO
      */
     void update(ScoreUpdateDTO scoreUpdateDTO);

     /**
      * 分页排序查询学生的成绩信息
      * @param pageQueryScoreDTO
      * @return
      */
     Page<PageQueryScoreVO> pageScoreSubject(PageQueryScoreDTO pageQueryScoreDTO);

     /**
      * 分页查询学生的总分信息
      * @param pageQueryDTO
      * @return
      */
     Page<PageQueryScoreVO> pageScoreSum(PageQueryDTO pageQueryDTO);

     /**
      * 分页查询学生的平均分信息
      * @param pageQueryDTO
      * @return
      */
     Page<PageQueryScoreVO> pageAvgScore(PageQueryDTO pageQueryDTO);

     /**
      * 根据id查询学生信息
      * @param studentId
      * @return
      */
     StudentVO get(String studentId);

}
