import {useEffect, useState} from "react";

function Maintain() {
    const [products,setProducts] = useState([]); //Reacti erikood ->
    //muutuja(HTMLi), funktsioon (HTMLi muutmine),allväärtus(tühi massiiv)
    useEffect(() => {
        fetch("http://localhost:8000/products")
            .then(responce => responce.json())
            .then(body => setProducts(body));
    },[]); //use Effect ---> Reakti erikood

    function deleteProduct(productId) {
        fetch("http://localhost:8080/products/" + productId, {
            method: "DELETE"
        }).then(responce => responce.json())
            .then(body => setProducts(body));

        // const index = products.findIndex(element => element.id === productId)
        // products.splice(index,1)

        // setProducts(products.slice());
    }

return (
    products.map( element =>
        <div>
            <img scr = {element.imgSrc} alt=""/>
            <div>{element.name}</div>
            <div>{element.price}</div>
            <div>{element.id}</div>
            <div>{element.active}</div>
            <div>{element.description}</div>
            <button onClick = {() => deleteProduct(element.id)}>x</button>
        </div>)
)

}

export default Maintain;