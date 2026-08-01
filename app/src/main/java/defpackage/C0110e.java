package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110e {
    public static final /* synthetic */ int pro = 0;
    public static final long remoteconfig;
    public final C7558e Signature;
    public final InterfaceC18435e ad;
    public final C0576e adcel;
    public final C0576e admob;
    public long advert;
    public C16446e amazon;
    public InterfaceC6512e appmetrica;
    public boolean billing;
    public InterfaceC6512e license;
    public final C7558e loadAd;
    public final C12851e metrica;
    public final C0576e mopub;
    public InterfaceC6512e purchase;
    public long smaato;
    public final C0576e startapp;
    public long subscription;
    public final InterfaceC2661e vip;
    public final C0576e yandex;

    static {
        long j = Alert.DURATION_SHOW_INDEFINITELY;
        remoteconfig = (j & 4294967295L) | (j << 32);
    }

    public C0110e(InterfaceC18435e interfaceC18435e, InterfaceC2661e interfaceC2661e, C12851e c12851e) {
        this.ad = interfaceC18435e;
        this.vip = interfaceC2661e;
        this.metrica = c12851e;
        Boolean bool = Boolean.FALSE;
        this.yandex = AbstractC14533e.startapp(bool);
        this.startapp = AbstractC14533e.startapp(bool);
        this.adcel = AbstractC14533e.startapp(bool);
        this.mopub = AbstractC14533e.startapp(bool);
        long j = remoteconfig;
        this.advert = j;
        this.smaato = 0L;
        Object obj = null;
        this.amazon = interfaceC2661e != null ? interfaceC2661e.metrica() : null;
        int i = 12;
        this.loadAd = new C7558e(new C11490e(0L), AbstractC9546e.billing, obj, i);
        this.Signature = new C7558e(Float.valueOf(1.0f), AbstractC9546e.ad, obj, i);
        this.admob = AbstractC14533e.startapp(new C11490e(0L));
        this.subscription = j;
    }

    public final void ad() {
        C16446e c16446e = this.amazon;
        InterfaceC6512e interfaceC6512e = this.license;
        boolean booleanValue = ((Boolean) this.startapp.getValue()).booleanValue();
        InterfaceC18435e interfaceC18435e = this.ad;
        InterfaceC5083e interfaceC5083e = null;
        if (booleanValue || interfaceC6512e == null || c16446e == null) {
            if (metrica()) {
                if (c16446e != null) {
                    c16446e.purchase(1.0f);
                }
                AbstractC5336e.purchase(interfaceC18435e, null, 0, new C7538e(this, interfaceC5083e, 0), 3);
                return;
            }
            return;
        }
        appmetrica(true);
        boolean metrica = metrica();
        boolean z = !metrica;
        if (!metrica) {
            c16446e.purchase(0.0f);
        }
        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14078e(z, this, interfaceC6512e, c16446e, (InterfaceC5083e) null), 3);
    }

    public final void appmetrica(boolean z) {
        this.startapp.setValue(Boolean.valueOf(z));
    }

    public final void billing(boolean z) {
        this.yandex.setValue(Boolean.valueOf(z));
    }

    public final void license() {
        InterfaceC2661e interfaceC2661e;
        boolean booleanValue = ((Boolean) this.yandex.getValue()).booleanValue();
        InterfaceC18435e interfaceC18435e = this.ad;
        InterfaceC5083e interfaceC5083e = null;
        if (booleanValue) {
            billing(false);
            AbstractC5336e.purchase(interfaceC18435e, null, 0, new C7538e(this, interfaceC5083e, 2), 3);
        }
        if (((Boolean) this.startapp.getValue()).booleanValue()) {
            appmetrica(false);
            AbstractC5336e.purchase(interfaceC18435e, null, 0, new C7538e(this, interfaceC5083e, 3), 3);
        }
        if (metrica()) {
            purchase(false);
            AbstractC5336e.purchase(interfaceC18435e, null, 0, new C7538e(this, interfaceC5083e, 4), 3);
        }
        this.billing = false;
        yandex(0L);
        this.advert = remoteconfig;
        C16446e c16446e = this.amazon;
        if (c16446e != null && (interfaceC2661e = this.vip) != null) {
            interfaceC2661e.ad(c16446e);
        }
        this.amazon = null;
        this.license = null;
        this.purchase = null;
        this.appmetrica = null;
    }

    public final boolean metrica() {
        return ((Boolean) this.adcel.getValue()).booleanValue();
    }

    public final void purchase(boolean z) {
        this.adcel.setValue(Boolean.valueOf(z));
    }

    public final void vip() {
        if (((Boolean) this.yandex.getValue()).booleanValue()) {
            AbstractC5336e.purchase(this.ad, null, 0, new C7538e(this, null, 1), 3);
        }
    }

    public final void yandex(long j) {
        this.admob.setValue(new C11490e(j));
    }
}
