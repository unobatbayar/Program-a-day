"""
@author unobatbayar
@program 4
@date 06-10-2018 

"""
class Student:
  def __init__(self, name, age, sex, course, studentId, nationality, relationshipStatus): #using the builtin __init__ function we can assign values to objects etc!
    self.name = name
    self.age = age
    self.sex = sex
    self.course = course
    self.studentId = studentId
    self.nationality = nationality 
    self.relationshipStatus = relationshipStatus


s1 = Student("Lisa", 19, "Female", "English", "190338261", "American", "Single")
s2 = Student("Joseph", 20, "Male", "Computer Science", "000000000", "Unknown", "Unknown")
s3 = Student("Max", 18, "Male", "Biology", "123820293", "Japanese", "Single" )


print(s1.name)
print(s2.course)
print(s3.studentId)