package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۘۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8933e {
    public final InterfaceC18435e ad;
    public final C2616e billing;
    public final InterfaceC3314e vip;
    public final C2616e yandex;
    public final C6656e metrica = AbstractC14533e.purchase(new C10229e(this, 1));
    public final C0576e license = AbstractC14533e.startapp(Boolean.FALSE);
    public final C2616e appmetrica = new C2616e(0.0f);
    public final C2616e purchase = new C2616e(0.0f);
    public final C10684e startapp = new C10684e();

    public C8933e(InterfaceC18435e interfaceC18435e, InterfaceC3314e interfaceC3314e, float f, float f2) {
        this.ad = interfaceC18435e;
        this.vip = interfaceC3314e;
        this.billing = new C2616e(f2);
        this.yandex = new C2616e(f);
    }

    public final float ad() {
        return ((Number) this.metrica.getValue()).floatValue();
    }

    public final boolean vip() {
        return ((Boolean) this.license.getValue()).booleanValue();
    }
}
