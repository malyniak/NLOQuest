package services;

public class LoseService extends Service {
    private static final LoseService service=new LoseService();
    private LoseService() {
    }
    public static LoseService getService() {
        return service;
    }
}
