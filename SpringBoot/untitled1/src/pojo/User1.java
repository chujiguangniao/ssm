package pojo;

public class User1 {
    private Integer a;

    public void setA(Integer a){
        this.a= a;
    }

    public Integer getA() {
        return a;
    }

    public void add2(User1 user){
        user.setA(2);
    }

}
