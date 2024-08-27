public class main{
    String name,email;
    Long mob;
    main(String name,Long mob,String email){
        this.name=name;
        this.mob=mob;
        this.email=email;
    }
    void display()
    {
        System.out.println(this.name+"\t"this.mob+"\t"this.email)
    }
    public static void main(String[] args){
        main m1=new main("alpha",9038506570,"alpha@gmail.com");
        main m2=new main("beta",9026056658,"beta@gmail.com");
        m1.display();
    }
}