package me.leif.gao.p109;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.Stopwatch;
import me.leif.gao.Utils.FilePath;

/**
 * Created by leif on 2017/12/2
 */
public class ThreeSum {

    private static final String testFileName = "p109/4Kints.txt";

    private static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                for (int k=j+1; k<N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(FilePath.getFilePath(testFileName));
        Stopwatch timer = new Stopwatch();
        StdOut.println(count(a));
        double time = timer.elapsedTime();
        System.out.println("普通算法时间:" + time);
    }

}
