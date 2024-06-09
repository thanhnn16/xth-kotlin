package com.thanhnn16.com_tam_xth.model.entities

data class Partner(
    val name: String,
    val image: String,
    val rating: Float,
    val shippingPrice: String,
    val shippingTime: String,
    val category: List<String>,
) {
    companion object {
        //get sample partner
        fun getSamplePartner() = listOf(
            Partner(
                name = "McDonald's",
                image = "https://media.vneconomy.vn/w800/images/upload/2021/04/20/0023.jpg",
                rating = 4.5f,
                shippingPrice = "Free",
                shippingTime = "30-45 min",
                category = listOf("Fast Food", "Burger", "American"),
            ),
            Partner(
                name = "Starbucks",
                image = "https://vudigital.co/wp-content/uploads/2021/09/logo-starbucks-y-nghia-va-lich-su-cua-bieu-tuong-ca-phe-nang-tien-ca-tu-1917-2.jpg",
                rating = 4.8f,
                shippingPrice = "Free",
                shippingTime = "30-45 min",
                category = listOf("Coffee", "Beverages", "American"),
            ),
            Partner(
                name = "KFC",
                image = "https://storage.googleapis.com/stateless.navee.asia/2023/06/bc87efc9-cua-hang-kfc.png",
                rating = 4.5f,
                shippingPrice = "Free",
                shippingTime = "30-45 min",
                category = listOf("Fast Food", "Burger", "American"),
            ),
            Partner(
                name = "Pizza Hut",
                image = "https://upload.wikimedia.org/wikipedia/commons/a/a3/Pizza_Hut_Athens_OH_USA.JPG",
                rating = 4.5f,
                shippingPrice = "Free",
                shippingTime = "30-45 min",
                category = listOf("Fast Food", "Burger", "American"),
            ),
            Partner(
                name = "Burger King",
                image = "https://media-cdn.tripadvisor.com/media/photo-s/0e/81/53/04/burger-king-four-seasons.jpg",
                rating = 4.5f,
                shippingPrice = "Free",
                shippingTime = "30-45 min",
                category = listOf("Fast Food", "Burger", "American"),
            ),
            Partner(
                name = "Subway",
                image = "https://cdn.britannica.com/08/193908-050-66767D57/view-Subway-restaurant-Bangkok-Thailand.jpg",
                rating = 4.5f,
                shippingPrice = "Free",
                shippingTime = "30-45 min",
                category = listOf("Fast Food", "Burger", "American"),
            ),
        )
    }
}
