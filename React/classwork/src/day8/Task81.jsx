import React,{useEffect,useState,useReducer} from 'react'

const Task81 = () => {
    const redu = (r, action) => {
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
    }
    const [r, setRed] = useReducer(redu, { c: 0 });
    const [show, setShow] = useState(false)
    useEffect(()=>{
        if(show){
            console.log("u use useEffect")
        }
    },[show])
  return (
    <>
        <div>
        {show && 
        <div>
            <div>{r.c}</div>
                <div>
                    <button type='button' onClick={() => setRed({ type: 'increment' })}>Increment</button>
                    <button type='button' onClick={() => setRed({ type: 'decrement' })}>Decrement</button>
                    <button type='button' onClick={() => setRed({ type: 'reset' })}>Reset</button>
            </div>
        </div>}
        {!show && <button type='button' onClick={()=> setShow(!show)}>Click</button>}
        
        </div>
    </>
  )
}

export default Task81