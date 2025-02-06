Method 1 : Using Moore's Voting Algorithm

 import java.util.Scanner;
 class Main
 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
     if (k <= 1) // Invalid k
       System.out.println("Invalid ,No element Appear more than n/k times");
       return; 

         
     HashMap<Integer, Integer> candidates = new HashMap<>();

      for (int num : arr) {
      if (candidates.containsKey(num)) // if current element present in HashMap,increase its count
      {
        candidates.put(num, candidates.get(num) + 1);
       } 
      else if (candidates.size() < k - 1)  // if hashmap is having space , add current element
      {
          candidates.put(num, 1);
      } 
      else { // if hashmap is not having space, decrease the count of the element
              Iterator<Map.Entry<Integer, Integer>> it = candidates.entrySet().iterator(); // iterator for iterating the hashmap elements
              while (it.hasNext()) {
              Map.Entry<Integer, Integer> entry = it.next();
              entry.setValue(entry.getValue() - 1);
              if (entry.getValue() == 0) {
               it.remove(); // Remove elements with zero count
                }
          }
            }
        }

        
        HashMap<Integer, Integer> actualCounts = new HashMap<>(); // create another hashmap for counting the actualvalues
        for (int num : arr) {
            if (candidates.containsKey(num))  // if current element is present in the candidates hashmap,then insert the element into new hashmap
            {
                actualCounts.put(num, actualCounts.getOrDefault(num, 0) + 1); // increment the count
            }
        }

         for (Map.Entry<Integer, Integer> entry : actualCounts.entrySet()) {
            if (entry.getValue() > n / k) {
                System.out.print(entry.getKey() + " ");
            }
        }
    sc.close();
    
  }
 }
