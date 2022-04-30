import {useRef} from "react";

function Add() {
    const nameRef = useRef();
    const priceRef = useRef();
    //<input id = "prouctName" type = "text"/>
    //document.getElementById("")


    function addProduct() {
        fetch("http://localhost:8080/products", {
            method: "POST",
            body: JSON.stringify({
                name: nameRef.current.value,
                price: priceRef.current.value
            }),
            headers: {
                "Content-Type": "application/json"
            }
        });
    }
    return (<div>
        <label htmlFor="">NIMI</label>
        <input ref={nameRef} type="text" />
        <label htmlFor="">HIND</label>
        <input ref={priceRef} type="price" />
        <button onClick={() => addProduct()}>Lisa</button>
    </div>)
}

export default Add;