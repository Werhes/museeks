package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؓؒؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530e<T> {
    public static final C15716e Companion = new Object();
    public static final C4707e metrica;
    public final Object ad;
    public final String vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕۛؒ, java.lang.Object] */
    static {
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.spark.client.SparkWithHash", null, 2);
        c4707e.advert("data", false);
        c4707e.advert("hash", false);
        metrica = c4707e;
    }

    public /* synthetic */ C1530e(int i, Object obj, String str) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, metrica);
            throw null;
        }
        this.ad = obj;
        this.vip = str;
    }

    public C1530e(Object obj, String str) {
        this.ad = obj;
        this.vip = str;
    }
}
