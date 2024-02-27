from django.urls import path
from .views import StandardListCreate, StandardRetrieveUpdateDestroy, StudentListCreate, StudentRetrieveUpdateDestroy, student_list

urlpatterns = [
    path('standards/', StandardListCreate.as_view(), name='standard-list-create'),
    path('standards/<int:pk>/', StandardRetrieveUpdateDestroy.as_view(), name='standard-detail'),
    path('students/', StudentListCreate.as_view(), name='student-list-create'),
    path('students/<int:pk>/', StudentRetrieveUpdateDestroy.as_view(), name='student-detail'),
    path('studentsList/', student_list, name='student_list'),
]
