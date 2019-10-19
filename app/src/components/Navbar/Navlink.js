import React from 'react';
import './styles.css';

export default class MyNavbar extends React.Component{
   
    render(){
        let className;
        if (this.props.isActive) {
            className = ' link-active';
        }
        else{
            className = ' link';
        }
        return <a  className={className} onClick={this.props.onClick} href={this.props.link}>{this.props.value}</a>
            
    }
}
