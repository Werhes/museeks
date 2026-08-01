package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
public final class d4 extends u3 {
    public final /* synthetic */ DoubleBinaryOperator h;
    public final /* synthetic */ double i;

    public d4(y6 y6Var, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }

    @Override // j$.util.stream.u3
    public final p4 D0() {
        return new y3(this.i, this.h);
    }
}
