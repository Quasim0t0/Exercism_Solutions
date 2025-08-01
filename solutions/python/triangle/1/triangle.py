def equilateral(sides):
    if(is_triangle(sides)):
        return sides[0]==sides[1]==sides[2] and sides[0]==sides[2]
    else:
        return False

def isosceles(sides):
    if(is_triangle(sides)):
        return sides[0]==sides[1] or sides[0]==sides[2] or sides[1]==sides[2]
    else:
        return False

def scalene(sides):
    if(is_triangle(sides)):
        return sides[0]!=sides[1]!=sides[2] and sides[0]!=sides[2]
    else:
        return False

def is_triangle(sides):
    nozero = sides[0]>0 and sides[1]>0 and sides[2]>0
    first = sides[0]+sides[1]>=sides[2]
    second = sides[0]+sides[2]>=sides[1]
    third = sides[2]+sides[1]>=sides[0]
    return nozero and first and second and third