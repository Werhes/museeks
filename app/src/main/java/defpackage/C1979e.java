package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1979e {
    public final C10566e ad;
    public C18464e adcel;
    public final boolean appmetrica;
    public final InterfaceC14388e billing;
    public EnumC7792e mopub;
    public final C1839e vip;
    public final InterfaceC2141e yandex;
    public final int metrica = Alert.DURATION_SHOW_INDEFINITELY;
    public final int license = 1;
    public final int purchase = 1;
    public final List startapp = C13664e.f27089e;

    public C1979e(C10566e c10566e, C1839e c1839e, boolean z, InterfaceC14388e interfaceC14388e, InterfaceC2141e interfaceC2141e, int i) {
        this.ad = c10566e;
        this.vip = c1839e;
        this.appmetrica = z;
        this.billing = interfaceC14388e;
        this.yandex = interfaceC2141e;
    }

    public final void ad(EnumC7792e enumC7792e) {
        C18464e c18464e = this.adcel;
        if (c18464e == null || enumC7792e != this.mopub || c18464e.vip()) {
            this.mopub = enumC7792e;
            c18464e = new C18464e(this.ad, AbstractC15890e.license(this.vip, enumC7792e), this.startapp, this.billing, this.yandex);
        }
        this.adcel = c18464e;
    }
}
