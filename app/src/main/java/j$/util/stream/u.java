package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class u extends d5 {
    public boolean b;
    public final j$.util.d0 c;
    public final /* synthetic */ r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, k5 k5Var) {
        super(k5Var);
        this.d = rVar;
        k5 k5Var2 = this.a;
        Objects.requireNonNull(k5Var2);
        this.c = new j$.util.d0(k5Var2, 1);
    }

    @Override // j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        c0 c0Var = (c0) ((j$.time.r) this.d.t).apply(d);
        if (c0Var != null) {
            try {
                boolean z = this.b;
                j$.util.d0 d0Var = this.c;
                if (z) {
                    j$.util.t0 spliterator = c0Var.sequential().spliterator();
                    while (!this.a.m() && spliterator.tryAdvance((DoubleConsumer) d0Var)) {
                    }
                } else {
                    c0Var.sequential().forEach(d0Var);
                }
            } catch (Throwable th) {
                try {
                    c0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c0Var != null) {
            c0Var.close();
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.d5, j$.util.stream.k5
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
