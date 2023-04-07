# 5. Вагоны в электричке пронумерованы натуральными числами,
# начиная с 1 (при этом иногда вагоны нумеруются от «головы» поезда,
# а иногда – с «хвоста»; это зависит от того, в какую сторону едет электричка).
# В каждом вагоне написан его номер.
# Витя сел в i-й вагон от головы поезда и обнаружил,
# что его вагон имеет номер j. Он хочет определить,
# сколько всего вагонов в электричке.
# Напишите программу, которая будет это делать или сообщать,
# что без дополнительной информации это сделать невозможно.

# Input:
# 3
# 4
# Output:
# 6

i = int(input())
j = int(input())
if i != j:
    print(i+j-1)
else:
    print('без дополнительной информации это сделать невозможно.')



#     Here is a Python program that determines the total number of wagons on the train based on Vitya's input:

# def find_total_wagons(i, j):
#     if i > j:
#         return "Insufficient information to determine the number of wagons."
    
#     total_wagons_head = i + j - 1
#     return total_wagons_head

# # Get input values for i and j
# i = int(input("Enter the i-th car position from the head of the train: "))
# j = int(input("Enter the j-th car number: "))

# # Find the total wagons on the train and print the result
# result = find_total_wagons(i, j)
# print("Total number of wagons:", result)
# Just copy the code above and paste it in your Python environment (e.g., IDLE, Jupyter Notebook, etc.) to run the program.

# Input example:

# Enter the i-th car position from the head of the train: 3 Enter the j-th car number: 4

# Output:

# Total number of wagons: 6
