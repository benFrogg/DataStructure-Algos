def findAnagram(str1, str2):
    wordDict = {}

    for i in str1:
        if i in wordDict:
            wordDict[i] += 1
        else:
            wordDict[i] = 1

    for i in str2:
        if i in wordDict:
            wordDict[i] -= 1
        else:
            wordDict[i] = 1

    for i in wordDict:
        if wordDict[i] == 0:
            return True

    return False


if __name__ == "__main__":
    str1 = "Clint Eastwood"
    str2 = "Old West Action"
    str3 = "dog"
    str4 = "god"
    str5 = "aaa"
    str6 = "bbb"

    print(findAnagram(str1, str2))
    print(findAnagram(str3, str4))
    print(findAnagram(str5, str6))