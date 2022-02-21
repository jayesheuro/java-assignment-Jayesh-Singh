package coreJavaQuestions;

class FetchData extends Thread{
    public void run(){
        for(int i=1; i<=2; i++){
        try {
            Thread.sleep(5000);
            System.out.println("FetchData thread is running......" + Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}

class ProcessData implements Runnable{
    public void run(){
        for(int i=1; i<=2; i++){
        try {
            Thread.sleep(1000);
            System.out.println("ProcessData thread is running...... "+ Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

}
public class ques3 {

    public static void main(String[] args) throws InterruptedException{
        FetchData fetch = new FetchData();
        Thread th = new Thread(new ProcessData(), "Thread-1");

        fetch.start();
        fetch.join();
        th.start();
        th.join();
        
    }

}
