import MovieCard from "../../components/MovieCard";
import Pagination from "../../components/Pagination";

const Listing = () => {
    return (
        <>
            <Pagination/>
            
            <div className="container">
                <div className="row">
                    <div className="col-sm-6">
                        <MovieCard/>
                    </div>
                </div>
            </div>
        
        </>
    );
}

export default Listing;