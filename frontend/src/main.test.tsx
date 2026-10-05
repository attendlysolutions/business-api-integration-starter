import { describe, expect, it } from 'vitest';

function apiBaseUrl(value: string | undefined): string {
  return value ?? 'http://localhost:8080';
}

describe('frontend configuration', () => {
  it('uses the local API when no VITE_API_URL is provided', () => {
    expect(apiBaseUrl(undefined)).toBe('http://localhost:8080');
  });

  it('preserves an explicitly configured API URL', () => {
    expect(apiBaseUrl('https://api.example.test')).toBe('https://api.example.test');
  });
});
