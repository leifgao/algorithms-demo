package me.leif.gao.p109;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.Stopwatch;
import me.leif.gao.Utils.FilePath;
import me.leif.gao.p28.BinarySearch;

import java.util.Arrays;

/**
 * Created by leif on 2017/12/2
 */
public class ThreeSumFast {
    private static final String testFileName = "p109/4Kints.txt";

    //利用二分查找
    private static int count(int[] a) {
        int N = a.length;
        Arrays.sort(a);
        int cnt = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (BinarySearch.rank(-a[i]-a[j], a) > j) {
                    cnt++;
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
        System.out.println("fast算法时间:" + time);
    }
}
