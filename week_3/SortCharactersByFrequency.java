public class SortCharactersByFrequency {
    //Map and Heap
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue(new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> a, Map.Entry<Character,Integer> b){
                return b.getValue() - a.getValue();
            }
        });

        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry e = pq.poll();

            for(int i=0;i<(int)e.getValue();i++)
                sb.append(e.getKey());
        }
        return sb.toString();
    }

    //Frequency Array
    public String FrequencySortt(String s){
        if(s.length()==0)
            return s;

        int[] count = new int[128];
        char[] cArr = s.toCharArray();

        for(int i=0;i<cArr.length;i++)
            count[i]++;

        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int max = 0;
            int index = 0;
            for(int j=0;j<128;j++){
                if(count[j] > max){
                    max = count[j];
                    index = j;
                }
            }
            while(count[index] > 0){
                str.append((char)index);
                count[index]--;
            }
        }
        return str.toString();
    }
}
