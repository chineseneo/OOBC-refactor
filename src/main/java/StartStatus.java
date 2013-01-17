public class StartStatus extends Status {
    public StartStatus(String status) {
        super(status);
    }

    public Status faDong() {
        return this;
    }

    public Status guaDang() {
        return new GuaDangStatus("guaDang");
    }

    public Status caiYouMen() {
        return new KongZhuanStatus("kongZhuan");
    }
}
