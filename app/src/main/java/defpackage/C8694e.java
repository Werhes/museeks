package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8694e {
    public final C15051e billing;
    public final C15051e purchase;
    public final C0576e ad = AbstractC14533e.startapp(Boolean.TRUE);
    public final C0576e vip = AbstractC14533e.startapp(Boolean.FALSE);
    public final C2616e metrica = new C2616e(0.0f);
    public final C15867e license = new C15867e(0);
    public final C2616e appmetrica = new C2616e(1.0f);
    public long yandex = -1;
    public long startapp = -1;
    public long adcel = -1;
    public long mopub = -1;

    public C8694e(String str) {
        this.purchase = new C15051e(str.concat(" source"));
        this.billing = new C15051e(str.concat(" target"));
    }
}
