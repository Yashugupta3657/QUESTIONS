 public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        ArrayList<Long> mt=new ArrayList<Long>();
        for(int i=0;i<=n-m;i++){
            mt.add(a.get(i+(int)m-1)-a.get(i));
        }
        Collections.sort(mt);
        return mt.get(0);
    }
