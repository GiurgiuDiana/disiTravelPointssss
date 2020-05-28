import React, {Component} from 'react';
import './App.css';
import {Layout, Header, Navigation, Drawer, Content} from 'react-mdl';
import Main from './components/main';
import {Link} from 'react-router-dom';
import getTranslation from "./constants/getTranslation";
import {store} from "./constants/store";
import {LanguageSelector} from "./constants/LanguageSelector";
import profilPhoto from "./images/profilPhoto3.jpg";
import email from "../src/components/emailComponent/AddEmailComponent"

class App extends Component {

    componentDidMount() {
        store.subscribe(() => this.forceUpdate());
    }

    render() {
        return (
            <div className="demo-big-content">
                <Layout>

                    <Header className="header-color"
                            title={<Link style={{textDecoration: 'none', color: 'white'}} to="/">Travel Points
                                </Link>} scroll>

                        {/*<LanguageSelector/>*/}

                        <Navigation>
                            <Link to="/location-view">
                                <p1>
                                    Home
                                   </p1>
                            </Link>
                            <Link to="/wishlist-items">
                                <p1>
                                    Wishlist
                                    </p1>
                            </Link>
                            <Link to="/despre">
                                <p1>
                                    Reports
                                </p1>
                            </Link>
                            <Link to="/email">
                                <p1>
                                Contact
                                </p1>
                            </Link>
                            <Link to="/login">
                                <p1>
                                    Login</p1>
                            </Link>
                            <Link to="/logout">
                                <p1>
                                    Logout</p1>
                            </Link>


                        </Navigation>

                    </Header>

                    <Drawer title={<Link style={{textDecoration: 'none', color: 'black'}} to="/">

                        Travel Points
                    </Link>}>

                        <Navigation>
                            <Link to="/location-view">
                                {getTranslation(
                                    store.getState(),
                                    'acasa/home',
                                )}</Link>
                            <Link to="/noutati">
                                {getTranslation(
                                    store.getState(),
                                    'noutati/news',
                                )}</Link>
                            <Link to="/despre">
                                {getTranslation(
                                    store.getState(),
                                    'despre/about',
                                )}</Link>
                            <Link to="/email">
                                {getTranslation(
                                    store.getState(),
                                    'email',
                                )}</Link>
                            <Link to="/coordonator">
                                {getTranslation(
                                    store.getState(),
                                    'coordonator/coordinator',
                                )}</Link>
                            <Link to="/contact">
                                {getTranslation(
                                    store.getState(),
                                    'contact/contact',
                                )}</Link>

                        </Navigation>

                    </Drawer>


                    <Content>

                        <div className="page-content"/>

                        <Main
                        />

                    </Content>

                </Layout>


            </div>

        );
    }
}

export default App;
