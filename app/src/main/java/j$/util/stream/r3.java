package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class r3 extends u6 implements f2, x1 {
    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
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

    @Override // j$.util.stream.k5
    public final /* synthetic */ void accept(long j) {
        u3.L();
        throw null;
    }

    @Override // j$.util.stream.x1
    public final f2 build() {
        return this;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 e(long j, long j2, IntFunction intFunction) {
        return u3.W(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.k5
    public final void end() {
    }

    @Override // j$.util.stream.f2
    public final void f(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object[] objArr2 = this.f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.f2
    public final Object[] g(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.k5
    public final void h(long j) {
        clear();
        j(j);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ boolean m() {
        return false;
    }
}
