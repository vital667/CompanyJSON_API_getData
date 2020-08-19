public class Employee {
    private Integer id;
    private String name;
    private String surName;
    private Double salary;
    private Integer age;
    private String imageUrl;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
