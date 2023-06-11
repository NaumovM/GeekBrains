import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        int n = GetHighestBit(i);
        short[] m1 = Multiplies(i, n);
        short[] m2 = NonMultiplies(i, n);
        System.out.println("i = " + i + ", n = " + n);
        //PrintArray(m1);
        //PrintArray(m2);
    }
    public static int GetHighestBit(int x) {
        int bit = 1;
        int count = 0;
        while (x > bit) {
            bit = bit << 1;
            count++;
        }
    return count;
    }
    public static short @NotNull [] Multiplies(int start, int multi){
        ArrayList<Object> list = new ArrayList<>();                 //подсмотрел фичу, а как иначе
        for (int i = start; i < Short.MAX_VALUE; i++) {
            if(i % multi == 0){
                list.add((short)i);                                 //зачем здесь шорт? почему просто i не хочет?
            }
        }
        short[] m1 = new short[list.size()];
        for (int i = 0; i < list.size(); i++) {
            m1[i] = (short)list.get(i);                             // зачем здесь Get???
        }
        return m1;
    }
    public static short @NotNull [] NonMultiplies(int end, int multi){
        ArrayList<Object> list = new ArrayList<>();
        for (int i = Short.MIN_VALUE; i < end; i++) {
            if(i % multi != 0){
                list.add((short)i);
            }
        }
        short[] m2 = new short[list.size()];
        for (int i = 0; i < list.size(); i++) {
            m2[i] = (short)list.get(i);
        }
        return m2;
    }
    public static void PrintArray(short @NotNull [] array) {
        for (short value : array) {
            System.out.println(value);
        }
    }
}
