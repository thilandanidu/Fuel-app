import DashboardHeader from "../components/DashboardHeader";
import Button from "react-bootstrap/Button";
import Form from "react-bootstrap/Form";
import "./styles.css";

const CheckOrder = () => {
  return (
    <div className="dashboard-content">
      <DashboardHeader btnText="New Order" />

      <div className="dashboard-content-container">
        <div className="dashboard-content-header">
          <h2>Check Order</h2>
        </div>

        <Form>
          <Form.Group className="mb-3" controlId="formBasicEmail">
            <Form.Label>Reference ID</Form.Label>
            <Form.Control type="text" placeholder="" />
          </Form.Group>

          <Button variant="success" type="submit">
            Submit
          </Button>
        </Form>

        <table>
          <thead>
            <th>Ref ID</th>
            <th>Name</th>
            <th>Type</th>
            <th>Volume</th>
            <th>Status</th>
            <th>Confirm</th>

          </thead>

          <tbody>
            <tr >
              <td>
                <span>4165416</span>
              </td>
              <td>
                <span>4165416</span>
              </td>
              <td>
                <span>4165416</span>
              </td>
              <td>
                <span>4165416</span>
              </td>
              <td>
                <span>4165416</span>
              </td>
              <td>
                <span>4165416</span>
              </td>
              
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default CheckOrder;
