public class Person {
    private String name;
    private String professions;
    private int age;


    public Person(String name, String professions, int age) {
        this.name = name;
        this.professions = professions;
        this.age = age;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String getProfessio() {
        System.out.println(professions);
        return professions;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessions(String professions) {
        this.professions = professions;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
