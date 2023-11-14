arr1=[-3,9,12,13,19,22,26]
arr2=[2,6,8,15,18,23,25,29,72]
arr=[]
i,j=0,0
for k in range(len(arr1)+len(arr2)):
    if i < len(arr1) and (j >= len(arr2) or arr1[i] < arr2[j]):
        arr.append(arr1[i])
        i += 1
    else:
        arr.append(arr2[j])
        j += 1
print(arr)
               
               
    

    
