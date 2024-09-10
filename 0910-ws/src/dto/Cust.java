package dto;

import java.time.LocalDateTime;

public class Cust {
    private String id;
    private String pwd;
    private String name;
    private LocalDateTime signUpTime;
    public Cust() {}
    public Cust(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getSignUpTime() {
        return signUpTime;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", signUpTime=" + signUpTime +
                '}';
    }
}