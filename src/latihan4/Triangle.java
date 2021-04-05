package latihan4;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle (String color, int base, int height){
        //mengambil nilai color milik shape
        super(color);
        this.base =base;
        this.height =height;
    }
    @Override
    public String toString (){
        return "Tringale [base= "+base+", height= "+height+","+super.toString()+"]";
    }
    @Override
    //menampilkan luas
    public double getArea() {
        return 0.5*base*height;
    }
}
