import React, { useReducer } from 'react'

const redu = (r, action) => {
    // console.log(action);
    // console.log(r);
    switch (action.type) {
        case 'increment':
            var val = { c: r.c + 1 }
            console.log(r);
            return val;
            break;
        case 'decrement':
            var val2 = { c: r.c - 1 }
            console.log(r);
            return val2;
            break;
        case 'reset':
            return { c: 0 };
            break;
        default:
            console.log('Give Correct Value');
            break;
    }
    // console.log("hello",r);
}
export default function Reducer() {
    const [r, setRed] = useReducer(redu, { c: 0 });
    // console.log(r);
    // console.log(setRed);
    // console.log(redu);

    return (
        <>
            <div>
                <div>{r.c}</div>
                <div>
                    <button type='button' onClick={() => setRed({ type: 'increment' })}>Increment</button>
                    <button type='button' onClick={() => setRed({ type: 'decrement' })}>Decrement</button>
                    <button type='button' onClick={() => setRed({ type: 'reset' })}>Reset</button>
                </div>
            </div>
        </>
    )
}
