          List<List<Integer>>ans=new ArrayList<>();
          Arrays.sort(nums);
          int l=0;
          int r=0;
          for(int i=0;i<nums.length-3;i++)
          {
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j!=i+1 && nums[j]==nums[j-1])
                continue;
                l=j+1;
                r=nums.length-1;
                while(l<r)
                {
                   long sum = (long) nums[i] + (long) nums[j] + (long) nums[l] + (long) nums[r];

                    if(sum==target)
                    {
                        ans.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                    
                    while(l<r && nums[l]==nums[l+1])
                    {
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1])
                    {
                        r--;
                    }
                    l++;
                    r--;
                    }
                    if(sum>target)
                    {
                        r--;
                    }
                    else if(sum<target)
                    {
                        l++;
                    }

                }

            }
          }
          return ans;
        
