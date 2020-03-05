package bangundatar;

public class balok extends persegipanjang{
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double volume(){
        return this.tinggi*this.luas();
    }

    public double volume(double tinggi){
        return this.tinggi*this.luas();
    }
}
