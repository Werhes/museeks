package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۟ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12783e implements InterfaceC8707e {
    public final String ad;
    public final C17580e appmetrica;
    public final Function2 billing;
    public final C17580e license;
    public final InterfaceC8026e metrica;
    public final C17580e purchase;
    public final float[] startapp;
    public final C6674e vip;
    public final float[] yandex;

    public C12783e(String str, C6674e c6674e, InterfaceC8026e interfaceC8026e, C17580e c17580e, C17580e c17580e2, C17580e c17580e3, Function2 function2) {
        this.ad = str;
        this.vip = c6674e;
        this.metrica = interfaceC8026e;
        this.license = c17580e;
        this.appmetrica = c17580e2;
        this.purchase = c17580e3;
        this.billing = function2;
        AbstractC12029e.ad("RGB");
        C17580e c17580e4 = AbstractC0695e.ad;
        float f = c17580e.ad;
        float f2 = c17580e2.ad;
        float f3 = c17580e3.ad;
        float f4 = c17580e.vip;
        float f5 = c17580e2.vip;
        float f6 = c17580e3.vip;
        float f7 = 1;
        float[] fArr = {f, f2, f3, f4, f5, f6, (f7 - f) - f4, (f7 - f2) - f5, (f7 - f3) - f6};
        C17580e c17580e5 = c6674e.vip;
        float[] amazon = AbstractC7518e.amazon(fArr);
        float f8 = c17580e5.ad;
        float f9 = c17580e5.metrica;
        float f10 = (f8 * f9) / c17580e5.vip;
        float ad = c17580e5.ad();
        float[] advert = AbstractC7518e.advert((amazon[2] * ad) + (amazon[1] * f9) + (amazon[0] * f10), (amazon[5] * ad) + (amazon[4] * f9) + (amazon[3] * f10), (amazon[8] * ad) + (amazon[7] * f9) + (amazon[6] * f10), fArr);
        this.yandex = advert;
        this.startapp = AbstractC7518e.amazon(advert);
    }

    @Override // defpackage.InterfaceC8707e
    public final float[] ad() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC8707e
    public final InterfaceC8026e appmetrica() {
        return this.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC8707e)) {
            return false;
        }
        InterfaceC8707e interfaceC8707e = (InterfaceC8707e) obj;
        if (!this.ad.equals(interfaceC8707e.getName()) || !AbstractC7890e.billing(this.vip, interfaceC8707e.license()) || !this.metrica.equals(interfaceC8707e.appmetrica())) {
            return false;
        }
        if (!(obj instanceof C12783e)) {
            return Arrays.equals(this.yandex, interfaceC8707e.ad()) && Arrays.equals(this.startapp, interfaceC8707e.vip());
        }
        C12783e c12783e = (C12783e) obj;
        return AbstractC7890e.billing(this.license, c12783e.license) && AbstractC7890e.billing(this.appmetrica, c12783e.appmetrica) && AbstractC7890e.billing(this.purchase, c12783e.purchase);
    }

    @Override // defpackage.InterfaceC13702e
    public final String getName() {
        return this.ad;
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC13702e
    public final C6674e license() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC8707e
    public final C9604e metrica(float f, float f2, float f3, float f4) {
        return new C9604e(f, f2, f3, f4, this);
    }

    public final String toString() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC8707e
    public final float[] vip() {
        return this.startapp;
    }
}
