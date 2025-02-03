class Type_41 {
    void type_test() {
        Byte bt = new Byte((byte)65);
        Short st = new Short((short)0x41);
        Character ch = new Character('A');
        Integer it = new Integer(0101);
        Long lg = new Long(65);
        Float ft = new Float(1e-2f);
        Double db = new Double(0.01);

    double sum = bt.byteValue() + st.shortValue() + ch.charValue() + it.intValue() + lg.longValue() + ft.floatValue() + db.doubleValue();
    String str = bt.toString() + st.toString() + ch.toString() + it.toString() + lg.toString() + ft.toString() + db.toString();

        System.out.println(sum);
        System.out.println(str);
    }
}

class Type_42 {
    void type_test(){
        Byte bt = new Byte((byte)65);
        Character ch = new Character('A');
        Integer it = new Integer(0101);
       
        if(bt.equals((byte)65)) System.out.println("bt.equals() == (byte)65");
        else                    System.out.println("bt.equals() != (byte)65");

        if(bt.equals(65)) System.out.println("bt.equals() == 65");
        else              System.out.println("bt.equals() != 65");

        if(bt.byteValue() == (byte)65) System.out.println("bt.byteValue() == (byte)65");
        else                           System.out.println("bt.byteValue() != (byte)65");

        if(bt.byteValue() == 65) System.out.println("bt.byteValue() == 65");
        else                     System.out.println("bt.byteValue() != 65");
    }
}

public class STEP_12_Type_4{
    public static void main(String[] args)
    {
        new Type_41().type_test();
        new Type_42().type_test();
    }
}