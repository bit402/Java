package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class test01 {
//    public static double distance(long x1,long y1,long x2,long y2) {
//        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
//    }
//    // 计算数字的2因子数
//    private static int count2Factor(int num) {
//        int cnt = 0;
//        while (num % 2 == 0 && num > 0) {
//            cnt++;
//            num /= 2;
//        }
//        return cnt;
//    }
//public static long magic(long H){
//    return my_sqrt((H/2)+1);
//}
//    public static long my_sqrt(long n){
//        if(n<=1){
//            return n;
//        }
//        long left=1L;
//        long right=n;
//        long result=0L;
//        while(left<=right){
//            long mid=left+(right-left)/2;
//            if(mid<=n/mid){
//                left=mid+1;
//                result=mid;
//            }
//            else {
//                right=mid-1;
//            }
//        }
//        return result;
//    }
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = 0;
//        int k = 0;
//        //System.out.println("请输入数组数和要求的因子数："); // 顺便修正错别字“因字数”
//        n = scan.nextInt();
//        k = scan.nextInt();
//        int[] arr = new int[n];
//       // System.out.println("请输入数组的" + n + "个数字："); // 修正原错误提示“给字符串赋值”
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextInt();
//        }
//
//        // 复制数组用于统计初始因子数，避免修改原数组
//        int[] arrCopy = new int[n];
//        for (int i = 0; i < n; i++) {
//            arrCopy[i] = arr[i];
//        }
//
//        // 统计初始2的因子总数（家底）
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            int num = arrCopy[i];
//            while (num % 2 == 0) {
//                sum += 1;
//                num = num / 2;
//            }
//        }
//        //System.out.println("家底（现有因子数）  " + sum);
//        int need = k - sum;
//        //System.out.println("还差  " + need);
//        long cost = 0L;
//
//        if (need > 0) {
//            // ========== 错误1：原代码把内层逻辑写到了遍历数字的for循环里，现在移到while循环内 ==========
//            while (need > 0) {
//                int bestIndex = -1;
//                int minAdd = 100001;
//                int gainFactor = 0;
//
//                // 遍历所有数字，找性价比最高的操作
//                for (int i = 0; i < n; i++) {
//                    int currentNum = arr[i];
//                    if (currentNum >= 100000) {
//                        continue;
//                    }
//                    // 找当前数字的最小增量最优操作
//                    for (int add = 1; add <= 100000 - currentNum; add++) {
//                        int newNum = currentNum + add;
//                        int oldFactor = count2Factor(currentNum);
//                        int newFactor = count2Factor(newNum);
//                        int gain = newFactor - oldFactor;
//
//                        // 原代码其他部分不变，仅替换这段if判断
//                        if (gain > 0) {
//                            // 初始状态直接更新，非初始状态对比增量（优先选更小的，增量相同选赚更多的）
//                            boolean needUpdate = false;
//                            if (bestIndex == -1) {
//                                // 第一次找到有效操作，直接更新
//                                needUpdate = true;
//                            } else {
//                                // 非初始状态：增量更小 或 增量相同但赚的因子更多
//                                needUpdate = (add < minAdd) || (add == minAdd && gain > gainFactor);
//                            }
//
//                            if (needUpdate) {
//                                bestIndex = i;
//                                minAdd = add;
//                                gainFactor = gain;
//                                break; // 找到第一个能赚因子的增量，直接退出内层循环
//                            }
//                        }
//                    }
//                } // ========== 错误2：原代码提前闭合了遍历数字的for循环，现在修正 ==========
//
//                // ========== 错误3：原代码把“无法凑够”的判断写到了遍历数字的for循环内，现在移到这里 ==========
//                // 遍历完所有数字都没找到可操作的，说明凑不够
//                if (bestIndex == -1) {
//                    System.out.println("无法凑够因子数，cost=-1");
//                    cost = -1;
//                    break; // 退出while循环
//                }
//
//                // 执行最优操作
//                cost += minAdd;
//                need -= gainFactor;
//                arr[bestIndex] += minAdd;
//
//                // 打印中间过程
//                //System.out.println("给数字" + (arr[bestIndex] - minAdd) + "加了" + minAdd +
//                        //"，多赚" + gainFactor + "个因子，剩余缺口：" + Math.max(need, 0));
//            } // ========== 错误4：原代码的while循环提前闭合，现在修正 ==========
//        } else {
//            cost = 0;
//        }
//
//        // 输出最终结果
//        if (cost == -1) {
//            //System.out.println("最终结果：无法凑够，返回-1");
//            System.out.println(-1);
//        } else {
//            //System.out.println("最终结果：最少需要加的数的总和为 " + cost);
//            System.out.println(cost);
//        }
//        scan.close();
//        Scanner scan = new Scanner(System.in);
//        int n=scan.nextInt();
//        int k=scan.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=scan.nextInt();
//        }
//        int[][] dp=new int[n+1][k+1];
//        int INF=Integer.MAX_VALUE;
//        for(int i=0;i<=n;i++){
//            Arrays.fill(dp[i],INF);
//        }
//        dp[0][0]=0;
//        for(int i=1;i<=n;i++){
//            int currentNum=arr[i-1];
//            for(int j=0;j<=k;j++){
//                for(int e=0;e<=Math.min(j,16);e++){
//                    int powerOf2=(int)Math.pow(2,e);
//                    int x=(int)Math.ceil((double)currentNum/powerOf2)*powerOf2;
//                    if(x<=100000 && dp[i-1][j-e]!=INF){
//                        int cost=dp[i-1][j-e]+(x-currentNum);
//                        dp[i][j]=Math.min(cost,dp[i][j]);
//                    }
//                }
//            }
//        }
//        if(dp[n][k]==INF){
//            System.out.println(-1);
//        }
//        else{
//            System.out.println(dp[n][k]);
//        }
//        scan.close();
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        long[] arr=new long[n];
//        for(int i=0;i<n;i++){
//            arr[i]=scan.nextLong();
//        }
//        long preArr[]=new long[20];
//        int preLenght=0;
//        long ans=0L;
//        for(int i=0;i<n;i++){
//            long curArr[]=new long[20];
//            int curLenght=0;
//            long current = arr[i]; // ✅ 使用临时变量current，不修改原始数组arr[i]
//            while (current>1){
//                curArr[curLenght++]=current;
//                current=magic(current);
//            }
//            for(int j=0;j<curLenght;j++){
//                long num=curArr[j];
//                boolean flag=false;
//                for(int k=0;k<preLenght;k++){
//                    if(num==preArr[k]){
//                        flag=true;
//                        break;
//                    }
//                }
//                if(!flag){
//                    ans++;
//                }
//            }
//            preArr=curArr.clone();
//            preLenght=curLenght;
//        }
//        System.out.println(ans);
//        scan.close();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arrb = new int[n];
//        int[] arra = new int[n];
//        int[] p = new int[n+1];
////        int sa=0;
////        int sb=0;
//        for (int i = 0; i < n; i++) {
//            arrb[i] = scanner.nextInt();
//            p[arrb[i]]=i+1;
//        }
//        scanner.close();
//        if(n==2){
//            if(arrb[0]<arrb[1]){
//                System.out.println(0);
//                return;
//            }
//            if(arrb[0]>arrb[1]){
//                System.out.println(1);
//                return;
//            }
//        }
//        long sum=(long)(n+1)*n/2;
//        long current=sum;
//        long ans=0;
//        for(int i=n;i>=1;i--){
//            long option=current-2L*p[i];
//            if(option>ans){
//                ans=option;
//            }
//            current-=p[i];
//        }
//        System.out.println(ans);
////        for(int i=n-1;i>=0;i--){
////            if(arrb[i]==n){
////                arra[i]=1;
////            }
////            else{
////                arra[i]=arrb[i]+1;
////            }
////        }
////        for(int i=n-1;i>=0;i--){
////            if(arra[i]>arrb[i]){
////                sa+=(i+1);
////            }
////            else if(arra[i]<arrb[i]){
////                sb+=(i+1);
////            }
////        }
////        System.out.println(sa-sb);
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        long[][] arrn=new long[n][3];
//        long[][] arrm=new long[m][3];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 3; j++) {
//                arrn[i][j]=scanner.nextLong();
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < 3; j++) {
//                arrm[i][j]=scanner.nextLong();
//            }
//        }
//        long sum=0L;
//        for (int i=0; i<m;i++){
//            long x1=arrm[i][0];
//            long y1=arrm[i][1];
//            long r1=arrm[i][2];
//            for(int j=0;j<n;j++){
//                long x2=arrn[j][0];
//                long y2=arrn[j][1];
//                long r2=arrn[j][2];
//                double l=distance(x1,y1,x2,y2);
//                if(l<=r1+r2){
//                    sum++;
//                }
//            }
//        }
//        System.out.println(sum);
//        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] maxHeights = new int[n];
//        int[] currentHeights = new int[n];
//
//        int currentPos = 0;
//        int direction = 1; // 1向右，-1向左
//
//        // 关键修正：模拟足够多的天数（4*n天，覆盖更完整的周期）
//        for (int day = 1; day <= 4 * n; day++) {
//            // 早晨：所有灌木长高1厘米
//            for (int i = 0; i < n; i++) {
//                currentHeights[i]++;
//                maxHeights[i] = Math.max(maxHeights[i], currentHeights[i]);
//            }
//
//            // 傍晚：修剪当前位置的灌木
//            currentHeights[currentPos] = 0;
//
//            // 移动逻辑修正：先预判下一个位置，再判断是否转向
//            int nextPos = currentPos + direction;
//            if (nextPos < 0 || nextPos >= n) {
//                direction = -direction; // 转向
//                nextPos = currentPos + direction; // 重新计算下一个位置
//            }
//            currentPos = nextPos; // 更新当前位置
//        }
//
//        // 输出结果
//        for (int height : maxHeights) {
//            System.out.println(height);
//        }
//        scanner.close();
//        Scanner sc = new Scanner(System.in);
//        int L = sc.nextInt();
//        int[] d = new int[L + 1];
//        long[] sum = new long[L + 1];
//        for(int i = 1; i <= L; i++) {
//            for(int j=i;j<=L;j+=i){
//                d[j]++;
//            }
//        }
//        for(int i = 1; i <= L; i++) {
//            sum[i]=sum[i-1]+d[i];
//        }
//        long total=0;
//        for(int s = 1; s < L; s++) {
//            int max=L-s;
//            long sn=d[s];
//            long st=sum[max];
//            total+=sn*st;
//        }
//        sc.close();
//        System.out.println(total);
//        int month=0;
//        int day=0;
//        LocalDate localDate = LocalDate.of(2022,1,1);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//        String[] seq={"012","123","234","345","456","567","678","789"};
//        int count=0;
//        while(localDate.getYear()==2022){
//            String date=localDate.format(formatter);
//            for(String s:seq){
//                if(date.contains(s)){
//                    count++;
//                    break;
//                }
//            }
//            localDate=localDate.plusDays(1);
//        }
//        System.out.println(count);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n+1];
//        for (int i = 1; i <= n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        long result=0L;
//        for (int i = 1; i <= n; i++) {
//            for (int j = i+1; j <= n; j++) {
//               result+= (long) (arr[i] ^ arr[j]) *(long)(j-i);
//            }
//        }
//        sc.close();
//        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        // 读取测试用例的数量
        int n = sc.nextInt();

        // 循环处理每个测试用例
        for (int i = 0; i < n; i++) {
            // 读取要判断的数字
            long a = sc.nextLong();
            // 调用判断方法，输出结果
            if (judge(a)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        // 关闭输入流（好习惯）
        sc.close();
    }
    static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
            157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233,
            239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317,
            331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419,
            421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503,
            509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607,
            613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701,
            709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811,
            821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911,
            919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997, 1009, 1013, 1019,
            1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 1091, 1093, 1097,
            1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201,
            1213, 1217, 1223, 1229, 1231, 1237, 1249, 1259, 1277, 1279, 1283, 1289, 1291,
            1297, 1301, 1303, 1307, 1319, 1321, 1327, 1361, 1367, 1373, 1381, 1399, 1409,
            1423, 1427, 1429, 1433, 1439, 1447, 1451, 1453, 1459, 1471, 1481, 1483, 1487,
            1489, 1493, 1499, 1511, 1523, 1531, 1543, 1549, 1553, 1559, 1567, 1571, 1579,
            1583, 1597, 1601, 1607, 1609, 1613, 1619, 1621, 1627, 1637, 1657, 1663, 1667,
            1669, 1693, 1697, 1699, 1709, 1721, 1723, 1733, 1741, 1747, 1753, 1759, 1777,
            1783, 1787, 1789, 1801, 1811, 1823, 1831, 1847, 1861, 1867, 1871, 1873, 1877,
            1879, 1889, 1901, 1907, 1913, 1931, 1933, 1949, 1951, 1973, 1979, 1987, 1993,
            1997, 1999, 2003, 2011, 2017, 2027, 2029, 2039, 2053, 2063, 2069, 2081, 2083,
            2087, 2089, 2099, 2111, 2113, 2129, 2131, 2137, 2141, 2143, 2153, 2161, 2179,
            2203, 2207, 2213, 2221, 2237, 2239, 2243, 2251, 2267, 2269, 2273, 2281, 2287,
            2293, 2297, 2309, 2311, 2333, 2339, 2341, 2347, 2351, 2357, 2371, 2377, 2381,
            2383, 2389, 2393, 2399, 2411, 2417, 2423, 2437, 2441, 2447, 2459, 2467, 2473,
            2477, 2503, 2521, 2531, 2539, 2543, 2549, 2551, 2557, 2579, 2591, 2593, 2609,
            2617, 2621, 2633, 2647, 2657, 2659, 2663, 2671, 2677, 2683, 2687, 2689, 2693,
            2699, 2707, 2711, 2713, 2719, 2729, 2731, 2741, 2749, 2753, 2767, 2777, 2789,
            2791, 2797, 2801, 2803, 2819, 2833, 2837, 2843, 2851, 2857, 2861, 2879, 2887,
            2897, 2903, 2909, 2917, 2927, 2939, 2953, 2957, 2963, 2969, 2971, 2999, 3001,
            3011, 3019, 3023, 3037, 3041, 3049, 3061, 3067, 3079, 3083, 3089, 3109, 3119,
            3121, 3137, 3163, 3167, 3169, 3181, 3187, 3191, 3203, 3209, 3217, 3221, 3229,
            3251, 3253, 3257, 3259, 3271, 3299, 3301, 3307, 3313, 3319, 3323, 3329, 3331,
            3343, 3347, 3359, 3361, 3371, 3373, 3389, 3391, 3407, 3413, 3433, 3449, 3457,
            3461, 3463, 3467, 3469, 3491, 3499, 3511, 3517, 3527, 3529, 3533, 3539, 3541,
            3547, 3557, 3559, 3571, 3581, 3583, 3593, 3607, 3613, 3617, 3623, 3631, 3637,
            3643, 3659, 3671, 3673, 3677, 3691, 3697, 3701, 3709, 3719, 3727, 3733, 3739,
            3761, 3767, 3769, 3779, 3793, 3797, 3803, 3821, 3823, 3833, 3847, 3851, 3853,
            3863, 3877, 3881, 3889, 3907, 3911, 3917, 3919, 3923, 3929, 3931, 3943, 3947, 3967};
    static boolean judge(long a) {
        // 第一步：遍历所有预定义的质数，分解a的质因数
        for (int j = 0; j < primes.length; j++) {
            // 取出当前要试除的质数
            long primeNum = primes[j];

            // 如果质数比当前a还大，说明已经分解完了，不用继续
            if (primeNum > a) {
                break;
            }

            // 如果a不能被这个质数整除，跳过这个质数
            if (a % primeNum != 0) {
                continue;
            }

            // 统计这个质因数的指数（出现的次数）
            int count = 0;
            while (a % primeNum == 0) {
                count++;       // 指数+1
                a = a / primeNum;  // 把这个质因数从a中除掉
            }

            // 关键判断：如果某个质因数的指数是1，直接返回false（无法拆分）
            if (count == 1) {
                return false;
            }
        }

        // 第二步：检查分解后剩余的数是否是平方数或立方数
        // 剩余的数要么是1，要么是大质数的幂，必须是平方/立方数才符合条件
        return isSquare(a) || isCube(a);
    }

    /**
     * 判断一个数是否是平方数（比如4=2²，9=3²）
     * @param a 要判断的数
     * @return 是平方数返回true，否则false
     */
    static boolean isSquare(long a) {
        // 先算出a的平方根（取整）
        long sqrtA = (long) Math.sqrt(a);
        // 验证：平方根的平方是否等于a（处理取整误差，还要检查sqrtA+1的情况）
        return (sqrtA * sqrtA == a) || ((sqrtA + 1) * (sqrtA + 1) == a);
    }

    /**
     * 判断一个数是否是立方数（比如8=2³，27=3³）
     * @param a 要判断的数
     * @return 是立方数返回true，否则false
     */
    static boolean isCube(long a) {
        // 先算出a的立方根（取整）
        long cbrtA = (long) Math.cbrt(a);
        // 验证：立方根的立方是否等于a（处理取整误差，检查cbrtA、cbrtA+1、cbrtA+2）
        return (cbrtA * cbrtA * cbrtA == a)
                || ((cbrtA + 1) * (cbrtA + 1) * (cbrtA + 1) == a)
                || ((cbrtA + 2) * (cbrtA + 2) * (cbrtA + 2) == a);
    }
}