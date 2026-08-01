package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5996e implements InterfaceC1926e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C12528e f12633e;

    public C5996e(C12528e c12528e) {
        this.f12633e = c12528e;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void Signature(InterfaceC9610e interfaceC9610e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final void ads(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        if (Build.VERSION.SDK_INT >= 35) {
            C12528e c12528e = this.f12633e;
            if (c12528e.metrica == null || !c12528e.appmetrica) {
                return;
            }
            Integer num = (Integer) ((C10224e) c7500e.f15283e).f20233e.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE);
            if (num != null) {
                c12528e.metrica(c12528e.purchase, num.intValue() != 1 ? 0 : 1);
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void advert(InterfaceC9610e interfaceC9610e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void crashlytics(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
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
}
