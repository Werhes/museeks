package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16244e {
    public static final C0520e ad = C0520e.appmetrica("message");
    public static final C0520e vip = C0520e.appmetrica("allowedTargets");
    public static final C0520e metrica = C0520e.appmetrica("value");
    public static final Object license = AbstractC10064e.purchase(new C6571e(AbstractC0206e.pro, AbstractC15262e.metrica), new C6571e(AbstractC0206e.isVip, AbstractC15262e.license), new C6571e(AbstractC0206e.inmobi, AbstractC15262e.purchase));

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public static InterfaceC14707e ad(C12816e c12816e, InterfaceC16902e interfaceC16902e, C11980e c11980e) {
        C2430e license2;
        C2430e license3;
        if (c12816e.equals(AbstractC0206e.smaato) && (license3 = interfaceC16902e.license(AbstractC15262e.appmetrica)) != null) {
            return new C12794e(license3, c11980e);
        }
        C12816e c12816e2 = (C12816e) license.get(c12816e);
        if (c12816e2 == null || (license2 = interfaceC16902e.license(c12816e2)) == null) {
            return null;
        }
        return vip(license2, c11980e, false);
    }

    public static InterfaceC14707e vip(C2430e c2430e, C11980e c11980e, boolean z) {
        C11709e ad2 = AbstractC2677e.ad(((InterfaceC18155e) AbstractC14437e.appmetrica(c2430e.ad)).subs());
        C12816e c12816e = AbstractC15262e.metrica;
        if (ad2.equals(new C11709e(c12816e.vip(), c12816e.ad.billing()))) {
            return new C1784e(c2430e, c11980e);
        }
        C12816e c12816e2 = AbstractC15262e.license;
        if (ad2.equals(new C11709e(c12816e2.vip(), c12816e2.ad.billing()))) {
            return new C14844e(c2430e, c11980e);
        }
        C12816e c12816e3 = AbstractC15262e.purchase;
        if (ad2.equals(new C11709e(c12816e3.vip(), c12816e3.ad.billing()))) {
            return new C14698e(c11980e, c2430e, AbstractC0206e.inmobi);
        }
        C12816e c12816e4 = AbstractC15262e.appmetrica;
        if (ad2.equals(new C11709e(c12816e4.vip(), c12816e4.ad.billing()))) {
            return null;
        }
        return new C17696e(c2430e, c11980e, z);
    }
}
