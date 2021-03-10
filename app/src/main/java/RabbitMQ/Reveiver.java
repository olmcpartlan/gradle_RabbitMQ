package RabbitMQ;


import java.util.concurrent.CountDownLatch;

public class Reveiver {
  // CountDownLatch is a type of synchronizer which allows Thread to wait for "n" Thread(s) before processing.
  // Works on "latch" principle, thread will wait until gate is open.
  private CountDownLatch latch = new CountDownLatch(1);

  public String receiveMessage(String message) {
    return "Received Message: " + message;
  }

  public CountDownLatch getLatch() {
    return latch;
  }

}
