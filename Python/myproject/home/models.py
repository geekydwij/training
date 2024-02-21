from django.db import models

# Create your models here.
class Car(models.Model):
    year = models.IntegerField()
    color = models.CharField(max_length=20)
    manufacturer = models.CharField(max_length=20)
    model = models.CharField(max_length=20)
    sold = models.BooleanField(default=False)
    price = models.DecimalField(max_digits=10, decimal_places=2)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    def __str__(self):
        return f"{self.color} {self.year} {self.manufacturer} {self.model}"