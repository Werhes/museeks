package defpackage;

import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1874e implements InterfaceC12066e, InterfaceC1489e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C10302e f4999e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC16400e f5000e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C4909e f5001e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f5002e = new Object();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f4998e = false;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C17469e f5003e = null;

    public C1874e(InterfaceC16400e interfaceC16400e, C10302e c10302e, C4909e c4909e) {
        this.f5000e = interfaceC16400e;
        this.f4999e = c10302e;
        this.f5001e = c4909e;
        if (((C4891e) interfaceC16400e.vip()).license.ad(EnumC7785e.f15779e)) {
            c10302e.Signature();
        } else {
            c10302e.inmobi();
        }
        interfaceC16400e.vip().ad(this);
    }

    public static void ads(List list, C4909e c4909e) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            if (abstractC16510e.smaato()) {
                synchronized (abstractC16510e.metrica) {
                    abstractC16510e.loadAd = c4909e;
                }
            }
        }
    }

    public final void applovin() {
        synchronized (this.f5002e) {
            try {
                if (this.f4998e) {
                    this.f4998e = false;
                    if (((C4891e) this.f5000e.vip()).license.ad(EnumC7785e.f15779e)) {
                        onStart(this.f5000e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC3958e appmetrica() {
        return this.f4999e.f20346e.f18385e;
    }

    public final void inmobi(C17469e c17469e) {
        C17469e c17469e2;
        synchronized (this.f5002e) {
            try {
                C17469e c17469e3 = this.f5003e;
                if (c17469e3 != null && c17469e3.vip() == c17469e.startapp) {
                    if (this.f5003e.vip() || c17469e.startapp) {
                        if (this.f5003e.vip() && c17469e.startapp) {
                            ArrayList arrayList = new ArrayList(this.f5003e.purchase);
                            arrayList.removeAll(c17469e.purchase);
                            if (arrayList.isEmpty()) {
                                c17469e2 = null;
                            } else {
                                C17469e c17469e4 = this.f5003e;
                                c17469e2 = new C17469e(arrayList, c17469e4.ad, c17469e4.vip);
                            }
                            this.f5003e = c17469e2;
                        }
                    } else if (this.f5003e != c17469e) {
                        return;
                    } else {
                        this.f5003e = null;
                    }
                    ArrayList arrayList2 = new ArrayList(c17469e.purchase);
                    arrayList2.retainAll(this.f4999e.premium());
                    this.f4999e.firebase(arrayList2);
                    ads(arrayList2, null);
                }
            } finally {
            }
        }
    }

    public final void isPro() {
        synchronized (this.f5002e) {
            List premium = this.f4999e.premium();
            this.f4999e.firebase((ArrayList) premium);
            ads(premium, null);
            this.f5003e = null;
        }
    }

    public final void isVip() {
        synchronized (this.f5002e) {
            try {
                if (this.f4998e) {
                    return;
                }
                onStop(this.f5000e);
                this.f4998e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica(C17469e c17469e) {
        synchronized (this.f5002e) {
            try {
                if (this.f5003e == null) {
                    this.f5003e = c17469e;
                } else if (c17469e.vip()) {
                    if (!this.f5003e.vip()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f5003e.purchase);
                    arrayList.addAll(c17469e.purchase);
                    this.f5003e = new C17469e(arrayList, c17469e.ad, c17469e.vip);
                } else {
                    if (this.f5003e.vip()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f5003e = c17469e;
                    C10302e c10302e = this.f4999e;
                    c10302e.firebase((ArrayList) c10302e.premium());
                }
                this.f4999e.m2793throw(c17469e.ad);
                this.f4999e.m2790goto(c17469e.vip);
                this.f4999e.m2789extends(c17469e.ad());
                this.f4999e.m2792native(c17469e.metrica);
                c17469e.getClass();
                C2362e appmetrica = C13023e.appmetrica(c17469e, vip());
                c17469e.yandex.execute(new RunnableC2623e(appmetrica, c17469e, 27));
                this.f4999e.metrica(c17469e.purchase, appmetrica);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC10450e(EnumC14621e.ON_DESTROY)
    public void onDestroy(InterfaceC16400e interfaceC16400e) {
        synchronized (this.f5002e) {
            C10302e c10302e = this.f4999e;
            c10302e.firebase((ArrayList) c10302e.premium());
        }
    }

    @InterfaceC10450e(EnumC14621e.ON_PAUSE)
    public void onPause(InterfaceC16400e interfaceC16400e) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4999e.f20346e.adcel(false);
        }
    }

    @InterfaceC10450e(EnumC14621e.ON_RESUME)
    public void onResume(InterfaceC16400e interfaceC16400e) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4999e.f20346e.adcel(true);
        }
    }

    @InterfaceC10450e(EnumC14621e.ON_START)
    public void onStart(InterfaceC16400e interfaceC16400e) {
        synchronized (this.f5002e) {
            try {
                if (!this.f4998e) {
                    this.f4999e.Signature();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC10450e(EnumC14621e.ON_STOP)
    public void onStop(InterfaceC16400e interfaceC16400e) {
        synchronized (this.f5002e) {
            try {
                if (!this.f4998e) {
                    this.f4999e.inmobi();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List pro() {
        List unmodifiableList;
        synchronized (this.f5002e) {
            unmodifiableList = DesugarCollections.unmodifiableList(this.f4999e.premium());
        }
        return unmodifiableList;
    }

    public final InterfaceC16400e remoteconfig() {
        InterfaceC16400e interfaceC16400e;
        synchronized (this.f5002e) {
            interfaceC16400e = this.f5000e;
        }
        return interfaceC16400e;
    }

    public final boolean signatures(AbstractC16510e abstractC16510e) {
        boolean contains;
        synchronized (this.f5002e) {
            contains = ((ArrayList) this.f4999e.premium()).contains(abstractC16510e);
        }
        return contains;
    }

    public final boolean tapsense() {
        boolean vip;
        synchronized (this.f5002e) {
            C17469e c17469e = this.f5003e;
            vip = c17469e == null ? false : c17469e.vip();
        }
        return vip;
    }

    @Override // defpackage.InterfaceC1489e
    public final InterfaceC12424e vip() {
        return this.f4999e.f20346e.f18386e;
    }
}
