public class FindTheTownJudge {
       public int findJudge(int N, int[][] trust) {
            int[] trustedBy = new int[N+1];

            for(int i=0;i<trust.length;i++){
                trustedBy[trust[i][1]]++;
            }

            int judge = 0;

            for(int i=1;i<=N;i++)
                if(trustedBy[i]==(N-1))
                    judge = i;

            if(judge==0)
                return -1;

            for(int i=0;i<trust.length;i++)
                if(trust[i][0]==judge)
                    return -1;

            return judge;
        }
    }
