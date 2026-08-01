package j$.util.function;

import j$.time.r;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                return j$.com.android.tools.r8.a.b(this, predicate);
            default:
                return j$.com.android.tools.r8.a.b(this, predicate);
        }
    }

    public final Predicate negate() {
        switch (this.a) {
            case 0:
                return new r(2, this);
            default:
                return new r(2, this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                return j$.com.android.tools.r8.a.u(this, predicate);
            default:
                return j$.com.android.tools.r8.a.u(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.test(obj) && this.c.test(obj);
            default:
                return this.b.test(obj) || this.c.test(obj);
        }
    }
}
