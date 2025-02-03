class STEP_01_add_4{
    public static void main(String[] args) throws IOException {
        Add_43 add;
        int x, y, z, t;

        x = System.in.read() - '0';
        y = System.in.read() - '0';
        
        add = new Add_43();
        
        z = add.add2i(x,y);
        t = add.total;
        System.out.printf("%d + %d = %d, total = %d\n", x, y, z, t);
    }
}