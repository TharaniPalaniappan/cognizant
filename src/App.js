import React from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
    const flag = true; // set to false to display IndianPlayers instead

    let content;
    if (flag) {
        content = <ListofPlayers />;
    } else {
        content = <IndianPlayers />;
    }

    return (
        <div>
            <h1>Cricket App</h1>
            {content}
        </div>
    );
}

export default App;
