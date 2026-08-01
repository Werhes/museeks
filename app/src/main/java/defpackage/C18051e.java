package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘۠ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18051e {
    public float ad;
    public float adcel;
    public final ArrayList advert;
    public float amazon;
    public final AbstractC16519e appmetrica;
    public final float billing;
    public final C18397e license;
    public boolean loadAd;
    public boolean metrica;
    public final ArrayList mopub;
    public boolean purchase;
    public C2326e smaato;
    public long startapp;
    public float vip;
    public final float yandex;
    public static final C5751e Signature = new C5751e(1);
    public static final C5751e admob = new C5751e(2);
    public static final C5751e subscription = new C5751e(3);
    public static final C5751e remoteconfig = new C5751e(4);
    public static final C5751e pro = new C5751e(5);
    public static final C5751e signatures = new C5751e(0);

    public C18051e(C8705e c8705e) {
        this.ad = 0.0f;
        this.vip = Float.MAX_VALUE;
        this.metrica = false;
        this.purchase = false;
        this.billing = Float.MAX_VALUE;
        this.yandex = -3.4028235E38f;
        this.startapp = 0L;
        this.mopub = new ArrayList();
        this.advert = new ArrayList();
        this.license = null;
        this.appmetrica = new C2079e(c8705e);
        this.adcel = 1.0f;
        this.smaato = null;
        this.amazon = Float.MAX_VALUE;
        this.loadAd = false;
    }

    public C18051e(C18397e c18397e) {
        C11821e c11821e = C18397e.f36061e;
        this.ad = 0.0f;
        this.vip = Float.MAX_VALUE;
        this.metrica = false;
        this.purchase = false;
        this.billing = Float.MAX_VALUE;
        this.yandex = -3.4028235E38f;
        this.startapp = 0L;
        this.mopub = new ArrayList();
        this.advert = new ArrayList();
        this.license = c18397e;
        this.appmetrica = c11821e;
        if (c11821e == subscription || c11821e == remoteconfig || c11821e == pro) {
            this.adcel = 0.1f;
        } else if (c11821e == signatures) {
            this.adcel = 0.00390625f;
        } else if (c11821e == Signature || c11821e == admob) {
            this.adcel = 0.00390625f;
        } else {
            this.adcel = 1.0f;
        }
        this.smaato = null;
        this.amazon = Float.MAX_VALUE;
        this.loadAd = false;
    }

    public final void ad(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.purchase = false;
        ThreadLocal threadLocal = C16020e.purchase;
        if (threadLocal.get() == null) {
            threadLocal.set(new C16020e());
        }
        C16020e c16020e = (C16020e) threadLocal.get();
        c16020e.ad.remove(this);
        ArrayList arrayList2 = c16020e.vip;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            c16020e.appmetrica = true;
        }
        this.startapp = 0L;
        this.metrica = false;
        while (true) {
            arrayList = this.mopub;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                C13154e c13154e = (C13154e) arrayList.get(i);
                float f = this.vip;
                C9142e c9142e = c13154e.ad;
                c9142e.ad = f;
                Iterator it = ((ArrayList) c9142e.license).iterator();
                while (it.hasNext()) {
                    ((InterfaceC2425e) it.next()).ad(c9142e);
                }
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void license() {
        C2326e c2326e = this.smaato;
        if (c2326e == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) c2326e.startapp;
        if (d > this.billing) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.yandex) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.adcel * 0.75f);
        c2326e.license = abs;
        c2326e.appmetrica = abs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.purchase;
        if (z || z) {
            return;
        }
        this.purchase = true;
        if (!this.metrica) {
            this.vip = this.appmetrica.metrica(this.license);
        }
        float f = this.vip;
        if (f > this.billing || f < this.yandex) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = C16020e.purchase;
        if (threadLocal.get() == null) {
            threadLocal.set(new C16020e());
        }
        C16020e c16020e = (C16020e) threadLocal.get();
        ArrayList arrayList = c16020e.vip;
        if (arrayList.size() == 0) {
            if (c16020e.license == null) {
                c16020e.license = new C18478e(c16020e.metrica);
            }
            C18478e c18478e = c16020e.license;
            ((Choreographer) c18478e.f36227e).postFrameCallback((ChoreographerFrameCallbackC6485e) c18478e.f36229e);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void metrica() {
        if (this.smaato.vip <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.purchase) {
            this.loadAd = true;
        }
    }

    public final void vip(float f) {
        ArrayList arrayList;
        this.appmetrica.appmetrica(this.license, f);
        int i = 0;
        while (true) {
            arrayList = this.advert;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((InterfaceC17484e) arrayList.get(i)).yandex(this.vip);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
