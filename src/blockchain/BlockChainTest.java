package blockchain;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BlockChainTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        BlockUtils blockChain = new BlockUtils();
        blockChain.createGenesisBlock();

//        blockChain.addBlock("Helloooo !!");
//        blockChain.addBlock("I am Anas !!");
//        blockChain.addBlock("From Palestine !!");
//        blockChain.mineBlock(1,"New Block Mined ");
//        blockChain.mineBlock(2,"New Block Mined 2");
//        blockChain.mineBlock(5,"New Block Mined 3");
//        blockChain.mineBlock(6,"New Block Mined 4");

        blockChain.blocksExplorer();
        blockChain.chainStatus();
    }

}
