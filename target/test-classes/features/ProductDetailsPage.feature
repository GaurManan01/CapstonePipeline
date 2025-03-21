Feature: Product Details Functionlities

Scenario: Validate the product
	When User clicks the product
	Then Verify product title
	Then Verify product description
	Then Verify product price
	Then Add to cart