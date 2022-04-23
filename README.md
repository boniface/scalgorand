# Scalgorand

[![Build](https://github.com/boniface/scalgorand/workflows/build/badge.svg?branch=main)](https://github.com/boniface/scalgorand/actions?query=branch%3Amain+workflow%3Abuild) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/zm.hashcode/scalgorand-core_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/zm.hashcode/scalgorand-core_2.13)

# Introduction and Background

A blockchain is a public ledger of transactional data, 
distributed across multiple computers  in a network. 
All of these computers work together, using the same set of software and rules, 
to verify transactions to add to the finalized ledger or file that is a publicly verifiable and tamperproof, meaning,
if you try to change even a single record, anywhere in the history of a blockchain,
it will be evident and rejected by the network computers.

Algorand  is both a digital currency and blockchain platform. As a platform, Algorand is designed to 
process many transactions quickly, similar to a major payments processor like 
Mastercard or Visa. Algorand can host other cryptocurrencies and blockchain-based projects, 
making it a direct competitor to Ethereum. 

As a digital currency, ALGO,  the platform's native currency, Algorand is used to secure 
the Algorand blockchain and pay processing fees for Algorand-based transactions.

Algorand is an open-source blockchain, meaning that anyone can view and contribute 
to the platform's code. Algorand uses an operating protocol called pure proof-of-stake (PPoS),
which recruits network operators from the entire pool of ALGO coin holders.

# The Library

Scalgorand is a Scala Algorand Library 
 for communicating and interacting with the 
Algorand network. 
It contains a REST client for accessing algorand network over the web, and also exposes

functionality for 
1. generating keypairs, 
2. mnemonics, 
3. creating transactions, 
4. signing transactions 
5. serializing data across the network.
6. and many more features



## Usage

The packages are published on Maven Central.

```scala
libraryDependencies += "zm.hashcode" %% "scalgorand-core" % "<version>"
```

## Documentation

Links:

- [Website](https://boniface.github.io/scalgorand/)
- [API documentation](https://boniface.github.io/scalgorand/api/)

## Contributing

The scalgorand project welcomes contributions from anybody wishing to participate.  All code or documentation that is provided must be licensed with the same license that scalgorand is licensed with (Apache 2.0, see [LICENCE](./LICENSE.md)).

People are expected to follow the [Scala Code of Conduct](./CODE_OF_CONDUCT.md) when discussing scalgorand on GitHub, Gitter channel, or other venues.

Feel free to open an issue if you notice a bug, have an idea for a feature, or have a question about the code. Pull requests are also gladly accepted. For more information, check out the [contributor guide](./CONTRIBUTING.md).

## License

All code in this repository is licensed under the Apache License, Version 2.0.  See [LICENCE](./LICENSE.md).
