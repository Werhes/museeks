package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15752e implements InterfaceC11968e {
    public final int ad;
    public final String vip;
    public final C0576e metrica = AbstractC14533e.startapp(C7088e.appmetrica);
    public final C0576e license = AbstractC14533e.startapp(Boolean.TRUE);

    public C15752e(int i, String str) {
        this.ad = i;
        this.vip = str;
    }

    @Override // defpackage.InterfaceC11968e
    public final int ad(InterfaceC14388e interfaceC14388e) {
        return appmetrica().vip;
    }

    public final C7088e appmetrica() {
        return (C7088e) this.metrica.getValue();
    }

    public final void billing(C12948e c12948e, int i) {
        int i2 = this.ad;
        if (i == 0 || (i & i2) != 0) {
            this.metrica.setValue(c12948e.ad.startapp(i2));
            purchase(c12948e.ad.signatures(i2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15752e) {
            return this.ad == ((C15752e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC11968e
    public final int license(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        return appmetrica().ad;
    }

    @Override // defpackage.InterfaceC11968e
    public final int metrica(InterfaceC14388e interfaceC14388e) {
        return appmetrica().license;
    }

    public final void purchase(boolean z) {
        this.license.setValue(Boolean.valueOf(z));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vip);
        sb.append('(');
        sb.append(appmetrica().ad);
        sb.append(", ");
        sb.append(appmetrica().vip);
        sb.append(", ");
        sb.append(appmetrica().metrica);
        sb.append(", ");
        return AbstractC1786e.pro(sb, appmetrica().license, ')');
    }

    @Override // defpackage.InterfaceC11968e
    public final int vip(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        return appmetrica().metrica;
    }
}
