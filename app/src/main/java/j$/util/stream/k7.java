package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class k7 extends z6 implements j$.util.w0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.t6, java.util.function.IntConsumer, java.lang.Object, j$.util.stream.c] */
    @Override // j$.util.stream.z6
    public final void d() {
        ?? t6Var = new t6();
        this.h = t6Var;
        Objects.requireNonNull(t6Var);
        this.e = this.b.F0(new j7(t6Var, 1));
        this.f = new j$.time.r(12, this);
    }

    @Override // j$.util.stream.z6
    public final z6 e(Spliterator spliterator) {
        return new z6(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.l(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h != null || this.i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        j7 j7Var = new j7(intConsumer, 0);
        this.b.E0(this.d, j7Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.C(this, consumer);
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a = a();
        if (a) {
            p6 p6Var = (p6) this.h;
            long j = this.g;
            int o = p6Var.o(j);
            intConsumer.accept((p6Var.c == 0 && o == 0) ? ((int[]) p6Var.e)[(int) j] : ((int[][]) p6Var.f)[o][(int) (j - p6Var.d[o])]);
        }
        return a;
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.w0) super.trySplit();
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.w0) super.trySplit();
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final j$.util.w0 trySplit() {
        return (j$.util.w0) super.trySplit();
    }
}
