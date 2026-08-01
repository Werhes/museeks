package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class t6 extends c implements Iterable, j$.lang.a {
    public Object e;
    public Object[] f;

    public t6() {
        this.e = newArray(16);
    }

    public t6(int i) {
        super(i);
        this.e = newArray(1 << this.a);
    }

    public Object b() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object newArray = newArray((int) count);
        c(0, newArray);
        return newArray;
    }

    public void c(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count > k(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, k(obj2));
            i += k(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void d(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            j(obj2, 0, k(obj2), obj);
        }
        j(this.e, 0, this.b, obj);
    }

    public abstract void j(Object obj, int i, int i2, Object obj2);

    public abstract int k(Object obj);

    public abstract Object newArray(int i);

    public final int o(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.c; i++) {
            if (j < this.d[i] + k(this.f[i])) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public final void p(long j) {
        long k;
        int i = this.c;
        if (i == 0) {
            k = k(this.e);
        } else {
            k = k(this.f[i]) + this.d[i];
        }
        if (j > k) {
            if (this.f == null) {
                Object[] r = r();
                this.f = r;
                this.d = new long[8];
                r[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > k) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int i3 = this.a;
                if (i2 != 0 && i2 != 1) {
                    i3 = Math.min((i3 + i2) - 1, 30);
                }
                int i4 = 1 << i3;
                this.f[i2] = newArray(i4);
                long[] jArr = this.d;
                jArr[i2] = jArr[i2 - 1] + k(this.f[r6]);
                k += i4;
                i2++;
            }
        }
    }

    public abstract Object[] r();

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final void u() {
        long k;
        if (this.b == k(this.e)) {
            if (this.f == null) {
                Object[] r = r();
                this.f = r;
                this.d = new long[8];
                r[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    k = k(this.e);
                } else {
                    k = k(objArr[i]) + this.d[i];
                }
                p(k + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }
}
