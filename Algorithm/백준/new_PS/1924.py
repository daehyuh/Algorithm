mon, day = map(int, input().split(' '))
days = 0
days += day
daylist = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

for i in range(mon-1):
    days += daylist[i]
days = days % 7
if days == 1:
    print('MON')
elif days == 2:
    print('TUE')
elif days == 3:
    print('WED')
elif days == 4:
    print('THU')
elif days == 5:
    print('FRI')
elif days == 6:
    print('SAT')
elif days == 0:
    print('SUN')

# 32 == MON
# 33 == TUE
# 34 == WED
# 35 == THU
# 36 == FRI
# 37 == SAT
# 38 == SUN
