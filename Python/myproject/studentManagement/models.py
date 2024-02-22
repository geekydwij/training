from django.db import models

# Create your models here.
class Standard(models.Model):
    standard_name = models.CharField(max_length=50)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    def __str__(self):
        return self.standard_name

class Student(models.Model):
    name = models.CharField(max_length=100)
    rollno = models.IntegerField()
    standard = models.ForeignKey(Standard, on_delete=models.CASCADE)
    course = models.CharField(max_length=100)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    def __str__(self):
        return self.name