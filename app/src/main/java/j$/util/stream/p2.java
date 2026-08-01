package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class p2 extends h2 implements e2 {
    @Override // j$.util.stream.e2
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object newArray = newArray((int) j);
        c(0, newArray);
        return newArray;
    }

    @Override // j$.util.stream.e2
    public final void c(int i, Object obj) {
        f2 f2Var = this.a;
        ((e2) f2Var).c(i, obj);
        ((e2) this.b).c(i + ((int) ((e2) f2Var).count()), obj);
    }

    @Override // j$.util.stream.e2
    public final void d(Object obj) {
        ((e2) this.a).d(obj);
        ((e2) this.b).d(obj);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return u3.M(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
