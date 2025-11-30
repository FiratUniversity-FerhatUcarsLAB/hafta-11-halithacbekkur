    public class Exercise4_6 {

       

            public static double multadd(double a, double b, double c) {
                return a * b + c;
            }

            public static double expSum(double x) {
                return x * Math.exp(-x) + (1 - Math.exp(-x));
            }

            public static void main(String[] args) {

                double t1 = multadd(1.0, 2.0, 3.0);
                System.out.println("multadd(1.0, 2.0, 3.0) = " + t1);

                double t2 = Math.sin(Math.PI / 4) + multadd(Math.cos(Math.PI / 4), 0.5, 0);
                System.out.println("sin(pi/4) + cos(pi/4)/2 = " + t2);

                double t3 = Math.log(10) + Math.log(20);
                System.out.println("log(10) + log(20) = " + t3);

                double e1 = expSum(2.0);
                System.out.println("expSum(2.0) = " + e1);
            }
        }


