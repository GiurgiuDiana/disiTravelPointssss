import React, { Component } from 'react'
import ApiServiceEmail from "../../service/ApiServiceEmail";
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';

class AddEmailComponent extends Component{

    constructor(props){
        super(props);
        this.state ={
            subject: '',
            messages: '',
            tourist_id: '',
            message: null
        }
        this.saveEmail = this.saveEmail.bind(this);
    }


    saveEmail = (e) => {
        e.preventDefault();
        let email = {subject: this.state.subject, message: this.state.messages, touristId: '1'};

        ApiServiceEmail.addEmail(email)
            .then(res => {
                this.setState({message : 'Email sent successfully.'});
                this.props.history.push('/view-obj-tourist');
            });
    }

    onChange = (e) =>
        this.setState({ [e.target.name]: e.target.value });

    render() {
        return(
            <div>
                <Typography variant="h4" style={style}>Send Email to Admin !</Typography>
                <form style={formContainer}>

                    <TextField placeholder="Subject" fullWidth margin="normal" name="subject" value={this.state.subject} onChange={this.onChange}/>
                    <br/><br/><br/><br/><br/>

                    <TextField placeholder="Message" fullWidth margin="normal" name="messages" value={this.state.messages} onChange={this.onChange}/>
                    <br/><br/><br/><br/><br/>

                    <Button variant="contained" color="primary" onClick={this.saveEmail}>Send to Admin</Button>
                </form>
            </div>
        );
    }
}
const formContainer = {
    display: 'flex',
    flexFlow: 'row wrap'
};

const style ={
    display: 'flex',
    justifyContent: 'center'

}

export default AddEmailComponent;
