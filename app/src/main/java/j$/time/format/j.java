package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalField;

/* loaded from: classes2.dex */
public class j implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final TemporalField a;
    public final int b;
    public final int c;
    public final SignStyle d;
    public final int e;

    public j(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = signStyle;
        this.e = 0;
    }

    public j(TemporalField temporalField, int i, int i2, SignStyle signStyle, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = signStyle;
        this.e = i3;
    }

    public long a(x xVar, long j) {
        return j;
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == SignStyle.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.g(this.a, j, i, i2);
    }

    public j d() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j e(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean i(x xVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long a = xVar.a(temporalField);
        if (a == null) {
            return false;
        }
        long a2 = a(xVar, a.longValue());
        b0 b0Var = xVar.b.c;
        String l = a2 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(a2));
        int length = l.length();
        int i = this.c;
        if (length > i) {
            throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + a2 + " exceeds the maximum print width of " + i);
        }
        b0Var.getClass();
        int i2 = this.b;
        SignStyle signStyle = this.d;
        if (a2 >= 0) {
            int i3 = b.a[signStyle.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && a2 >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[signStyle.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + a2 + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - l.length(); i5++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r5 = r12;
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0174, code lost:
    
        if (r6 <= r10) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(j$.time.format.v r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.j(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public String toString() {
        int i = this.c;
        TemporalField temporalField = this.a;
        SignStyle signStyle = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && signStyle == SignStyle.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i2 == i && signStyle == SignStyle.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i2 + ")";
        }
        return "Value(" + temporalField + "," + i2 + "," + i + "," + signStyle + ")";
    }
}
