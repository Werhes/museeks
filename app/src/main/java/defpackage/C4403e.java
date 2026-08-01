package defpackage;

import android.content.res.Configuration;
import android.hardware.camera2.CameraExtensionSession;
import android.media.AudioDescriptor;
import android.media.AudioFocusRequest;
import android.os.Handler;
import android.os.IInterface;
import android.os.SystemClock;
import android.view.autofill.AutofillId;
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.IAppHost;
import androidx.car.app.navigation.model.Maneuver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ۟ؕ */
/* loaded from: classes.dex */
public final /* synthetic */ class C4403e implements InterfaceC12623e, InterfaceC12504e, InterfaceC9650e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f9583e;

    public /* synthetic */ C4403e(int i) {
        this.f9583e = i;
    }

    public static /* bridge */ /* synthetic */ int ad(Configuration configuration) {
        return configuration.colorMode;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher appmetrica(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class billing() {
        return CameraExtensionSession.class;
    }

    public static /* bridge */ /* synthetic */ AutofillId license(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest metrica(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ void purchase(Configuration configuration, int i) {
        configuration.colorMode = i;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor vip(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // defpackage.InterfaceC12623e
    public Object adcel(IInterface iInterface) {
        ((IAppHost) iInterface).invalidate();
        return null;
    }

    @Override // defpackage.InterfaceC9650e
    public Object apply(Object obj) {
        switch (this.f9583e) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C14598e((C6097e) obj);
            default:
                return Integer.valueOf(((C16360e) obj).ad);
        }
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        long j;
        C2691e c2691e;
        C14805e c14805e;
        C11010e c11010e;
        switch (this.f9583e) {
            case 12:
                C3659e c3659e = (C3659e) obj;
                C18536e c18536e = c3659e.vip;
                if (c3659e.equals(c18536e.mopub) && c18536e.loadAd != null) {
                    C6433e c6433e = c18536e.admob;
                    int i = c6433e.f13320e;
                    if (i != -1) {
                        long j2 = ((C11816e) c6433e.f13318e).purchase / i;
                        C11863e c11863e = c18536e.signatures;
                        c11863e.getClass();
                        j = AbstractC9413e.m2560package(c11863e.ad.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - c18536e.f36358new;
                    C2691e c2691e2 = c18536e.loadAd;
                    int i2 = ((C11816e) c18536e.admob.f13318e).purchase;
                    long m2567switch = AbstractC9413e.m2567switch(j);
                    C17424e c17424e = ((C9860e) c2691e2.f6570e).f19459e;
                    Handler handler = (Handler) c17424e.f34142e;
                    if (handler != null) {
                        handler.post(new RunnableC16648e(c17424e, i2, m2567switch, elapsedRealtime, 0));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                C3659e c3659e2 = (C3659e) obj;
                c3659e2.getClass();
                C18536e.f36344instanceof.getAndDecrement();
                C2691e c2691e3 = c3659e2.vip.loadAd;
                if (c2691e3 != null) {
                    C11816e c11816e = c3659e2.ad;
                    C12268e c12268e = new C12268e(c11816e.ad, c11816e.vip, c11816e.metrica, c11816e.license, c11816e.appmetrica, c11816e.purchase);
                    C17424e c17424e2 = ((C9860e) c2691e3.f6570e).f19459e;
                    Handler handler2 = (Handler) c17424e2.f34142e;
                    if (handler2 != null) {
                        handler2.post(new RunnableC6952e(c17424e2, c12268e, 0));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                C3659e c3659e3 = (C3659e) obj;
                C18536e c18536e2 = c3659e3.vip;
                if (c3659e3.equals(c18536e2.mopub) && (c2691e = c18536e2.loadAd) != null && c18536e2.f36346break && (c14805e = ((C9860e) c2691e.f6570e).f35009e) != null) {
                    c14805e.ad();
                    return;
                }
                return;
            case 15:
                C3659e c3659e4 = (C3659e) obj;
                C18536e c18536e3 = c3659e4.vip;
                if (c3659e4.equals(c18536e3.mopub) && c18536e3.f36367try) {
                    c18536e3.f36361protected = true;
                    return;
                }
                return;
            default:
                C2691e c2691e4 = ((C16605e) obj).ad.loadAd;
                if (c2691e4 != null) {
                    C9860e c9860e = (C9860e) c2691e4.f6570e;
                    synchronized (c9860e.f1504e) {
                        c11010e = c9860e.f1495e;
                    }
                    if (c11010e != null) {
                        c11010e.m2979e();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
