package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class i8 extends e5 {
    public final boolean b;

    public i8(d6 d6Var, k5 k5Var) {
        super(k5Var);
        this.b = true;
    }

    @Override // j$.util.stream.i5, j$.util.stream.k5
    public final void accept(int i) {
        if (this.b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.e5, j$.util.stream.k5
    public final boolean m() {
        return !this.b || this.a.m();
    }
}
