package oracle.ref;

import java.awt.Color;

public final class OracleColors extends Color
{
   /**
    * Fuckin shit
    */
   private static final long serialVersionUID = 1L;

   public static final Color TECH_GREEN = Color.decode("0x2AE843");
   public static final Color SKY_BLUE = Color.decode("0x59D0E3");
   public static final Color BRONZE = Color.decode("0xA1781A");
   public static final Color PALE_BLUE = Color.decode("0x598CE3");

   /**
    * This class should never be instantiated. As such, the instantiation is
    * private to prevent this
    * 
    * @param c
    */
   private OracleColors(int c) {
      super(c);
   }

}
