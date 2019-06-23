package com.factory;

import com.bean.Teacher;

public class TeacherFactory {

    public static Teacher createTeacher(){
        Teacher teacher  = new Teacher("老张",35);
        return teacher;
    }

    public Teacher createTeacher2(){
        Teacher teacher  = new Teacher("老李",45);
        return teacher;
    }
}
