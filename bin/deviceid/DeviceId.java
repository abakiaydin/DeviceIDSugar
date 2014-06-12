package deviceid;

public class DeviceId  
{ 
  private static final String MODEL = "model";

  private static final String ORIGIN = "origin";

  private static final String SERIAL_NUMBER = "serialNumber";

  private static final String SOFTWARE_VERSION_NUMBER = "svn";

  private static final String CHECK_DIGIT = "cd";

  private String original_imei;

  private String imei;

  private String origin = "00";

  private String model = "000000";

  private String serial_number = "000000";

  private String check_digit = "0";

  private String software_version_number = "00";

  public DeviceId () 
  { 
    this.original_imei = "0000000000000000";
  }

  public DeviceId (String ... allowList) 
  { 
    this.original_imei = "0000000000000000";
    allow(allowList);
  }

  private void allow(String ... allowList)
  { 
    for(int i = 0; i < allowList.length; i++)
    { 
      if(allowList[i].equals(DeviceId.MODEL))
      { 
        model = original_imei.substring(0, 2);
      }
      else
        if(allowList[i].equals(DeviceId.ORIGIN))
        { 
          origin = original_imei.substring(2, 8);
        }
        else
          if(allowList[i].equals(DeviceId.SERIAL_NUMBER))
          { 
            serial_number = original_imei.substring(8, 14);
          }
          else
            if(allowList[i].equals(DeviceId.SOFTWARE_VERSION_NUMBER))
            { 
              software_version_number = original_imei.substring(14);
            }
            else
              if(allowList[i].equals(DeviceId.CHECK_DIGIT))
              { 
                check_digit = original_imei.substring(14);
              }
    }
    String last_digits = software_version_number;
    if(original_imei.length() == 15)
    { 
      last_digits = check_digit;
    }
    imei = origin + model + serial_number + last_digits;
    return;
  }

  public String getDeviceId()
  { 
    return imei;
  }

  public String get(String ... fieldList)
  { 
    String origin = "00";
    String model = "000000";
    String serial_number = "000000";
    String check_digit = "0";
    String software_version_number = "00";
    for(int i = 0; i < fieldList.length; i++)
    { 
      if(fieldList[i].equals(DeviceId.MODEL))
      { 
        model = original_imei.substring(0, 2);
      }
      else
        if(fieldList[i].equals(DeviceId.ORIGIN))
        { 
          origin = original_imei.substring(2, 8);
        }
        else
          if(fieldList[i].equals(DeviceId.SERIAL_NUMBER))
          { 
            serial_number = original_imei.substring(8, 14);
          }
          else
            if(fieldList[i].equals(DeviceId.SOFTWARE_VERSION_NUMBER))
            { 
              software_version_number = original_imei.substring(14);
            }
            else
              if(fieldList[i].equals(DeviceId.CHECK_DIGIT))
              { 
                check_digit = original_imei.substring(14);
              }
    }
    String last_digits = software_version_number;
    if(original_imei.length() == 15)
    { 
      last_digits = check_digit;
    }
    return origin + model + serial_number + last_digits;
  }

  @Override public String toString()
  { 
    return imei;
  }
}