public class Rettangolo extends Forma {
        private double larghezza = 4;
        private double altezza = 2;

        @Override
        public void calcolaArea() {
            double area = larghezza * altezza;
            System.out.println("Area del rettangolo: " + area);
        }
    }
