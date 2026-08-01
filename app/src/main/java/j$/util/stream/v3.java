package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class v3 extends u3 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    public v3(y6 y6Var, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.u3
    public final p4 D0() {
        return new n4(this.i, this.h);
    }
}
