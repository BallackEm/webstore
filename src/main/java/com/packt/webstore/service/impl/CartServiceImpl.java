package com.packt.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Cart;
import com.packt.webstore.domain.repository.CartRepository;
import com.packt.webstore.exception.InvalidCartException;
import com.packt.webstore.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	public Cart create(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.create(cart);
	}

	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		return cartRepository.read(cartId);
	}

	public void update(String cartId, Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.update(cartId, cart);
	}

	public void delete(String cartId) {
		// TODO Auto-generated method stub
		cartRepository.delete(cartId);
	}

	public Cart validate(String cartId) {
		// TODO Auto-generated method stub
		Cart cart = cartRepository.read(cartId);
		if (cart == null || cart.getCartItems().size() == 0) {
			throw new InvalidCartException(cartId);
		}
		return cart;
	}
}
