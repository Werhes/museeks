package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2804e {
    public EnumC7792e ad;
    public Object appmetrica;
    public long billing;
    public C1839e license;
    public InterfaceC2141e metrica;
    public final C0576e purchase = AbstractC14533e.startapp(Boolean.TRUE);
    public InterfaceC14388e vip;

    public C2804e(EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e, InterfaceC2141e interfaceC2141e, C1839e c1839e, Object obj) {
        long ad;
        this.ad = enumC7792e;
        this.vip = interfaceC14388e;
        this.metrica = interfaceC2141e;
        this.license = c1839e;
        this.appmetrica = obj;
        ad = AbstractC15605e.ad(this.license, this.vip, this.metrica, AbstractC15605e.ad, 1);
        this.billing = ad;
    }

    public static void ad(C2804e c2804e, EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e, C1839e c1839e, int i) {
        if ((i & 1) != 0) {
            enumC7792e = c2804e.ad;
        }
        if ((i & 2) != 0) {
            interfaceC14388e = c2804e.vip;
        }
        InterfaceC2141e interfaceC2141e = c2804e.metrica;
        if ((i & 8) != 0) {
            c1839e = c2804e.license;
        }
        Object obj = c2804e.appmetrica;
        EnumC7792e enumC7792e2 = c2804e.ad;
        C0576e c0576e = c2804e.purchase;
        if (enumC7792e == enumC7792e2 && AbstractC7890e.billing(interfaceC14388e, c2804e.vip) && AbstractC7890e.billing(interfaceC2141e, c2804e.metrica) && AbstractC7890e.billing(c1839e, c2804e.license)) {
            if (AbstractC7890e.billing(obj, c2804e.appmetrica)) {
                return;
            }
            c2804e.appmetrica = obj;
            c0576e.setValue(Boolean.TRUE);
            return;
        }
        c2804e.ad = enumC7792e;
        c2804e.vip = interfaceC14388e;
        c2804e.metrica = interfaceC2141e;
        c2804e.license = c1839e;
        c0576e.setValue(Boolean.TRUE);
    }
}
