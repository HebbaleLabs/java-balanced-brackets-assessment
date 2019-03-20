package com.talfinder.assessment;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BalancedBracketsTest {

  @Parameters
  public static Collection<Object[]> parameters() {
    return Arrays.asList(new Object[][] {
        {"[2+3(4+5)]", true},
        {"{1*[2+3(4+5)]}", true},
        {"{1*2+3)4+5(}", false},
        {"\"r1*(cosθ1+i*sinθ1)/r2*(cosθ2+i*sinθ2)=r1/r2[cos(θ1−θ2)+i*sin(θ1−θ2)]\"", true},
        {"{[r1*(cosθ1+i*sinθ1)]*[r2*(cosθ2+i*sinθ2)]=r1/r2[cos(θ1+θ2)+i*sin(θ1+θ2)}]", false},
        {"3*4+5", true},
        {"r1*(cosθ1+i*sinθ1)/r2*(cosθ2+i*sinθ2)=r1/r2[cos(θ1−θ2)+i*sin(θ1−θ2)]", true},
        {"[r*(cosθ+i*sinθ)]*n=r*n(cos(nθ)+i*sin(nθ))", true},
        {"1", true}
    });
  }

  String input;
  boolean expectedValue;

  public BalancedBracketsTest(String input, boolean expectedValue) {
    this.input = input;
    this.expectedValue = expectedValue;
  }

  @Test
  public void checkBalancedBrackets() {
    Assert.assertEquals("input:Equation as '"+ input + "'", expectedValue, BalancedBrackets.isBalanced(input));
  }
}
