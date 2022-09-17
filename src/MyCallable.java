import java.util.concurrent.Callable;

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Integer counter = 0;
        try {
            while (true) {
                Thread.sleep(2500);
                System.out.println("Я callable задача в треде_" + Thread.currentThread().getName());
                counter += 1;
                if (counter.equals(5)) {
                    break;
                }
            }
        } finally{
            System.out.println(Thread.currentThread().getName() + " с Callable завершен");
        }
    return counter;
    }

}