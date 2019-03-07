public class MarleyChallenge{
    final static String MARLEY = "marley";
    final static String MIRKO = "mirko";

    public static void main(String[] args){
        simpleMarleyMirko(100);
        marleyMirkoII(100);
    }

    static void simpleMarleyMirko(int n){
        String output = "";

        for(int i = 1;  i < n; i++){
            boolean marley = (i % 3 == 0);
            boolean mirko = (i % 5 == 0);

            if(marley & mirko){
                output = MARLEY + MIRKO;
            }else if(marley){
                output = MARLEY;
            }else if(mirko){
                output = MIRKO;
            }else{
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }


    static void marleyMirkoII(int stop){
        for(int i = 1; i < stop; i++){
            StringBuilder builder = new StringBuilder();
            if(i % 3 == 0) builder.append(MARLEY);
            if(i % 5 == 0) builder.append(MIRKO);
            String output = ((builder.length() == 0) ? String.valueOf(i) : builder.toString());
            System.out.println(output);

        }
    }
}
