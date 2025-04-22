        int arr[]=new int[a.length+b.length];
        int m=0;
        int i=0;
        int j=0;
        if(k<=0 || k>a.length+b.length)
        {
            return -1;
        }
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                arr[m++]=a[i];
                i++;
            }
            else if(a[i]>b[j])
            {
                arr[m++]=b[j];
                j++;
            }
        }
        while(i<a.length)
        {
            arr[m++]=a[i++];
        }
         while(j<b.length)
        {
            arr[m++]=b[j++];
        }
        return arr[k-1];
