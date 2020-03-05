package bangundatar;

public class segitiga extends bangundatar{
        private double alas;
        private double tinggi;

        public double getAlas() {
            return alas;
        }

        public void setAlas(double alas) {
            this.alas = alas;
        }

        public double getTinggi() {
            return tinggi;
        }

        public void setTinggi(double tinggi) {
            this.tinggi = tinggi;
        }

        @Override
        public double keliling() {
            return alas*3; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public double luas() {
            return alas*tinggi/2; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setJenis(String jenis) {
            super.setJenis(jenis); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getJenis() {
            return super.getJenis(); //To change body of generated methods, choose Tools | Templates.
        }

        public double luas(double alas,double tinggi) {
            return alas*tinggi/2; //To change body of generated methods, choose Tools | Templates.
        }

        public double keliling(double alas) {
        return alas*3; //To change body of generated methods, choose Tools | Templates.
    }


    }

