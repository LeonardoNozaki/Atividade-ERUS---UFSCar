import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import ongImg from './ong_01.jpg';
import './styles.css';

export default class MyCarousel extends React.Component{
  render(){
    return (
      <Carousel>
        <Carousel.Item>
          <img
            src={ongImg}
            alt="First slide"
            width="100%" height="500"
          />
          <Carousel.Caption>
            <h3>First slide label</h3>
            <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            src={ongImg}
            alt="First slide"
            width="100%" height="500"
          />
          <Carousel.Caption>
            <h3>First slide label</h3>
            <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
          </Carousel.Caption>
        </Carousel.Item>
      </Carousel>
    );
  }
}
