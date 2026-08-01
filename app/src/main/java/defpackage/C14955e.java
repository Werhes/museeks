package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14955e {
    public final boolean ad;
    public final boolean appmetrica;
    public final boolean license;
    public final int metrica;
    public final boolean purchase;
    public final C5401e vip;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14955e(boolean r6, defpackage.C5401e r7, int r8, boolean r9, int r10) {
        /*
            r5 = this;
            r0 = r10 & 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r2
        Lf:
            r0 = r10 & 4
            if (r0 == 0) goto L18
            eؘؔٔ r7 = new eؘؔٔ
            r7.<init>(r2, r1)
        L18:
            r0 = r10 & 16
            if (r0 == 0) goto L1d
            r8 = r2
        L1d:
            r0 = r10 & 32
            if (r0 == 0) goto L62
            java.util.Map r0 = defpackage.C5122e.metrica
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 27
            if (r0 > r3) goto L2a
            goto L62
        L2a:
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r4 = "samsungexynos7870"
            boolean r4 = defpackage.AbstractC7890e.billing(r3, r4)
            if (r4 == 0) goto L35
            goto L62
        L35:
            java.lang.String r4 = "qcom"
            boolean r3 = defpackage.AbstractC6507e.loadAd(r3, r4, r1)
            if (r3 == 0) goto L41
            r3 = 31
            if (r0 <= r3) goto L62
        L41:
            java.lang.Object r0 = defpackage.C5122e.license
            java.lang.String r3 = android.os.Build.BRAND
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r3)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L60
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r3 = r3.toLowerCase(r4)
            boolean r0 = r0.contains(r3)
            if (r0 != r1) goto L60
            goto L62
        L60:
            r0 = r2
            goto L63
        L62:
            r0 = r1
        L63:
            r3 = r10 & 64
            if (r3 == 0) goto L68
            r9 = r2
        L68:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L6d
            r1 = r2
        L6d:
            r5.<init>()
            r5.ad = r6
            r5.vip = r7
            r5.metrica = r8
            r5.license = r0
            r5.appmetrica = r9
            r5.purchase = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14955e.<init>(boolean, eؘؔٔ, int, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14955e)) {
            return false;
        }
        C14955e c14955e = (C14955e) obj;
        return this.ad == c14955e.ad && AbstractC7890e.billing(this.vip, c14955e.vip) && this.metrica == c14955e.metrica && this.license == c14955e.license && this.appmetrica == c14955e.appmetrica && this.purchase == c14955e.purchase;
    }

    public final int hashCode() {
        return ((((((((this.vip.hashCode() + ((38347 + (this.ad ? 1231 : 1237)) * 31)) * 961) + this.metrica) * 31) + (this.license ? 1231 : 1237)) * 31) + (this.appmetrica ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
        sb.append(this.ad);
        sb.append(", awaitRepeatingRequestBeforeCapture=");
        sb.append(this.vip);
        sb.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
        sb.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.metrica + ')'));
        sb.append(", closeCaptureSessionOnDisconnect=");
        sb.append(this.license);
        sb.append(", closeCameraDeviceOnClose=");
        sb.append(this.appmetrica);
        sb.append(", enableRestartDelays=");
        return AbstractC1786e.isVip(sb, this.purchase, ')');
    }
}
