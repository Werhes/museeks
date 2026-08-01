package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class k extends g5 {
    public final /* synthetic */ int b = 2;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g8 g8Var, k5 k5Var) {
        super(k5Var);
        this.d = g8Var;
        this.c = true;
    }

    public /* synthetic */ k(k5 k5Var) {
        super(k5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, k5 k5Var) {
        super(k5Var);
        this.d = qVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void t(Object obj) {
        switch (this.b) {
            case 0:
                k5 k5Var = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    k5Var.t((k5) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    k5Var.t((k5) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.time.r) ((q) this.d).t).apply((j$.time.r) obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        k5 k5Var2 = this.a;
                        if (z) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!k5Var2.m() && spliterator.tryAdvance(k5Var2)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(k5Var2);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean test = ((g8) this.d).t.test(obj);
                    this.c = test;
                    if (test) {
                        this.a.t((k5) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.end();
                return;
            default:
                super.end();
                return;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final void h(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
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
    public boolean m() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.m();
            case 2:
                return !this.c || this.a.m();
            default:
                return super.m();
        }
    }
}
