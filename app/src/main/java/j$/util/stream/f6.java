package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class f6 extends a5 {
    public final boolean s;
    public final Comparator t;

    public f6(c5 c5Var) {
        super(c5Var, x6.q | x6.o);
        this.s = true;
        this.t = j$.util.e.INSTANCE;
    }

    public f6(c5 c5Var, Comparator comparator) {
        super(c5Var, x6.q | x6.p);
        this.s = false;
        this.t = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final f2 M0(u3 u3Var, Spliterator spliterator, IntFunction intFunction) {
        if (x6.SORTED.n(((a) u3Var).m) && this.s) {
            return u3Var.k0(spliterator, false, intFunction);
        }
        Object[] g = u3Var.k0(spliterator, true, intFunction).g(intFunction);
        Arrays.sort(g, this.t);
        return new i2(g);
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        Objects.requireNonNull(k5Var);
        return (x6.SORTED.n(i) && this.s) ? k5Var : x6.SIZED.n(i) ? new y5(k5Var, this.t) : new y5(k5Var, this.t);
    }
}
