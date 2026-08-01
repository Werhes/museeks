package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class m8 extends d5 {
    public final boolean b;

    public m8(c6 c6Var, k5 k5Var) {
        super(k5Var);
        this.b = true;
    }

    @Override // j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.d5, j$.util.stream.k5
    public final boolean m() {
        return !this.b || this.a.m();
    }
}
