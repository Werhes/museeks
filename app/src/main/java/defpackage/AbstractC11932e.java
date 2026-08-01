package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11932e {
    public static final C5720e ad;
    public static final C13780e appmetrica;
    public static final C10221e license;
    public static final C13507e metrica;
    public static final C17594e purchase;
    public static final C5720e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.HmacKey");
        C17424e ad2 = C5720e.ad();
        ad2.advert(EnumC3021e.RAW, C2942e.appmetrica);
        ad2.advert(EnumC3021e.TINK, C2942e.vip);
        ad2.advert(EnumC3021e.LEGACY, C2942e.license);
        ad2.advert(EnumC3021e.CRUNCHY, C2942e.metrica);
        ad = ad2.Signature();
        C17424e ad3 = C5720e.ad();
        ad3.advert(EnumC10611e.SHA1, C3700e.vip);
        ad3.advert(EnumC10611e.SHA224, C3700e.metrica);
        ad3.advert(EnumC10611e.SHA256, C3700e.license);
        ad3.advert(EnumC10611e.SHA384, C3700e.appmetrica);
        ad3.advert(EnumC10611e.SHA512, C3700e.purchase);
        vip = ad3.Signature();
        metrica = new C13507e(C9622e.class, new C12582e(29));
        license = new C10221e(metrica2, new C0189e(0));
        appmetrica = new C13780e(C1127e.class, new C0189e(1));
        purchase = new C17594e(metrica2, new C0189e(2));
    }
}
