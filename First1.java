public class First1 {
    public static void main(String[] args) {
        String name="SACHIN";
        String value="SAURAV";
        int res=name.compareTo(value);
        if(res==0){
            System.out.println("equal");
        }
        else if(res>0){
            System.out.println("name is big");
        }
        else{
            System.out.println("value is big");
        }
    }
}
