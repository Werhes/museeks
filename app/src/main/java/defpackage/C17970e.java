package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17970e extends AbstractC10226e implements InterfaceC12198e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C6557e f35220e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C17236e f35221e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f35222e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC15728e f35223e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f35224e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f35225e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17970e(int r8, defpackage.C17236e r9, defpackage.AbstractC15728e r10, defpackage.C6557e r11, boolean r12, int r13) {
        /*
            r7 = this;
            r0 = r13 & 8
            if (r0 == 0) goto Lb
            eَٗٞ r11 = defpackage.C6557e.f13492e
            r11.getClass()
            eًؙٟ r11 = defpackage.C6557e.f13491e
        Lb:
            r4 = r11
            r11 = r13 & 16
            if (r11 == 0) goto L11
            r12 = 0
        L11:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17970e.<init>(int, eٗۙٝ, eٕۛٙ, eًؙٟ, boolean, int):void");
    }

    public C17970e(int i, C17236e c17236e, AbstractC15728e abstractC15728e, C6557e c6557e, boolean z, boolean z2) {
        this.f35222e = i;
        this.f35221e = c17236e;
        this.f35223e = abstractC15728e;
        this.f35220e = c6557e;
        this.f35225e = z;
        this.f35224e = z2;
    }

    @Override // defpackage.AbstractC1186e
    public final boolean Signature() {
        return this.f35225e;
    }

    @Override // defpackage.AbstractC15728e
    /* renamed from: ads, reason: merged with bridge method [inline-methods] */
    public final C17970e signatures(C13520e c13520e) {
        C17236e c17236e = this.f35221e;
        AbstractC16232e license = c17236e.f33768e.license(c13520e);
        C1021e c1021e = c17236e.f33766e != null ? new C1021e(c17236e, c13520e, 9) : null;
        C17236e c17236e2 = c17236e.f33765e;
        if (c17236e2 == null) {
            c17236e2 = c17236e;
        }
        C17236e c17236e3 = new C17236e(license, c1021e, c17236e2, c17236e.f33767e);
        AbstractC15728e abstractC15728e = this.f35223e;
        return new C17970e(this.f35222e, c17236e3, abstractC15728e != null ? abstractC15728e : null, this.f35220e, this.f35225e, 32);
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return new C17970e(this.f35222e, this.f35221e, this.f35223e, c6557e, this.f35225e, this.f35224e);
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: eؗٔٓ */
    public final InterfaceC8528e mo483e() {
        return C18139e.ad(1, true, new String[0]);
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        return new C17970e(this.f35222e, this.f35221e, this.f35223e, this.f35220e, z, 32);
    }

    @Override // defpackage.AbstractC1186e
    public final InterfaceC5021e loadAd() {
        return this.f35221e;
    }

    @Override // defpackage.AbstractC1186e
    public final List mopub() {
        return C13664e.f27089e;
    }

    @Override // defpackage.AbstractC10226e, defpackage.AbstractC15728e
    public final AbstractC15728e pro(boolean z) {
        return new C17970e(this.f35222e, this.f35221e, this.f35223e, this.f35220e, z, 32);
    }

    @Override // defpackage.AbstractC1186e
    public final C6557e smaato() {
        return this.f35220e;
    }
}
