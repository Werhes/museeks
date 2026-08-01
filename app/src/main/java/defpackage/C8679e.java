package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8679e {
    public static final C7936e billing = new C7936e(10);
    public final InterfaceC13158e ad;
    public final float appmetrica;
    public final long license;
    public final InterfaceC2141e metrica;
    public final float purchase;
    public final EnumC7792e vip;

    public C8679e(InterfaceC13158e interfaceC13158e, EnumC7792e enumC7792e, InterfaceC2141e interfaceC2141e, long j) {
        this.ad = interfaceC13158e;
        this.vip = enumC7792e;
        this.metrica = interfaceC2141e;
        this.license = j;
        this.appmetrica = interfaceC13158e.vip();
        this.purchase = interfaceC13158e.mo499package();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.ad + ", densityValue=" + this.appmetrica + ", fontScale=" + this.purchase + ", layoutDirection=" + this.vip + ", fontFamilyResolver=" + this.metrica + ", constraints=" + ((Object) C5602e.advert(this.license)) + ')';
    }
}
