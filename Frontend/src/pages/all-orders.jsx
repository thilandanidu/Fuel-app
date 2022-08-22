import DashboardHeader from "../components/DashboardHeader";
import Button from 'react-bootstrap/Button';

import "./styles.css";

const AllOrders = () => {
  return (
    <div className="dashboard-content">
      <DashboardHeader btnText="New Order" />

      <div className="dashboard-content-container">
        <div className="dashboard-content-header">
          <h2>All Order Details</h2>
          
        </div>

        <table>
          <thead>
            <th>Ref ID</th>
            <th>Name</th>
            <th>Type</th>
            <th>Volume</th>
            <th>Receive Date</th>
            <th>Location</th>
            <th>Status</th>
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
              <td>
                <span>Received</span>
              </td>
              
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default AllOrders;
