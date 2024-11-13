public class BasicExceptions {

    public static void main(String[] args) {
       try {

        String[] strArray1 = new String[] {"A","B","C"};
        System.out.println("here is the item : " + strArray1[0]);
    }//end try
       catch (Exception e) {
           System.out.println("something went wrong");
       }//end catch
       finally {
           System.out.println("we are in the finally block");
       }//en finally

        System.out.println("program continued");

       }
}
