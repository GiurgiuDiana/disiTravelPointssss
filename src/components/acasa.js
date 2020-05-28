import React, {Component} from 'react';
import "../styles/acasa.css"
import getTranslation from "../constants/getTranslation";
import {store} from "../constants/store"


class Acasa extends Component {
    render() {
        return (
<div>
            <div class="landing-grid">

            </div>


    <section id="nature-field">
        <h1> {getTranslation(
            store.getState(),
            'bunVenit/welcome',
        )}
        </h1>
        <p>
            <p1>
                {getTranslation(
                    store.getState(),
                    'descriere/describe',
                )}</p1>

        </p>
        <a href="/despre" className="btn">{getTranslation(
            store.getState(),
            'citesteMaiMulte/readMore',
        )}</a>
        <div id="nature-sky"></div>
        <div id="nature-sun"></div>
        <div id="layer1">
            <div className="nature-1 nature1"></div>

            <div className="nature-2 nature1"></div>

            <div className="nature-3 nature1"></div>

            <div className="nature-4 nature1"></div>

            <div className="nature-5 nature1"></div>

            <div className="nature-6 nature1"></div>

            <div className="nature-7 nature1"></div>

            <div className="nature-8 nature1"></div>

            <div className="nature-9 nature1"></div>

            <div className="nature-10 nature1"></div>

            <div className="nature-11 nature1"></div>

            <div className="nature-12 nature1"></div>

            <div className="nature-13 nature1"></div>

            <div className="nature-14 nature1"></div>

            <div className="nature-15 nature1"></div>

            <div className="nature-16 nature1"></div>

            <div className="nature-17 nature1"></div>

            <div className="nature-18 nature1"></div>

            <div className="nature-19 nature1"></div>

            <div className="nature-20 nature1"></div>

            <div className="nature-21 nature1"></div>

            <div className="nature-22 nature1"></div>

            <div className="nature-23 nature1"></div>

            <div className="nature-24 nature1"></div>

            <div className="nature-25 nature1"></div>

        </div>
        <div id="layer2">
            <div className="nature-1 nature2"></div>

            <div className="nature-2 nature2"></div>

            <div className="nature-3 nature2"></div>

            <div className="nature-4 nature2"></div>

            <div className="nature-5 nature2"></div>

            <div className="nature-6 nature2"></div>

            <div className="nature-7 nature2"></div>

            <div className="nature-8 nature2"></div>

            <div className="nature-9 nature2"></div>

            <div className="nature-10 nature2"></div>

            <div className="nature-11 nature2"></div>

            <div className="nature-12 nature2"></div>

            <div className="nature-13 nature2"></div>

            <div className="nature-14 nature2"></div>

            <div className="nature-15 nature2"></div>

            <div className="nature-16 nature2"></div>

            <div className="nature-17 nature2"></div>

            <div className="nature-18 nature2"></div>

            <div className="nature-19 nature2"></div>

            <div className="nature-20 nature2"></div>

            <div className="nature-21 nature2"></div>

            <div className="nature-22 nature2"></div>

            <div className="nature-23 nature2"></div>

            <div className="nature-24 nature2"></div>

            <div className="nature-25 nature2"></div>

        </div>


        <div className="nature-car-head" id="na-car-1">
            <div className="nature-car" id="na-car-bottom-1"></div>
            <div className="nature-car-win"></div>
            <div className="nature-car-win" id="na-car-win-2"></div>
        </div>
        <div className="nature-car-head" id="na-car-2">
            <div className="nature-car" id="na-car-bottom-2"></div>
            <div className="nature-car-win"></div>
            <div className="nature-car-win" id="na-car-win-2"></div>
        </div>


    </section>



</div>



        );
    }
}

export default Acasa;
