package services;

public class WinService extends Service{
    private String url="/win.jsp";
    private static final WinService service=new WinService();
    private WinService() {
    }
    public Service getNextStep() {
        return StartService.getService();
    }
    @Override
    public String getUrl() {
        return url;
    }
    public static WinService getService() {
        return service;
    }
}
