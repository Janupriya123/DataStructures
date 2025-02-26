 if(s.length()%2!=0)
        {
            return -1;
        }
        int size=0;
        int open=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{')
            {
                size++;
            }
            else if(size>0)
            {
                size--;
            }
            else
            {
                open++;
            }
            
        }
        return (int)(Math.ceil(size/2.0)+Math.ceil(open/2.0));
