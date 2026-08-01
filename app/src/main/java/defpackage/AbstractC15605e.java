package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٝ٘ */
/* loaded from: classes.dex */
public abstract class AbstractC15605e {
    public static final String ad = AbstractC6507e.admob(10, "H");

    public static final long ad(C1839e c1839e, InterfaceC14388e interfaceC14388e, InterfaceC2141e interfaceC2141e, String str, int i) {
        C6342e vip = AbstractC9186e.vip(str, c1839e, AbstractC2278e.vip(0, 0, 0, 0, 15), interfaceC14388e, interfaceC2141e, i, 64);
        return (AbstractC7861e.billing(((C9904e) vip.f13183e).yandex()) << 32) | (AbstractC7861e.billing(vip.adcel()) & 4294967295L);
    }

    public static /* synthetic */ long vip(C1839e c1839e, InterfaceC14388e interfaceC14388e, InterfaceC2141e interfaceC2141e) {
        return ad(c1839e, interfaceC14388e, interfaceC2141e, ad, 1);
    }
}
