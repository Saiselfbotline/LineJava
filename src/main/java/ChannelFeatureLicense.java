/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ChannelFeatureLicense implements org.apache.thrift.TEnum {
  BLE_LCS_API_USABLE(26),
  PROHIBIT_MINIMIZE_CHANNEL_BROWSER(27),
  ALLOW_IOS_WEBKIT(28);

  private final int value;

  private ChannelFeatureLicense(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ChannelFeatureLicense findByValue(int value) { 
    switch (value) {
      case 26:
        return BLE_LCS_API_USABLE;
      case 27:
        return PROHIBIT_MINIMIZE_CHANNEL_BROWSER;
      case 28:
        return ALLOW_IOS_WEBKIT;
      default:
        return null;
    }
  }
}
