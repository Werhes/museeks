package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leَ۟ۦ;", "Leِٝؓ;", "Leؓٗٞ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eَ۟ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10568e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f20853e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC2141e f20854e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1839e f20855e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f20856e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f20857e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f20858e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f20859e;

    public C10568e(String str, C1839e c1839e, InterfaceC2141e interfaceC2141e, int i, boolean z, int i2, int i3) {
        this.f20857e = str;
        this.f20855e = c1839e;
        this.f20854e = interfaceC2141e;
        this.f20856e = i;
        this.f20853e = z;
        this.f20859e = i2;
        this.f20858e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10568e)) {
            return false;
        }
        C10568e c10568e = (C10568e) obj;
        return AbstractC7890e.billing(this.f20857e, c10568e.f20857e) && AbstractC7890e.billing(this.f20855e, c10568e.f20855e) && AbstractC7890e.billing(this.f20854e, c10568e.f20854e) && this.f20856e == c10568e.f20856e && this.f20853e == c10568e.f20853e && this.f20859e == c10568e.f20859e && this.f20858e == c10568e.f20858e;
    }

    public final int hashCode() {
        return (((((((((this.f20854e.hashCode() + AbstractC1786e.smaato(this.f20855e, this.f20857e.hashCode() * 31, 31)) * 31) + this.f20856e) * 31) + (this.f20853e ? 1231 : 1237)) * 31) + this.f20859e) * 31) + this.f20858e) * 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؓٗٞ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f4985e = this.f20857e;
        abstractC13616e.f4986e = this.f20855e;
        abstractC13616e.f4984e = this.f20854e;
        abstractC13616e.f4983e = this.f20856e;
        abstractC13616e.f4990e = this.f20853e;
        abstractC13616e.f4993e = this.f20859e;
        abstractC13616e.f4982e = this.f20858e;
        return abstractC13616e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // defpackage.AbstractC11865e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex(defpackage.AbstractC13616e r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            eؓٗٞ r1 = (defpackage.C1869e) r1
            r1.getClass()
            eٕؓۧ r2 = r1.f4986e
            r3 = 0
            r4 = 1
            eٕؓۧ r5 = r0.f20855e
            if (r5 == r2) goto L1e
            eٟؖۧ r6 = r5.ad
            eٟؖۧ r2 = r2.ad
            boolean r2 = r6.vip(r2)
            if (r2 == 0) goto L1c
            goto L21
        L1c:
            r2 = r4
            goto L22
        L1e:
            r5.getClass()
        L21:
            r2 = r3
        L22:
            java.lang.String r6 = r1.f4985e
            java.lang.String r7 = r0.f20857e
            boolean r6 = defpackage.AbstractC7890e.billing(r6, r7)
            r8 = 0
            if (r6 == 0) goto L2e
            goto L33
        L2e:
            r1.f4985e = r7
            r1.f4987e = r8
            r3 = r4
        L33:
            eٕؓۧ r6 = r1.f4986e
            boolean r6 = r6.license(r5)
            r6 = r6 ^ r4
            r1.f4986e = r5
            int r5 = r1.f4982e
            int r7 = r0.f20858e
            if (r5 == r7) goto L45
            r1.f4982e = r7
            r6 = r4
        L45:
            int r5 = r1.f4993e
            int r7 = r0.f20859e
            if (r5 == r7) goto L4e
            r1.f4993e = r7
            r6 = r4
        L4e:
            boolean r5 = r1.f4990e
            boolean r7 = r0.f20853e
            if (r5 == r7) goto L57
            r1.f4990e = r7
            r6 = r4
        L57:
            eؓ۠٘ r5 = r1.f4984e
            eؓ۠٘ r7 = r0.f20854e
            boolean r5 = defpackage.AbstractC7890e.billing(r5, r7)
            if (r5 != 0) goto L64
            r1.f4984e = r7
            r6 = r4
        L64:
            int r5 = r1.f4983e
            int r7 = r0.f20856e
            if (r5 != r7) goto L6c
            r4 = r6
            goto L6e
        L6c:
            r1.f4983e = r7
        L6e:
            if (r2 != 0) goto L74
            if (r3 != 0) goto L74
            if (r4 == 0) goto L76
        L74:
            r1.f4992e = r8
        L76:
            if (r3 != 0) goto L7a
            if (r4 == 0) goto L91
        L7a:
            eٍۖۚ r9 = r1.m707e()
            java.lang.String r10 = r1.f4985e
            eٕؓۧ r11 = r1.f4986e
            eؓ۠٘ r12 = r1.f4984e
            int r13 = r1.f4983e
            boolean r14 = r1.f4990e
            int r15 = r1.f4993e
            int r5 = r1.f4982e
            r16 = r5
            r9.purchase(r10, r11, r12, r13, r14, r15, r16)
        L91:
            boolean r5 = r1.f27016e
            if (r5 != 0) goto L96
            goto Lb0
        L96:
            if (r3 != 0) goto L9e
            if (r2 == 0) goto La1
            eؚؐۢ r5 = r1.f4988e
            if (r5 == 0) goto La1
        L9e:
            defpackage.AbstractC15118e.appmetrica(r1)
        La1:
            if (r3 != 0) goto La5
            if (r4 == 0) goto Lab
        La5:
            defpackage.AbstractC1599e.purchase(r1)
            defpackage.AbstractC12640e.advert(r1)
        Lab:
            if (r2 == 0) goto Lb0
            defpackage.AbstractC12640e.advert(r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10568e.yandex(eْۤۡ):void");
    }
}
