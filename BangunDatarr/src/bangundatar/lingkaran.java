package bangundatar;

public class lingkaran extends bangundatar{
        private double radius;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double keliling() {

                    return 3.14*2*radius; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public double luas() {
            return 3.14*radius*radius; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setJenis(String jenis) {
            super.setJenis(jenis); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getJenis() {
            return super.getJenis(); //To change body of generated methods, choose Tools | Templates.
        }
        public double keliling(double radius) {
            return 3.14*2*radius; //To change body of generated methods, choose Tools | Templates.
    }
        public double luas(double radius) {
            return 3.14*radius*radius; //To change body of generated methods, choose Tools | Templates.
        }

    }

