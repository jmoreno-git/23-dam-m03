package queues;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Jose
 */
public class QueueTest {

    private LinkedList<Integer> data1;
    private LinkedList<Integer> data2;
    private static final Logger LOG = Logger.getLogger(QueueTest.class.getName());

    public static void main(String[] args) {
        QueueTest qt = new QueueTest();
        qt.start();
    }

    private void start() {
        data1 = new LinkedList<>();
        data2 = new LinkedList<>();
        initData(data1);
        System.out.println("data1: " + data1);
        System.out.println("data2: " + data2);
        
        test(data1, "peekFirst");
        test(data1, "pollFirst");
        test(data2, "peekFirst");
        test(data2, "pollFirst");
        //
        test(data1, "getFirst");
        test(data1, "removeFirst");
        test(data2, "getFirst");
        test(data2, "removeFirst");        
    }

    private void initData(LinkedList<Integer> data) {
        data.addAll(IntStream.range(1, 20).boxed().collect(Collectors.toList()));
    }

    private <T> void test(LinkedList<T> obj, String methodName) {
        try {
            System.out.println("Test method: "+methodName);
            System.out.println("\tInitial data: "+obj);
            T elem = (T) (obj.getClass().getMethod(methodName).invoke(obj));
            System.out.println("\tElem: " + elem);
            System.out.println("\tFinal data: " + obj);
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
            LOG.log(Level.WARNING, "Exception thrown: {0}", new Object[]{ex.getClass().getName()});
        }
    }

}
