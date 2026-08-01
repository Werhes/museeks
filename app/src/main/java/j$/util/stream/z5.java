package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z5 extends v5 {
    public n6 c;

    @Override // j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.d5, j$.util.stream.k5
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        k5 k5Var = this.a;
        k5Var.h(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (k5Var.m()) {
                    break;
                }
                k5Var.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                k5Var.accept(dArr[i]);
                i++;
            }
        }
        k5Var.end();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.n6] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // j$.util.stream.d5, j$.util.stream.k5
    public final void h(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new t6((int) j) : new t6();
    }
}
