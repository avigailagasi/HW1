public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int times= Integer.parseInt(args[0]);
        int sign= -1;
        for (int i=0; i<times; i++){
            sign*=-1;
            approxPi+= (1.0/(2*i+1))*sign;
        }
        approxPi*=4;
        System.out.println(approxPi + " " + actualPi);
    }
}
