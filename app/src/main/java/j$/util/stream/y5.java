package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class y5 extends g5 {
    public final Comparator b;
    public boolean c;

    public y5(k5 k5Var, Comparator comparator) {
        super(k5Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final boolean m() {
        this.c = true;
        return false;
    }
}
