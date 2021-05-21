import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ChenWei
 * @create 2021-05-11-9:38
 */
public class JavaTest {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IOException {
      //使用new关键字
      Student student = new Student();
      Student student1 = new Student("1","AAA",0,11,"202");
      //使用Class类的newInstance方法
      Student student2 = (Student) Class.forName("org.programming.mitra.exercises.Student").newInstance();
      Student student3 = Student.class.newInstance();
      //使用Constructor类的newInstance方法
      Constructor<Student> constructor = Student.class.getConstructor();
      Student student4 = constructor.newInstance();
      //使用clone方法
      Student student5 = (Student) student.clone();
      //使用反序列化
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
      Student student6 = (Student) in.readObject();
  }
}

class Student implements Cloneable, Serializable {
    private String st_Id;
    private String name;
    private int sex;
    private int age;
    private String class_Id;

    public Student() {

    }

    public String getSt_Id() {
        return st_Id;
    }

    public void setSt_Id(String st_Id) {
        this.st_Id = st_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClass_Id() {
        return class_Id;
    }

    public void setClass_Id(String class_Id) {
        this.class_Id = class_Id;
    }



    public Student(String st_Id, String name, int sex, int age, String class_Id) {
        this.st_Id = st_Id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.class_Id = class_Id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "st_Id='" + st_Id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", class_Id='" + class_Id + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((st_Id == null) ? 0 : st_Id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (st_Id == null) {
            if (other.st_Id != null)
                return false;
        } else if (!st_Id.equals(other.st_Id))
            return false;
        return true;
    }
}
