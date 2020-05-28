import React, {Component} from 'react';
import {CardText} from 'react-mdl';
import "../styles/despre.css"


class Despre extends Component {

    render() {
        return (

            <div>
                <div className="landing-grid">


                </div>

                <div className="text-box">

                    <h1 className="heading-primary">
                        <span className="heading-primary-main">Planning Gps</span>
                        <span className="heading-primary-sub">using</span>
                        <span className="heading-primary-main">Google APIs</span>
                    </h1>


                </div>

                <div className="container">

                    <div className="sticky-notes">
                        <form action="get" id="survey-form">

                            <fieldset className="sticky-note">
                                <legend className="tape">Obiectivul 1:</legend>
                                <fieldset>
                                    <legend>User authentication/creation:</legend>
                                    <CardText>Sign in</CardText>
                                    <CardText>Register</CardText>
                                    <CardText>CRUD Account</CardText>
                                </fieldset>
                            </fieldset>

                            <fieldset className="sticky-note">
                                <legend className="tape">Obiectivul 2:</legend>
                                <fieldset>
                                    <legend>Choose the interest area:</legend>
                                    <br>
                                    </br>
                                    <select name="location" id="dropdown">
                                        <optgroup label="Africa">
                                            <option value="">Algeria</option>
                                            <option value="">Botswana</option>
                                            <option value="">Madagascar</option>
                                            <option value="">Uganda</option>
                                        </optgroup>
                                        <optgroup label="Asia">
                                            <option value="">Afghanistan</option>
                                            <option value="">India</option>
                                            <option value="">Pakistan</option>
                                            <option value="">Russia</option>
                                        </optgroup>
                                        <optgroup label="Europe">
                                            <option value="">Albania</option>
                                            <option value="">Croatia</option>
                                            <option value="">Georgia</option>
                                            <option value="">Romania</option>
                                        </optgroup>
                                        <optgroup label="South America">
                                            <option value="">Argentina</option>
                                            <option value="">Brazil</option>
                                            <option value="">Chile</option>
                                            <option value="">Venezuela</option>
                                        </optgroup>
                                    </select>
                                </fieldset>
                            </fieldset>

                            <fieldset className="sticky-note">
                                <legend className="tape">Obiectivul 3:</legend>
                                <fieldset>
                                    <legend> Create a plan:</legend>
                                    <CardText>Select a week</CardText>
                                    <CardText> Add pins on locations</CardText>
                                    <CardText> CRUD cell activity</CardText>
                                </fieldset>
                            </fieldset>

                            <fieldset className="sticky-note">
                                <legend className="tape">Obiectivul 4:</legend>
                                <fieldset>
                                    <legend> Plan management:</legend>
                                    <CardText>View plans</CardText>
                                    <CardText> View activity charts</CardText>
                                    <CardText> Smart routes</CardText>
                                </fieldset>
                            </fieldset>

                            <fieldset className="sticky-note">
                                <legend className="tape">Obiectivul 5:</legend>
                                <fieldset>
                                    <legend>Interface and app marketing:</legend>
                                    <CardText>Choose interface theme</CardText>
                                    <CardText> Rating the application </CardText>
                                    <CardText> View latest rates</CardText>
                                </fieldset>
                            </fieldset>

                            <fieldset className="sticky-note">
                                <legend className="tape">Obiectivul 6:</legend>
                                <fieldset>
                                    <legend>Security:</legend>
                                    <CardText>Encrypted password</CardText>
                                    <CardText> Routes security </CardText>
                                    <CardText> Cookie session</CardText>
                                </fieldset>
                            </fieldset>

                            <fieldset className="sticky-note">
                                <legend className="tape">Obiectivul 7:</legend>
                                <fieldset>
                                    <legend>Usability:</legend>
                                    <CardText>Friendly interface</CardText>
                                    <CardText> Guest session </CardText>
                                    <CardText> Demo </CardText>
                                </fieldset>
                            </fieldset>

                        </form>

                    </div>
                    <footer>
                        Made by <a href ="https://github.com/ioanac977/presentation-resume-template">@IoanaCristea</a>
                    </footer>

                </div>


            </div>


        )
    }
}

export default Despre;
