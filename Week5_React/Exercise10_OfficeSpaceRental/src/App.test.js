import { render, screen } from '@testing-library/react';
import App from './App';

test('renders Office Space Rental heading', () => {
  render(<App />);
  const headingElement = screen.getByText(/Office Space Rental/i);
  expect(headingElement).toBeInTheDocument();
});
