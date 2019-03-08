package com.talfinder.assessment;

import com.talfinder.assessment.BalancedBrackets;
import org.junit.Assert;
import org.junit.Test;


public class BalancedBracketsTest {

  @Test
  public void checkBalancedBrackets_simpleEquations() {

    String input = "1*(2+3)";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));

    input = "[2+3(4+5)]";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));

    input = "{1*[2+3(4+5)]}";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));

    input = "1*(2+3";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));

    input = "1*)2+3";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));

    input = "{1*2+3)4+5(}";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));

    input = "{1*2+3(4+5})";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));

    input = "{1*2+3(4+5)}]";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));

    input = "}1*2+3(4+5){";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));

    input = "{1*[2+3(4+5";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));
  }

  @Test
  public void checkBalancedBrackets_ComplextEquations() {

    String input = "[r*(cosθ+i*sinθ)]*n=r*n(cos(nθ)+i*sin(nθ))";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));

    input = "r1*(cosθ1+i*sinθ1)/r2*(cosθ2+i*sinθ2)=r1/r2[cos(θ1−θ2)+i*sin(θ1−θ2)]";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));

    input = "{[r1*(cosθ1+i*sinθ1)]*[r2*(cosθ2+i*sinθ2)]=r1/r2[cos(θ1+θ2)+i*sin(θ1+θ2)]}";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));

    input = "[r*(cosθ+i*sinθ])*n=r*n(cos(nθ)+i*sin(nθ))";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));

    input = "r1*(cosθ1+i*sinθ1)/r2*(cosθ2+i*sinθ2)=r1/r2*cos(θ1−θ2)+i*sin(θ1−θ2)]";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));

    input = "{[r1*(cosθ1+i*sinθ1)]*[r2*(cosθ2+i*sinθ2)]=r1/r2[cos(θ1+θ2)+i*sin(θ1+θ2)}]";
    Assert.assertFalse(BalancedBrackets.isBalanced(input));
  }

  @Test
  public void checkBalancedBrackets_WithoutBrackets() {

    String input = "1+2+3";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));

    input = "1";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));

    input = "3*4+5";
    Assert.assertTrue(BalancedBrackets.isBalanced(input));
  }
}
