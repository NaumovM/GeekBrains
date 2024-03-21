package sem3hw;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        Student student = new Student("Иван", 20, 3.5);


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(student);
            System.out.println("Объект Student был сериализован в файл 'student.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }


        Student deserializedStudent = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            deserializedStudent = (Student) in.readObject();
            System.out.println("Объект Student был успешно десериализован из файла 'student.ser'");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }



        if (deserializedStudent != null) {
            deserializedStudent.printInfo();
        } else {
            System.out.println("Ошибка при десериализации объекта Student");
        }
    }
}