package week_1;


    public class Rectangle {
        private double length;
        private double width;
        private int x;
        private int y;

        public void setX(int x) {

            this.x = x;

        }
        public int getX() {
            return x;
        }



        public void setY(int y) {

            this.y = y;
        }
        public int getY() {
            return y;
        }


        public void setLength(double length) {
            if(length>=0) {
                this.length = length;
            }
        }

        public void setWidth(double width) {
            if(width>=0) {
                this.width = width;
            }

        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public double area() {
            return length * width;
        }

        public double circumference() {
            return 2 * (length * width);
        }
        Rectangle(double length,double width,int x,int y){
            System.out.println("constructor started");
            this.length=length;
            this.width=width;
            this.x=x;
            this.y=y;

        }
        public Rectangle calMin(Rectangle r1,Rectangle r2){

            if(r1.area()>r2.area())
            {
                return r2;
            }
            else
                return r1;
        }
        public double cal(Rectangle r1,Rectangle r2)
        {
            if(r1.area()>r2.area())
            {
                return r2.area();
            }
            else
                return r1.area();
        }

        public String intersect(Rectangle r1,Rectangle r2){
            if((r1.x+r1.length)>r2.x && (r1.y+r1.width)>r2.y)
                return "they intersect";
            else
                return "they don't intersect";

        }

    }




