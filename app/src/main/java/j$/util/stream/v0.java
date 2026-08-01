package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class v0 extends e5 {
    public boolean b;
    public final j$.util.h0 c;
    public final /* synthetic */ t0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t0 t0Var, k5 k5Var) {
        super(k5Var);
        this.d = t0Var;
        k5 k5Var2 = this.a;
        Objects.requireNonNull(k5Var2);
        this.c = new j$.util.h0(k5Var2, 1);
    }

    @Override // j$.util.stream.i5, j$.util.stream.k5
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((k0) this.d.t).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.h0 h0Var = this.c;
                if (z) {
                    j$.util.w0 spliterator = intStream.sequential().spliterator();
                    while (!this.a.m() && spliterator.tryAdvance((IntConsumer) h0Var)) {
                    }
                } else {
                    intStream.sequential().forEach(h0Var);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.e5, j$.util.stream.k5
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
