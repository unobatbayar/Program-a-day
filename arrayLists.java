//playing around with ArrayLists in Java.
//@author unobatbayar
import java.util.ArrayList;
class arrayLists{
    public static void main (String[] args){
        System.out.println(name_list());
    }

    public static ArrayList<String> name_list(){
        ArrayList names = new ArrayList();
        names.add("Tim Berners-Lee");
        names.add("Satoshi Nakomoto");
        names.add("Aaron Swartz");
        names.add("Uno Batbayar");

        //System.out.println(names.get(3));
        //names.remove("Aaron Swartz");
        return names;
    }
}