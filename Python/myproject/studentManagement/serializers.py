from rest_framework import serializers
from .models import Standard, Student

class StandardSerializer(serializers.ModelSerializer):
    class Meta:
        model = Standard
        fields = ['id', 'standard_name', 'created_at', 'updated_at']

class StudentSerializer(serializers.ModelSerializer):
    class Meta:
        model = Student
        fields = ['id', 'name', 'rollno', 'standard', 'course', 'created_at', 'updated_at']
