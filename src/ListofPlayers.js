import React from 'react';

const players = [
    { name: 'Virat Kohli', score: 82 },
    { name: 'Rohit Sharma', score: 45 },
    { name: 'KL Rahul', score: 91 },
    { name: 'Rishabh Pant', score: 38 },
    { name: 'Hardik Pandya', score: 67 },
    { name: 'Ravindra Jadeja', score: 55 },
    { name: 'Jasprit Bumrah', score: 12 },
    { name: 'Mohammed Shami', score: 8 },
    { name: 'Yuzvendra Chahal', score: 5 },
    { name: 'Shikhar Dhawan', score: 74 },
    { name: 'Suryakumar Yadav', score: 60 }
];

function ListofPlayers() {
    // Filter players with scores below 70 using an ES6 arrow function
    const lowScorers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>

            <h2>Players with Score Below 70</h2>
            <ul>
                {lowScorers.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListofPlayers;
