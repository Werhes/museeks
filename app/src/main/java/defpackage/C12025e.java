package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12025e {
    public final InterfaceC7227e ad;
    public final InterfaceC13984e vip;

    public C12025e(InterfaceC7227e interfaceC7227e, InterfaceC13984e interfaceC13984e) {
        this.ad = interfaceC7227e;
        this.vip = interfaceC13984e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12025e)) {
            return false;
        }
        InterfaceC13984e interfaceC13984e = this.vip;
        if (interfaceC13984e == null) {
            C12025e c12025e = (C12025e) obj;
            if (c12025e.vip == null) {
                return AbstractC7890e.billing(this.ad, c12025e.ad);
            }
        }
        return AbstractC7890e.billing(interfaceC13984e, ((C12025e) obj).vip);
    }

    public final int hashCode() {
        InterfaceC13984e interfaceC13984e = this.vip;
        return interfaceC13984e != null ? interfaceC13984e.hashCode() : this.ad.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.vip;
        if (obj == null) {
            obj = this.ad;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
