import java.io.*;

class MyRndException_41 extends Exception {    
}

class MyRndException_42 extends Exception{
}

class Get_n_4 {
    int getnum() throws MyRndException_41{
        int n;
        n = (int)(Math.random() * 10);
        System.out.println(n);

        if(n == 0)
            throw new MyRndException_41();
        return(n);
    }
}

class Get_m_4 {
    Get_n_4 gn;

    Get_m_4(Get_n_4 gn){
        this.gn = gn;
    }

    int getmod() throws MyRndException_41, MyRndException_42 {
        int x, y, m;

        x = gn.getnum(); y = gn.getnum();

        if((m = ( x % y)) == 0)
            throw new MyRndException_42();
        System.out.printf("<%d, %d>", x, y);
        return (m);
    }
}

class STEP_11_Exception_4{
    public static void main(String args[]) {
        Get_n_4 rd = new Get_n_4();
        Get_m_4 md = new Get_m_4(rd);
        int m;

        while(true) {
            try{
                m = md.getmod();
            } catch (MyRndException_41 e) {
                System.out.println("MyRndException_41");
                break;
            } catch (MyRndException_42 e) {
                System.out.println("MyRndException_42");
                break;
            }
            System.out.println("-->"+ m);
        }
        System.out.println("Stop...");
    }
}