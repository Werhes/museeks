package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16990e extends AbstractC11185e {
    /* JADX WARN: Type inference failed for: r0v2, types: [eؘٗٓ, eٌُۖ] */
    public static C16990e license(InterfaceC12438e interfaceC12438e, Size size) {
        if (interfaceC12438e.tapsense() == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC12438e.firebase(interfaceC12438e.toString()));
        }
        ?? abstractC11185e = new AbstractC11185e();
        C11469e crashlytics = interfaceC12438e.crashlytics();
        C17015e c17015e = C17015e.f33328e;
        int i = C11469e.ad().billing.metrica;
        ArrayList arrayList = abstractC11185e.license;
        ArrayList arrayList2 = abstractC11185e.metrica;
        C10379e c10379e = abstractC11185e.vip;
        if (crashlytics != null) {
            C9937e c9937e = crashlytics.billing;
            i = c9937e.metrica;
            for (CameraDevice.StateCallback stateCallback : crashlytics.metrica) {
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : crashlytics.license) {
                if (!arrayList.contains(stateCallback2)) {
                    arrayList.add(stateCallback2);
                }
            }
            c10379e.mopub(c9937e.license);
            c17015e = c9937e.vip;
        }
        c10379e.getClass();
        c10379e.f20510e = C4069e.purchase(c17015e);
        int i2 = 7;
        if (interfaceC12438e instanceof C5450e) {
            Rational rational = AbstractC7768e.ad;
            if (((PreviewPixelHDRnetQuirk) AbstractC16338e.ad(PreviewPixelHDRnetQuirk.class)) != null && !AbstractC7890e.billing(AbstractC7768e.ad, new Rational(size.getWidth(), size.getHeight()))) {
                C4069e license = C4069e.license();
                license.yandex(AbstractC15428e.ad(CaptureRequest.TONEMAP_MODE), 2);
                c10379e.pro(new C2362e(i2, C17015e.vip(license)));
            }
        }
        c10379e.f20509e = ((Number) interfaceC12438e.smaato(C11456e.f23055e, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) interfaceC12438e.smaato(C11456e.f23061e, null);
        if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
            arrayList2.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) interfaceC12438e.smaato(C11456e.f23060e, null);
        if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
            arrayList.add(stateCallback4);
        }
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) interfaceC12438e.smaato(C11456e.f23057e, null);
        if (captureCallback != null) {
            C17839e c17839e = new C17839e(captureCallback);
            c10379e.amazon(c17839e);
            ArrayList arrayList3 = abstractC11185e.appmetrica;
            if (!arrayList3.contains(c17839e)) {
                arrayList3.add(c17839e);
            }
        }
        int mo842strictfp = interfaceC12438e.mo842strictfp();
        if (mo842strictfp != 0) {
            c10379e.getClass();
            if (mo842strictfp != 0) {
                ((C4069e) c10379e.f20510e).yandex(InterfaceC12438e.f24900e, Integer.valueOf(mo842strictfp));
            }
        }
        int mo843try = interfaceC12438e.mo843try();
        if (mo843try != 0) {
            c10379e.getClass();
            if (mo843try != 0) {
                ((C4069e) c10379e.f20510e).yandex(InterfaceC12438e.f24896e, Integer.valueOf(mo843try));
            }
        }
        C4069e license2 = C4069e.license();
        C14326e c14326e = C11456e.f23058e;
        String str = (String) interfaceC12438e.smaato(c14326e, null);
        if (str != null) {
            license2.yandex(c14326e, str);
        }
        C14326e c14326e2 = C11456e.f23059e;
        Long l = (Long) interfaceC12438e.smaato(c14326e2, null);
        if (l != null) {
            license2.yandex(c14326e2, Long.valueOf(l.longValue()));
        }
        c10379e.pro(license2);
        C17974e c17974e = new C17974e(6);
        interfaceC12438e.metrica(new C11565e(c17974e, interfaceC12438e, 1));
        c10379e.pro(new C2362e(i2, C17015e.vip((C4069e) c17974e.f35233e)));
        return abstractC11185e;
    }

    public final void ad(InterfaceC12330e interfaceC12330e) {
        this.vip.pro(interfaceC12330e);
    }

    public final C11469e metrica() {
        return new C11469e(new ArrayList(this.ad), new ArrayList(this.metrica), new ArrayList(this.license), new ArrayList(this.appmetrica), this.vip.tapsense(), this.purchase, this.billing, this.yandex, this.startapp);
    }

    public final void vip(AbstractC5113e abstractC5113e, C14677e c14677e, int i) {
        C18464e ad = C1673e.ad(abstractC5113e);
        if (c14677e == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        ad.f36194e = c14677e;
        ad.f36192e = Integer.valueOf(i);
        this.ad.add(ad.m4518e());
        ((HashSet) this.vip.f20508e).add(abstractC5113e);
    }
}
