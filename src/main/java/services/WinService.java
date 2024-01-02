package services;

public class WinService extends Service{
    private static final WinService service=new WinService();
    private WinService() {
    }
    public static WinService getService() {
        return service;
    }
}
