import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup, FormArray, Validators, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-feedback',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './feedback.html',
  styleUrl: './feedback.css',
})
export class Feedback {
  feedbackForm: FormGroup;
  submitted = false;

  constructor(private fb: FormBuilder) {
    this.feedbackForm = this.fb.group({
      studentName: ['', [Validators.required, Validators.minLength(3)]],
      courseCode: ['', Validators.required],
      rating: ['', Validators.required],
      comments: this.fb.array([this.createComment()]),
    });
  }

  createComment() {
    return this.fb.control('', Validators.required);
  }

  get comments() {
    return this.feedbackForm.get('comments') as FormArray;
  }

  addComment() {
    this.comments.push(this.createComment());
  }

  removeComment(index: number) {
    if (this.comments.length > 1) {
      this.comments.removeAt(index);
    }
  }

  onSubmit() {
    this.submitted = true;
    if (this.feedbackForm.valid) {
      console.log('Feedback submitted:', this.feedbackForm.value);
      alert(`Thanks ${this.feedbackForm.value.studentName}! Feedback for ${this.feedbackForm.value.courseCode} recorded.`);
      this.feedbackForm.reset();
      this.comments.clear();
      this.comments.push(this.createComment());
      this.submitted = false;
    }
  }
}
