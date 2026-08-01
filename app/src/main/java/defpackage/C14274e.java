package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۟ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14274e implements InterfaceC16522e {
    public final AbstractC9876e ad;
    public final float vip;

    public C14274e(AbstractC9876e abstractC9876e, float f) {
        this.ad = abstractC9876e;
        this.vip = f;
    }

    @Override // defpackage.InterfaceC16522e
    public final float ad() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC16522e
    public final AbstractC4457e appmetrica() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14274e)) {
            return false;
        }
        C14274e c14274e = (C14274e) obj;
        return AbstractC7890e.billing(this.ad, c14274e.ad) && Float.compare(this.vip, c14274e.vip) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip) + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC16522e
    public final /* synthetic */ InterfaceC16522e license(InterfaceC16522e interfaceC16522e) {
        return AbstractC1786e.purchase(this, interfaceC16522e);
    }

    @Override // defpackage.InterfaceC16522e
    public final InterfaceC16522e metrica(Function0 function0) {
        return !equals(C0925e.ad) ? this : (InterfaceC16522e) function0.invoke();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.ad);
        sb.append(", alpha=");
        return AbstractC17861e.remoteconfig(sb, this.vip, ')');
    }

    @Override // defpackage.InterfaceC16522e
    public final long vip() {
        int i = C3618e.mopub;
        return C3618e.adcel;
    }
}
