package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class s6 implements j$.util.c1 {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object e;
    public final /* synthetic */ t6 f;

    public s6(t6 t6Var, int i, int i2, int i3, int i4) {
        this.f = t6Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = t6Var.f;
        this.e = objArr == null ? t6Var.e : objArr[i];
    }

    public abstract void a(int i, Object obj, Object obj2);

    public abstract j$.util.c1 b(Object obj, int i, int i2);

    public abstract j$.util.c1 c(int i, int i2, int i3, int i4);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return i2 - this.c;
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + i2) - jArr[i]) - this.c;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        t6 t6Var;
        Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                t6Var = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = t6Var.f[i];
                t6Var.j(obj2, i4, t6Var.k(obj2), obj);
                i++;
                i4 = 0;
            }
            t6Var.j(this.a == i3 ? this.e : t6Var.f[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.p(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.r(this, i);
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        a(i3, obj2, obj);
        int i4 = this.c;
        Object obj3 = this.e;
        t6 t6Var = this.f;
        if (i4 == t6Var.k(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            Object[] objArr = t6Var.f;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            t6 t6Var = this.f;
            j$.util.c1 c = c(i, i3, i4, t6Var.k(t6Var.f[i3]));
            this.a = i2;
            this.c = 0;
            this.e = t6Var.f[i2];
            return c;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        j$.util.c1 b = b(this.e, i5, i6);
        this.c += i6;
        return b;
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.t0 trySplit() {
        return (j$.util.t0) trySplit();
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }
}
