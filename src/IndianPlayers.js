import React from 'react';

// Odd and Even team players extracted using ES6 array destructuring
const teamPlayers = [
    'Virat Kohli',
    'Rohit Sharma',
    'KL Rahul',
    'Rishabh Pant',
    'Hardik Pandya',
    'Ravindra Jadeja'
];
const [oddTeamPlayer1, evenTeamPlayer1, oddTeamPlayer2, evenTeamPlayer2, oddTeamPlayer3, evenTeamPlayer3] = teamPlayers;

const oddTeamPlayers = [oddTeamPlayer1, oddTeamPlayer2, oddTeamPlayer3];
const evenTeamPlayers = [evenTeamPlayer1, evenTeamPlayer2, evenTeamPlayer3];

// T20 and Ranji Trophy player arrays merged using the ES6 spread operator
const T20players = ['Jasprit Bumrah', 'Suryakumar Yadav', 'Shubman Gill'];
const RanjiTrophyPlayers = ['Mayank Agarwal', 'Sarfaraz Khan', 'Prithvi Shaw'];
const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

function IndianPlayers() {
    return (
        <div>
            <h2>Odd Team Players</h2>
            <ul>
                {oddTeamPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h2>Even Team Players</h2>
            <ul>
                {evenTeamPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h2>T20 &amp; Ranji Trophy Players (Merged)</h2>
            <ul>
                {mergedPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>
        </div>
    );
}

export default IndianPlayers;
