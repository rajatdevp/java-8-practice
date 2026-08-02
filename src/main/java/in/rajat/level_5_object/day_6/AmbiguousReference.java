package in.rajat.level_5_object.day_6;

public class AmbiguousReference {

    void sum(int ii){
        System.out.println("int");
    }
    void sum(Integer i) {
        System.out.println("Integer");
    }

    void sum(String s){
        System.out.println("String");
    }
    void sum(Object o){
        System.out.println("Object");
    }

    public static void main(String[] args) {

        AmbiguousReference groupByJoiningYear = new AmbiguousReference();
        groupByJoiningYear.sum(null);//java: reference to sum is ambiguous
        // EMPLOYEES.stream().collect(Collectors.groupingBy(Employee::getJoiningDate::combiner));
    }
}
