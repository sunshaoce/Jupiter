<p align="center">
  <img src="./assets/V-Sim.png" alt="V-Sim" width="500">
  <br><br>
  <a href="https://github.com/andrescv/V-Sim/blob/master/LICENSE">
    <img src="https://img.shields.io/badge/License-GPL%20v3-blue.svg" alt="License: GPL v3">
  </a>
  <a href="https://travis-ci.org/andrescv/V-Sim">
    <img src="https://api.travis-ci.org/andrescv/V-Sim.svg?branch=master" alt="Travis CI">
  </a>
  <a href="https://github.com/andrescv/V-Sim/releases">
    <img src="https://img.shields.io/github/release/andrescv/V-Sim/all.svg" alt="Version">
  </a>
  <img src="https://img.shields.io/github/downloads/andrescv/V-Sim/total.svg">
  <a href="http://commitizen.github.io/cz-cli/">
    <img src="https://img.shields.io/badge/commitizen-friendly-brightgreen.svg"
    alt="Commitizen friendly"
    />
  </a>
</p>

**VSim** is a RISC-V assembler and runtime simulator for educational purposes made in Java. Almost all the 32-bit base integer ISA can be simulated as well as the **M** and **F** extensions with all their respective pseudo-instructions. For a complete list of supported instructions, please visit the [wiki](https://github.com/andrescv/V-Sim/wiki) page.

### Dependencies

**VSim** requires Java SE 8 (or later) JRE installed on your computer.

<p align="center">
  <a href="http://www.oracle.com/technetwork/java/javase/downloads/index.html">
  <img src="https://raw.githubusercontent.com/andrescv/VSim/master/assets/download.png" alt="download">
  </a>
</p>

### Installation

To install or update **VSim**, you can use the install script (only on linux) with

**cURL**:

```shell
curl -o- https://raw.githubusercontent.com/andrescv/VSim/v1.0.0-beta/install.sh | bash
```
or **Wget**:

```shell
wget -qO- https://raw.githubusercontent.com/andrescv/VSim/v1.0.0-beta/install.sh | bash
```

To verify that **VSim** has been installed, do:

```shell
vsim -version
```

which should output 'vsim-v1.0.0-beta' if the installation was successful. If not then you can try source your profile with `source`.


Alternatively you can also try it by downloading the following files: [VSim](https://github.com/andrescv/VSim/releases/download/v1.0.0-beta/vsim-v1.0.0-beta.zip), and inside the unzipped folder open a terminal/command prompt and enter the following command:

```shell
java -jar VSim.jar [flags] <files>
```

### Related projects

* [Venus RV32IM Web Simulator](http://www.kvakil.me/venus/), by Keyhan Vakil.

* [MARS simulator](http://courses.missouristate.edu/KenVollmar/mars/), by Pete Sanderson and Kenneth Vollmar.

### Contributing

Pull requests and stars are always welcome. For bugs and feature requests, [please create an issue](https://github.com/andrescv/VSim/issues/new).

### Acknowledgments

A big thank you to all the people working on the RISC-V project, for all the quality material that you develop.
