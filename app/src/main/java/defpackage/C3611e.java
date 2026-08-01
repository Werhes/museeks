package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3611e {
    public static final C12582e yandex = new C12582e(24);
    public final AbstractC14783e ad;
    public final boolean appmetrica;
    public final C12582e billing;
    public final int license;
    public final C7364e metrica;
    public final boolean purchase;
    public final EnumC4513e vip;

    public C3611e(AbstractC14783e abstractC14783e, EnumC4513e enumC4513e, int i, boolean z, boolean z2) {
        this.ad = abstractC14783e;
        this.vip = enumC4513e;
        int ordinal = enumC4513e.ordinal();
        this.metrica = ordinal != 1 ? ordinal != 3 ? C7364e.f15096e : C7364e.f15094e : C7364e.f15095e;
        this.license = i;
        this.appmetrica = z;
        this.purchase = z2;
        this.billing = yandex;
    }

    public final AbstractC14783e ad() {
        this.billing.getClass();
        return this.ad;
    }
}
