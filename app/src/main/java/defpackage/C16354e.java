package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16354e implements InterfaceC1926e, InterfaceC3351e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f32151e = new CopyOnWriteArrayList();

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void Signature(InterfaceC9610e interfaceC9610e) {
    }

    @Override // defpackage.InterfaceC3351e
    public final void ad() {
        Iterator it = this.f32151e.iterator();
        while (it.hasNext()) {
            ((C3664e) it.next()).metrica();
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void ads(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        billing(interfaceC9610e.mo2622catch(), (C10224e) c7500e.f15283e);
    }

    @Override // defpackage.InterfaceC1926e
    public final void advert(InterfaceC9610e interfaceC9610e) {
        Iterator it = this.f32151e.iterator();
        while (it.hasNext()) {
            C3664e c3664e = (C3664e) it.next();
            long mo2622catch = interfaceC9610e.mo2622catch();
            synchronized (c3664e) {
                try {
                    if (c3664e.f8246e == null) {
                        c3664e.f8246e = new C16002e(mo2622catch);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void appmetrica(C3664e c3664e) {
        this.f32151e.add(c3664e);
    }

    public final void billing(long j, C10224e c10224e) {
        Integer num;
        Iterator it = this.f32151e.iterator();
        while (it.hasNext()) {
            C3664e c3664e = (C3664e) it.next();
            if (!c3664e.f8244e.mo693e() && !c3664e.f8244e.isCancelled()) {
                synchronized (c3664e) {
                    C16002e c16002e = c3664e.f8246e;
                    if (c16002e != null && j >= c16002e.ad) {
                        Unit unit = Unit.INSTANCE;
                        Long l = (Long) c10224e.f20233e.get(CaptureResult.SENSOR_TIMESTAMP);
                        long frameNumber = c10224e.f20233e.getFrameNumber();
                        if (l != null && c3664e.f8247e == null) {
                            c3664e.f8247e = l;
                        }
                        Long l2 = c3664e.f8247e;
                        if (c3664e.f8242e == null || l2 == null || l == null || l.longValue() - l2.longValue() <= c3664e.f8242e.longValue()) {
                            if (c3664e.f8241e == null) {
                                c3664e.f8241e = new C5125e(frameNumber);
                            }
                            C5125e c5125e = c3664e.f8241e;
                            if (c5125e != null && (num = c3664e.f8243e) != null && frameNumber - c5125e.ad > num.intValue()) {
                                c3664e.f8244e.m2175import(new C4405e(1, c10224e));
                            } else if (((Boolean) c3664e.f8245e.invoke(c10224e)).booleanValue()) {
                                c3664e.f8244e.m2175import(new C4405e(0, c10224e));
                            }
                        } else {
                            c3664e.f8244e.m2175import(new C4405e(2, c10224e));
                        }
                    }
                }
            }
            this.f32151e.remove(c3664e);
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void crashlytics(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
        billing(interfaceC9610e.mo2622catch(), c10224e);
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: extends */
    public final /* synthetic */ void mo730extends(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: goto */
    public final /* synthetic */ void mo731goto(InterfaceC9610e interfaceC9610e, long j, InterfaceC7172e interfaceC7172e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void inmobi(InterfaceC9610e interfaceC9610e, int i) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void isVip(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void license(InterfaceC9610e interfaceC9610e, long j, int i, int i2) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void loadAd(InterfaceC9610e interfaceC9610e, long j) {
    }

    @Override // defpackage.InterfaceC3351e
    public final void metrica() {
        Iterator it = this.f32151e.iterator();
        while (it.hasNext()) {
            ((C3664e) it.next()).metrica();
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: protected */
    public final /* synthetic */ void mo732protected(C9021e c9021e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void purchase(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void subs(InterfaceC9610e interfaceC9610e) {
    }

    @Override // defpackage.InterfaceC3351e
    public final void vip() {
        Iterator it = this.f32151e.iterator();
        while (it.hasNext()) {
            ((C3664e) it.next()).metrica();
        }
    }
}
