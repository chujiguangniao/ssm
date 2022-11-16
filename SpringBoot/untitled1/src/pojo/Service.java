package pojo;


public class Service {

    private User1 user = new User1();

    public void add(){
        user.setA(1);
        user.add2(user);
        System.out.println(user.getA());
    }

    public static void main(String[] args) {
        Service service = new Service();
        service.add();
    }

}
