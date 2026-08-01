package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18271e {
    public static final C10914e ad = new C10914e(0);

    public static final void ad(C13126e c13126e, Function1 function1, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(1149221023);
        int i2 = (c13770e.yandex(c13126e) ? 4 : 2) | i | (c13770e.yandex(function1) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c13770e2 = c13770e;
            AbstractC0865e.ad(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.license, null, null, null, AbstractC16653e.license(-2027638895, new C11828e(c13126e, function1, 8), c13770e), c13770e2, 196614, 28);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C15709e(c13126e, function1, i, 1);
        }
    }

    public static final boolean appmetrica(AbstractC1186e abstractC1186e) {
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        if (advert != null && ((AbstractC17093e.vip(advert) && AbstractC17093e.appmetrica(advert) && !AbstractC2876e.billing((InterfaceC5052e) advert).equals(AbstractC4972e.yandex)) || AbstractC17093e.purchase(abstractC1186e))) {
            return true;
        }
        InterfaceC4077e advert2 = abstractC1186e.loadAd().advert();
        InterfaceC16046e interfaceC16046e = advert2 instanceof InterfaceC16046e ? (InterfaceC16046e) advert2 : null;
        return interfaceC16046e != null && appmetrica(AbstractC16279e.yandex(interfaceC16046e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int license(InterfaceC2531e interfaceC2531e, int i) {
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        int[] iArr = {0};
        Object metrica = ((C9000e) interfaceC2531e).metrica(key);
        if (metrica != 0) {
            iArr = metrica;
        }
        if (AbstractC1660e.startapp(iArr, i)) {
            return i;
        }
        int[] iArr2 = {0};
        Object metrica2 = ((C9000e) interfaceC2531e).metrica(key);
        if (metrica2 != 0) {
            iArr2 = metrica2;
        }
        return AbstractC1660e.startapp(iArr2, 1) ? 1 : 0;
    }

    public static C0308e metrica() {
        return (C0308e) C0308e.appmetrica.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C8805e vip(InterfaceC2531e interfaceC2531e) {
        int[] iArr = {0};
        Object metrica = ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (metrica != 0) {
            iArr = metrica;
        }
        return new C8805e(0, iArr);
    }
}
