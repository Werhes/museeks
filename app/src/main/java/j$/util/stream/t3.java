package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public class t3 extends CountedCompleter {
    public final f2 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public t3(f2 f2Var, Object obj, int i) {
        this.c = i;
        this.a = f2Var;
        this.b = 0;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t3(t3 t3Var, e2 e2Var, int i) {
        this(t3Var, e2Var, i, (byte) 0);
        this.c = 0;
        this.d = t3Var.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t3(t3 t3Var, f2 f2Var, int i) {
        this(t3Var, f2Var, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) t3Var.d;
    }

    public t3(t3 t3Var, f2 f2Var, int i, byte b) {
        super(t3Var);
        this.a = f2Var;
        this.b = i;
    }

    public final t3 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new t3(this, ((e2) this.a).a(i), i2);
            default:
                return new t3(this, this.a.a(i), i2);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        t3 t3Var = this;
        while (t3Var.a.i() != 0) {
            t3Var.setPendingCount(t3Var.a.i() - 1);
            int i = 0;
            int i2 = 0;
            while (i < t3Var.a.i() - 1) {
                t3 a = t3Var.a(i, t3Var.b + i2);
                i2 = (int) (a.a.count() + i2);
                a.fork();
                i++;
            }
            t3Var = t3Var.a(i, t3Var.b + i2);
        }
        switch (t3Var.c) {
            case 0:
                ((e2) t3Var.a).c(t3Var.b, t3Var.d);
                break;
            default:
                t3Var.a.f((Object[]) t3Var.d, t3Var.b);
                break;
        }
        t3Var.propagateCompletion();
    }
}
