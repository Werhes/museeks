package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class q3 extends CountedCompleter implements k5 {
    public final Spliterator a;
    public final u3 b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public q3(Spliterator spliterator, u3 u3Var, int i) {
        this.a = spliterator;
        this.b = u3Var;
        this.c = d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public q3(q3 q3Var, Spliterator spliterator, long j, long j2, int i) {
        super(q3Var);
        this.a = spliterator;
        this.b = q3Var.b;
        this.c = q3Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public abstract q3 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        u3.D();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        u3.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        u3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        q3 q3Var = this;
        while (spliterator.estimateSize() > q3Var.c && (trySplit = spliterator.trySplit()) != null) {
            q3Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            q3 q3Var2 = q3Var;
            q3Var2.a(trySplit, q3Var.d, estimateSize).fork();
            q3Var = q3Var2.a(spliterator, q3Var2.d + estimateSize, q3Var2.e - estimateSize);
        }
        q3 q3Var3 = q3Var;
        q3Var3.b.E0(spliterator, q3Var3);
        q3Var3.propagateCompletion();
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }
}
