package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2765e {
    public final InterfaceC8346e ad;
    public final boolean license;
    public final InterfaceC8346e metrica;
    public final InterfaceC8346e vip;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2765e() {
        /*
            r1 = this;
            eَؚ٘ r0 = defpackage.C10327e.f20377e
            r1.<init>(r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2765e.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2765e(InterfaceC8346e interfaceC8346e, InterfaceC8346e interfaceC8346e2, InterfaceC8346e interfaceC8346e3) {
        this.ad = interfaceC8346e;
        this.vip = interfaceC8346e2;
        this.metrica = interfaceC8346e3;
        this.license = ((AbstractC7674e) interfaceC8346e).isEmpty() && ((AbstractC7674e) interfaceC8346e2).isEmpty() && ((AbstractC7674e) interfaceC8346e3).isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2765e)) {
            return false;
        }
        C2765e c2765e = (C2765e) obj;
        return AbstractC7890e.billing(this.ad, c2765e.ad) && AbstractC7890e.billing(this.vip, c2765e.vip) && AbstractC7890e.billing(this.metrica, c2765e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SearchResults(tracksByTitle=" + this.ad + ", tracksByArtist=" + this.vip + ", playlists=" + this.metrica + ')';
    }
}
