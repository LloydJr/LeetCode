import java.util.*;
import java.util.stream.Collectors;

// https://neetcode.io/practice

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
           }
        }
        return false;
    }
}

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        s.toLowerCase();
        t.toLowerCase();

        if(s.length() == t.length()){
            char[] charArray1 = s.toCharArray();
            char[] charArray2 = t.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if(result){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}

class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}

class ValidPalindrome {

    /*
    * TODO Remove white space and special characters
    *      What to do:
    *       -make new string
    *       -check if its alpha numerical
    *       -include it and add it to the new string
    *       -convert it to lowercase
    *       -if equal, then true, else false
    * */
    public boolean isPalindrome(String s) {
        int i = 0; int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i); Character end = s.charAt(j);

            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class MergeTwoSortedList {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummyNode = new ListNode();
//        ListNode tail = dummyNode;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                tail.next = list1;
//                list1 = list1.next;
//            } else {
//                tail.next = list2;
//                list2 = list2.next;
//                tail = tail.next;
//
//            }
//            tail = tail.next;
//        }
//        tail.next = list1 != null ? list1 : list2;
//        return tail.next;
//    }
//}

// if (list1 == null) return list2;
//         if (list2 == null) return list1;
//
//         if (list1.val < list2.val) {
//        list1.next = mergeTwoLists(list1.next, list2);
//        return list1;
//        } else {
//        list2.next = mergeTwoLists(list2.next, list1);
//        return list2;
//        }
//        }


class Result {

    /*
     * Complete the 'isPangram' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY pangram as parameter.
     */

    public static String isPangram(List<String> pangram) {
        String alpha = "abcdefghijklmnopqrstuvqxyz";
        for (int i = 0; i < pangram.size(); i++) {
            List<String> panList = pangram.stream().map(String::toLowerCase).collect(Collectors.toList());
            String str = panList.get(i).toLowerCase();
            String newStr = str.replace(" ", "");
            if (newStr.contains(alpha)) {
                return "1";
            } else {
                return "0";
            }

        }
        return "1";
//
//        for(int i = 0; i < pangram.size(); i++){
//            String alpha = "abcdefghijklmnopqrstuvqxyz";
//            pangram.get(i);
//            if(pangram.contains(alpha)){
//                return "1";
//            }
//            else{
//                return "0";
//            }
//        }
//        return null;
    }

    public static int findMinimumDays(List<Float> durations) {
        Collections.sort( durations);
        int days = 0;
        int beginning = 0;
        int end = durations.size() - 1;
        while (beginning < end && durations.iterator().hasNext()) {
            for (int i = 0; i < durations.size(); i++) {
                if (durations.get(i) + durations.get(i + 1) <= 3.0) {
                    days++;
                }
                for (int j = i + 1; j < durations.size(); j++) {
                    if (durations.get(i) + durations.get(j + 1) <= 3.0) {
                        days++;
                    }
                }
            }
        }
        return days;
    }
}

class BinarySearch {
    public int search(int[] nums, int target) {
        int index=-1;
        int begin=0, end=nums.length-1, middle=(end+begin)/2;
        while(begin<=end){
            if (nums[middle]==target) return middle;
            if (nums[middle]>target){
                end=middle-1; middle=(end+begin)/2;
            }
            if (nums[middle]<target){
                begin=middle+1; middle=(end+begin)/2;
            }
        }
        return index;
    }
}
//Fastest Solution 0ms

//class ReversedLinkedList {
//
//    public ListNode reverseList(ListNode head) {
//        return rev(head, null);
//    }
//
//    public ListNode rev(ListNode node, ListNode pre) {
//        if (node == null) return pre;
//        ListNode temp = node.next;
//        node.next = pre;
//        return rev(temp, node);
//    }
//}
//class InvertTreeBinary {
//
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//        TreeNode node = new TreeNode(root.val);
//        node.right = invertTree(root.left);
//        node.val = root.val;
//        node.left = invertTree(root.right);
//        return node;
//    }
//}
class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
class SingleNumbers {

    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) ans ^= nums[i];
        return ans;
    }
}


public class NumberOf1Bit {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}

class CountingBits {

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = count(i);
        }
        return ans;
    }

    private int count(int x) {
        int count = 0;
        while (x != 0) {
            x &= x - 1;
            count++;
        }
        return count;
    }
}
class HappyNumbers {

    public boolean isHappy(int n) {
        if (n == 1 || n == -1) {
            return true;
        }

        Set<Integer> visit = new HashSet<Integer>();

        while (!visit.contains(n)) {
            visit.add(n);

            n = sumOfSquare(n);

            if (n == 1) return true;
        }

        return false;
    }

    public int sumOfSquare(int n) {
        int output = 0;

        while (n != 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n = n / 10;
        }

        return output;
    }
}
class TwoSumIIinputArraySorted {

    public int[] twoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;
        int num_a, num_b;

        while (a_pointer < b_pointer) {
            num_a = numbers[a_pointer];
            num_b = numbers[b_pointer];

            if (num_a + num_b == target) break;

            if (num_a + num_b < target) {
                a_pointer++;
                continue;
            }

            b_pointer--;
        }

        return new int[] { a_pointer + 1, b_pointer + 1 };
    }
}

public class ReversingBits {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
    }
}

class MissingNumbers {

    public int missingNumber(int[] nums) {
        int sum = 0;
        int total = nums.length * (nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return total - sum;
    }
}

class KthLargest {

    final PriorityQueue<Integer> heap = new PriorityQueue<>();
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int n : nums) add(n);
    }

    public int add(int val) {
        if (heap.size() < k) heap.offer(val); //for adding the values of the array
        else if (val > heap.peek()) {
            heap.poll(); //remove the top element
            heap.add(val); //add the new element
        }
        return heap.peek();
    }
}





















