package org.example;

public class Main {
    public static void main(String[] args) {

        Faculty EngineerFaculty = new Faculty("Engineer", 284200);
        Faculty BasicsSciences = new Faculty("Basis Sciences", 262200);

        User teacher1 = new User("Juan", "Perez", 12345, "jprez@ucatolica.edu.co", "teacher");
        User student1 = new User("Juanita", "Rios",1012463, "jrios@ucatolica.edu.co", "student");
        User student2 = new User("Jesus", "Gaitan",104796, "jggaitan94@ucatolica.edu.co", "student");
        User teacher2 = new User("Jorge", "Gonzalez",565494, "jrojas94@ucatolica.edu.co", "teacher");

        Subject CT10071 = new Subject("Construcción de Software", "CT10071", 3, "Construccion de software", EngineerFaculty);
        Subject CE05003 = new Subject("Formulación","CE05003", 3, "Formulación de proyectos", BasicsSciences);

        EngineerFaculty.addSubject(CT10071);
        BasicsSciences.addSubject(CE05003);

        Classroom cls1 = new Classroom("SC 3", 20, "Claustro");
        Classroom cls2 = new Classroom("O 301", 25, "Sede 4");

        CT10071.addClassroom(cls1);
        CE05003.addClassroom(cls2);

        Enroll enroll1 = new Enroll(67000694, student1, 0.0,"2024-07-29");

        System.out.println(student2.toString());


        /*
        enroll1.addSubject(CT10071);
        enroll1.addSubject(CE05003);
        enroll1.obtainTotalAmount();
        */





        /*
        System.out.println(EngineerFaculty);
        System.out.println(BasicsSciences);
        System.out.println(CT10071);
        System.out.println(CE05003);
        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(enroll1);*/
    }
}