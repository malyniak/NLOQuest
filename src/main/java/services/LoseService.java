package services;

public class LoseService extends Service{
    private String url="/lose.jsp";
    private static final LoseService service=new LoseService();
    private LoseService() {
    }
    @Override
    public String getUrl() {
        return url;
    }

    public static LoseService getService() {
        return service;
    }
}
