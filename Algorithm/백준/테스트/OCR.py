import random
import turtle

imagelist = ["1.gif",
             "2.gif",
             "3.gif",
             "4.gif",
             "5.gif",
             "6.gif"]
game = 0
win = 0
lose = 0
draw = 0
while True:
    Me = random.randrange(0, 5)
    Com = random.randrange(0, 5)
    window = turtle.Screen()
    window.addshape(imagelist[Me])
    window.addshape(imagelist[Com])
    turtle1 = turtle.Turtle()
    turtle2 = turtle.Turtle()
    turtle1.shape(imagelist[Me])
    turtle1.penup()
    turtle1.speed(0)
    turtle1.goto(0, 0)
    turtle2.shape(imagelist[Com])
    turtle2.penup()
    turtle2.speed(0)
    turtle2.goto(300, 0)

    if Me > Com:
        win += 1
    elif Me < Com:
        lose += 1
    # else:
    #     draw += 1
    # 비기는 경우는 계산하지 않음?

    a = input()
    if a == 'r':
        turtle.clear()
    elif a == 'q' or a == 'Q':
        print("총 전적", win, "승", lose, "패")
        break
