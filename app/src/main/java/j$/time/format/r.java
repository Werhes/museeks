package j$.time.format;

import j$.time.temporal.TemporalField;

/* loaded from: classes2.dex */
public final class r implements e {
    public final TemporalField a;
    public final TextStyle b;
    public final a0 c;
    public volatile j d;

    public r(TemporalField temporalField, TextStyle textStyle, a0 a0Var) {
        this.a = temporalField;
        this.b = textStyle;
        this.c = a0Var;
    }

    @Override // j$.time.format.e
    public final boolean i(x xVar, StringBuilder sb) {
        Long a = xVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = xVar.b;
        if (a == null) {
            return false;
        }
        j$.time.chrono.j jVar = (j$.time.chrono.j) xVar.a.D(j$.time.temporal.p.b);
        String c = (jVar == null || jVar == j$.time.chrono.q.c) ? this.c.c(this.a, a.longValue(), this.b, dateTimeFormatter.b) : this.c.b(jVar, this.a, a.longValue(), this.b, dateTimeFormatter.b);
        if (c != null) {
            sb.append(c);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, SignStyle.NORMAL);
        }
        return this.d.i(xVar, sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r8 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r8.hasNext() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r9 = (java.util.Map.Entry) r8.next();
        r1 = (java.lang.String) r9.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r11.h(r1, 0, r12, r13, r1.length()) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        return r11.g(r10.a, ((java.lang.Long) r9.getValue()).longValue(), r13, r1.length() + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r6 != j$.time.temporal.ChronoField.ERA) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r11.c != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r6 = r7.s().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r6.hasNext() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        r1 = ((j$.time.chrono.k) r6.next()).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if (r11.h(r1, 0, r12, r13, r1.length()) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        return r11.g(r10.a, r7.getValue(), r13, r1.length() + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (r11.c == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        return ~r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (r10.d != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
    
        r10.d = new j$.time.format.j(r10.a, 1, 19, j$.time.format.SignStyle.NORMAL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        return r10.d.j(r11, r12, r13);
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(j$.time.format.v r11, java.lang.CharSequence r12, int r13) {
        /*
            r10 = this;
            j$.time.format.a0 r1 = r10.c
            j$.time.temporal.TemporalField r6 = r10.a
            int r2 = r12.length()
            if (r13 < 0) goto Ld0
            if (r13 > r2) goto Ld0
            boolean r2 = r11.c
            j$.time.format.DateTimeFormatter r3 = r11.a
            if (r2 == 0) goto L15
            j$.time.format.TextStyle r2 = r10.b
            goto L16
        L15:
            r2 = 0
        L16:
            j$.time.chrono.j r7 = r11.d()
            if (r7 == 0) goto L29
            j$.time.chrono.q r5 = j$.time.chrono.q.c
            if (r7 != r5) goto L21
            goto L29
        L21:
            java.util.Locale r3 = r3.b
            java.util.Iterator r1 = r1.d(r7, r6, r2, r3)
        L27:
            r8 = r1
            goto L30
        L29:
            java.util.Locale r3 = r3.b
            java.util.Iterator r1 = r1.e(r6, r2, r3)
            goto L27
        L30:
            if (r8 == 0) goto Lb7
        L32:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r8.next()
            r9 = r1
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            int r5 = r1.length()
            r0 = r11
            r3 = r12
            r4 = r13
            boolean r2 = r0.h(r1, r2, r3, r4, r5)
            if (r2 == 0) goto L32
            r0 = r1
            j$.time.temporal.TemporalField r1 = r10.a
            java.lang.Object r2 = r9.getValue()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r0 = r0.length()
            int r5 = r0 + r13
            r0 = r11
            r4 = r13
            int r0 = r0.g(r1, r2, r4, r5)
            return r0
        L6d:
            j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.ERA
            if (r6 != r1) goto Lb1
            boolean r1 = r11.c
            if (r1 != 0) goto Lb1
            java.util.List r1 = r7.s()
            java.util.Iterator r6 = r1.iterator()
        L7d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r6.next()
            r7 = r1
            j$.time.chrono.k r7 = (j$.time.chrono.k) r7
            java.lang.String r1 = r7.toString()
            r2 = 0
            int r5 = r1.length()
            r0 = r11
            r3 = r12
            r4 = r13
            boolean r2 = r0.h(r1, r2, r3, r4, r5)
            if (r2 == 0) goto L7d
            r0 = r1
            j$.time.temporal.TemporalField r1 = r10.a
            int r2 = r7.getValue()
            long r2 = (long) r2
            int r0 = r0.length()
            int r5 = r0 + r13
            r0 = r11
            r4 = r13
            int r0 = r0.g(r1, r2, r4, r5)
            return r0
        Lb1:
            boolean r1 = r11.c
            if (r1 == 0) goto Lb7
            int r0 = ~r13
            return r0
        Lb7:
            j$.time.format.j r1 = r10.d
            if (r1 != 0) goto Lc9
            j$.time.format.j r1 = new j$.time.format.j
            j$.time.temporal.TemporalField r2 = r10.a
            r3 = 19
            j$.time.format.SignStyle r5 = j$.time.format.SignStyle.NORMAL
            r6 = 1
            r1.<init>(r2, r6, r3, r5)
            r10.d = r1
        Lc9:
            j$.time.format.j r1 = r10.d
            int r0 = r1.j(r11, r12, r13)
            return r0
        Ld0:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.r.j(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.a;
        TextStyle textStyle2 = this.b;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
