package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6198e implements InterfaceC3958e {
    public final C12610e adcel;
    public final C17425e appmetrica;
    public final C1985e billing;
    public final C13330e license;
    public final C13583e metrica;
    public final C12528e purchase;
    public final C9255e startapp;
    public final C13825e vip;
    public final InterfaceC9550e yandex;

    public C6198e(C13825e c13825e, C13583e c13583e, C13330e c13330e, C13609e c13609e, C17425e c17425e, C12528e c12528e, C1985e c1985e, InterfaceC9550e interfaceC9550e, C9255e c9255e, C10503e c10503e, C8591e c8591e, C12610e c12610e) {
        this.vip = c13825e;
        this.metrica = c13583e;
        this.license = c13330e;
        this.appmetrica = c17425e;
        this.purchase = c12528e;
        this.billing = c1985e;
        this.yandex = interfaceC9550e;
        this.startapp = c9255e;
        this.adcel = c12610e;
    }

    @Override // defpackage.InterfaceC3958e
    public final void ad() {
        this.yandex.ad();
    }

    @Override // defpackage.InterfaceC3958e
    public final ListenableFuture adcel(boolean z) {
        Integer num;
        C6434e c6434e = InterfaceC2531e.yandex;
        InterfaceC2531e interfaceC2531e = this.vip.vip;
        c6434e.getClass();
        int[] iArr = (int[]) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (!(iArr == null ? false : AbstractC1660e.startapp(iArr, 6)) || ((num = (Integer) this.purchase.purchase.license()) != null && num.intValue() == -1)) {
            return AbstractC15792e.smaato(AbstractC15792e.remoteconfig(C6815e.vip(AbstractC16398e.ad(C17425e.ad(this.appmetrica, z, 6))), new C17974e(11, new C8391e(26)), AbstractC3062e.billing()));
        }
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Unable to enable/disable torch when low-light boost is on.");
        }
        return new C4065e(1, new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"));
    }

    @Override // defpackage.InterfaceC3958e
    public final void advert() {
        C9255e c9255e = this.startapp;
        C11074e c11074e = c9255e.ad;
        synchronized (c11074e.f21967e) {
            c11074e.f21964e = new C13935e(5);
            Unit unit = Unit.INSTANCE;
        }
        AbstractC15792e.smaato(AbstractC5750e.purchase(new C11565e(c9255e.ad.ad(c9255e.license, true), "clearCaptureRequestOptions", 6)));
    }

    @Override // defpackage.InterfaceC3958e
    public final void appmetrica(InterfaceC12330e interfaceC12330e) {
        C9255e c9255e = this.startapp;
        C17974e c17974e = new C17974e(6);
        interfaceC12330e.metrica(new C11565e(c17974e, interfaceC12330e, 1));
        C17015e vip = C17015e.vip((C4069e) c17974e.f35233e);
        C11074e c11074e = c9255e.ad;
        synchronized (c11074e.f21967e) {
            try {
                for (C14326e c14326e : vip.admob()) {
                    ((C4069e) c11074e.f21964e.f27641e).billing(c14326e, EnumC13734e.f27216e, vip.subscription(c14326e));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC15792e.smaato(AbstractC5750e.purchase(new C11565e(c9255e.ad.ad(c9255e.license, true), "addCaptureRequestOptions", 6)));
    }

    @Override // defpackage.InterfaceC3958e
    public final void billing(int i) {
        boolean z = true;
        this.metrica.metrica(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.yandex.metrica(z);
    }

    @Override // defpackage.InterfaceC3958e
    public final ListenableFuture license(float f) {
        float adcel;
        C1985e c1985e = this.billing;
        c1985e.getClass();
        if (f > 1.0f || f < 0.0f) {
            return new C4065e(1, new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0, 1]"));
        }
        float f2 = c1985e.vip;
        float f3 = c1985e.metrica;
        float f4 = f - 1.0f;
        if (Math.abs(f4) < Math.ulp(Math.abs(f4)) * 2.0d) {
            adcel = f3;
        } else {
            float f5 = f - 0.0f;
            if (Math.abs(f5) < Math.ulp(Math.abs(f5)) * 2.0d) {
                adcel = f2;
            } else {
                float f6 = 1.0f / f2;
                adcel = AbstractC13482e.adcel(1.0f / (f6 - ((f6 - (1.0f / f3)) * f)), f2, f3);
            }
        }
        return c1985e.ad(new C11608e(adcel, f2, f3), true, true);
    }

    @Override // defpackage.InterfaceC3958e
    public final void metrica() {
        C11498e c11498e = this.adcel.ad;
        c11498e.getClass();
        int decrementAndGet = C11498e.vip.decrementAndGet(c11498e);
        if (decrementAndGet >= 0) {
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", "decrementUsage: videoUsage = " + decrementAndGet);
                return;
            }
            return;
        }
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "decrementUsage: videoUsage = " + decrementAndGet + ", which is less than 0!");
        }
    }

    @Override // defpackage.InterfaceC3958e
    public final InterfaceC12330e mopub() {
        C2362e c2362e;
        C11074e c11074e = this.startapp.ad;
        synchronized (c11074e.f21967e) {
            C11456e applovin = c11074e.f21964e.applovin();
            C17974e c17974e = new C17974e(6);
            applovin.metrica(new C11565e(c17974e, applovin, 1));
            c2362e = new C2362e(7, C17015e.vip((C4069e) c17974e.f35233e));
        }
        return c2362e;
    }

    @Override // defpackage.InterfaceC3958e
    public final ListenableFuture purchase(float f) {
        C1985e c1985e = this.billing;
        float f2 = c1985e.vip;
        float f3 = c1985e.metrica;
        if (f <= f3 && f >= f2) {
            return c1985e.ad(new C11608e(f, f2, f3), true, true);
        }
        StringBuilder sb = new StringBuilder("Requested zoomRatio ");
        sb.append(f);
        sb.append(" is not within valid range [");
        sb.append(f2);
        sb.append(", ");
        return new C4065e(1, new IllegalArgumentException(AbstractC17861e.remoteconfig(sb, f3, ']')));
    }

    @Override // defpackage.InterfaceC3958e
    public final void smaato() {
        C11498e c11498e = this.adcel.ad;
        c11498e.getClass();
        int incrementAndGet = C11498e.vip.incrementAndGet(c11498e);
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "incrementUsage: videoUsage = " + incrementAndGet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [eًؗۖ, java.util.concurrent.CancellationException, eٌِٞ] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // defpackage.InterfaceC3958e
    public final ListenableFuture startapp(C16389e c16389e) {
        C9689e ad;
        List list;
        List list2;
        C13330e c13330e;
        InterfaceC7865e interfaceC7865e;
        int i;
        ?? r10;
        InterfaceC1908e interfaceC1908e;
        C13330e c13330e2 = this.license;
        C8591e c8591e = c13330e2.license;
        Integer num = c13330e2.adcel;
        Integer num2 = c13330e2.startapp;
        Integer num3 = c13330e2.yandex;
        InterfaceC2786e interfaceC2786e = c13330e2.appmetrica;
        C8823e c8823e = new C8823e();
        InterfaceC7865e interfaceC7865e2 = c13330e2.purchase;
        if (interfaceC7865e2 != null) {
            C8419e c8419e = c13330e2.Signature;
            if (c8419e != null) {
                c8419e.Signature(null);
            }
            C8419e c8419e2 = c13330e2.admob;
            if (c8419e2 != null) {
                c8419e2.Signature(null);
            }
            C8823e c8823e2 = c13330e2.loadAd;
            if (c8823e2 != null) {
                AbstractC17861e.isPro("Cancelled by another startFocusAndMetering()", c8823e2);
            }
            C8823e c8823e3 = c13330e2.amazon;
            if (c8823e3 != null) {
                AbstractC17861e.isPro("Cancelled by another startFocusAndMetering()", c8823e3);
            }
            c13330e2.amazon = c8823e;
            List metrica = AbstractC0181e.metrica((List) c16389e.f32193e, num2.intValue(), interfaceC2786e.adcel(), c13330e2.metrica(), 2, c13330e2.vip);
            List metrica2 = AbstractC0181e.metrica((List) c16389e.f32194e, num3.intValue(), interfaceC2786e.adcel(), c13330e2.metrica(), 1, c13330e2.vip);
            List metrica3 = AbstractC0181e.metrica((List) c16389e.f32195e, num.intValue(), interfaceC2786e.adcel(), c13330e2.metrica(), 4, c13330e2.vip);
            if (metrica.isEmpty() && metrica2.isEmpty() && metrica3.isEmpty()) {
                c8823e.m2503e(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                ad = AbstractC16398e.ad(c8823e);
                return AbstractC15792e.smaato(ad);
            }
            if (!metrica2.isEmpty()) {
                C11744e c11744e = c13330e2.metrica;
                synchronized (c11744e.license) {
                    c11744e.advert = 1;
                    Unit unit = Unit.INSTANCE;
                }
                c11744e.purchase();
            }
            if (num2.intValue() > 0) {
                if (metrica.isEmpty()) {
                    metrica = AbstractC1660e.m670implements(AbstractC8806e.ad);
                }
                list = metrica;
            } else {
                list = null;
            }
            if (num3.intValue() > 0) {
                list2 = metrica2.isEmpty() ? AbstractC1660e.m670implements(AbstractC8806e.ad) : metrica2;
            } else {
                list2 = null;
            }
            if (num.intValue() <= 0) {
                metrica3 = null;
            } else if (metrica3.isEmpty()) {
                metrica3 = AbstractC1660e.m670implements(AbstractC8806e.ad);
            }
            if (metrica2.isEmpty() || !c13330e2.mopub) {
                c13330e = c13330e2;
                interfaceC7865e = interfaceC7865e2;
                i = 1;
                r10 = 0;
                List list3 = metrica3;
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "startFocusAndMetering: updating 3A regions only");
                }
                interfaceC1908e = interfaceC7865e.metrica(list, list2, list3);
            } else {
                c13330e = c13330e2;
                long j = c16389e.f32196e;
                if (j <= 0 || j >= 5000) {
                    j = 5000;
                }
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "startFocusAndMetering: updating 3A regions & triggering AF");
                }
                C12236e c12236e = num3.intValue() > 0 ? new C12236e(1) : null;
                List list4 = C6510e.vip;
                ArrayList arrayList = c13330e.advert;
                C6510e c6510e = new C6510e((arrayList != null && (arrayList.contains(new C6510e(1)) || arrayList.contains(new C6510e(1)))) ? 1 : 0);
                long convert = TimeUnit.NANOSECONDS.convert(j, TimeUnit.MILLISECONDS);
                i = 1;
                r10 = 0;
                interfaceC7865e = interfaceC7865e2;
                interfaceC1908e = interfaceC7865e2.ad(list, list2, metrica3, c12236e, c6510e, convert);
            }
            ((C6467e) interfaceC1908e).mo692else(new C1510e(c8823e, interfaceC1908e, c13330e, (metrica2.isEmpty() ? 1 : 0) ^ i));
            C8419e c8419e3 = c13330e.Signature;
            if (c8419e3 != 0) {
                c8419e3.Signature(r10);
            }
            c13330e.Signature = AbstractC5336e.purchase(c8591e.appmetrica, r10, 0, new C1709e(c8823e, r10, i), 3);
            long j2 = c16389e.f32196e;
            if (j2 > 0) {
                C8419e c8419e4 = c13330e.admob;
                if (c8419e4 != 0) {
                    c8419e4.Signature(r10);
                }
                C13330e c13330e3 = c13330e;
                c13330e3.admob = AbstractC5336e.purchase(c8591e.appmetrica, r10, 0, new C5840e(j2, c13330e3, interfaceC7865e, c8823e, (InterfaceC5083e) null), 3);
            }
        } else {
            AbstractC17861e.isPro("Camera is not active.", c8823e);
        }
        ad = AbstractC16398e.ad(c8823e);
        return AbstractC15792e.smaato(ad);
    }

    @Override // defpackage.InterfaceC3958e
    public final void vip(C16990e c16990e) {
        this.yandex.vip(c16990e);
    }

    @Override // defpackage.InterfaceC3958e
    public final void yandex(InterfaceC14003e interfaceC14003e) {
        this.metrica.getClass();
    }
}
