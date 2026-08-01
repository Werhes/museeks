package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b6 extends x5 {
    public r6 c;

    @Override // j$.util.stream.j5, j$.util.stream.k5
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        k5 k5Var = this.a;
        k5Var.h(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (k5Var.m()) {
                    break;
                }
                k5Var.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                k5Var.accept(jArr[i]);
                i++;
            }
        }
        k5Var.end();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.r6] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final void h(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new t6((int) j) : new t6();
    }
}
