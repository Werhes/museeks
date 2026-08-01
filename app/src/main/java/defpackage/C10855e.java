package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10855e extends AbstractC12082e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f21501e;

    public C10855e(String str) {
        this.f21501e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void firebase(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L42
        L3b:
            r5[r1] = r7
            goto L42
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L42:
            if (r9 == r1) goto L56
            if (r9 == r4) goto L52
            if (r9 == r3) goto L4f
            if (r9 == r0) goto L56
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L56
        L4f:
            r5[r4] = r7
            goto L56
        L52:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L56:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10855e.firebase(int):void");
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        if (c13520e != null) {
            return this;
        }
        firebase(3);
        throw null;
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC10226e ads() {
        throw new IllegalStateException(this.f21501e);
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        if (c6557e != null) {
            throw new IllegalStateException(this.f21501e);
        }
        firebase(0);
        throw null;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        throw new IllegalStateException(this.f21501e);
    }

    @Override // defpackage.AbstractC10226e, defpackage.AbstractC15728e
    public final /* bridge */ /* synthetic */ AbstractC15728e isVip(C6557e c6557e) {
        isVip(c6557e);
        throw null;
    }

    @Override // defpackage.AbstractC12082e
    /* renamed from: premium */
    public final AbstractC10226e admob(C13520e c13520e) {
        if (c13520e != null) {
            return this;
        }
        firebase(3);
        throw null;
    }

    @Override // defpackage.AbstractC10226e, defpackage.AbstractC15728e
    public final /* bridge */ /* synthetic */ AbstractC15728e pro(boolean z) {
        pro(z);
        throw null;
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        if (c13520e != null) {
            return this;
        }
        firebase(3);
        throw null;
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC12082e subs(AbstractC10226e abstractC10226e) {
        throw new IllegalStateException(this.f21501e);
    }

    @Override // defpackage.AbstractC10226e
    public final String toString() {
        String str = this.f21501e;
        if (str != null) {
            return str;
        }
        firebase(1);
        throw null;
    }
}
