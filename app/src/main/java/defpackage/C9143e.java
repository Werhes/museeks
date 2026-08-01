package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.glance.session.SessionWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۧۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9143e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18299e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f18300e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f18301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9143e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(1, interfaceC5083e);
        this.f18299e = i;
        this.f18301e = obj;
        this.f18300e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f18299e) {
            case 0:
                return ((C9143e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C9143e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C9143e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C9143e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C9143e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C9143e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9143e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f18299e;
        Object obj2 = this.f18300e;
        Object obj3 = this.f18301e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                C7558e c7558e = (C7558e) obj3;
                C7558e.ad(c7558e);
                Object metrica = c7558e.metrica(obj2);
                c7558e.metrica.f32835e.setValue(metrica);
                c7558e.appmetrica.setValue(metrica);
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                CameraDevice cameraDevice = (CameraDevice) obj3;
                if (cameraDevice != null) {
                    Log.i("CXCP", "Closing Camera " + cameraDevice.getId());
                    String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
                        Trace.beginSection(str);
                        try {
                            cameraDevice.close();
                        } catch (NullPointerException e) {
                            Log.w("CXCP", "NPE encountered during CameraDevice.close()", e);
                        }
                        Unit unit = Unit.INSTANCE;
                        Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(str, " - ")));
                    } catch (Throwable th) {
                        Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(str, " - ")));
                        throw th;
                    }
                }
                ((C9302e) obj2).f18534e = true;
                return Unit.INSTANCE;
            case 2:
                AbstractC2003e.purchase(obj);
                StringBuilder sb = new StringBuilder();
                C13135e c13135e = (C13135e) obj3;
                sb.append(c13135e);
                sb.append(" CameraCaptureSessionWrapper#close");
                C0180e c0180e = (C0180e) obj2;
                try {
                    Trace.beginSection(sb.toString());
                    Log.d("CXCP", "Closing capture session for " + c13135e);
                    AbstractC17861e.inmobi(c0180e.ad);
                    Unit unit2 = Unit.INSTANCE;
                    Trace.endSection();
                    return Unit.INSTANCE;
                } finally {
                }
            case 3:
                AbstractC2003e.purchase(obj);
                StringBuilder sb2 = new StringBuilder();
                C13135e c13135e2 = (C13135e) obj3;
                sb2.append(c13135e2);
                sb2.append(" stopRepeating");
                C10379e c10379e = (C10379e) obj2;
                try {
                    Trace.beginSection(sb2.toString());
                    c10379e.m2806try();
                    Unit unit3 = Unit.INSTANCE;
                    Trace.endSection();
                    try {
                        Trace.beginSection(c13135e2 + " abortCaptures");
                        c10379e.adcel();
                        Trace.endSection();
                        return Unit.INSTANCE;
                    } finally {
                    }
                } finally {
                }
            case 4:
                AbstractC2003e.purchase(obj);
                AbstractC11424e abstractC11424e = (AbstractC11424e) obj3;
                AbstractC4533e.vip(((InterfaceC8376e) abstractC11424e.f22964e).mo324extends().f25997e, (InterfaceC8376e) abstractC11424e.f22964e, (C0667e) obj2);
                return Unit.INSTANCE;
            case 5:
                AbstractC2003e.purchase(obj);
                InterfaceC6141e interfaceC6141e = (InterfaceC6141e) obj3;
                AbstractC4533e.vip(interfaceC6141e.mo324extends().f25997e, interfaceC6141e, (Throwable) obj2);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                ((C1633e) obj3).vip(((SessionWorker) obj2).f435e.metrica);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f18299e) {
            case 0:
                return new C9143e((C7558e) this.f18301e, this.f18300e, interfaceC5083e, 0);
            case 1:
                return new C9143e((CameraDevice) this.f18301e, (C9302e) this.f18300e, interfaceC5083e, 1);
            case 2:
                return new C9143e((C13135e) this.f18301e, (C0180e) this.f18300e, interfaceC5083e, 2);
            case 3:
                return new C9143e((C13135e) this.f18301e, (C10379e) this.f18300e, interfaceC5083e, 3);
            case 4:
                return new C9143e((AbstractC11424e) this.f18301e, (C0667e) this.f18300e, interfaceC5083e, 4);
            case 5:
                return new C9143e((InterfaceC6141e) this.f18301e, (Throwable) this.f18300e, interfaceC5083e, 5);
            default:
                return new C9143e((C1633e) this.f18301e, (SessionWorker) this.f18300e, interfaceC5083e, 6);
        }
    }
}
