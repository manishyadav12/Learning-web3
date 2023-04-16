//SPDX-License-Indentifier:MIT

pragma solidity ^0.8.0;

import "https://github.com/OpenZeppelin/openzeppelin-contracts/blob/master/contracts/token/ERC20/ERC20.sol";

contract manishToken is ERC20 {
    constructor(string memory _name,string memory _symbol) 
    ERC20(_name,_symbol) {

        //get some token for ourselves
        //msg.sneder is the person deploying the contract 

        _mint(msg.sender,1000*(10 ** 18));

    }   

}