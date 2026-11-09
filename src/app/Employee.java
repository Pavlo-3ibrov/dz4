package app;

public class Employee {
    //inkapsuliruem
    private String fullName;
    private String posada;
    private String email;
    private String telephone;
    private int age;

    //konstruktiruem
    public Employee(String fullName, String posada, String email, String telephone, int age) {
        this.fullName = fullName;
        this.posada = posada;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }
//gettiruem i settiruem

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getPosada() {
        return posada;
    }

    public void setPosada(String posada) {
        this.posada = posada;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelephone() {
        return telephone;
    }


    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}


