package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final class k4 extends u3 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    public k4(y6 y6Var, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.u3
    public final p4 D0() {
        return new j4(this.i, this.h);
    }
}
