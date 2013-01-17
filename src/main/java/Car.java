public class Car {

    private Status status;

    public Car() {
        status = new StopStatus("stopped");
    }

    public String getStatus() {
        return status.getStatus();
    }

    public void faDong() {
        status = status.faDong();
    }

    public void guaDang() {
        status = status.guaDang();
    }

    public void caiYouMen() {
        status = status.caiYouMen();
    }
}

