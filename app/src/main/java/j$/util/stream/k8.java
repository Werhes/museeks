package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class k8 extends f5 {
    public final boolean b;

    public k8(e6 e6Var, k5 k5Var) {
        super(k5Var);
        this.b = true;
    }

    @Override // j$.util.stream.j5, j$.util.stream.k5
    public final void accept(long j) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final boolean m() {
        return !this.b || this.a.m();
    }
}
