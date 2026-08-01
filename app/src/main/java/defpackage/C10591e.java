package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۡٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10591e {
    public final String ad;
    public final InterfaceC12561e vip;

    public C10591e(String str, InterfaceC12561e interfaceC12561e) {
        this.ad = str;
        this.vip = interfaceC12561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10591e)) {
            return false;
        }
        C10591e c10591e = (C10591e) obj;
        return AbstractC7890e.billing(this.ad, c10591e.ad) && AbstractC7890e.billing(this.vip, c10591e.vip);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC12561e interfaceC12561e = this.vip;
        return hashCode + (interfaceC12561e != null ? interfaceC12561e.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.ad + ", action=" + this.vip + ')';
    }
}
