package lection05.offline;

public class Employee {

    private static long tmpId = 0;

    private String fio;
    private String position;
    private String telephone;

    private int theSalary ;
    private int age;
    private long id;

    public Employee(String valueFio, String valuePosition, String valueTelephone, int valueTheSalary, int valueAge){
        fio = valueFio;
        position = valuePosition;
        telephone = valueTelephone;
        theSalary = valueTheSalary;
        age = valueAge;
        id = createId();
    }

    private long createId(){
        return ++tmpId;
    }

    protected void salaryIncrease(){
        if(this.age > 35)
            this.theSalary = this.theSalary + 10000;
    }

   protected void printEmployeeInfo(){
       System.out.println("ID: " + this.getId() +
               "\n" + this.getFio() +
               ":\nДолжность: " + this.getPosition() +
               ":\nТелефон: " + this.getTelephone() +
               ":\nЗарплата: " + this.getTheSalary() +
               ":\nВозвраст: " + this.getAge());
   }

    public String getFio() {
        return fio;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPosition() {
        return position;
    }

    public int getTheSalary() {
        return theSalary;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }
}
