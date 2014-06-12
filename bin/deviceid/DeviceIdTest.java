package deviceid;
import deviceid.DeviceId;
import org.junit.Assert;
import org.junit.Test;
public class DeviceIdTest  
{ 
  private static String imeiNumber = "000000000000000";

  @Test public void test()
  { 
    DeviceId imei = new DeviceId("model", "origin", "cd");
    String model = "model";
    imei.get("origin", "svn");
  }
}