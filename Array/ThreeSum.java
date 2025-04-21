 Arrays.sort(arr);
        int j=0;
        int k=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(i!=0 && arr[i]==arr[i-1])
            continue;
            j=i+1;
            k=arr.length-1;
            while(j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target)
                 {
                      System.out.print("true");
                      return;
                 }
                 else if(sum>target)
                 {
                     k--;
                 }
                 else
                 {
                     j++;
                 }
            }
        }  
           System.out.print("true");
           return;
    }
}
