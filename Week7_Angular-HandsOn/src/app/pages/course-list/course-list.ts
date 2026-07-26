import { Component } from '@angular/core';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  imports: [CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css',
})
export class CourseList {
  course1 = { id: 1, name: 'Data Structures', code: 'CS101' };
  course2 = { id: 2, name: 'Operating Systems', code: 'CS102' };
  course3 = { id: 3, name: 'Database Systems', code: 'CS103' };
}
