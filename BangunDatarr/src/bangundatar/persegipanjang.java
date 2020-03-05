package bangundatar;

public class  persegipanjang extends bangundatar{
        private double panjang;
        private double lebar;

        public double getPanjang() {
            return panjang;
        }

        public void setPanjang(double panjang) {
            this.panjang = panjang;
        }

        public double getLebar() {
            return lebar;
        }

        public void setLebar(double lebar) {
            this.lebar = lebar;
        }

        @Override
        public double keliling() {
            return (panjang+lebar)*2; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public double luas() {
            return panjang*lebar; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setJenis(String jenis) {
            super.setJenis(jenis); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getJenis() {
            return super.getJenis(); //To change body of generated methods, choose Tools | Templates.
        }

        public double keliling(double panjang, double lebar) {
            return (panjang+lebar)*2; //To change body of generated methods, choose Tools | Templates.
        }

        public double luas(double panjang, double lebar) {
            return panjang*lebar; //To change body of generated methods, choose Tools | Templates.
        }
    }

