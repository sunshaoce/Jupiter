package vsim.riscv.instructions.rtype;

import vsim.utils.ALU;


public final class Mulhsu extends RType {

  public Mulhsu() {
    super(
      "mulhsu",
      "mulhsu rd, rs1, rs2",
      "set rd = (rs1 * unsigned(rs2)) >> XLEN"
    );
  }

  @Override
  public int getFunct3() {
    return 0b010;
  }

  @Override
  public int getFunct7() {
    return 0b0000001;
  }

  @Override
  protected int compute(int rs1, int rs2) {
    return ALU.mulhsu(rs1, rs2);
  }

}
