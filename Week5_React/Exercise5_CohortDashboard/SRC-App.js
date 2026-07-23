import React from "react";
import CohortDetails from "./components/CohortDetails";

// Sample data representing the Academy's ongoing and completed cohorts
const cohorts = [
  {
    id: 1,
    name: "Full Stack Java - Batch 12",
    status: "ongoing",
    startDate: "05-Jun-2026",
    endDate: "30-Aug-2026",
    trainer: "Anita Sharma",
  },
  {
    id: 2,
    name: "ReactJS - Batch 07",
    status: "ongoing",
    startDate: "01-Jul-2026",
    endDate: "25-Sep-2026",
    trainer: "Rahul Verma",
  },
  {
    id: 3,
    name: "Python for Data Science - Batch 04",
    status: "completed",
    startDate: "10-Feb-2026",
    endDate: "15-Apr-2026",
    trainer: "Priya Nair",
  },
  {
    id: 4,
    name: ".NET Core - Batch 09",
    status: "completed",
    startDate: "20-Jan-2026",
    endDate: "10-Mar-2026",
    trainer: "Karthik Iyer",
  },
];

function App() {
  return (
    <div>
      <h1 style={{ textAlign: "center" }}>Academy Cohort Dashboard</h1>
      <div>
        {cohorts.map((cohort) => (
          <CohortDetails key={cohort.id} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;
