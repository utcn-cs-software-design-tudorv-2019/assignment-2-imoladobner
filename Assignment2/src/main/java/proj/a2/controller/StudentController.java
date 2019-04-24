package proj.a2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import proj.a2.model.entity.Student;
import proj.a2.model.entity.*;
import proj.a2.model.entity.UserAccount;
import proj.a2.model.service.StudentService;
import proj.a2.model.service.UserService;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView loginView(){
        ModelAndView mav = new ModelAndView("studentProfile");

        mav.addObject("user",new UserAccount());
        mav.addObject("student",new Student());
        return mav;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public ModelAndView processOperations(@RequestParam(value = "action") String action,
                                          @RequestParam(value = "username") String username,
                                          @RequestParam(value = "password") String password,
                                          @ModelAttribute(value = "student")Student student){
        ModelAndView mav = new ModelAndView("studentProfile");
        UserAccount user = new UserAccount();
        user.setUserName(username);
        user.setPassword(password);
        if(action.equals("Login")) performLoginOperation(mav,user);
        else if(action.equals("Create")) createStudent(mav,student);
        else if(action.equals("Update")) updateStudent(mav,student);
        else if(action.equals("Delete")) deleteStudent(mav,student);
        mav.addObject("user",new UserAccount());
        return mav;
    }

    private void performLoginOperation(ModelAndView mav, UserAccount user){
        System.out.println(user);
        if(!userService.checkUser(user)){
            mav.addObject("student",new Student());
            return;
        }
        //user was valid
        user = userService.findUser(user);
        System.out.println(user);
        Student student = userService.studentUser(user);
        if(student == null){
            mav.addObject("student",new Student());
            return;
        }
        //valid student - present information
        mav.addObject("student",student);
    }

    private void createStudent(ModelAndView mav, Student student){
        if(studentService.checkIfExists(student)){  //student already exist in database
            student = studentService.viewStudent(student);
            mav.addObject("student",student);
            return;
        }

        studentService.createStudent(student);
        student = studentService.viewStudent(student);
        mav.addObject("student",student);
    }

    private void updateStudent(ModelAndView mav, Student student){
        if(!studentService.checkIfExists(student)){  //student does not exist in database
            mav.addObject("student",new Student());
            return;
        }

        Student stud = studentService.viewStudent(student);
        Student oldStudent = stud.clone();

        //we need to update only the fields that are changed
        if(!student.getStudName().equals("") && student.getStudName().compareTo(oldStudent.getStudName()) != 0)
            oldStudent.setStudName(student.getStudName());

        if(student.getMatricol() != 0 && student.getMatricol() != oldStudent.getMatricol())
            oldStudent.setMatricol(student.getMatricol());

        if(student.getStudGroup() != 0 && student.getStudGroup() != oldStudent.getStudGroup())
            oldStudent.setStudGroup(student.getStudGroup());

        studentService.updateStudent(oldStudent);
        student = studentService.viewStudent(oldStudent);

        mav.addObject("student",student);
    }

    private void deleteStudent(ModelAndView mav, Student student){
        if(!studentService.checkIfExists(student)){  //student does not exist in database
            mav.addObject("student",new Student());
            return;
        }

        studentService.deleteStudent(student);
        mav.addObject("student",new Student());
    }
}
