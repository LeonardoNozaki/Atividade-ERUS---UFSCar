import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import ongImg1 from '../../assets/ong_01.jpg';
import ongImg2 from '../../assets/ong_02.jpg';
import ongImg3 from '../../assets/ong_03.jpg';
import './styles.css';

export default class MyCarousel extends React.Component{
  render(){
    return (
      <Carousel>
        <Carousel.Item>
          <img
            src={ongImg1}
            alt="First slide"
            width="100%" height="700"
          />
          <Carousel.Caption>
            <h3>First slide label</h3>
            <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            src={ongImg2}
            alt="First slide"
            width="100%" height="700"
          />
          <Carousel.Caption>
            <h3>First slide label</h3>
            <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            src={ongImg3}
            alt="First slide"
            width="100%" height="700"
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
