# cricketapp — Exercise 9 (ES6 Features Lab)

## Components

### ListofPlayers.js
- An array of 11 players (name + score).
- `players.map()` renders the full list.
- `players.filter(player => player.score < 70)` (ES6 arrow function) renders
  a second list of players scoring below 70.

### IndianPlayers.js
- **Destructuring:** a `teamPlayers` array is destructured into odd-position
  and even-position players, which are then displayed as "Odd Team Players"
  and "Even Team Players".
- **Merging:** `T20players` and `RanjiTrophyPlayers` arrays are combined
  with the ES6 spread operator (`[...T20players, ...RanjiTrophyPlayers]`)
  and rendered as a single merged list.

### App.js
- A `flag` boolean controls which component is shown, via a simple
  `if...else`. Set `flag = true` to show `ListofPlayers`, or `flag = false`
  to show `IndianPlayers`.

> Note: the lab document's reference images specify the general
> pattern (map/filter/destructure/merge) but not the exact player
> names — sample data was used to match the required structure and
> methods. Feel free to swap in the exact names/scores from your
> lab material if they differ.

## Setup
1. Unzip this folder.
2. Open a terminal in the project folder.
3. Install dependencies:
   ```
   npm install
   ```
4. Run the app:
   ```
   npm start
   ```
5. Visit `http://localhost:3000`. Toggle the `flag` value in `App.js` and
   save to see the other component render.

## Submitting
```
git init                     # if not already a git repo
git add .
git commit -m "Exercise 9: ES6 features - map, filter, destructuring, merge"
git remote add origin <your-repo-url>
git push -u origin main
```
