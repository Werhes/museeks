package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class x3 extends u3 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ x3(y6 y6Var, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.u3
    public final p4 D0() {
        switch (this.h) {
            case 0:
                return new o4((LongBinaryOperator) this.i);
            case 1:
                return new a4((DoubleBinaryOperator) this.i);
            case 2:
                return new f4((BinaryOperator) this.i);
            default:
                return new l4((IntBinaryOperator) this.i);
        }
    }
}
