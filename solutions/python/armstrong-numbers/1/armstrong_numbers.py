def is_armstrong_number(number):
    number_str= str(number)
    armstrong = 0
    for i in range(len(number_str)):
        armstrong = armstrong + int(number_str[i])**len(number_str)
    if(armstrong==number):
        return True
    else:
        return False