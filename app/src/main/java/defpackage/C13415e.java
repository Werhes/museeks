package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٟ */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13415e implements InterfaceC8895e, InterfaceC4097e, InterfaceC9595e, InterfaceC12504e, InterfaceC1360e, InterfaceC15046e, InterfaceC8427e, InterfaceC7449e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f26672e;

    public /* synthetic */ C13415e(int i) {
        this.f26672e = i;
    }

    public /* synthetic */ C13415e(int i, Object obj) {
        this.f26672e = i;
    }

    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException ad(Object obj) {
        return (ForegroundServiceStartNotAllowedException) obj;
    }

    public static /* bridge */ /* synthetic */ boolean billing(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint purchase(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        C6268e c6268e = (C6268e) obj;
        switch (this.f26672e) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                c6268e.mo2072e();
                return;
            case 20:
                c6268e.loadAd();
                return;
            case 21:
                c6268e.mo2080e();
                return;
            case 22:
                c6268e.mo2118e();
                return;
            case 23:
                c6268e.mo2093e();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                c6268e.mo2066continue();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                c6268e.mo2063case();
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            default:
                c6268e.mo2136strictfp();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                c6268e.mo2077e();
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                c6268e.mo2109e();
                return;
        }
    }

    @Override // defpackage.InterfaceC15046e
    public void appmetrica(InterfaceC10645e interfaceC10645e, int i) {
        switch (this.f26672e) {
            case 16:
                interfaceC10645e.getClass();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                interfaceC10645e.getClass();
                return;
            default:
                interfaceC10645e.metrica(i);
                return;
        }
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        switch (this.f26672e) {
            case 9:
                ((InterfaceC8524e) obj).signatures(1);
                return;
            default:
                ((InterfaceC8524e) obj).admob(0.0f);
                return;
        }
    }

    @Override // defpackage.InterfaceC8895e
    public Object license(AbstractC14783e abstractC14783e) {
        C12524e c12524e = ((C0251e) abstractC14783e).ad;
        C0251e.smaato(c12524e);
        Integer num = c12524e.f25077e;
        int ordinal = c12524e.f25072e.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    AbstractC16176e.ad.vip();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            AbstractC16176e.ad(num.intValue()).vip();
        } else {
            AbstractC16176e.vip(num.intValue()).vip();
        }
        return new Object();
    }

    @Override // defpackage.InterfaceC4097e
    public void metrica(float f) {
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(C6584e c6584e, C18424e c18424e, int i) {
        return c6584e.tapsense(c18424e);
    }

    @Override // defpackage.InterfaceC1360e
    public void vip(C4275e c4275e) {
        switch (this.f26672e) {
            case 11:
                C12318e c12318e = c4275e.ad;
                if (c4275e.mo1580e()) {
                    c12318e.getClass();
                    AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
                    c12318e.f24703e.getClass();
                    return;
                }
                return;
            case 12:
                c4275e.startapp.billing(26, new C12582e(9));
                return;
            case 13:
                C12318e c12318e2 = c4275e.ad;
                Objects.requireNonNull(c12318e2);
                c12318e2.vip(new RunnableC2783e(17, c12318e2));
                return;
            default:
                throw new ClassCastException();
        }
    }

    @Override // defpackage.InterfaceC9595e
    public int yandex(Object obj) {
        String str = ((C10643e) obj).ad;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
