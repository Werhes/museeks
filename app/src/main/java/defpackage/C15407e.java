package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15407e {
    public final InterfaceC10857e ad;
    public final InterfaceC10857e license;
    public final InterfaceC10857e metrica;
    public final InterfaceC10857e vip;

    public C15407e(InterfaceC10857e interfaceC10857e, InterfaceC10857e interfaceC10857e2, InterfaceC10857e interfaceC10857e3, InterfaceC10857e interfaceC10857e4) {
        this.ad = interfaceC10857e;
        this.vip = interfaceC10857e2;
        this.metrica = interfaceC10857e3;
        this.license = interfaceC10857e4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [eُؙۣ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eُؙۣ] */
    public static C15407e ad(C15407e c15407e, C0547e c0547e, C0547e c0547e2, int i) {
        C0547e c0547e3 = c0547e;
        if ((i & 1) != 0) {
            c0547e3 = c15407e.ad;
        }
        InterfaceC10857e interfaceC10857e = c15407e.vip;
        InterfaceC10857e interfaceC10857e2 = c15407e.metrica;
        C0547e c0547e4 = c0547e2;
        if ((i & 8) != 0) {
            c0547e4 = c15407e.license;
        }
        c15407e.getClass();
        return new C15407e(c0547e3, interfaceC10857e, interfaceC10857e2, c0547e4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15407e.class != obj.getClass()) {
            return false;
        }
        C15407e c15407e = (C15407e) obj;
        return AbstractC7890e.billing(this.ad, c15407e.ad) && AbstractC7890e.billing(this.vip, c15407e.vip) && AbstractC7890e.billing(this.metrica, c15407e.metrica) && AbstractC7890e.billing(this.license, c15407e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31);
    }
}
