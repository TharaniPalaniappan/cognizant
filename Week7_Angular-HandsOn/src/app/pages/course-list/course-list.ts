import { Component } from '@angular/core';
import { CourseCard } from '../../components/course-card/course-card';
import { Highlight } from '../../directives/highlight';
import { TruncatePipe } from '../../pipes/truncate-pipe';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-course-list',
  imports: [CourseCard, Highlight, TruncatePipe, CommonModule],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css',
})
export class CourseList {
  course1 = { id: 1, name: 'Data Structures', code: 'CS101', description: 'Learn arrays, linked lists, trees, and graphs in depth.', status: 'open' };
  course2 = { id: 2, name: 'Operating Systems', code: 'CS102', description: 'Understand processes, memory management, and scheduling.', status: 'full' };
  course3 = { id: 3, name: 'Database Systems', code: 'CS103', description: 'Explore relational databases, SQL, and normalization concepts.', status: 'waitlist' };

  selectedCourseId: number | null = null;

  selectCourse(id: number) {
    this.selectedCourseId = id;
  }
}
