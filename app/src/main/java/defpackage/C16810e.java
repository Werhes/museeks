package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16810e extends AbstractC13010e {
    public static final C16810e smaato;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٗؗ۟, eْؓۡ] */
    static {
        C18521e c18521e = new C18521e();
        AbstractC13818e.ad(c18521e);
        smaato = new AbstractC13010e(c18521e, AbstractC13818e.metrica, AbstractC13818e.vip, AbstractC13818e.license, AbstractC13818e.appmetrica, AbstractC13818e.purchase, AbstractC13818e.billing, AbstractC13818e.startapp, AbstractC13818e.yandex, AbstractC13818e.adcel, AbstractC13818e.mopub, AbstractC13818e.advert);
    }

    public static String ad(C12816e c12816e) {
        StringBuilder sb = new StringBuilder();
        C13579e c13579e = c12816e.ad;
        sb.append(c13579e.ad.replace('.', '/'));
        sb.append('/');
        sb.append((c13579e.metrica() ? "default-package" : c13579e.billing().vip()).concat(".kotlin_builtins"));
        return sb.toString();
    }
}
