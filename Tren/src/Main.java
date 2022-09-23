public class Main {
    public static void main (String[] args){
        Locomotora loc509 = new Locomotora(509);
        Locomotora loc566 = new Locomotora(566);
        Locomotora loc666 = new Locomotora();
        loc666.codigo=666;

        Vagon vagon1 = new Vagon("2 pisos",80);
        Vagon vagon2 = new Vagon("1 pisos", 40);
        Vagon vagon3= new Vagon("2 pisos", 80);
    }
}
