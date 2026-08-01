package defpackage;

import android.hardware.camera2.CaptureResult;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17735e implements InterfaceC1926e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34802e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34803e;

    public /* synthetic */ C17735e(int i, Object obj) {
        this.f34803e = i;
        this.f34802e = obj;
    }

    private final /* synthetic */ void ad(C9021e c9021e) {
    }

    private final /* synthetic */ void adcel(InterfaceC9610e interfaceC9610e, long j, InterfaceC7172e interfaceC7172e) {
    }

    private final /* synthetic */ void admob(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    private final /* synthetic */ void amazon(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    private final /* synthetic */ void applovin(InterfaceC9610e interfaceC9610e) {
    }

    private final /* synthetic */ void appmetrica(InterfaceC9610e interfaceC9610e, long j, int i, int i2) {
    }

    private final /* synthetic */ void billing(InterfaceC9610e interfaceC9610e, int i) {
    }

    /* renamed from: class, reason: not valid java name */
    private final /* synthetic */ void m4419class(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    private final /* synthetic */ void firebase(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    /* renamed from: interface, reason: not valid java name */
    private final /* synthetic */ void m4420interface(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
    }

    private final /* synthetic */ void isPro(InterfaceC9610e interfaceC9610e) {
    }

    private final /* synthetic */ void metrica(InterfaceC9610e interfaceC9610e, long j, int i, int i2) {
    }

    private final /* synthetic */ void mopub(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
    }

    private final /* synthetic */ void premium(InterfaceC9610e interfaceC9610e) {
    }

    private final /* synthetic */ void pro(InterfaceC9610e interfaceC9610e, long j) {
    }

    private final /* synthetic */ void remoteconfig(InterfaceC9610e interfaceC9610e) {
    }

    private final /* synthetic */ void signatures(InterfaceC9610e interfaceC9610e, long j) {
    }

    private final /* synthetic */ void smaato(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
    }

    private final /* synthetic */ void startapp(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
    }

    private final /* synthetic */ void subscription(InterfaceC9610e interfaceC9610e) {
    }

    private final /* synthetic */ void tapsense(InterfaceC9610e interfaceC9610e) {
    }

    private final /* synthetic */ void vip(C9021e c9021e) {
    }

    private final /* synthetic */ void yandex(InterfaceC9610e interfaceC9610e, int i) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void Signature(InterfaceC9610e interfaceC9610e) {
        int i = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    public final void ads(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        Integer num;
        switch (this.f34803e) {
            case 0:
                return;
            default:
                if (((C16170e) this.f34802e).admob.ad == 0 || (num = (Integer) interfaceC9610e.vip(AbstractC9212e.vip)) == null) {
                    return;
                }
                C16170e c16170e = (C16170e) this.f34802e;
                int intValue = num.intValue();
                synchronized (c16170e.metrica) {
                    C12718e c12718e = c16170e.purchase;
                    while (!c12718e.isEmpty() && ((C16837e) c12718e.first()).ad <= intValue) {
                        ((C8823e) ((C16837e) c12718e.first()).vip).m2175import(Unit.INSTANCE);
                        AbstractC13480e.m3600strictfp(c12718e);
                        ((C16170e) this.f34802e).admob.ad();
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void advert(InterfaceC9610e interfaceC9610e) {
        int i = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void crashlytics(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
        int i = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: extends */
    public final void mo730extends(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        switch (this.f34803e) {
            case 0:
                C8823e c8823e = (C8823e) this.f34802e;
                C10224e c10224e = (C10224e) c7500e.f15283e;
                Integer num = (Integer) c10224e.f20233e.get(CaptureResult.CONTROL_AE_STATE);
                Integer num2 = (Integer) c10224e.f20233e.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                if (num == null || num2 == null) {
                    if (num2 == null || num2.intValue() != 0) {
                        return;
                    }
                    c8823e.m2175import(0);
                    return;
                }
                int intValue = num.intValue();
                if ((intValue == 2 || intValue == 3 || intValue == 4) && num2.intValue() == 0) {
                    c8823e.m2175import(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: goto */
    public final void mo731goto(InterfaceC9610e interfaceC9610e, long j, InterfaceC7172e interfaceC7172e) {
        Integer num;
        switch (this.f34803e) {
            case 0:
                return;
            default:
                if (((C16170e) this.f34802e).admob.ad == 0 || (num = (Integer) interfaceC9610e.vip(AbstractC9212e.vip)) == null) {
                    return;
                }
                C16170e c16170e = (C16170e) this.f34802e;
                int intValue = num.intValue();
                synchronized (c16170e.metrica) {
                    try {
                        C12718e c12718e = c16170e.purchase;
                        String str = " with CaptureFailure.reason = " + interfaceC7172e.ads();
                        if (str == null) {
                            str = BuildConfig.FLAVOR;
                        }
                        Throwable th = new Throwable("Failed in framework level".concat(str));
                        while (!c12718e.isEmpty() && ((C16837e) c12718e.first()).ad <= intValue) {
                            ((C8823e) ((C16837e) c12718e.first()).vip).m2503e(th);
                            AbstractC13480e.m3600strictfp(c12718e);
                            ((C16170e) this.f34802e).admob.ad();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void inmobi(InterfaceC9610e interfaceC9610e, int i) {
        int i2 = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void isVip(InterfaceC9610e interfaceC9610e, long j, long j2) {
        int i = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void license(InterfaceC9610e interfaceC9610e, long j, int i, int i2) {
        int i3 = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void loadAd(InterfaceC9610e interfaceC9610e, long j) {
        int i = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: protected */
    public final /* synthetic */ void mo732protected(C9021e c9021e) {
        int i = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void purchase(InterfaceC9610e interfaceC9610e, long j, long j2) {
        int i = this.f34803e;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void subs(InterfaceC9610e interfaceC9610e) {
        int i = this.f34803e;
    }
}
