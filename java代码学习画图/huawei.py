chang = int(input())
arra = list()
while True:
    try:
        arr = input().strip().split(',')
        arra.append(arr)
    except EOFError:
        break
end = 0
chance = False
recon = list()
while not chance:
    chance = True
    for arr in arra:
        if end <len(arr):
            chance = False
        recon.extend(arr[end:end+chang])
    end += chang

print(','.join(recon))
