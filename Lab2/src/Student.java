/*
 *Продемонструйте у коді генерацію свого виключення AgeStudentException у конструкторі класу
 * Student при спробі створити об'єкт зі значенням віку помилковим.
 * */


import java.lang.reflect.Array;

public class Student {
    static public int age;
    static public String name;
    static public int group;


   static public int getAge() {
        return age;
    }

    static public String getName() {
        return name;
    }

    static public int getGroup() {
        return group;
    }

    Student(String name,int age,int group) throws AgeStudentException {
        this.name=name;
        if (age<0) {
            throw new AgeStudentException();
        }
        this.age=age;
        this.group=group;
    }
/*
    Створіть метод, який дозволяє сортувати масив Студентів у відповідності до критерію
    сортування(за віком, за прізвищем та інше). Масив та критерій сортування  передаються
    як критерії методу. Сортування реалізувати методом =бульбашки=
*/




  /*  static public void studentSort(Student[] students,int criterion) {
        switch (criterion) {
            case 1:

                break;
            case 2:
                //пузырьковый метод
                for (int i = 0; i < Student.getAge()- 1; i++) {
                    for (int j = Student.getAge() - 1; j > i; j--) {
                        if (students[j - 1] > students[j]) {//тут ошибка, я пробовала по всякому обратиться к взрасту студента, но не получается, не знаю как сделать
                            Student tmp = students[j - 1];
                            students[j - 1] = students[j];
                            students[j] = tmp;
                        }
                    }
                }
                //вывод массива на экран
                for (Student i : students)
                    i.toString();
        }
                break;
            case 3:
                break;
            default:
                break;
        }*/

    @Override
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGroup: "+group;
    }

}