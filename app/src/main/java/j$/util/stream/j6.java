package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j6 extends x5 {
    public long[] c;
    public int d;

    @Override // j$.util.stream.j5, j$.util.stream.k5
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        k5 k5Var = this.a;
        k5Var.h(j);
        if (this.b) {
            while (i < this.d && !k5Var.m()) {
                k5Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                k5Var.accept(this.c[i]);
                i++;
            }
        }
        k5Var.end();
        this.c = null;
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final void h(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }
}
