package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class o2 extends p2 implements d2 {
    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 e(long j, long j2, IntFunction intFunction) {
        return u3.V(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        u3.P(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void forEach(Consumer consumer) {
        u3.S(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.f2
    public final Spliterator spliterator() {
        return new i3(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.c1, j$.util.stream.i3] */
    @Override // j$.util.stream.f2
    public final j$.util.c1 spliterator() {
        return new i3(this);
    }
}
