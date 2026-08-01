package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class y2 implements f2 {
    @Override // j$.util.stream.f2
    public f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final void c(int i, Object obj) {
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return 0L;
    }

    public final void d(Object obj) {
    }

    @Override // j$.util.stream.f2
    public /* synthetic */ f2 e(long j, long j2, IntFunction intFunction) {
        return u3.W(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.f2
    public final Object[] g(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int i() {
        return 0;
    }
}
