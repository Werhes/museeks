package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class g8 extends a5 implements o8 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Predicate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8(c5 c5Var, int i, Predicate predicate, int i2) {
        super(c5Var, i);
        this.s = i2;
        this.t = predicate;
    }

    @Override // j$.util.stream.a
    public final f2 M0(u3 u3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                return (f2) new r8(this, u3Var, spliterator, intFunction).invoke();
            default:
                return (f2) new q8(this, u3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator N0(a aVar, Spliterator spliterator) {
        switch (this.s) {
            case 0:
                return x6.ORDERED.n(aVar.m) ? M0(aVar, spliterator, new a1(6)).spliterator() : new v8(aVar.G0(spliterator), this.t, 1);
            default:
                return x6.ORDERED.n(aVar.m) ? M0(aVar, spliterator, new a1(6)).spliterator() : new v8(aVar.G0(spliterator), this.t, 0);
        }
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        switch (this.s) {
            case 0:
                return new k(this, k5Var);
            default:
                return new h8(this, k5Var, false);
        }
    }

    @Override // j$.util.stream.o8
    public p8 i(x1 x1Var, boolean z) {
        return new h8(this, x1Var, z);
    }
}
