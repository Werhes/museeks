package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15508e implements InterfaceC1848e {
    public static final C15508e ad = new Object();
    public static final C7369e vip = new C7369e("projectNumber", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(1))));
    public static final C7369e metrica = new C7369e("messageId", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(2))));
    public static final C7369e license = new C7369e("instanceId", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(3))));
    public static final C7369e appmetrica = new C7369e("messageType", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(4))));
    public static final C7369e purchase = new C7369e("sdkPlatform", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(5))));
    public static final C7369e billing = new C7369e("packageName", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(6))));
    public static final C7369e yandex = new C7369e("collapseKey", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(7))));
    public static final C7369e startapp = new C7369e("priority", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(8))));
    public static final C7369e adcel = new C7369e("ttl", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(9))));
    public static final C7369e mopub = new C7369e("topic", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(10))));
    public static final C7369e advert = new C7369e("bulkId", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(11))));
    public static final C7369e smaato = new C7369e("event", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(12))));
    public static final C7369e amazon = new C7369e("analyticsLabel", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(13))));
    public static final C7369e loadAd = new C7369e("campaignId", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(14))));
    public static final C7369e Signature = new C7369e("composerLabel", AbstractC10257e.Signature(AbstractC10257e.loadAd(InterfaceC10332e.class, new C4207e(15))));

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C18488e c18488e = (C18488e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.billing(vip, c18488e.ad);
        interfaceC14209e.ad(metrica, c18488e.vip);
        interfaceC14209e.ad(license, c18488e.metrica);
        interfaceC14209e.ad(appmetrica, c18488e.license);
        interfaceC14209e.ad(purchase, EnumC6601e.ANDROID);
        interfaceC14209e.ad(billing, c18488e.appmetrica);
        interfaceC14209e.ad(yandex, c18488e.purchase);
        interfaceC14209e.appmetrica(startapp, c18488e.billing);
        interfaceC14209e.appmetrica(adcel, c18488e.yandex);
        interfaceC14209e.ad(mopub, c18488e.startapp);
        interfaceC14209e.billing(advert, 0L);
        interfaceC14209e.ad(smaato, EnumC11926e.MESSAGE_DELIVERED);
        interfaceC14209e.ad(amazon, c18488e.adcel);
        interfaceC14209e.billing(loadAd, 0L);
        interfaceC14209e.ad(Signature, c18488e.mopub);
    }
}
