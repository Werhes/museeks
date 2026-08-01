package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class w extends z {
    @Override // j$.util.stream.a
    public final boolean O0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.z, j$.util.stream.c0
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEach(doubleConsumer);
        } else {
            z.T0(R0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.z, j$.util.stream.c0
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            z.T0(R0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final c0 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final c0 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !x6.ORDERED.n(this.m) ? this : new v(this, x6.r, 0);
    }
}
