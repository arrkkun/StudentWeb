package com.itheima.student.service.lmpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.student.dto.PageQueryDTO;
import com.itheima.student.dto.PageQueryScoreDTO;
import com.itheima.student.dto.ScoreUpdateDTO;
import com.itheima.student.dto.StudentSaveDTO;
import com.itheima.student.entity.Student;
import com.itheima.student.mapper.StudentMapper;
import com.itheima.student.result.PageResult;
import com.itheima.student.service.StudentService;
import com.itheima.student.vo.PageQueryScoreVO;
import com.itheima.student.vo.PageQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServicelmpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 分页查询学生信息
     * @param pageQueryDTO 分页查询条件
     * @return 学生信息列表
     */
    @Override
    public PageResult pageQuery(PageQueryDTO pageQueryDTO) {
        //分页查询逻辑
        PageHelper.startPage(pageQueryDTO.getPage(), pageQueryDTO.getPageSize());
        Page<PageQueryVO> page = studentMapper.pageQuery(pageQueryDTO);
        long total = page.getTotal();
        List<PageQueryVO> result = page.getResult();
        return new PageResult(total, result);
    }

    @Override
    public void delete(String id) {
        studentMapper.delete(id);
    }

    @Override
    public void save(StudentSaveDTO studentSaveDTO) {
        studentMapper.save(studentSaveDTO);
    }

    @Override
    public void update(ScoreUpdateDTO scoreUpdateDTO) {
        studentMapper.update(scoreUpdateDTO);
    }

    @Override
    public PageResult pageScoreSubject(PageQueryScoreDTO pageQueryScoreDTO) {
        PageHelper.startPage(pageQueryScoreDTO.getPage(), pageQueryScoreDTO.getPageSize());
        Page<PageQueryScoreVO> page = studentMapper.pageScoreSubject(pageQueryScoreDTO);
        long total = page.getTotal();
        List<PageQueryScoreVO> result = page.getResult();
        return new PageResult(total, result);
    }

    @Override
    public PageResult pageScoreSum(PageQueryDTO pageQueryDTO) {
        PageHelper.startPage(pageQueryDTO.getPage(), pageQueryDTO.getPageSize());
        Page<PageQueryScoreVO> page = studentMapper.pageScoreSum(pageQueryDTO);
        long total = page.getTotal();
        List<PageQueryScoreVO> result = page.getResult();
        return new PageResult(total, result);
    }

    @Override
    public PageResult pageAvgScore(PageQueryDTO pageQueryDTO) {
        PageHelper.startPage(pageQueryDTO.getPage(), pageQueryDTO.getPageSize());
        Page<PageQueryScoreVO> page = studentMapper.pageAvgScore(pageQueryDTO);
        long total = page.getTotal();
        List<PageQueryScoreVO> result = page.getResult();
        return new PageResult(total, result);
    }
}
