package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class m implements j$.time.temporal.o, Serializable {
    public static final m d = new m(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.S(new Object[]{j$.time.temporal.a.YEARS, j$.time.temporal.a.MONTHS, j$.time.temporal.a.DAYS});
    }

    public m(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static m a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? d : new m(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.a == mVar.a && this.b == mVar.b && this.c == mVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l i(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        j$.time.chrono.j jVar = (j$.time.chrono.j) lVar.D(j$.time.temporal.p.b);
        if (jVar != null && !j$.time.chrono.q.c.equals(jVar)) {
            throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + jVar.getId());
        }
        int i = this.b;
        if (i == 0) {
            int i2 = this.a;
            if (i2 != 0) {
                lVar = lVar.d(i2, j$.time.temporal.a.YEARS);
            }
        } else {
            long j = (this.a * 12) + i;
            if (j != 0) {
                lVar = lVar.d(j, j$.time.temporal.a.MONTHS);
            }
        }
        int i3 = this.c;
        return i3 != 0 ? lVar.d(i3, j$.time.temporal.a.DAYS) : lVar;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
