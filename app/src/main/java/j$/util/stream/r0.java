package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class r0 extends CountedCompleter {
    public Spliterator a;
    public final k5 b;
    public final u3 c;
    public long d;

    public r0(r0 r0Var, Spliterator spliterator) {
        super(r0Var);
        this.a = spliterator;
        this.b = r0Var.b;
        this.d = r0Var.d;
        this.c = r0Var.c;
    }

    public r0(u3 u3Var, Spliterator spliterator, k5 k5Var) {
        super(null);
        this.b = k5Var;
        this.c = u3Var;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = d.e(estimateSize);
            this.d = j;
        }
        boolean n = x6.SHORT_CIRCUIT.n(((a) this.c).m);
        k5 k5Var = this.b;
        boolean z = false;
        r0 r0Var = this;
        while (true) {
            if (n && k5Var.m()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            r0 r0Var2 = new r0(r0Var, trySplit);
            r0Var.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                r0 r0Var3 = r0Var;
                r0Var = r0Var2;
                r0Var2 = r0Var3;
            }
            z = !z;
            r0Var.fork();
            r0Var = r0Var2;
            estimateSize = spliterator.estimateSize();
        }
        r0Var.c.g0(spliterator, k5Var);
        r0Var.a = null;
        r0Var.propagateCompletion();
    }
}
