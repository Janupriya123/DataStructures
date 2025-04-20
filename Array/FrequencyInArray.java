 HashMap<Integer,Integer>ans=new HashMap<>();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
        }
        for(int i=1;i<=arr.length;i++)
        {
             if(ans.containsKey(i))
             {
                 a.add(ans.get(i));
             }
             else
             {
                 a.add(0);
             }
        }
        return a;
