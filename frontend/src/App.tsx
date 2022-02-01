import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listing from './Pages/Listing';
import Form from './Pages/Form';
import NavBar from "./components/NavBar";


function App() {
  return (
    <BrowserRouter>
      <NavBar/>
      <Routes>
        <Route path="/" element={<Listing />} />
        <Route path="/form">
          <Route path=":movieId" element={<Form />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;