# views.py
from rest_framework import generics
from .models import Standard, Student
from .serializers import StandardSerializer, StudentSerializer
from django.shortcuts import render
from django.core.paginator import Paginator

class StandardListCreate(generics.ListCreateAPIView):
    queryset = Standard.objects.all()
    serializer_class = StandardSerializer

class StandardRetrieveUpdateDestroy(generics.RetrieveUpdateDestroyAPIView):
    queryset = Standard.objects.all()
    serializer_class = StandardSerializer

class StudentListCreate(generics.ListCreateAPIView):
    queryset = Student.objects.all()
    serializer_class = StudentSerializer

class StudentRetrieveUpdateDestroy(generics.RetrieveUpdateDestroyAPIView):
    queryset = Student.objects.all()
    serializer_class = StudentSerializer
def student_list(request):
    all_students = Student.objects.all()

    paginator = Paginator(all_students, 10)
    page_number = request.GET.get('page')
    students = paginator.get_page(page_number)

    return render(request, 'students_list.html', {'students': students})
