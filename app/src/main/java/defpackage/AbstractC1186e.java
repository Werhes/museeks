package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1186e implements InterfaceC15633e, InterfaceC9905e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f3785e;

    public abstract boolean Signature();

    public abstract AbstractC1186e admob(C13520e c13520e);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1186e)) {
            return false;
        }
        AbstractC1186e abstractC1186e = (AbstractC1186e) obj;
        if (Signature() == abstractC1186e.Signature()) {
            return AbstractC0426e.purchase(C4590e.f9890e, subscription(), abstractC1186e.subscription());
        }
        return false;
    }

    /* renamed from: eؗٔٓ, reason: contains not printable characters */
    public abstract InterfaceC8528e mo483e();

    @Override // defpackage.InterfaceC15633e
    public final InterfaceC2460e getAnnotations() {
        InterfaceC2460e interfaceC2460e;
        C6557e smaato = smaato();
        C5401e c5401e = AbstractC16662e.vip;
        InterfaceC8614e interfaceC8614e = AbstractC16662e.ad[0];
        C11720e c11720e = (C11720e) c5401e.ads(smaato);
        return (c11720e == null || (interfaceC2460e = c11720e.ad) == null) ? C4590e.f9885e : interfaceC2460e;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.f3785e;
        if (i != 0) {
            return i;
        }
        if (AbstractC4520e.purchase(this)) {
            hashCode = super.hashCode();
        } else {
            hashCode = (Signature() ? 1 : 0) + ((mopub().hashCode() + (loadAd().hashCode() * 31)) * 31);
        }
        this.f3785e = hashCode;
        return hashCode;
    }

    public abstract InterfaceC5021e loadAd();

    public abstract List mopub();

    public abstract C6557e smaato();

    public abstract AbstractC15728e subscription();
}
