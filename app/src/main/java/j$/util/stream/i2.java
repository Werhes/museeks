package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class i2 implements f2 {
    public final Object[] a;
    public int b;

    public i2(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    public i2(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 e(long j, long j2, IntFunction intFunction) {
        return u3.W(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.f2
    public final void f(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.f2
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.t(this.a[i]);
        }
    }

    @Override // j$.util.stream.f2
    public final Object[] g(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.f2
    public final Spliterator spliterator() {
        int i = this.b;
        Object[] objArr = this.a;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, 0, i);
        return new j$.util.i1(objArr, 0, i, 1040);
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
