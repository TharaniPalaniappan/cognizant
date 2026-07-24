# officespacerentalapp — Exercise 10 (JSX & Inline CSS Lab)

## What was done
- `App.js` uses JSX to:
  - Render a heading element
  - Render an `<img>` with a `src`/`alt` attribute
  - Display a single `office` object's Name, Rent, and Address
  - Loop through an `officeSpaces` array with `.map()` to render a list
  - Apply inline CSS so Rent shows **red** when below 60000 and **green**
    when 60000 or above

## Setup
1. Unzip this folder.
2. Open a terminal in the extracted `officespacerentalapp` folder.
3. `npm install`
4. `npm start` — visit `http://localhost:3000`

## Pushing to GitHub (the easy way)
No copying files one by one, no robocopy needed. Just replace the whole
repo folder's contents in one step:

1. Unzip this download.
2. Open File Explorer to your local repo folder.
3. **Delete everything inside the repo folder** (keep the folder itself,
   and keep the `.git` folder if it's hidden — turn on View → Hidden items
   to check it's still there after).
4. Select **all** files and folders inside the extracted `officespacerentalapp`
   folder (Ctrl+A), and drag/copy them into the now-empty repo folder.
5. In a terminal, inside the repo folder:
   ```
   git add .
   git commit -m "Exercise 10: officespacerentalapp - JSX and inline CSS"
   git push
   ```

This moves the entire project — `public`, `src`, `package.json`, everything —
in one drag, and `git add .` stages it all in one shot. No per-file copying.
