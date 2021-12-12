def getSum(arr, n):
    newList = []
    finalList = []
    
    for i in range(len(arr)):
        pos = i
        val = arr[i]
        remainder = n - int(val)

        if remainder in arr:
            newList.append(val)
            newList.append(remainder)

            if len(newList) == 2 and sorted(newList) not in finalList:
                finalList.append(newList)
                newList = []
        else:
            arr[pos] = val

    if not finalList:
        print("Not Found")
    else:
        for i in range(len(finalList)):
            print(finalList[i])



if __name__ == "__main__":
    arr1 = [1, 2, 3, 9]
    arr2 = [1, 2, 4, 4]
    arr3 = [1, 3, 5, 9]
    arr4 = [2, 3, 5, 6]
    getSum(arr1, 8)
    getSum(arr2, 8)
    getSum(arr3, 8)
    getSum(arr4, 8)