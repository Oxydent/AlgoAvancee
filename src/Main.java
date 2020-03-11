import java.util.ArrayList;

public class Main {
    public static boolean validecorde(Point A, Point B, ArrayList<Ligne> list){
        for(int i = 0 ; i < list.size(); i++){
            Ligne l = list.get(i);
            // Test pour éviter les segments qui existent déjà.
            if((l.getP1().equals(A)&&l.getP2().equals(B))||(l.getP1().equals(B)&&l.getP2().equals(A))){
                return false;
            } else if(false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Point A = new Point(0, 0);
        Point B = new Point(-3, 7);
        Point C = new Point(10, 8);
        Point D = new Point(9, 2);
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(A);
        points.add(B);
        points.add(C);
        points.add(D);

        Ligne l1 = new Ligne(A, B);
        Ligne l2 = new Ligne(B, C);
        Ligne l3 = new Ligne(C, D);
        Ligne l4 = new Ligne(D, A);
        ArrayList<Ligne> polygone = new ArrayList<Ligne>();
        polygone.add(l1);
        polygone.add(l2);
        polygone.add(l3);
        polygone.add(l4);

        System.out.println(validecorde(B, A, polygone));
        System.out.println(l1.getSize());
    }
}
