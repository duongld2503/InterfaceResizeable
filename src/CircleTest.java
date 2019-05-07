public class CircleTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);


        for (int i =0;i<3;i++){
            double p = Math.random();
            double r = Math.random();

            Circle ilm = new Circle();
            ilm.setRadius(r);
            System.out.println(ilm.getRadius()*ilm.getRadius()*Math.PI);
            ilm.resize(p);
            System.out.println(ilm.getRadius()*ilm.getRadius()*Math.PI);
        }
    }
}
