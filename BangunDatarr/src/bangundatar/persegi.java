package bangundatar;

public class persegi  extends bangundatar{
        private double sisi;


        public double getSisi() {
            return sisi;
        }

        public void setSisi(double sisi) {
            this.sisi = sisi;
        }
        @Override
        public double keliling() {
            return sisi*4; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public double luas() {
            return sisi*sisi; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setJenis(String jenis) {
            super.setJenis(jenis); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getJenis() {
            return super.getJenis(); //To change body of generated methods, choose Tools | Templates.
        }

        public double luas(double sisi) {
            return sisi*sisi; //To change body of generated methods, choose Tools | Templates.
        }
        public double keliling(double sisi) {
            return sisi*4; //To change body of generated methods, choose Tools | Templates.
        }

    }

