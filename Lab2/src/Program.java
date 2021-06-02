import java.util.*;
import java.util.function.Function;

public class Program {
    public static void main(String[] args) throws Exception, AgeStudentException {

        User user2=new User("asenko@gmail.com","Lilya123");
        User user3=new User("kovalenko0000000000@gmail.com","Koval887");
        User user4=new User("uhfogishfoishf@gmail.com","Kla");



        ArrayList<User> list=new ArrayList<User>();
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(new User("Nifoddsrgew@gmail.com","Ola"));
        list.add(new User("dhiufwoef@gmail.com","Nikita123"));



        System.out.println("Сортування по довжині рядка");
        Comparator<User> comparator= Comparator.comparing(user->user.getEmail().length());


        Collections.sort(list,comparator);

        for (User user:list) {
            System.out.println(user);
        }
        System.out.println("Сортування по 3 символу");
        Comparator<User> comparator1=Comparator.comparing(user -> user.getLogin().charAt(2));
        Collections.sort(list,comparator1);
        for(User user:list){
            System.out.println(user);
        }
        System.out.println("Сортування по кількості голосних букв англ алфавіту");


        Function<User, Integer> getCount = new Function<User, Integer>() {

            private Set<Character> set = new HashSet<>(Arrays.asList('e', 'u', 'i', 'o', 'a'));

            @Override
            public Integer apply(User user) {
                int count = 0;
                for (int i = 0; i < user.getEmail().length(); i++)
                    count += set.contains(user.getEmail().charAt(i)) ? 1 : 0;

                return count;
            }
        };
        Comparator<User> comparator2=(user5,user6)->Integer.compare(getCount.apply(user5), getCount.apply(user6));
        Collections.sort(list,comparator2);
        for(User user:list){
            System.out.println(user);
        }
        System.out.println("Обробка виключення з віком");

        /*______________STUDENT____________*/

        try {
            Student student=new Student("Lilya",-18,201);
            System.out.println(student);
        }
        catch (AgeStudentException ex){
            System.out.println("Invalid age");
        }

        Student[] students=new Student[3];
        students[0]=new Student("Kolya",18,201);
        students[1]=new Student("Yana",19,479);
        students[2]=new Student("Vika",17,120);

/*
        Продемонструйте роботу 15 методів класу Arrays.*/


        int[] numbers={167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int[] numbers2={167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int intArr[][] = { { 10, 20, 15, 22, 35 } };

        int intArr1[][] = { { 10, 15, 22 } };
        //1
        Arrays.sort(numbers);
        //2
        System.out.println(Arrays.toString(numbers));
        //3
        int [] numbersCopy = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(numbersCopy));
        //4
        int [] numbersCopyRange = Arrays.copyOfRange(numbers, 2,6);
        System.out.println(Arrays.toString(numbersCopyRange));
        //5
        System.out.println(Arrays.equals(numbers,numbers2));
        //6
        System.out.println(Arrays.asList(numbers));
        //7
        System.out.println(Arrays.binarySearch(numbers,167));
        //8
        System.out.println(Arrays.deepEquals(intArr, intArr1));
        //9
        System.out.println(Arrays.deepHashCode(intArr));
        //10
        System.out.println(Arrays.deepToString(intArr));
        //11
        System.out.println(Arrays.hashCode(numbers));
        //12
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));
        //13
        Arrays.sort(numbers,1,6);
        System.out.println(Arrays.toString(numbers));
        //14
        System.out.println(Arrays.stream(numbers));
        //15
        System.out.println(Arrays.spliterator(numbers));

        /*Продемонструйте на тестовому прикладі усі випадки спрацювання статичних та
        звичайних ініціалізаторів.*/

        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();    // Id = 105
        bob.displayId();    // Id = 106

        Person undef = new Person();
        undef.displayInfo();

        Person dasha = new Person("Dasha");
        dasha.displayInfo();
    }
}
