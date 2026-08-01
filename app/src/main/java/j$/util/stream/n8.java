package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class n8 extends d5 implements p8 {
    public n8(c6 c6Var, k5 k5Var, boolean z) {
        super(k5Var);
    }

    @Override // j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    @Override // j$.util.stream.p8
    public final long n() {
        return 0L;
    }
}
