package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class x6 {
    public static final x6 DISTINCT;
    public static final x6 ORDERED;
    public static final x6 SHORT_CIRCUIT;
    public static final x6 SIZED;
    public static final x6 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ x6[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        w6 w6Var = w6.SPLITERATOR;
        j$.time.r x = x(w6Var);
        w6 w6Var2 = w6.STREAM;
        x.u(w6Var2);
        w6 w6Var3 = w6.OP;
        ((EnumMap) ((Map) x.b)).put((EnumMap) w6Var3, (w6) 3);
        x6 x6Var = new x6("DISTINCT", 0, 0, x);
        DISTINCT = x6Var;
        j$.time.r x2 = x(w6Var);
        x2.u(w6Var2);
        ((EnumMap) ((Map) x2.b)).put((EnumMap) w6Var3, (w6) 3);
        x6 x6Var2 = new x6("SORTED", 1, 1, x2);
        SORTED = x6Var2;
        j$.time.r x3 = x(w6Var);
        x3.u(w6Var2);
        ((EnumMap) ((Map) x3.b)).put((EnumMap) w6Var3, (w6) 3);
        w6 w6Var4 = w6.TERMINAL_OP;
        ((EnumMap) ((Map) x3.b)).put((EnumMap) w6Var4, (w6) 2);
        w6 w6Var5 = w6.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) x3.b)).put((EnumMap) w6Var5, (w6) 2);
        x6 x6Var3 = new x6("ORDERED", 2, 2, x3);
        ORDERED = x6Var3;
        j$.time.r x4 = x(w6Var);
        x4.u(w6Var2);
        ((EnumMap) ((Map) x4.b)).put((EnumMap) w6Var3, (w6) 2);
        x6 x6Var4 = new x6("SIZED", 3, 3, x4);
        SIZED = x6Var4;
        j$.time.r x5 = x(w6Var3);
        x5.u(w6Var4);
        int i2 = 0;
        x6 x6Var5 = new x6("SHORT_CIRCUIT", 4, 12, x5);
        SHORT_CIRCUIT = x6Var5;
        v = new x6[]{x6Var, x6Var2, x6Var3, x6Var4, x6Var5};
        f = j(w6Var);
        g = j(w6Var2);
        h = j(w6Var3);
        j(w6Var4);
        j(w6Var5);
        for (x6 x6Var6 : values()) {
            i2 |= x6Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        x6 x6Var7 = DISTINCT;
        m = x6Var7.c;
        n = x6Var7.d;
        x6 x6Var8 = SORTED;
        o = x6Var8.c;
        p = x6Var8.d;
        x6 x6Var9 = ORDERED;
        q = x6Var9.c;
        r = x6Var9.d;
        x6 x6Var10 = SIZED;
        s = x6Var10.c;
        t = x6Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public x6(String str, int i2, int i3, j$.time.r rVar) {
        for (w6 w6Var : w6.values()) {
            Map.EL.b((java.util.Map) rVar.b, w6Var, 0);
        }
        this.a = (java.util.Map) rVar.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int i(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int j(w6 w6Var) {
        int i2 = 0;
        for (x6 x6Var : values()) {
            i2 |= ((Integer) x6Var.a.get(w6Var)).intValue() << x6Var.b;
        }
        return i2;
    }

    public static int k(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }

    public static x6 valueOf(String str) {
        return (x6) Enum.valueOf(x6.class, str);
    }

    public static x6[] values() {
        return (x6[]) v.clone();
    }

    public static j$.time.r x(w6 w6Var) {
        j$.time.r rVar = new j$.time.r(10, new EnumMap(w6.class));
        rVar.u(w6Var);
        return rVar;
    }

    public final boolean n(int i2) {
        return (i2 & this.e) == this.c;
    }
}
