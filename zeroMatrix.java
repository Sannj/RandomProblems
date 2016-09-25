package RandomProblems;

import java.util.ArrayList;

/**
 * Created by sanjanabadam on 9/22/16.
 */
public class zeroMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
      //  a.add(new ArrayList<Integer>());
       // a.add(new ArrayList<Integer>());
        /*a.get(0).add(0);
        a.get(0).add(1);
        a.get(0).add(1);
        a.get(1).add(1);
        a.get(1).add(1);
        a.get(1).add(1);*/
        for(int i = 0; i<28;i++){
            a.add(new ArrayList<Integer>());
            for(int j =0; j<50;j++){
                a.get(i).add(1);
            }
        }
        a.get(27).set(37,0);


      //  System.out.println(a);
        setZeroes(a);

    }
    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int r = 1, c = 1;
        int rsize = a.size();
        int csize = a.get(0).size();
        for(int i = 0; i<csize; i++){
            if(a.get(0).get(i) == 0)
                r = 0;
        }
        for(int i = 0; i<rsize; i++){
            if(a.get(i).get(0) == 0)
                c = 0;
        }
        for(int i = 1; i<rsize; i++){
            for(int j = 1; j<csize; j++){
                if(a.get(i).get(j) == 0) {
                    a.get(0).set(j, 0);
                    a.get(i).set(0, 0);
                }
            }
        }
        System.out.println(a);

        for(int i = 1; i<csize; i++){
            int k = 1;
            if(a.get(0).get(i) == 0){
                for(int j = 1; j<rsize; j++){
                    a.get(j).set(i,0);

                }
            }
            k++;
        }

        for(int i = 1; i<rsize; i++){
            int k = 1;
            if(a.get(i).get(0) == 0){
                for(int j =1; j<csize;j++){
                    a.get(k).set(j,0);

                }
            }
            k++;
        }
        System.out.println(a);
        if(r == 0){
            for(int i = 0; i< csize; i++){
                a.get(0).set(i,0);
            }
        }
        if(c == 0){
            for(int i = 0; i< rsize; i++){
                a.get(i).set(0,0);
            }
        }
        System.out.println(a);
    }
}

