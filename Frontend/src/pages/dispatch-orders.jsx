import DashboardHeader from "../components/DashboardHeader";
import Button from 'react-bootstrap/Button';

import "./styles.css";

const DispatchOrders = () => {
  return (
    <div className="dashboard-content">
      <DashboardHeader btnText="New Order" />

      <div className="dashboard-content-container">
        <div className="dashboard-content-header">
          <h2>Dispatch Orders</h2>
          
        </div>

        <table>
          <thead>
            <th>Ref ID</th>
            <th>Type</th>
            <th>Volume</th>
            <th>Date</th>
            <th>Location</th>
            <th>Action</th>
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
                <Button variant="danger">Dispatch</Button>
                
              </td>
              
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default DispatchOrders;
