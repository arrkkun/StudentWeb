package com.itheima.student.Controller;

import com.itheima.student.dto.PageQueryDTO;
import com.itheima.student.dto.PageQueryScoreDTO;
import com.itheima.student.result.PageResult;
import com.itheima.student.result.Result;
import com.itheima.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/Raking")
public class RankingController {

    @Autowired
    private StudentService studentService;
    /**
     * 分页显示学生单科排名
     * @param pageQueryScoreDTO
     * @return
     */
    @GetMapping("/pageScore")
    public Result<PageResult> pageScore(PageQueryScoreDTO pageQueryScoreDTO){
        log.info("分页显示学生单科排名,pageQueryScoreDTO={}",pageQueryScoreDTO);
        PageResult pageResult = studentService.pageScoreSubject(pageQueryScoreDTO);
        return Result.success(pageResult);
    }
    /**
     * 分页显示学生总分排名
     * @param pageQueryDTO
     * @return
     */
    @GetMapping("/SumpageScore")
    public Result<PageResult> page(PageQueryDTO pageQueryDTO){
        log.info("分页显示学生总分排名,pageQueryDTO={}",pageQueryDTO);
        PageResult pageResult = studentService.pageScoreSum(pageQueryDTO);
        return Result.success(pageResult);
    }

    /**
     * 分页显示学生平均分排名
     * @Param("pageQueryDTO")
     * @return
     */
    @GetMapping("/AveragepageScore")
    public Result<PageResult> pageAvgScore(PageQueryDTO pageQueryDTO){
        log.info("分页显示学生平均分排名,pageQueryDTO={}",pageQueryDTO);
        PageResult pageResult = studentService.pageAvgScore(pageQueryDTO);
        return Result.success(pageResult);
    }


}
