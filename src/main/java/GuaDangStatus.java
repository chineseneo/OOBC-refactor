public class GuaDangStatus extends Status {
    public GuaDangStatus(String guaDang) {
        super(guaDang);
    }

    public Status faDong() {
        this.status = "started";
        return this;
    }

    public Status guaDang() {
        if (status.equals("started")) {
            this.status = "guaDang";
        }
        return this;
    }

    public Status caiYouMen() {
        return new MovingStatus("moving");
    }
}
