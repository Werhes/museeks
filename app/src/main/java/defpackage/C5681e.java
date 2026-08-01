package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5681e extends C8256e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C16975e f12053e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final int f12054e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f12055e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int f12056e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C18208e f12057e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final boolean f12058e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final String f12059e;

    public C5681e(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5681e(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, defpackage.C16975e r19, int r20, defpackage.C18208e r21, boolean r22) {
        /*
            r13 = this;
            if (r14 == 0) goto L43
            r0 = 1
            if (r14 == r0) goto L14
            r0 = 3
            if (r14 == r0) goto L11
            java.lang.String r0 = "Unexpected runtime error"
        La:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L4b
        L11:
            java.lang.String r0 = "Remote error"
            goto La
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r17
            r0.append(r5)
            java.lang.String r1 = " error, index="
            r0.append(r1)
            r6 = r18
            r0.append(r6)
            java.lang.String r1 = ", format="
            r0.append(r1)
            r7 = r19
            r0.append(r7)
            java.lang.String r1 = ", format_supported="
            r0.append(r1)
            java.lang.String r1 = defpackage.AbstractC9413e.subs(r20)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L4b
        L43:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L4b:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L58
            java.lang.String r1 = ": null"
            java.lang.String r0 = defpackage.AbstractC10257e.adcel(r0, r1)
        L58:
            r1 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r8 = r20
            r9 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5681e.<init>(int, java.lang.Exception, int, java.lang.String, int, eٌْٗ, int, eَٛ, boolean):void");
    }

    public C5681e(String str, Throwable th, int i, int i2, String str2, int i3, C16975e c16975e, int i4, C18208e c18208e, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        AbstractC2301e.billing(!z || i2 == 1);
        AbstractC2301e.billing(th != null || i2 == 3);
        this.f12055e = i2;
        this.f12059e = str2;
        this.f12054e = i3;
        this.f12053e = c16975e;
        this.f12056e = i4;
        this.f12057e = c18208e;
        this.f12058e = z;
    }

    @Override // defpackage.C8256e
    public final boolean ad(C8256e c8256e) {
        if (!super.ad(c8256e)) {
            return false;
        }
        String str = AbstractC9413e.ad;
        C5681e c5681e = (C5681e) c8256e;
        return this.f12055e == c5681e.f12055e && Objects.equals(this.f12059e, c5681e.f12059e) && this.f12054e == c5681e.f12054e && Objects.equals(this.f12053e, c5681e.f12053e) && this.f12056e == c5681e.f12056e && Objects.equals(this.f12057e, c5681e.f12057e) && this.f12058e == c5681e.f12058e;
    }

    public final C5681e metrica(C18208e c18208e) {
        String message = getMessage();
        String str = AbstractC9413e.ad;
        return new C5681e(message, getCause(), this.f16770e, this.f12055e, this.f12059e, this.f12054e, this.f12053e, this.f12056e, c18208e, this.f16769e, this.f12058e);
    }
}
