public class Triangolo extends Forma {
        private double base = 3;
        private double altezza = 5;

        @Override
        public void calcolaArea() {
            double area = (base * altezza) / 2;
            System.out.println("Area del triangolo: " + area);
        }
    }
