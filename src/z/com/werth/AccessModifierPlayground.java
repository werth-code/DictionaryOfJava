package z.com.werth;

import com.werth.AccessModSub1;
import com.werth.EnumSounds;

import java.util.function.Function;

public class AccessModifierPlayground {

    public static void main(String[] args) {
        AccessModSub1 protectClass = new AccessModSub1(EnumSounds.SWOOSH, "BasketBall Net", "SomeProtectedString", "Also Protected");
        System.out.println(protectClass.toString());
        // Notice we do not have access to the protected methods. We can still call toString() as it is public but cannot use the getters/setters because they are protected.




    }

}
