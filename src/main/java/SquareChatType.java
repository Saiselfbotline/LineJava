/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SquareChatType implements org.apache.thrift.TEnum {
  OPEN(1),
  SECRET(2),
  ONE_ON_ONE(3),
  SQUARE_DEFAULT(4);

  private final int value;

  private SquareChatType(int value) {
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
  public static SquareChatType findByValue(int value) { 
    switch (value) {
      case 1:
        return OPEN;
      case 2:
        return SECRET;
      case 3:
        return ONE_ON_ONE;
      case 4:
        return SQUARE_DEFAULT;
      default:
        return null;
    }
  }
}
