package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class b4 extends u3 {
    public final /* synthetic */ int h;

    public /* synthetic */ b4(int i) {
        this.h = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.p4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.p4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.p4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.p4, java.lang.Object] */
    @Override // j$.util.stream.u3
    public final p4 D0() {
        switch (this.h) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                return new Object();
            default:
                return new Object();
        }
    }

    @Override // j$.util.stream.u3, j$.util.stream.d8
    public final Object f(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return x6.SIZED.n(aVar.m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.f(aVar, spliterator);
            case 1:
                return x6.SIZED.n(aVar.m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.f(aVar, spliterator);
            case 2:
                return x6.SIZED.n(aVar.m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.f(aVar, spliterator);
            default:
                return x6.SIZED.n(aVar.m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.f(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.u3, j$.util.stream.d8
    public final Object j(u3 u3Var, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return x6.SIZED.n(((a) u3Var).m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.j(u3Var, spliterator);
            case 1:
                return x6.SIZED.n(((a) u3Var).m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.j(u3Var, spliterator);
            case 2:
                return x6.SIZED.n(((a) u3Var).m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.j(u3Var, spliterator);
            default:
                return x6.SIZED.n(((a) u3Var).m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.j(u3Var, spliterator);
        }
    }

    @Override // j$.util.stream.u3, j$.util.stream.d8
    public final int v() {
        switch (this.h) {
            case 0:
                return x6.r;
            case 1:
                return x6.r;
            case 2:
                return x6.r;
            default:
                return x6.r;
        }
    }
}
