package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class x4 extends g5 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public final Object d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(e1 e1Var, k5 k5Var) {
        super(k5Var);
        this.e = e1Var;
        k5 k5Var2 = this.a;
        Objects.requireNonNull(k5Var2);
        this.d = new j$.util.l0(k5Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(r rVar, k5 k5Var) {
        super(k5Var);
        this.e = rVar;
        k5 k5Var2 = this.a;
        Objects.requireNonNull(k5Var2);
        this.d = new j$.util.d0(k5Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(t0 t0Var, k5 k5Var) {
        super(k5Var);
        this.e = t0Var;
        k5 k5Var2 = this.a;
        Objects.requireNonNull(k5Var2);
        this.d = new j$.util.h0(k5Var2, 1);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void t(Object obj) {
        switch (this.b) {
            case 0:
                j$.util.l0 l0Var = (j$.util.l0) this.d;
                l1 l1Var = (l1) ((j$.time.r) ((e1) this.e).t).apply((j$.time.r) obj);
                if (l1Var != null) {
                    try {
                        if (this.c) {
                            j$.util.z0 spliterator = l1Var.sequential().spliterator();
                            while (!this.a.m() && spliterator.tryAdvance((LongConsumer) l0Var)) {
                            }
                        } else {
                            l1Var.sequential().forEach(l0Var);
                        }
                    } catch (Throwable th) {
                        try {
                            l1Var.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (l1Var != null) {
                    l1Var.close();
                    return;
                }
                return;
            case 1:
                j$.util.h0 h0Var = (j$.util.h0) this.d;
                IntStream intStream = (IntStream) ((j$.time.r) ((t0) this.e).t).apply((j$.time.r) obj);
                if (intStream != null) {
                    try {
                        if (this.c) {
                            j$.util.w0 spliterator2 = intStream.sequential().spliterator();
                            while (!this.a.m() && spliterator2.tryAdvance((IntConsumer) h0Var)) {
                            }
                        } else {
                            intStream.sequential().forEach(h0Var);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.d0 d0Var = (j$.util.d0) this.d;
                c0 c0Var = (c0) ((j$.time.r) ((r) this.e).t).apply((j$.time.r) obj);
                if (c0Var != null) {
                    try {
                        if (this.c) {
                            j$.util.t0 spliterator3 = c0Var.sequential().spliterator();
                            while (!this.a.m() && spliterator3.tryAdvance((DoubleConsumer) d0Var)) {
                            }
                        } else {
                            c0Var.sequential().forEach(d0Var);
                        }
                    } catch (Throwable th5) {
                        try {
                            c0Var.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (c0Var != null) {
                    c0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final void h(long j) {
        switch (this.b) {
            case 0:
                this.a.h(-1L);
                return;
            case 1:
                this.a.h(-1L);
                return;
            default:
                this.a.h(-1L);
                return;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final boolean m() {
        switch (this.b) {
            case 0:
                this.c = true;
                return this.a.m();
            case 1:
                this.c = true;
                return this.a.m();
            default:
                this.c = true;
                return this.a.m();
        }
    }
}
