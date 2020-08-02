class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        i = 0
        while (i<length):
            if i<0:
                i=0
            a = nums[i]
            if (i+1)==length:
                break
            if nums[i+1]==a:
                nums.remove(a)
                length=len(nums)
                i-=1
            else:
                i+=1
        return len(nums)