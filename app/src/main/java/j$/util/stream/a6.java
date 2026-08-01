package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a6 extends w5 {
    public p6 c;

    @Override // j$.util.stream.i5, j$.util.stream.k5
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.e5, j$.util.stream.k5
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        k5 k5Var = this.a;
        k5Var.h(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (k5Var.m()) {
                    break;
                }
                k5Var.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                k5Var.accept(iArr[i]);
                i++;
            }
        }
        k5Var.end();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.p6] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // j$.util.stream.e5, j$.util.stream.k5
    public final void h(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new t6((int) j) : new t6();
    }
}
