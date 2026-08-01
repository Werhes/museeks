package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class w0 extends z0 {
    @Override // j$.util.stream.a
    public final boolean O0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.z0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.h.r) {
            super.forEach(intConsumer);
        } else {
            z0.T0(R0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.z0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.h.r) {
            super.forEachOrdered(intConsumer);
        } else {
            z0.T0(R0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream parallel() {
        this.h.r = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !x6.ORDERED.n(this.m) ? this : new s(this, x6.r, 2);
    }
}
