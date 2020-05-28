import React, { useState ,Component} from 'react';

import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import ApiServiceLocation from "../../service/ApiServiceLocation";

export default class AddLocation extends Component{

    constructor(props){
        super(props);
        this.state ={
            cityName:'',
            descriptions:'',
            objectivs:[],
            message: null
        }
        this.saveCaregiver = this.saveCaregiver.bind(this);
    }

    saveLocation = (e) => {
        e.preventDefault();

        let location = { cityName: this.state.cityName,descriptions: this.descriptions};

        ApiServiceLocation.addLocation(location)
            .then(res => {
                this.setState({message : 'Location added successfully.'});
                this.props.history.push('/doctors');
            });



    }
    onChange = (e) => {
        this.props.history.push(`/${e.target.value}`);
    }
    render() {
        return (
            <div>
                <div className="landing-grid">

                </div>
                <div>
                    <Typography variant="h4" style={style}>Add Caregiver</Typography>
                    <form style={formContainer}>

                        <TextField type="text" placeholder="City Name" fullWidth margin="normal" name="cityName" value={this.state.cityName} onChange={this.onChange}/>
                        <TextField type="text" placeholder="Descriptions " fullWidth margin="normal" name="descriptions" value={this.state.descriptions} onChange={this.onChange}/>

                        <Button variant="contained" color="primary" onClick={this.saveLocation}>Save</Button>
                    </form>
                </div>
            </div>
        );


    }
}
