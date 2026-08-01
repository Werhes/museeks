package j$.util.stream;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class m1 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ m1(s1 s1Var, int i) {
        this.a = i;
        this.b = s1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new r1(this.b);
            case 1:
                return new r1(this.b);
            default:
                return new r1(this.b);
        }
    }
}
