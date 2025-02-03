import java.util.*;

class Random_5{
    int seed;
    int rum0, rum1, rum2;            
    int max;

    Random_5(int seed);{
        this.seed = seed;
        
        setRnums();
        setMax();
    }

    void setRnums();{
        Random rnd = new Random(seed);
        rum0 = rnd.nextInt();
        rum1 = rnd.nextInt();
        rum2 = rnd.nextInt();
    }

    void setMax(){
        int tmp;
        if(rum0 < rum1){
            tmp = rum1;
            if(rum1 < rum2){
               tmp = rum2; 
            }
        }
        else if(rum1 > rum2){
            tmp = rum1;
            if(rum0 > rum1){
                tmp = rum0;
            }
        }
        max = tmp;
    }

    int outRnums(){
        System.out.printf("%d %d %d", rum0, rum1, rum2);
        return(rum0 + rum1+ rum2);
    }
    
    int getMax(){
        return(max);
    }
}

