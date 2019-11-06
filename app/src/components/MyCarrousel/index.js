import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import ongImg1 from '../../assets/ong_01.jpg';
import ongImg2 from '../../assets/ong_02.jpg';
import ongImg3 from '../../assets/ong_03.jpg';
import './styles.css';

export default class MyCarousel extends React.Component{
  render(){
    return (
          <Carousel className="carouselSmall">
            <Carousel.Item>
              <img
                src={ongImg1}
                alt="First slide"
                width="100%" height="500"
              />
              <Carousel.Caption>
                <h3>Dia das crianças</h3>
                <p>Comemoração do dia das crianças na ONG EDI Freitas</p>
              </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item>
              <img
                src={ongImg2}
                alt="First slide"
                width="100%" height="500"
              />
              <Carousel.Caption>
                <h3>Olha o algodão doce!!</h3>
                <p>Muito açucar e alegria para a garotada!!</p>
              </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item>
              <img
                src={ongImg3}
                alt="First slide"
                width="100%" height="500"
              />
              <Carousel.Caption>
                <h3>The winter is coming!</h3>
                <p>O inverno está chegando, e nois da EDI Freitas já garantimos lares quentinhos</p>
              </Carousel.Caption>
            </Carousel.Item>
          </Carousel>
    );
  }
}
