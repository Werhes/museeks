package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۤۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675e implements InterfaceC11968e {
    public final String ad;
    public final C0576e vip;

    public C0675e(C11303e c11303e, String str) {
        this.ad = str;
        this.vip = AbstractC14533e.startapp(c11303e);
    }

    @Override // defpackage.InterfaceC11968e
    public final int ad(InterfaceC14388e interfaceC14388e) {
        return appmetrica().vip;
    }

    public final C11303e appmetrica() {
        return (C11303e) this.vip.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0675e) {
            return AbstractC7890e.billing(appmetrica(), ((C0675e) obj).appmetrica());
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC11968e
    public final int license(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        return appmetrica().ad;
    }

    @Override // defpackage.InterfaceC11968e
    public final int metrica(InterfaceC14388e interfaceC14388e) {
        return appmetrica().license;
    }

    public final void purchase(C11303e c11303e) {
        this.vip.setValue(c11303e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append("(left=");
        sb.append(appmetrica().ad);
        sb.append(", top=");
        sb.append(appmetrica().vip);
        sb.append(", right=");
        sb.append(appmetrica().metrica);
        sb.append(", bottom=");
        return AbstractC1786e.pro(sb, appmetrica().license, ')');
    }

    @Override // defpackage.InterfaceC11968e
    public final int vip(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        return appmetrica().metrica;
    }
}
