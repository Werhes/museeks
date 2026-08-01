package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class v2 extends y2 implements b2 {
    @Override // j$.util.stream.y2, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.y2, j$.util.stream.f2
    public final /* bridge */ /* synthetic */ f2 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ Object b() {
        return u3.e;
    }

    @Override // j$.util.stream.y2, j$.util.stream.f2
    public final /* synthetic */ f2 e(long j, long j2, IntFunction intFunction) {
        return u3.U(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        u3.O(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void forEach(Consumer consumer) {
        u3.R(this, consumer);
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.b;
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ j$.util.c1 spliterator() {
        return Spliterators.b;
    }
}
