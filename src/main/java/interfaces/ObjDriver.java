package interfaces;

public class ObjDriver {


    public static void main(String[] args) {
        new ObjDriver();
        //even though clone is default in parent class still we have to provide impl
        System.out.println(new ObjTest() {
            @Override
            public Object clone() {
                return null;
            }
        });
    }
}
