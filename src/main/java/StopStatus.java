public class StopStatus extends Status {
    public StopStatus(String status) {
        super(status);
    }

    public Status faDong() {
        return new StartStatus("started");
    }

    public Status guaDang() {
        return this;
    }

    public Status caiYouMen() {
        return this;
    }
}
