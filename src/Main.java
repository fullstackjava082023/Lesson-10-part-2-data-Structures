import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> cars = new ArrayList();
        cars.add("BMW");
//        cars.add(5);
        cars.add("Volvo");
        cars.add("Ferrari");
        cars.add("BMW");
        cars.add("bmw");

        //bmv BMV BMV Ferrari Volvo

        System.out.println(cars);

//        System.out.println("ILIA".equals("ilia"));
        System.out.println(cars.size());



//        for (String element : cars) {
//            System.out.println(element);
//        }
//        cars.remove("BMW");
//        cars.remove(0);
//        System.out.println(cars);
//        System.out.println(cars.get(0));


//        //not working cannot delete during the loop
//        for (String element : cars) {//5
//            if (element.equals("BMW")) {
//                cars.remove("BMW");//4.. 3
//            }
//        }


        Iterator<String> iterator = cars.iterator();//creates iterator for cars list
//        System.out.println(iterator.next());
//        iterator.next(); //Volvo
//        System.out.println(iterator.next());//Ferrari
//        iterator.next();//bmw
//        System.out.println(iterator.next());//bmw
//        if (iterator.hasNext()) {//checking if iterator can move to the next element
//            iterator.next();
//        }
//        while (iterator.hasNext()) {//? -> 1, 2 , 3,
//            String nextItem = iterator.next();
//            if (nextItem.equals("BMW")) {
//                iterator.remove();
//            }
//        }



        System.out.println(cars);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));


//        System.out.println(Collections.min(cars));

        Collections.sort(cars);//sorted the cars list
        System.out.println(cars);


        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(new Person(15, "Arja"));

        personLinkedList.add(new Person(17, "Rob"));
        personLinkedList.add(new Person(20, "John"));
        System.out.println(personLinkedList);

        Collections.sort(personLinkedList);

        System.out.println(personLinkedList);






    }



//    public static List<Question> populateQuestions () {
//        List<Question> allQuestions = new ArrayList<>();
//        ArrayList<String> options = new ArrayList<>();
//        options.add("0 - Madrid");
//        options.add("1 - Paris");
//        options.add("2 - New York");
//
//        allQuestions.add(new Question("What is the capital of France?",options, 1));
//
//        ArrayList<String> options2 = new ArrayList<>();
//        options.add("0 - Pacific Ocean");
//        options.add("1 - Indian Ocean");
//        options.add("2 - Atlantic Ocean");
//
//        allQuestions.add( new Question("What is the biggest ocean",options2, 0));
//
//        //// 20 questions.
//
//        Collections.shuffle(allQuestions);
//        allQuestions.subList(0,9);
//        return allQuestions;
//    }


}

