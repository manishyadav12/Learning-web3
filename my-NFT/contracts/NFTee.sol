// SPDX-License-Identifier: MIT
pragma solidity ^0.8.4;

import "@openzeppelin/contracts/token/ERC721/ERC721.sol";        


contract NFTee is ERC721{

    constructor() ERC721 ("my-NFT","new_NFT") {
        
        //mint 5 nft
        _mint(msg.sender,1);
        _mint(msg.sender,2);
        _mint(msg.sender,3);
        _mint(msg.sender,4);
        _mint(msg.sender,5);

    } 

}