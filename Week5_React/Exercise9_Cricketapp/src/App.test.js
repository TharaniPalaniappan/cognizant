import { render, screen } from '@testing-library/react';
import App from './App';

test('renders Cricket App heading', () => {
  render(<App />);
  const headingElement = screen.getByText(/Cricket App/i);
  expect(headingElement).toBeInTheDocument();
});
