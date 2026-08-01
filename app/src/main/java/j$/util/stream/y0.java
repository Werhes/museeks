package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class y0 extends z0 {
    @Override // j$.util.stream.a
    public final boolean O0() {
        return false;
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
