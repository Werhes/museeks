package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class q5 extends g1 {
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(i1 i1Var, int i, long j, long j2) {
        super(i1Var, i);
        this.s = j;
        this.t = j2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [j$.util.Spliterator, j$.util.stream.z7] */
    @Override // j$.util.stream.a
    public final f2 M0(u3 u3Var, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long l0 = u3Var.l0(spliterator);
        if (l0 > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar = (a) u3Var;
            while (aVar.l > 0) {
                aVar = aVar.i;
            }
            return u3.e0(u3Var, u3.Y(aVar.L0(), spliterator, this.s, this.t), true);
        }
        if (x6.ORDERED.n(((a) u3Var).m)) {
            return (f2) new u5(this, u3Var, spliterator, intFunction, this.s, this.t).invoke();
        }
        j$.util.z0 z0Var = (j$.util.z0) u3Var.G0(spliterator);
        long j3 = this.s;
        long j4 = this.t;
        if (j3 <= l0) {
            long j5 = l0 - j3;
            j = j4 >= 0 ? Math.min(j4, j5) : j5;
            j2 = 0;
        } else {
            j = j4;
            j2 = j3;
        }
        return u3.e0(this, new z7(z0Var, j2, j), true);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [j$.util.Spliterator, j$.util.stream.z7] */
    @Override // j$.util.stream.a
    public final Spliterator N0(a aVar, Spliterator spliterator) {
        long l0 = aVar.l0(spliterator);
        if (l0 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.z0 z0Var = (j$.util.z0) aVar.G0(spliterator);
            long j = this.s;
            return new q7(z0Var, j, u3.a0(j, this.t));
        }
        if (x6.ORDERED.n(aVar.m)) {
            return ((f2) new u5(this, aVar, spliterator, new a1(16), this.s, this.t).invoke()).spliterator();
        }
        j$.util.z0 z0Var2 = (j$.util.z0) aVar.G0(spliterator);
        long j2 = this.s;
        long j3 = this.t;
        if (j2 <= l0) {
            long j4 = l0 - j2;
            if (j3 >= 0) {
                j4 = Math.min(j3, j4);
            }
            j3 = j4;
            j2 = 0;
        }
        return new z7(z0Var2, j2, j3);
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        return new p5(this, k5Var);
    }
}
