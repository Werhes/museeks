package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class d1 extends f5 {
    public boolean b;
    public final j$.util.l0 c;
    public final /* synthetic */ e1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, k5 k5Var) {
        super(k5Var);
        this.d = e1Var;
        k5 k5Var2 = this.a;
        Objects.requireNonNull(k5Var2);
        this.c = new j$.util.l0(k5Var2, 1);
    }

    @Override // j$.util.stream.j5, j$.util.stream.k5
    public final void accept(long j) {
        l1 l1Var = (l1) ((j$.time.r) this.d.t).apply(j);
        if (l1Var != null) {
            try {
                boolean z = this.b;
                j$.util.l0 l0Var = this.c;
                if (z) {
                    j$.util.z0 spliterator = l1Var.sequential().spliterator();
                    while (!this.a.m() && spliterator.tryAdvance((LongConsumer) l0Var)) {
                    }
                } else {
                    l1Var.sequential().forEach(l0Var);
                }
            } catch (Throwable th) {
                try {
                    l1Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (l1Var != null) {
            l1Var.close();
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
