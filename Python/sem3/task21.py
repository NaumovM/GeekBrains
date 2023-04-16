# 21'. Напишите программу для печати всех уникальных значений в словаре.
# [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, 
#  {"VII": " S005 "}, {" V ":" S009 "}, {" VIII ":" S007 "}]

d = [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, 
     {"VII": "S005"}, {" V ":"S009"}, {" VIII ":"S007"}]
new_set = set()
for i in d:
    for k in i.values():
        new_set.add(k)
print(new_set)

print(set((list(k.values())[0]) for k in d))