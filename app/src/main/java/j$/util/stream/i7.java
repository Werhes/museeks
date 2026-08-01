package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class i7 extends z6 implements j$.util.t0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.t6, java.lang.Object, j$.util.stream.c, java.util.function.DoubleConsumer] */
    @Override // j$.util.stream.z6
    public final void d() {
        ?? t6Var = new t6();
        this.h = t6Var;
        Objects.requireNonNull(t6Var);
        this.e = this.b.F0(new h7(t6Var, 1));
        this.f = new j$.time.r(11, this);
    }

    @Override // j$.util.stream.z6
    public final z6 e(Spliterator spliterator) {
        return new z6(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h != null || this.i) {
            do {
            } while (tryAdvance(doubleConsumer));
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        h7 h7Var = new h7(doubleConsumer, 0);
        this.b.E0(this.d, h7Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean a = a();
        if (a) {
            n6 n6Var = (n6) this.h;
            long j = this.g;
            int o = n6Var.o(j);
            doubleConsumer.accept((n6Var.c == 0 && o == 0) ? ((double[]) n6Var.e)[(int) j] : ((double[][]) n6Var.f)[o][(int) (j - n6Var.d[o])]);
        }
        return a;
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.t0) super.trySplit();
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.t0) super.trySplit();
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final j$.util.t0 trySplit() {
        return (j$.util.t0) super.trySplit();
    }
}
