package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5484e implements InterfaceC4082e {
    public final C0912e ad;
    public final int license;
    public final int metrica;
    public final C5891e vip;

    public C5484e(C0912e c0912e, C5891e c5891e, int i, int i2) {
        this.ad = c0912e;
        this.vip = c5891e;
        this.metrica = i;
        this.license = i2;
    }

    @Override // defpackage.InterfaceC4082e
    public final long appmetrica() {
        return 2048L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        if ((r11 != null ? r11.size() : 0) > 0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, eِّؔ] */
    @Override // defpackage.InterfaceC4082e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5484e.billing(android.graphics.Canvas):void");
    }

    @Override // defpackage.InterfaceC4082e
    public final int getWidth() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC4082e
    public final boolean purchase() {
        return true;
    }

    @Override // defpackage.InterfaceC4082e
    public final int vip() {
        return this.license;
    }
}
