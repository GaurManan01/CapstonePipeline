Feature: Shopping Cart Functionalities

Scenario: Proceed to checkout
	When product removed
	Then quantity increased
	Then checkout
