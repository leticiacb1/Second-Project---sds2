import ProductsList from './ProductsList';
import {Product} from './types';

type Props ={
    product: Product;
}

function formatPrice (price:number){
    const formatter = new Intl.NumberFormat('pt-BR', {
        style:'currency',
        currency:'BRL',
        minimumFractionDigits:2
    });

    return formatter.format(price);
}

function ProductsCard({product}:Props){
    return(
        <div className="order-card-container">
            <h3 className="orders-card-title">
                {product.name}
            </h3>
            <img src={product.imageUri} alt={product.name} className="order-card-image"/>
            <h3 className="order-card-price">
               {formatPrice(product.price)}
            </h3>

            <div className="order-card-description">
                <h3>Descrição</h3>
                <p>
                Descrição Uma deliciosa combinação de Linguiça Calabresa, rodelas de cebolas frescas, azeitonas pretas, mussarela, polpa de tomate, orégano e massa especial.
                </p>
            </div>
        </div>
    )
}
export default  ProductsCard;