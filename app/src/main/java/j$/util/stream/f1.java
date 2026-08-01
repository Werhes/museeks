package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class f1 extends i1 {
    @Override // j$.util.stream.a
    public final boolean O0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.i1, j$.util.stream.l1
    public final void forEach(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEach(longConsumer);
        } else {
            i1.T0(R0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.i1, j$.util.stream.l1
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEachOrdered(longConsumer);
        } else {
            i1.T0(R0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final l1 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final l1 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !x6.ORDERED.n(this.m) ? this : new t(this, x6.r, 4);
    }
}
