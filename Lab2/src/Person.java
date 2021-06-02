public class Person {
    private int id;
    static int counter;
    String name;
    int age;

  /*  Статические инициализаторы предназначены для инициализации статических переменных, либо
    для выполнения таких действий, которые выполняются при создании самого первого объекта.*/

    static{
        counter = 105;
        System.out.println("Статичний ініціалізатор");
    }
//обычный инициализатор
    {
        name = "Undefined";
        age = 18;
    }
    Person(String name){

        this.name = name;
    }
    Person(){
        id=counter++;
        System.out.println("Конструктор");
    }

    Person(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
    public void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

