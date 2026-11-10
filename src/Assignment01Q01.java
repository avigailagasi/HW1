public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String str: args) {
            char firstch= str.charAt(0);
            if (firstch%5==0){
                System.out.println(firstch);
            }
        }
    }
}
