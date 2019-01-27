package suppliers;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class SuppliersEx {

    public static void main(String[] args) {
        Supplier<Integer> supplier = SuppliersEx::getNum;
        for(int i=1;i<21;i++)
            System.out.println(supplier.get());

        int x = 10;
        int y = 20;
        BooleanSupplier booleanSupplier = () -> x>y;
        System.out.println(booleanSupplier.getAsBoolean());

    }

    private static Integer getNum() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
