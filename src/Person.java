public class Person implements Comparable{
    private Integer age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //if I bigger than other  => 1 positive
    //if i am smaller than other object => - 1   negative
    //if we are the same in order  => 0
    @Override
    public int compareTo(Object other) {
//        int result = 0;
//
//        Person otherPerson = (Person) other;
//        if (this.age > otherPerson.getAge()) {
//            result =  1;
//        } else if (this.age < otherPerson.getAge()) {
//            result = -1;
//        }
//        return  result;
        Person otherPerson = (Person) other;

        return age.compareTo(otherPerson.getAge());
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
