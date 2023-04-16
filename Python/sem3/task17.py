# 17'. Дан список чисел. Определите, сколько в нем встречается различных чисел.

nums = [1, 2, 3, 4, 1, 2]
print(set(nums))
uniq_nums = [i for i in nums if nums.count(i) == 1]
print(uniq_nums)