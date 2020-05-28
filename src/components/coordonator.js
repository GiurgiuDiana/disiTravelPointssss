import React, {Component} from 'react';
import {Cell, Grid} from "react-mdl";
import profilPhoto from "../images/profilPhoto7.jpg";


class Coordonator extends Component {
    render() {
        return (
            <div style={{width: '100%', margin: 'auto'}}>
                <Grid className="landing-grid">
                    <Cell col={12}>
                        <img

                            src={profilPhoto}
                            alt="profilPhoto"
                            className="avatar-img"
                        />

                        <div className="banner-text">
                            <h1>Senior Lecturer Engineer
                            </h1>
                            <h1>Cosmina Ivan</h1>


                            <p>Computer Networks and Internet Technologies | Distributed Systems | High Performance
                                Computing | Advanced Architectures for Parallel Computer </p>


                        </div>
                    </Cell>

                    <footer><br></br>
                        Made by <a href ="https://github.com/ioanac977/presentation-resume-template">@IoanaCristea</a>
                    </footer>
                </Grid>

            </div>
        )
    }
}

export default Coordonator;
