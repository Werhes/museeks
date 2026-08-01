package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class l8 extends f5 implements p8 {
    public l8(e6 e6Var, k5 k5Var, boolean z) {
        super(k5Var);
    }

    @Override // j$.util.stream.j5, j$.util.stream.k5
    public final void accept(long j) {
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }

    @Override // j$.util.stream.p8
    public final long n() {
        return 0L;
    }
}
