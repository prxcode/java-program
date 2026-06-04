## LEETCODE [DSA]

## EASY PROBLEMS
### 1. Remove Element 
```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
```

### 2. Single Number
```java
class Solution {
    public int singleNumber(int[] nums) {
      int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;  
    }
}
```

### 3. Find Numbers with Even Number of Digits
```java
class Solution {
    public int findNumbers(int[] nums) {
         int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = String.valueOf(nums[i]).length();

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
```

### 4. Maximum Number of Words Found in Sentences
```java
class Solution {
    public int mostWordsFound(String[] sentences) {
       int maxWords = 0;
        for (String sentence : sentences) {
            int words = sentence.split(" ").length;
            maxWords = Math.max(maxWords, words);
        }
        return maxWords; 
    }
}
```
