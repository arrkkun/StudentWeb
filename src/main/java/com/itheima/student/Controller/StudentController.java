package com.itheima.student.Controller;


import com.itheima.student.dto.PageQueryDTO;
import com.itheima.student.dto.ScoreUpdateDTO;
import com.itheima.student.dto.StudentSaveDTO;
import com.itheima.student.entity.Student;
import com.itheima.student.result.PageResult;
import com.itheima.student.result.Result;
import com.itheima.student.vo.StudentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.itheima.student.service.StudentService;

@Slf4j
@RestController
@RequestMapping("/Scores")
public class StudentController {
    @Autowired
    private StudentService studentService;
    /**
     * 分页查询学生信息
     * @return
     */
    @GetMapping("/page")
    public Result<PageResult> page(PageQueryDTO pageQueryDTO){
        log.info("分页查询学生信息,pageQueryDTO={}",pageQueryDTO);
        PageResult pageResult = studentService.pageQuery(pageQueryDTO);
        return Result.success(pageResult);
    }



    /**
     * 删除学生信息
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id){
        log.info("删除学生信息,id={}",id);
        studentService.delete(id);
        return Result.success();
    }

    /**
     * 新增学生信息
     * @param studentSaveDTO
     * @return
     */
    @PostMapping
    public Result save(@RequestBody StudentSaveDTO studentSaveDTO){
        log.info("新增学生信息,student={}",studentSaveDTO);
        studentService.save(studentSaveDTO);
        return Result.success();
    }

    /**
     * 修改学生成绩
     * @param scoreUpdateDTO
     * @return
     */
    @PutMapping
    public Result update(@RequestBody ScoreUpdateDTO scoreUpdateDTO){
        log.info("修改学生成绩,student={}",scoreUpdateDTO);
        studentService.update(scoreUpdateDTO);
        return Result.success();
    }

    /**
     * 查询学生信息
     * @param id
     * @returnq
     */
    @GetMapping("/{id}")
    public Result<StudentVO> get(@PathVariable String id){
        log.info("查询学生信息,id={}",id);
        StudentVO student = studentService.get(id);
        return Result.success(student);
    }

}
