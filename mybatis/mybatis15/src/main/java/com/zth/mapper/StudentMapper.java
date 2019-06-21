package com.zth.mapper;

import com.zth.jopo.Stu;
import java.util.List;

/**
 * @author zth
 * @Date 2019-06-20 23:01
 */
public interface StudentMapper {

    public List<Stu> getAllStudents(Stu stu);

    public List<Stu> getAllStudents1(Stu stu);

    public List<Stu> getAllStudents2(Stu stu);

    public void updateStu(Stu stu);

    public List<Stu> getStudentsIn(List ids);

}
