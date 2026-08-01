package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1623e implements InterfaceC11335e, InterfaceC11914e {
    public final BinderC7597e adcel;
    public final C7735e appmetrica;
    public final InterfaceC2367e license;
    public final /* synthetic */ C16680e loadAd;
    public boolean mopub;
    public final C5720e purchase;
    public final int startapp;
    public final LinkedList metrica = new LinkedList();
    public final HashSet billing = new HashSet();
    public final HashMap yandex = new HashMap();
    public final ArrayList advert = new ArrayList();
    public C14758e smaato = null;
    public int amazon = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C1623e(C16680e c16680e, AbstractC6950e abstractC6950e) {
        this.loadAd = c16680e;
        Looper looper = c16680e.f32734e.getLooper();
        C12894e ad = abstractC6950e.ad();
        C2532e c2532e = new C2532e((C17548e) ad.f25751e, (String) ad.f25750e, (String) ad.f25752e);
        C17150e c17150e = (C17150e) abstractC6950e.license.f26645e;
        AbstractC9528e.startapp(c17150e);
        InterfaceC2367e metrica = c17150e.metrica(abstractC6950e.ad, looper, c2532e, abstractC6950e.appmetrica, this, this);
        C5389e c5389e = abstractC6950e.metrica;
        if (c5389e == null || !(metrica instanceof AbstractC6785e)) {
            String str = abstractC6950e.vip;
            if (str != null && (metrica instanceof AbstractC6785e)) {
                ((AbstractC6785e) metrica).pro = str;
            }
        } else {
            ((AbstractC6785e) metrica).signatures = c5389e;
        }
        this.license = metrica;
        this.appmetrica = abstractC6950e.purchase;
        this.purchase = new C5720e();
        this.startapp = abstractC6950e.yandex;
        if (!metrica.metrica()) {
            this.adcel = null;
            return;
        }
        Context context = c16680e.f32733e;
        HandlerC9134e handlerC9134e = c16680e.f32734e;
        C12894e ad2 = abstractC6950e.ad();
        this.adcel = new BinderC7597e(context, handlerC9134e, new C2532e((C17548e) ad2.f25751e, (String) ad2.f25750e, (String) ad2.f25752e));
    }

    public final void Signature() {
        C16680e c16680e = this.loadAd;
        AbstractC9528e.license(c16680e.f32734e);
        Status status = C16680e.f32731e;
        billing(status);
        this.purchase.license(false, status);
        for (C9364e c9364e : (C9364e[]) this.yandex.keySet().toArray(new C9364e[0])) {
            loadAd(new C2302e(c9364e, new C8988e()));
        }
        mopub(new C14758e(4, null, null));
        if (((AbstractC6785e) this.license).remoteconfig()) {
            c16680e.f32734e.post(new RunnableC16721e(5, new C16452e(this)));
        }
    }

    public final void ad() {
        Object obj = this.license;
        C16680e c16680e = this.loadAd;
        AbstractC9528e.license(c16680e.f32734e);
        this.smaato = null;
        mopub(C14758e.f29187e);
        if (this.mopub) {
            HandlerC9134e handlerC9134e = c16680e.f32734e;
            C7735e c7735e = this.appmetrica;
            handlerC9134e.removeMessages(11, c7735e);
            c16680e.f32734e.removeMessages(9, c7735e);
            this.mopub = false;
        }
        Iterator it = this.yandex.values().iterator();
        while (it.hasNext()) {
            C0462e c0462e = ((C11255e) it.next()).ad;
            if (advert((C1032e[]) c0462e.f2531e) != null) {
                it.remove();
            } else {
                try {
                    ((InterfaceC17847e) ((C18100e) c0462e.f2536e).f35492e).accept(obj, new C8988e());
                } catch (DeadObjectException unused) {
                    remoteconfig(3);
                    ((AbstractC6785e) obj).billing("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        license();
        yandex();
    }

    @Override // defpackage.InterfaceC11914e
    public final void adcel(C14758e c14758e) {
        amazon(c14758e, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void admob() {
        C16680e c16680e = this.loadAd;
        AbstractC9528e.license(c16680e.f32734e);
        InterfaceC2367e interfaceC2367e = this.license;
        AbstractC6785e abstractC6785e = (AbstractC6785e) interfaceC2367e;
        if (abstractC6785e.remoteconfig() || abstractC6785e.pro()) {
            return;
        }
        try {
            int m1991case = c16680e.f32745e.m1991case(c16680e.f32733e, interfaceC2367e);
            if (m1991case != 0) {
                C14758e c14758e = new C14758e(m1991case, null, null);
                String name = interfaceC2367e.getClass().getName();
                String c14758e2 = c14758e.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + c14758e2.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(c14758e2);
                Log.w("GoogleApiManager", sb.toString());
                amazon(c14758e, null);
                return;
            }
            C8331e c8331e = new C8331e(c16680e, interfaceC2367e, this.appmetrica);
            if (interfaceC2367e.metrica()) {
                BinderC7597e binderC7597e = this.adcel;
                AbstractC9528e.startapp(binderC7597e);
                C12514e c12514e = binderC7597e.startapp;
                if (c12514e != null) {
                    c12514e.purchase();
                }
                C2532e c2532e = binderC7597e.yandex;
                c2532e.f6389e = Integer.valueOf(System.identityHashCode(binderC7597e));
                C17150e c17150e = binderC7597e.purchase;
                Context context = binderC7597e.license;
                Handler handler = binderC7597e.appmetrica;
                binderC7597e.startapp = (C12514e) c17150e.metrica(context, handler.getLooper(), c2532e, (C10111e) c2532e.f6384e, binderC7597e, binderC7597e);
                binderC7597e.adcel = c8331e;
                Set set = binderC7597e.billing;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableC16721e(binderC7597e));
                } else {
                    C12514e c12514e2 = binderC7597e.startapp;
                    c12514e2.getClass();
                    c12514e2.mopub = new C7988e(c12514e2);
                    c12514e2.subs(2, null);
                }
            }
            try {
                abstractC6785e.mopub = c8331e;
                abstractC6785e.subs(2, null);
            } catch (SecurityException e) {
                amazon(new C14758e(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            amazon(new C14758e(10, null, null), e2);
        }
    }

    public final C1032e advert(C1032e[] c1032eArr) {
        if (c1032eArr != null && c1032eArr.length != 0) {
            C4295e c4295e = ((AbstractC6785e) this.license).inmobi;
            C1032e[] c1032eArr2 = c4295e == null ? null : c4295e.f9384e;
            if (c1032eArr2 == null) {
                c1032eArr2 = new C1032e[0];
            }
            C17519e c17519e = new C17519e(c1032eArr2.length);
            for (C1032e c1032e : c1032eArr2) {
                c17519e.put(c1032e.f3493e, Long.valueOf(c1032e.billing()));
            }
            for (C1032e c1032e2 : c1032eArr) {
                Long l = (Long) c17519e.get(c1032e2.f3493e);
                if (l == null || l.longValue() < c1032e2.billing()) {
                    return c1032e2;
                }
            }
        }
        return null;
    }

    public final void amazon(C14758e c14758e, RuntimeException runtimeException) {
        C12514e c12514e;
        C16680e c16680e = this.loadAd;
        AbstractC9528e.license(c16680e.f32734e);
        BinderC7597e binderC7597e = this.adcel;
        if (binderC7597e != null && (c12514e = binderC7597e.startapp) != null) {
            c12514e.purchase();
        }
        AbstractC9528e.license(this.loadAd.f32734e);
        this.smaato = null;
        SparseIntArray sparseIntArray = (SparseIntArray) c16680e.f32745e.f12440e;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        mopub(c14758e);
        if ((this.license instanceof C9803e) && c14758e.f29190e != 24) {
            c16680e.f32739e = true;
            HandlerC9134e handlerC9134e = c16680e.f32734e;
            handlerC9134e.sendMessageDelayed(handlerC9134e.obtainMessage(19), 300000L);
        }
        int i = c14758e.f29190e;
        if (i == 4) {
            billing(C16680e.f32732e);
            return;
        }
        if (i == 25) {
            billing(C16680e.metrica(this.appmetrica, c14758e));
            return;
        }
        LinkedList linkedList = this.metrica;
        if (linkedList.isEmpty()) {
            this.smaato = c14758e;
            return;
        }
        if (runtimeException != null) {
            AbstractC9528e.license(c16680e.f32734e);
            purchase(null, runtimeException, false);
            return;
        }
        if (!c16680e.f32738e) {
            billing(C16680e.metrica(this.appmetrica, c14758e));
            return;
        }
        C7735e c7735e = this.appmetrica;
        purchase(C16680e.metrica(c7735e, c14758e), null, true);
        if (linkedList.isEmpty() || metrica(c14758e) || c16680e.purchase(c14758e, this.startapp)) {
            return;
        }
        if (c14758e.f29190e == 18) {
            this.mopub = true;
        }
        if (!this.mopub) {
            billing(C16680e.metrica(c7735e, c14758e));
        } else {
            HandlerC9134e handlerC9134e2 = c16680e.f32734e;
            handlerC9134e2.sendMessageDelayed(Message.obtain(handlerC9134e2, 9, c7735e), 5000L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean appmetrica(AbstractC9497e abstractC9497e) {
        if (abstractC9497e == null) {
            C5720e c5720e = this.purchase;
            InterfaceC2367e interfaceC2367e = this.license;
            abstractC9497e.purchase(c5720e, interfaceC2367e.metrica());
            try {
                abstractC9497e.billing(this);
                return true;
            } catch (DeadObjectException unused) {
                remoteconfig(1);
                ((AbstractC6785e) interfaceC2367e).billing("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        C1032e advert = advert(abstractC9497e.ad(this));
        if (advert == null) {
            C5720e c5720e2 = this.purchase;
            InterfaceC2367e interfaceC2367e2 = this.license;
            abstractC9497e.purchase(c5720e2, interfaceC2367e2.metrica());
            try {
                abstractC9497e.billing(this);
                return true;
            } catch (DeadObjectException unused2) {
                remoteconfig(1);
                ((AbstractC6785e) interfaceC2367e2).billing("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.license.getClass().getName();
        String str = advert.f3493e;
        long billing = advert.billing();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(billing).length() + 2);
        AbstractC13501e.Signature(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(billing);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        C16680e c16680e = this.loadAd;
        if (!c16680e.f32738e || !abstractC9497e.vip(this)) {
            abstractC9497e.appmetrica(new C3491e(advert));
            return true;
        }
        int metrica = abstractC9497e.metrica(this);
        C15160e c15160e = new C15160e(this.appmetrica, advert);
        ArrayList arrayList = this.advert;
        int indexOf = arrayList.indexOf(c15160e);
        if (indexOf >= 0) {
            C15160e c15160e2 = (C15160e) arrayList.get(indexOf);
            c16680e.f32734e.removeMessages(15, c15160e2);
            c16680e.f32734e.sendMessageDelayed(Message.obtain(c16680e.f32734e, 15, c15160e2), 5000L);
            return false;
        }
        arrayList.add(c15160e);
        c16680e.f32734e.sendMessageDelayed(Message.obtain(c16680e.f32734e, 15, c15160e), 5000L);
        c16680e.f32734e.sendMessageDelayed(Message.obtain(c16680e.f32734e, 16, c15160e), 120000L);
        C14758e c14758e = new C14758e(1, 2, null, null, Integer.valueOf(metrica));
        if (metrica(c14758e)) {
            String str2 = advert.f3493e;
            long billing2 = advert.billing();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(billing2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(billing2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!c16680e.purchase(c14758e, this.startapp)) {
            return false;
        }
        String str3 = advert.f3493e;
        long billing3 = advert.billing();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(billing3).length());
        sb3.append("Notification displayed for missing feature: ");
        sb3.append(str3);
        sb3.append(", version: ");
        sb3.append(billing3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    public final void billing(Status status) {
        AbstractC9528e.license(this.loadAd.f32734e);
        purchase(status, null, false);
    }

    @Override // defpackage.InterfaceC11335e
    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public final void mo659e() {
        C16680e c16680e = this.loadAd;
        if (Looper.myLooper() == c16680e.f32734e.getLooper()) {
            ad();
        } else {
            c16680e.f32734e.post(new RunnableC16721e(4, this));
        }
    }

    public final void license() {
        LinkedList linkedList = this.metrica;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC9497e abstractC9497e = (AbstractC9497e) arrayList.get(i);
            if (!((AbstractC6785e) this.license).remoteconfig()) {
                return;
            }
            if (appmetrica(abstractC9497e)) {
                linkedList.remove(abstractC9497e);
            }
        }
    }

    public final void loadAd(AbstractC9497e abstractC9497e) {
        AbstractC9528e.license(this.loadAd.f32734e);
        boolean remoteconfig = ((AbstractC6785e) this.license).remoteconfig();
        LinkedList linkedList = this.metrica;
        if (remoteconfig) {
            if (appmetrica(abstractC9497e)) {
                yandex();
                return;
            } else {
                linkedList.add(abstractC9497e);
                return;
            }
        }
        linkedList.add(abstractC9497e);
        C14758e c14758e = this.smaato;
        if (c14758e == null || c14758e.f29190e == 0 || c14758e.f29189e == null) {
            admob();
        } else {
            amazon(c14758e, null);
        }
    }

    public final boolean metrica(C14758e c14758e) {
        synchronized (C16680e.f32730e) {
            this.loadAd.getClass();
        }
        return false;
    }

    public final void mopub(C14758e c14758e) {
        HashSet hashSet = this.billing;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (AbstractC5729e.vip(c14758e, C14758e.f29187e)) {
            AbstractC6785e abstractC6785e = (AbstractC6785e) this.license;
            if (!abstractC6785e.remoteconfig() || abstractC6785e.vip == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final void purchase(Status status, Exception exc, boolean z) {
        AbstractC9528e.license(this.loadAd.f32734e);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            AbstractC9497e abstractC9497e = (AbstractC9497e) it.next();
            if (!z || abstractC9497e.ad == 2) {
                if (status != null) {
                    abstractC9497e.license(status);
                } else {
                    abstractC9497e.appmetrica(exc);
                }
                it.remove();
            }
        }
    }

    @Override // defpackage.InterfaceC11335e
    public final void remoteconfig(int i) {
        C16680e c16680e = this.loadAd;
        if (Looper.myLooper() == c16680e.f32734e.getLooper()) {
            vip(i);
        } else {
            c16680e.f32734e.post(new RunnableC9280e(this, i, 4));
        }
    }

    public final void smaato(C14758e c14758e) {
        AbstractC9528e.license(this.loadAd.f32734e);
        Object obj = this.license;
        String name = obj.getClass().getName();
        String valueOf = String.valueOf(c14758e);
        AbstractC6785e abstractC6785e = (AbstractC6785e) obj;
        abstractC6785e.billing(AbstractC4653e.ads(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
        amazon(c14758e, null);
    }

    public final boolean startapp(boolean z) {
        AbstractC9528e.license(this.loadAd.f32734e);
        AbstractC6785e abstractC6785e = (AbstractC6785e) this.license;
        if (!abstractC6785e.remoteconfig() || !this.yandex.isEmpty()) {
            return false;
        }
        C5720e c5720e = this.purchase;
        if (c5720e.ad.isEmpty() && c5720e.vip.isEmpty()) {
            abstractC6785e.billing("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        yandex();
        return false;
    }

    public final void vip(int i) {
        AbstractC9528e.license(this.loadAd.f32734e);
        this.smaato = null;
        this.mopub = true;
        String str = ((AbstractC6785e) this.license).ad;
        C5720e c5720e = this.purchase;
        c5720e.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        c5720e.license(true, new Status(20, sb.toString(), null, null));
        C7735e c7735e = this.appmetrica;
        C16680e c16680e = this.loadAd;
        HandlerC9134e handlerC9134e = c16680e.f32734e;
        handlerC9134e.sendMessageDelayed(Message.obtain(handlerC9134e, 9, c7735e), 5000L);
        HandlerC9134e handlerC9134e2 = c16680e.f32734e;
        handlerC9134e2.sendMessageDelayed(Message.obtain(handlerC9134e2, 11, c7735e), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) c16680e.f32745e.f12440e;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.yandex.values().iterator();
        while (it.hasNext()) {
            ((C11255e) it.next()).getClass();
        }
    }

    public final void yandex() {
        C16680e c16680e = this.loadAd;
        HandlerC9134e handlerC9134e = c16680e.f32734e;
        C7735e c7735e = this.appmetrica;
        handlerC9134e.removeMessages(12, c7735e);
        HandlerC9134e handlerC9134e2 = c16680e.f32734e;
        handlerC9134e2.sendMessageDelayed(handlerC9134e2.obtainMessage(12, c7735e), c16680e.f32744e);
    }
}
