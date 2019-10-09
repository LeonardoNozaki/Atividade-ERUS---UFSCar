import React from 'react';
import {Navbar, Nav, NavDropdown} from 'react-bootstrap';
import './styles.css';

export default class MyNavbar extends React.Component{
  render(){
    return (
        <Navbar className="shadow" collapseOnSelect expand="lg" bg="light" variant="" fixed="top">
            <Navbar.Brand href="#home">Edi Freitas</Navbar.Brand>
            <Navbar.Toggle aria-controls="responsive-navbar-nav" />
            <Navbar.Collapse id="responsive-navbar-nav">
                <Nav className="ml-auto">
                    <Nav.Link className="item-active"  href="#">Início</Nav.Link>
                    <Nav.Link href="#">Eventos</Nav.Link>
                    <Nav.Link href="#">Notícias</Nav.Link>
                    <Nav.Link href="#">Galeria</Nav.Link>
                    <Nav.Link href="#">Sobre a ONG</Nav.Link>
                    <Nav.Link href="#">Contato</Nav.Link>
                </Nav>
                </Navbar.Collapse>
        </Navbar>
    );
  }
}

