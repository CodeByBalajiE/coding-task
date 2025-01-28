"""2.You have two numbers, and your challenge is to write a program that performs both addition and subtraction with them. 
However, if any subtraction results in a negative number, display it as a positive value. How will you tackle this and 
show the final results?For example, consider two numbers 20 and 15. Addition of 2 values: 20 + 15 = 35.Subtraction of 
2 values: 20 - 15 = 5. For example, consider two numbers 20 and -150. Addition of 2 values: 20 + (-150) = -130 Absolute
value of (-130) = 130.Subtraction of 2 values: 20 - (-150) = 170."""


#day1 coding task program 1
#add and sub of two num 
a=int(input("enter the first num")) #first num
b=int(input("enter the second num")) #second num
c=input("enter the operation") #operation
if c=="+": #addition
        result=a+b
        print(result)
elif c=="-": #subtraction
        result=a-b
        if result<0: #check if the result is negative 
            print(result*-1) #make it as positive
        else:
            print(result)
        
