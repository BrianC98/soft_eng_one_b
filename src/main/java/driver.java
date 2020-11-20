import org.joda.time.DateTime;

import java.util.ArrayList;

public class driver {
    public static void main(String[] args){
        DateTime courseStart = new DateTime(2020, 9, 1, 9, 0);
        DateTime courseEnd = new DateTime(2021, 5, 1, 9, 0);

        Programme computerScience = new Programme("Computer Science", courseStart, courseEnd);

        ArrayList<Module> modules = new ArrayList<>();

        Module softwareEng = new Module("Software Engineering", "CT417");
        modules.add(softwareEng);

        Module profSkills = new Module("Professional Skills", "CT436");
        modules.add(profSkills);

        Module machineLearn = new Module("Machine Learning", "CT4101");
        modules.add(machineLearn);

        for (Module module : modules){
            computerScience.addModule(module);
            module.addProgramme(computerScience);
        }

        ArrayList<Student> students = new ArrayList<>();

        Student john = new Student("John Marston", 20, "01/01/2000", "173201");
        students.add(john);

        Student arthur = new Student("Arthur Morgan", 22, "01/01/1998", "173202");
        students.add(arthur);

        Student charles = new Student("Charles Smith", 21, "01/01/1999", "173203");
        students.add(charles);

        Student sadie = new Student("Sadie Adler", 19, "01/01/2001", "173204");
        students.add(sadie);

        Student tilly = new Student("Tilly Jackson", 18, "01/01/2002", "173205");
        students.add(tilly);

        for(Student student : students){
            student.addProgramme(computerScience);
            computerScience.addStudent(student);
        }

        john.addModule(softwareEng);
        softwareEng.addStudent(john);

        arthur.addModule(profSkills);
        profSkills.addStudent(arthur);

        charles.addModule(machineLearn);
        machineLearn.addStudent(charles);

        sadie.addModule(softwareEng);
        softwareEng.addStudent(sadie);

        tilly.addModule(profSkills);
        profSkills.addStudent(tilly);

        computerScience.printProgrammeDetails();

        for(Module module : modules){
            module.printModuleDetails();
        }

        for(Student student : students){
            student.printStudentDetails();
        }

    }
}
