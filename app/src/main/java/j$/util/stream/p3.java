package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class p3 extends q3 {
    public final Object[] h;

    public p3(Spliterator spliterator, u3 u3Var, Object[] objArr) {
        super(spliterator, u3Var, objArr.length);
        this.h = objArr;
    }

    public p3(p3 p3Var, Spliterator spliterator, long j, long j2) {
        super(p3Var, spliterator, j, j2, p3Var.h.length);
        this.h = p3Var.h;
    }

    @Override // j$.util.stream.q3
    public final q3 a(Spliterator spliterator, long j, long j2) {
        return new p3(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void t(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
