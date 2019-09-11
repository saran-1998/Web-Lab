def reverse_list(a):
    b = list()
    for i in range(0,len(a)):
        b.append(a[len(a)-i-1])
    return b

a = [1,2,3,4,5]
b = reverse_list(a)
print(b)