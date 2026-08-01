package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class q2 extends h2 {
    @Override // j$.util.stream.f2
    public final f2 e(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.e(j - count, j2 - count, intFunction);
        }
        if (j2 <= count) {
            return this.a.e(j, j2, intFunction);
        }
        return u3.f0(y6.REFERENCE, this.a.e(j, count, intFunction), this.b.e(0L, j2 - count, intFunction));
    }

    @Override // j$.util.stream.f2
    public final void f(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        f2 f2Var = this.a;
        f2Var.f(objArr, i);
        this.b.f(objArr, i + ((int) f2Var.count()));
    }

    @Override // j$.util.stream.f2
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.f2
    public final Object[] g(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.f2
    public final Spliterator spliterator() {
        return new i3(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
