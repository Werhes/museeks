package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13309e implements InterfaceC12986e {
    public final String ad;
    public final C9885e vip;

    public C13309e(C9885e c9885e, String str) {
        this.ad = str;
        this.vip = c9885e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C13309e.class.equals(obj != null ? obj.getClass() : null)) {
            return AbstractC7890e.billing(this.ad, ((C13309e) obj).ad);
        }
        return false;
    }

    @Override // defpackage.InterfaceC12986e
    public final String getId() {
        return this.ad;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
