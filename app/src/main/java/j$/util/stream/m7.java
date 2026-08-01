package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class m7 extends z6 implements j$.util.z0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.t6, java.lang.Object, j$.util.stream.c, java.util.function.LongConsumer] */
    @Override // j$.util.stream.z6
    public final void d() {
        ?? t6Var = new t6();
        this.h = t6Var;
        Objects.requireNonNull(t6Var);
        this.e = this.b.F0(new l7(t6Var, 1));
        this.f = new j$.time.r(13, this);
    }

    @Override // j$.util.stream.z6
    public final z6 e(Spliterator spliterator) {
        return new z6(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.m(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            do {
            } while (tryAdvance(longConsumer));
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        l7 l7Var = new l7(longConsumer, 0);
        this.b.E0(this.d, l7Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.D(this, consumer);
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean a = a();
        if (a) {
            r6 r6Var = (r6) this.h;
            long j = this.g;
            int o = r6Var.o(j);
            longConsumer.accept((r6Var.c == 0 && o == 0) ? ((long[]) r6Var.e)[(int) j] : ((long[][]) r6Var.f)[o][(int) (j - r6Var.d[o])]);
        }
        return a;
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.z0) super.trySplit();
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.z0) super.trySplit();
    }

    @Override // j$.util.stream.z6, j$.util.Spliterator
    public final j$.util.z0 trySplit() {
        return (j$.util.z0) super.trySplit();
    }
}
