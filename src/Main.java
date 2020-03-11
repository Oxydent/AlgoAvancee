import java.util.ArrayList;

public class Main {
    public static boolean validecorde(Point A, Point B, ArrayList<Ligne> list){
        Ligne corde = new Ligne(A, B);
        for(int i = 0 ; i < list.size(); i++){
            Ligne l = list.get(i);
            // Test pour éviter les segments qui existent déjà.
            if((l.getP1().equals(A)&&l.getP2().equals(B))||(l.getP1().equals(B)&&l.getP2().equals(A))){
                return false;
            } else if(intersection(corde, l)){
                return false;
            }
        }
        return true;
    }

    public static boolean intersection(Ligne l1, Ligne l2){
        double coefdir1;
        double coefdir2;
        double ordorig1;
        double ordorig2;

        // Droite issue de la ligne 1
        coefdir1 = (l1.getP1().getY()-l1.getP2().getY())/(l1.getP1().getX()-l1.getP2().getX());
        ordorig1 = l1.getP1().getY()-coefdir1*l1.getP1().getX();

        // Droite issue de la ligne 2
        coefdir2 = (l2.getP1().getY()-l2.getP2().getY())/(l2.getP1().getX()-l2.getP2().getX());
        ordorig2 = l2.getP1().getY()-coefdir2*l2.getP1().getX();

        if(coefdir1 == coefdir2){
            return false;
        }/* else if(){

        }*/
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
