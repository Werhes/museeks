package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class c6 extends x implements o8 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(a aVar, int i, int i2) {
        super(aVar, i);
        this.s = i2;
    }

    @Override // j$.util.stream.a
    public final f2 M0(u3 u3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                if (x6.SORTED.n(((a) u3Var).m)) {
                    return u3Var.k0(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((z1) u3Var.k0(spliterator, true, intFunction)).b();
                Arrays.sort(dArr);
                return new r2(dArr);
            case 1:
                return (f2) new r8(this, u3Var, spliterator, intFunction).invoke();
            default:
                return (f2) new q8(this, u3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public Spliterator N0(a aVar, Spliterator spliterator) {
        switch (this.s) {
            case 1:
                return x6.ORDERED.n(aVar.m) ? M0(aVar, spliterator, new a1(24)).spliterator() : new s8((j$.util.t0) aVar.G0(spliterator), 1);
            case 2:
                return x6.ORDERED.n(aVar.m) ? M0(aVar, spliterator, new a1(25)).spliterator() : new s8((j$.util.t0) aVar.G0(spliterator), 0);
            default:
                return super.N0(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        switch (this.s) {
            case 0:
                Objects.requireNonNull(k5Var);
                if (x6.SORTED.n(i)) {
                    return k5Var;
                }
                return x6.SIZED.n(i) ? new d5(k5Var) : new d5(k5Var);
            case 1:
                return new m8(this, k5Var);
            default:
                return new n8(this, k5Var, false);
        }
    }

    @Override // j$.util.stream.o8
    public p8 i(x1 x1Var, boolean z) {
        return new n8(this, x1Var, z);
    }
}
