package com.itheima.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentSaveDTO implements Serializable {
    private String studentName;
    private String studentId;
}
