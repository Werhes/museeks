package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* loaded from: classes2.dex */
public abstract class d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final u3 a;
    public Spliterator b;
    public long c;
    public d d;
    public d e;
    public Object f;

    public d(d dVar, Spliterator spliterator) {
        super(dVar);
        this.b = spliterator;
        this.a = dVar.a;
        this.c = dVar.c;
    }

    public d(u3 u3Var, Spliterator spliterator) {
        super(null);
        this.a = u3Var;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long e(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object a();

    public final boolean b() {
        return ((d) getCompleter()) == null;
    }

    public abstract d c(Spliterator spliterator);

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = e(estimateSize);
            this.c = j;
        }
        boolean z = false;
        d dVar = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            d c = dVar.c(trySplit);
            dVar.d = c;
            d c2 = dVar.c(spliterator);
            dVar.e = c2;
            dVar.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                dVar = c;
                c = c2;
            } else {
                dVar = c2;
            }
            z = !z;
            c.fork();
            estimateSize = spliterator.estimateSize();
        }
        dVar.d(dVar.a());
        dVar.tryComplete();
    }

    public void d(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
