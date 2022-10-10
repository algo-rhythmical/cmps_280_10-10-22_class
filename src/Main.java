import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Orange o1 = new Orange(1,1,1);
        Orange o2 = new Orange(10,10,10);
        Orange o3 = new Orange(100,100,100);

        Orange[] basket = {o1, o2, o3};

        System.out.println(Arrays.toString(basket));

        Arrays.sort(basket);


    }
}
