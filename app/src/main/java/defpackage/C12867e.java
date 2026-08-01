package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12867e extends AbstractC3442e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final String[] f25703e = new String[128];

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f25704e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC11855e f25705e;

    static {
        for (int i = 0; i <= 31; i++) {
            f25703e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f25703e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C12867e(InterfaceC11855e interfaceC11855e) {
        int[] iArr = new int[32];
        this.f7701e = iArr;
        this.f7700e = new String[32];
        this.f7702e = new int[32];
        this.f7704e = -1;
        this.f25705e = interfaceC11855e;
        this.f7703e = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: extends, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3409extends(defpackage.InterfaceC11855e r6, java.lang.String r7) {
        /*
            r0 = 34
            r6.writeByte(r0)
            int r1 = r7.length()
            r2 = 0
            r3 = r2
        Lb:
            if (r2 >= r1) goto L36
            char r4 = r7.charAt(r2)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 >= r5) goto L1c
            java.lang.String[] r5 = defpackage.C12867e.f25703e
            r4 = r5[r4]
            if (r4 != 0) goto L29
            goto L33
        L1c:
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 != r5) goto L23
            java.lang.String r4 = "\\u2028"
            goto L29
        L23:
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L33
            java.lang.String r4 = "\\u2029"
        L29:
            if (r3 >= r2) goto L2e
            r6.mo2632return(r3, r2, r7)
        L2e:
            r6.mo2631private(r4)
            int r3 = r2 + 1
        L33:
            int r2 = r2 + 1
            goto Lb
        L36:
            if (r3 >= r1) goto L3b
            r6.mo2632return(r3, r1, r7)
        L3b:
            r6.writeByte(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12867e.m3409extends(eِٜؒ, java.lang.String):void");
    }

    @Override // defpackage.AbstractC3442e
    public final C12867e Signature() {
        if (this.f7699e) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + advert());
        }
        if (this.f25704e != null) {
            this.f25704e = null;
            return this;
        }
        subs();
        this.f25705e.mo2631private("null");
        int[] iArr = this.f7702e;
        int i = this.f7703e - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.AbstractC3442e
    public final C12867e ad() {
        if (this.f7699e) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + advert());
        }
        m3411protected();
        m3410goto(1, 2, '[');
        return this;
    }

    @Override // defpackage.AbstractC3442e
    public final C12867e ads(String str) {
        if (str == null) {
            Signature();
            return this;
        }
        if (this.f7699e) {
            this.f7699e = false;
            loadAd(str);
            return this;
        }
        m3411protected();
        subs();
        m3409extends(this.f25705e, str);
        int[] iArr = this.f7702e;
        int i = this.f7703e - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25705e.close();
        int i = this.f7703e;
        if (i > 1 || (i == 1 && this.f7701e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f7703e = 0;
    }

    public final void crashlytics(int i, int i2, char c) {
        int isVip = isVip();
        if (isVip != i2 && isVip != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f25704e != null) {
            throw new IllegalStateException("Dangling name: " + this.f25704e);
        }
        int i3 = this.f7703e;
        int i4 = ~this.f7704e;
        if (i3 == i4) {
            this.f7704e = i4;
            return;
        }
        int i5 = i3 - 1;
        this.f7703e = i5;
        this.f7700e[i5] = null;
        int[] iArr = this.f7702e;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f25705e.writeByte(c);
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f7703e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f25705e.flush();
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3410goto(int i, int i2, char c) {
        int i3;
        int i4 = this.f7703e;
        int i5 = this.f7704e;
        if (i4 == i5 && ((i3 = this.f7701e[i4 - 1]) == i || i3 == i2)) {
            this.f7704e = ~i5;
            return;
        }
        subs();
        int i6 = this.f7703e;
        int[] iArr = this.f7701e;
        if (i6 == iArr.length) {
            if (i6 == 256) {
                throw new C14803e("Nesting too deep at " + advert() + ": circular reference?", 8, (byte) 0);
            }
            this.f7701e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f7700e;
            this.f7700e = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f7702e;
            this.f7702e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f7701e;
        int i7 = this.f7703e;
        this.f7703e = i7 + 1;
        iArr3[i7] = i;
        this.f7702e[i7] = 0;
        this.f25705e.writeByte(c);
    }

    @Override // defpackage.AbstractC3442e
    public final C12867e inmobi(long j) {
        if (this.f7699e) {
            this.f7699e = false;
            loadAd(Long.toString(j));
            return this;
        }
        m3411protected();
        subs();
        this.f25705e.mo2631private(Long.toString(j));
        int[] iArr = this.f7702e;
        int i = this.f7703e - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.AbstractC3442e
    public final C12867e license() {
        if (this.f7699e) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + advert());
        }
        m3411protected();
        m3410goto(3, 5, '{');
        return this;
    }

    @Override // defpackage.AbstractC3442e
    public final C12867e loadAd(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f7703e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int isVip = isVip();
        if ((isVip != 3 && isVip != 5) || this.f25704e != null || this.f7699e) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f25704e = str;
        this.f7700e[this.f7703e - 1] = str;
        return this;
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m3411protected() {
        if (this.f25704e != null) {
            int isVip = isVip();
            InterfaceC11855e interfaceC11855e = this.f25705e;
            if (isVip == 5) {
                interfaceC11855e.writeByte(44);
            } else if (isVip != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f7701e[this.f7703e - 1] = 4;
            m3409extends(interfaceC11855e, this.f25704e);
            this.f25704e = null;
        }
    }

    @Override // defpackage.AbstractC3442e
    public final C12867e purchase() {
        this.f7699e = false;
        crashlytics(3, 5, '}');
        return this;
    }

    public final void subs() {
        int isVip = isVip();
        int i = 2;
        if (isVip != 1) {
            InterfaceC11855e interfaceC11855e = this.f25705e;
            if (isVip == 2) {
                interfaceC11855e.writeByte(44);
            } else if (isVip == 4) {
                interfaceC11855e.mo2631private(":");
                i = 5;
            } else {
                if (isVip == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (isVip != 6) {
                    if (isVip != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                i = 7;
            }
        }
        this.f7701e[this.f7703e - 1] = i;
    }
}
