package Latihan2;

    class Line implements Relation{

        //private fields
         double x1;
         double x2;
         double y1;
         double y2;

        //agar private fields bisa diakses
        public Line (double x1, double x2, double y1, double y2){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
        //menghitung hasil
        public double getLength(){
            double length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            return length;
        }
        //implementasi abstract method di interface
        //untuk menguji apakah jumlah a lebih banyak daripada jumlah b
        @Override
        public boolean isGreater(Object a, Object b) {
            double aLen =((Line)a).getLength();
            double bLen =((Line)b).getLength();
            return (aLen>bLen);
        }
        //implementasi abstract method di interface
        //untuk menguji apakah jumlah b lebih banyak daripada jumlah a
        @Override
        public boolean isLess(Object a, Object b) {
            double aLen = ((Line)a).getLength();
            double bLen = ((Line)b).getLength();
            return (aLen<bLen);
        }
        //implementasi abstract method di interface
        //untuk menguji apakah jumlah b sama banyak dengan jumlah a
        @Override
        public boolean isEqual(Object a, Object b) {
            double aLen = ((Line)a).getLength();
            double bLen = ((Line)b).getLength();
            return (aLen==bLen);
        }
    }

