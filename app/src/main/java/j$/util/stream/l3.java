package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class l3 extends r6 implements d2, w1 {
    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ f2 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.k5, j$.util.stream.h5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        u3.D();
        throw null;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void accept(int i) {
        u3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t6, j$.util.stream.e2
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.w1, j$.util.stream.x1
    public final d2 build() {
        return this;
    }

    @Override // j$.util.stream.x1
    public final f2 build() {
        return this;
    }

    @Override // j$.util.stream.t6, j$.util.stream.e2
    public final void c(int i, Object obj) {
        super.c(i, (long[]) obj);
    }

    @Override // j$.util.stream.t6, j$.util.stream.e2
    public final void d(Object obj) {
        super.d((LongConsumer) obj);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 e(long j, long j2, IntFunction intFunction) {
        return u3.V(this, j, j2);
    }

    @Override // j$.util.stream.k5
    public final void end() {
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        u3.P(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return u3.M(this, intFunction);
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        clear();
        p(j);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void s(Long l) {
        u3.I(this, l);
    }

    @Override // j$.util.stream.r6, j$.util.stream.t6, java.lang.Iterable, j$.util.stream.f2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.r6, j$.util.stream.t6, java.lang.Iterable, j$.util.stream.f2
    public final j$.util.c1 spliterator() {
        return super.spliterator();
    }
}
