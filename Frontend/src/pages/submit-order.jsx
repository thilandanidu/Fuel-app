import DashboardHeader from "../components/DashboardHeader";
import Button from "react-bootstrap/Button";
import Form from "react-bootstrap/Form";
import Dropdown from "react-bootstrap/Dropdown";
import "./styles.css";

const SubmitOrder = () => {
  return (
    <div className="dashboard-content">
      <DashboardHeader btnText="New Order" />

      <div className="dashboard-content-container">
        <div className="dashboard-content-header">
          <h2>Submit Order</h2>
        </div>

        <Form>
          <Form.Group className="mb-3" controlId="formBasicEmail">
            <Form.Label>Filling Station Name</Form.Label>
            <Form.Control type="text" placeholder="" />
          </Form.Group>

          <Form.Group className="mb-3" controlId="formBasicPassword">
            <Form.Label>Filling Station Name</Form.Label>
            <Form.Control type="text" placeholder="" />
          </Form.Group>

          <Form.Group className="mb-3" controlId="formBasicCheckbox">
            <Form.Label>Fuel type needed</Form.Label>

            <Form.Select aria-label="Default select example">
              <option disabled selected>Choose Type</option>
              <option value="1">Petrol 92</option>
              <option value="2">Petrol 95</option>
              <option value="3">Diesel</option>
              <option value="4">Super Diesel</option>

            </Form.Select>
            
          </Form.Group>
          <Form.Group className="mb-3" controlId="formBasicPassword">
            <Form.Label>Volume needed</Form.Label>
            <Form.Control type="text" placeholder="in Liters" />
          </Form.Group>

          <Button variant="success" type="submit">
            Submit
          </Button>
        </Form>
      </div>
    </div>
  );
};

export default SubmitOrder;
