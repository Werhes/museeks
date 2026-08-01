package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5678e {
    public final InterfaceC7189e ad;
    public final InterfaceC7189e vip;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C5678e(defpackage.InterfaceC7189e r2, int r3) {
        /*
            r1 = this;
            r3 = r3 & 2
            eٖٗٛ r0 = defpackage.C17043e.ad
            if (r3 == 0) goto L7
            r2 = r0
        L7:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5678e.<init>(eٍؚٖ, int):void");
    }

    public C5678e(InterfaceC7189e interfaceC7189e, InterfaceC7189e interfaceC7189e2) {
        this.ad = interfaceC7189e;
        this.vip = interfaceC7189e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5678e)) {
            return false;
        }
        C5678e c5678e = (C5678e) obj;
        return AbstractC7890e.billing(this.ad, c5678e.ad) && AbstractC7890e.billing(this.vip, c5678e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.ad + ", nonSizeOrCornerModifiers=" + this.vip + ')';
    }
}
