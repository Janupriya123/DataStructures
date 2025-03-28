int c=0;
int s=0;
int i=0;
int j=0;
int max=Integer.MIN_VALUE;
while(j<arr.length)
{
    s+=arr[j];
    c++;
    if(c==k)
    {
      max=Math.max(s,max);
      s-=arr[i];
      i++;
      c--;
      }
      j++;
    }
   System.out.println(max);
}
}
