import React, {Component} from 'react';
import {Grid, Cell, List, ListItem, ListItemContent} from 'react-mdl';
import profilPhoto from "../images/profilPhoto3.jpg"


class Contact extends Component {
    render() {
        return (
<div>
    <div className="landing-grid">

            </div>
                <div className="contact-body">
                    <Grid className="contact-grid">
                        <Cell col={6}>
                            <h2>Cristea Ioana</h2>
                            <img
                                src={profilPhoto}
                                alt="avatar"
                                style={{height: '250px'}}
                            />

                        </Cell>
                        <Cell col={6}>
                            <h2>Contact Me</h2>
                            <hr/>

                            <div className="contact-list">
                                <List>
                                    <ListItem>
                                        <ListItemContent style={{fontSize: '30px', fontFamily: 'Anton'}}>
                                            <i className="fa fa-phone-square" aria-hidden="true"/>
                                            (+40) 774 619 544
                                        </ListItemContent>
                                    </ListItem>

                                    <ListItem>
                                        <ListItemContent style={{fontSize: '30px', fontFamily: 'Anton'}}>
                                            <i className="fa fa-fax" aria-hidden="true"/>
                                            (+20) 868 224
                                        </ListItemContent>
                                    </ListItem>

                                    <ListItem>
                                        <ListItemContent style={{fontSize: '30px', fontFamily: 'Anton'}}>
                                            <i className="fa fa-envelope" aria-hidden="true"/>
                                            ioanac977@gmail.com
                                        </ListItemContent>
                                    </ListItem>

                                    <ListItem>
                                        <ListItemContent style={{fontSize: '30px', fontFamily: 'Anton'}}>
                                            <i className="fa fa-skype" aria-hidden="true"/>
                                            cioana9
                                        </ListItemContent>
                                    </ListItem>


                                </List>
                            </div>
                        </Cell>
                    </Grid>
                    <footer><br></br><br></br><br></br>
                        Made by <a href ="https://github.com/ioanac977/presentation-resume-template">@IoanaCristea</a>
                    </footer>
                </div>


            </div>

        );
    }
}

export default Contact;
