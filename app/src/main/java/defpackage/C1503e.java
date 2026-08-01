package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؐؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503e implements InterfaceC2786e, InterfaceC11660e, InterfaceC4406e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f4366e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f4367e;

    public C1503e(C13825e c13825e, Range range) {
        this.f4367e = c13825e;
        this.f4366e = range;
    }

    public C1503e(Function1 function1) {
        this.f4367e = function1;
        this.f4366e = new C4066e();
    }

    public C1503e(Function2 function2) {
        this.f4367e = function2;
        this.f4366e = new C4066e();
    }

    @Override // defpackage.InterfaceC2786e
    public float ad() {
        return ((Number) ((Range) this.f4366e).getUpper()).floatValue();
    }

    @Override // defpackage.InterfaceC2786e
    public Rect adcel() {
        return (Rect) ((C9000e) ((C13825e) this.f4367e).vip).metrica(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    @Override // defpackage.InterfaceC2786e
    public InterfaceC1908e advert(InterfaceC7865e interfaceC7865e) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        ArrayList mopub = AbstractC6874e.mopub(key);
        if (Build.VERSION.SDK_INT >= 34) {
            mopub.add(CaptureRequest.CONTROL_SETTINGS_OVERRIDE);
        }
        return interfaceC7865e.billing(mopub);
    }

    @Override // defpackage.InterfaceC2786e
    public float license() {
        return ((Number) ((Range) this.f4366e).getLower()).floatValue();
    }

    @Override // defpackage.InterfaceC11660e
    public InterfaceC5372e metrica(InterfaceC7227e interfaceC7227e) {
        C16329e c16329e = (C16329e) ((C4066e) this.f4366e).get(((InterfaceC18155e) interfaceC7227e).subs());
        Object obj = c16329e.ad.get();
        if (obj == null) {
            synchronized (c16329e) {
                obj = c16329e.ad.get();
                if (obj == null) {
                    obj = new C16771e((InterfaceC5372e) ((Function1) this.f4367e).invoke(interfaceC7227e));
                    c16329e.ad = new SoftReference(obj);
                }
            }
        }
        return ((C16771e) obj).ad;
    }

    @Override // defpackage.InterfaceC2786e
    public InterfaceC1908e smaato(float f, InterfaceC7865e interfaceC7865e) {
        CaptureRequest.Key key;
        float license = license();
        if (f > ad() || license > f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        LinkedHashMap billing = AbstractC10064e.billing(new C6571e(key, Float.valueOf(f)));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C6434e c6434e = InterfaceC2531e.yandex;
            InterfaceC2531e interfaceC2531e = ((C13825e) this.f4367e).vip;
            c6434e.getClass();
            if (i >= 34 && AbstractC5666e.inmobi(interfaceC2531e)) {
                AbstractC5666e.m1964while(billing);
            }
        }
        return interfaceC7865e.adcel(billing, AbstractC13788e.vip);
    }

    @Override // defpackage.InterfaceC4406e
    public Object vip(InterfaceC7227e interfaceC7227e, ArrayList arrayList) {
        Object c12763e;
        C16329e c16329e = (C16329e) ((C4066e) this.f4366e).get(((InterfaceC18155e) interfaceC7227e).subs());
        Object obj = c16329e.ad.get();
        if (obj == null) {
            synchronized (c16329e) {
                obj = c16329e.ad.get();
                if (obj == null) {
                    obj = new C3803e();
                    c16329e.ad = new SoftReference(obj);
                }
            }
        }
        C3803e c3803e = (C3803e) obj;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C6388e((InterfaceC13984e) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c3803e.ad;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                c12763e = (InterfaceC5372e) ((Function2) this.f4367e).invoke(interfaceC7227e, arrayList);
            } catch (Throwable th) {
                c12763e = new C12763e(th);
            }
            C13523e c13523e = new C13523e(c12763e);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, c13523e);
            obj2 = putIfAbsent == null ? c13523e : putIfAbsent;
        }
        return ((C13523e) obj2).f26812e;
    }
}
