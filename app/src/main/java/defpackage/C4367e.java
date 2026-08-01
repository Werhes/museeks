package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4367e implements InterfaceC10309e {
    public C10689e ad;
    public C5981e license;
    public C14053e metrica;
    public C8419e vip;

    @Override // defpackage.InterfaceC10309e
    public final void ad(C0398e c0398e, InterfaceC6256e interfaceC6256e, C12476e c12476e, C14772e c14772e, C0763e c0763e, C0763e c0763e2) {
        C14053e c14053e = this.metrica;
        if (c14053e != null) {
            C12775e c12775e = c14053e.smaato;
            synchronized (c12775e.metrica) {
                try {
                    c12775e.adcel = c0398e;
                    c12775e.advert = interfaceC6256e;
                    c12775e.mopub = c12476e;
                    c12775e.smaato = c0763e;
                    c12775e.amazon = c0763e2;
                    if (!c12775e.appmetrica) {
                        if (c12775e.license) {
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    c12775e.ad();
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void adcel(C17151e c17151e) {
        C10689e c10689e = this.ad;
        if (c10689e == null) {
            return;
        }
        this.vip = c10689e.f27016e ? AbstractC5336e.purchase(c10689e.m3623e(), null, 4, new C6626e(c10689e, new C1247e(c17151e, this, c10689e, r4, 3), r4, 26), 1) : null;
    }

    @Override // defpackage.InterfaceC10309e
    public final void appmetrica(C0398e c0398e, C16174e c16174e, C9675e c9675e, C11840e c11840e) {
        adcel(new C17151e(c0398e, this, c16174e, c9675e, c11840e, 1));
    }

    @Override // defpackage.InterfaceC10309e
    public final void billing() {
        InterfaceC3965e interfaceC3965e;
        C10689e c10689e = this.ad;
        if (c10689e == null || (interfaceC3965e = (InterfaceC3965e) AbstractC10432e.vip(c10689e, AbstractC11473e.admob)) == null) {
            return;
        }
        ((C3112e) interfaceC3965e).ad();
    }

    @Override // defpackage.InterfaceC10309e
    public final void license() {
        C8419e c8419e = this.vip;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        this.vip = null;
        InterfaceC3542e startapp = startapp();
        if (startapp != null) {
            ((C5981e) startapp).license();
        }
    }

    @Override // defpackage.InterfaceC10309e
    public final void metrica() {
        InterfaceC3965e interfaceC3965e;
        C10689e c10689e = this.ad;
        if (c10689e == null || (interfaceC3965e = (InterfaceC3965e) AbstractC10432e.vip(c10689e, AbstractC11473e.admob)) == null) {
            return;
        }
        ((C3112e) interfaceC3965e).vip();
    }

    public final void mopub(C10689e c10689e) {
        if (this.ad != c10689e) {
            AbstractC8889e.metrica("Expected textInputModifierNode to be " + c10689e + " but was " + this.ad);
        }
        this.ad = null;
    }

    @Override // defpackage.InterfaceC10309e
    public final void purchase(C0398e c0398e, C0398e c0398e2) {
        C14053e c14053e = this.metrica;
        if (c14053e != null) {
            boolean z = (C12347e.metrica(c14053e.yandex.vip, c0398e2.vip) && AbstractC7890e.billing(c14053e.yandex.metrica, c0398e2.metrica)) ? false : true;
            c14053e.yandex = c0398e2;
            int size = c14053e.adcel.size();
            for (int i = 0; i < size; i++) {
                InputConnectionC10217e inputConnectionC10217e = (InputConnectionC10217e) ((WeakReference) c14053e.adcel.get(i)).get();
                if (inputConnectionC10217e != null) {
                    inputConnectionC10217e.billing = c0398e2;
                }
            }
            C12775e c12775e = c14053e.smaato;
            synchronized (c12775e.metrica) {
                c12775e.adcel = null;
                c12775e.advert = null;
                c12775e.mopub = null;
                c12775e.smaato = null;
                c12775e.amazon = null;
                Unit unit = Unit.INSTANCE;
            }
            if (AbstractC7890e.billing(c0398e, c0398e2)) {
                if (z) {
                    C16911e c16911e = c14053e.vip;
                    int billing = C12347e.billing(c0398e2.vip);
                    int purchase = C12347e.purchase(c0398e2.vip);
                    C12347e c12347e = c14053e.yandex.metrica;
                    int billing2 = c12347e != null ? C12347e.billing(c12347e.ad) : -1;
                    C12347e c12347e2 = c14053e.yandex.metrica;
                    c16911e.inmobi().updateSelection((View) c16911e.f33137e, billing, purchase, billing2, c12347e2 != null ? C12347e.purchase(c12347e2.ad) : -1);
                    return;
                }
                return;
            }
            if (c0398e != null && (!AbstractC7890e.billing(c0398e.ad.f20850e, c0398e2.ad.f20850e) || (C12347e.metrica(c0398e.vip, c0398e2.vip) && !AbstractC7890e.billing(c0398e.metrica, c0398e2.metrica)))) {
                C16911e c16911e2 = c14053e.vip;
                c16911e2.inmobi().restartInput((View) c16911e2.f33137e);
                return;
            }
            int size2 = c14053e.adcel.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InputConnectionC10217e inputConnectionC10217e2 = (InputConnectionC10217e) ((WeakReference) c14053e.adcel.get(i2)).get();
                if (inputConnectionC10217e2 != null) {
                    C0398e c0398e3 = c14053e.yandex;
                    C16911e c16911e3 = c14053e.vip;
                    if (inputConnectionC10217e2.mopub) {
                        inputConnectionC10217e2.billing = c0398e3;
                        if (inputConnectionC10217e2.startapp) {
                            c16911e3.inmobi().updateExtractedText((View) c16911e3.f33137e, inputConnectionC10217e2.yandex, AbstractC0865e.purchase(c0398e3));
                        }
                        C12347e c12347e3 = c0398e3.metrica;
                        long j = c0398e3.vip;
                        int billing3 = c12347e3 != null ? C12347e.billing(c12347e3.ad) : -1;
                        C12347e c12347e4 = c0398e3.metrica;
                        c16911e3.inmobi().updateSelection((View) c16911e3.f33137e, C12347e.billing(j), C12347e.purchase(j), billing3, c12347e4 != null ? C12347e.purchase(c12347e4.ad) : -1);
                    }
                }
            }
        }
    }

    public final InterfaceC3542e startapp() {
        C5981e c5981e = this.license;
        if (c5981e != null) {
            return c5981e;
        }
        if (!AbstractC1494e.ad) {
            return null;
        }
        C5981e metrica = AbstractC6959e.metrica(0, 3, 2);
        this.license = metrica;
        return metrica;
    }

    @Override // defpackage.InterfaceC10309e
    public final void vip() {
        adcel(null);
    }

    @Override // defpackage.InterfaceC10309e
    public final void yandex(C0763e c0763e) {
        Rect rect;
        C14053e c14053e = this.metrica;
        if (c14053e != null) {
            c14053e.advert = new Rect(AbstractC1561e.appmetrica(c0763e.ad), AbstractC1561e.appmetrica(c0763e.vip), AbstractC1561e.appmetrica(c0763e.metrica), AbstractC1561e.appmetrica(c0763e.license));
            if (!c14053e.adcel.isEmpty() || (rect = c14053e.advert) == null) {
                return;
            }
            c14053e.ad.requestRectangleOnScreen(new Rect(rect));
        }
    }
}
