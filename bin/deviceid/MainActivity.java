package deviceid;
import deviceid.DeviceId;
public class MainActivity  
{ 
  public void getDeviceId()
  { 
    DeviceId imei = new DeviceId("model", "origin", "cd");
    imei.get("origin", "svn");
  }
}