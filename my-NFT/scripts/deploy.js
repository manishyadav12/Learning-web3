const { ethers } = require("hardhat");

async function main() {
  //1.tell to deploy the contract
  const contract = await ethers.getContractFactory("NFTee");

  //2. Deploy it
  const deployedContract = await contract.deploy();
  //2.1
  await deployedContract.deployed();

  //3. Print the address of the deployed contract
  console.log("NFT Contract deployed to:", deployedContract.address);
}

main()
  .then(() => process.exit(0))
  .catch((error) => {
    console.error(error);
    process.exit(1);
  });
