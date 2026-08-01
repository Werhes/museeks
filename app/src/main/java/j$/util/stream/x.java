package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class x extends z {
    @Override // j$.util.stream.a
    public final boolean O0() {
        return true;
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
