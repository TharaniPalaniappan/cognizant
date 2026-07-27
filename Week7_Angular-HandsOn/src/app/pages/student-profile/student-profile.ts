import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-student-profile',
  imports: [FormsModule, CommonModule],
  templateUrl: './student-profile.html',
  styleUrl: './student-profile.css',
})
export class StudentProfile {
  studentName: string = '';
  studentEmail: string = '';
  selectedCourse: string = '';

  submitted = false;

  onSubmit(form: NgForm) {
    this.submitted = true;
    if (form.valid) {
      console.log('Form submitted:', form.value);
      alert(`Enrolled ${this.studentName} in ${this.selectedCourse}!`);
      form.resetForm();
      this.submitted = false;
    }
  }
}
