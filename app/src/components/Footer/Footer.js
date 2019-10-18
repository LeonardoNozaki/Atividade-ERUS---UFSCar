import React from 'react';
import { Card } from 'react-bootstrap';

export default class Footer extends React.Component{
    render(){
        return (
            <Card className="text-center fixed-bottom">
                <Card.Body>
                    <Card.Title>ONG Edi Freitas</Card.Title>
                    <Card.Text>
                    Rua Três, 12, Sorocaba, Brazil 18071-303.

                </Card.Text>
            </Card.Body>
            <Card.Footer className="text-muted">
                <p className="copyright pull-right">
                    &copy; {new Date().getFullYear()}{" "}
                </p>
            </Card.Footer>
        </Card>
    );
    }
}
