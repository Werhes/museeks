package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k6 extends y5 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        k5 k5Var = this.a;
        k5Var.h(j);
        if (this.c) {
            while (i < this.e && !k5Var.m()) {
                k5Var.accept((k5) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                k5Var.accept((k5) this.d[i]);
                i++;
            }
        }
        k5Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final void h(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }
}
