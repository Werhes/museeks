package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class t1 extends b {
    public final j$.util.concurrent.t j;

    public t1(j$.util.concurrent.t tVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = tVar;
    }

    public t1(t1 t1Var, Spliterator spliterator) {
        super(t1Var, spliterator);
        this.j = t1Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        u3 u3Var = this.a;
        r1 r1Var = (r1) ((Supplier) this.j.c).get();
        u3Var.E0(this.b, r1Var);
        boolean z = r1Var.b;
        if (z == ((s1) this.j.b).b) {
            Boolean valueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new t1(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((s1) this.j.b).b);
    }
}
