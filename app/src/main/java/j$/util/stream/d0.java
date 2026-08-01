package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class d0 implements d8 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public d0(boolean z, y6 y6Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : x6.r) | x6.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.d8
    public final Object f(a aVar, Spliterator spliterator) {
        e8 e8Var = (e8) this.d.get();
        aVar.E0(spliterator, e8Var);
        Object obj = e8Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.d8
    public final Object j(u3 u3Var, Spliterator spliterator) {
        a aVar = (a) u3Var;
        return new j0(this, x6.ORDERED.n(aVar.m), aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.d8
    public final int v() {
        return this.a;
    }
}
