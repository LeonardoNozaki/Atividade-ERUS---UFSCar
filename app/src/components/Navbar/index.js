import React from 'react';
import './styles.css';
import {Navbar, Nav} from 'react-bootstrap';
import Navlink from './Navlink';


export default class MyNavbar extends React.Component{
  constructor(props) {
    super(props);
    this.state = {
      isActive: Array(6).fill(false),
    };
    this.state.isActive[this.props.initActive] = true;
  }
 
  handleClick(active) {
    const isActive = this.state.isActive.slice();
    for(let i=0; i<6; i++){
      isActive[i] = false;
    }
    isActive[active] = true;
    this.setState({
      isActive: isActive,
    });
  }

  
  render(){
    
    return (
        <Navbar className="shadow" collapseOnSelect expand="lg" bg="light" variant="light" fixed="top">
            <Navbar.Brand href="#" className="brand" >Edi Freitas</Navbar.Brand>
            <Navbar.Toggle aria-controls="responsive-navbar-nav" />
            <Navbar.Collapse id="responsive-navbar-nav">
                <Nav className="ml-auto">
                    <Navlink onClick={() => this.handleClick(0)} isActive={this.state.isActive[0]} value={'Início'} link='#'></Navlink>
                    <Navlink onClick={() => this.handleClick(1)} isActive={this.state.isActive[1]} value={'Eventos'} link='#'></Navlink>
                    <Navlink onClick={() => this.handleClick(2)} isActive={this.state.isActive[2]} value={'Notícias'} link='#'></Navlink>
                    <Navlink onClick={() => this.handleClick(3)} isActive={this.state.isActive[3]} value={'Galeria'} link='#'></Navlink>
                    <Navlink onClick={() => this.handleClick(4)} isActive={this.state.isActive[4]} value={'Sobre a ONG'} link='#'></Navlink>
                    <Navlink onClick={() => this.handleClick(5)} isActive={this.state.isActive[5]} value={'Contato'} link='#'></Navlink>
                </Nav>
                </Navbar.Collapse>
        </Navbar>
    );
  }
}

