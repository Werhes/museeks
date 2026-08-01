package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14090e {

    /* renamed from: class, reason: not valid java name */
    public static final /* synthetic */ int f27845class = 0;
    public final boolean Signature;
    public final boolean admob;
    public C13882e ads;
    public final C11199e amazon;
    public C13882e applovin;
    public AbstractC13922e appmetrica;
    public final Context billing;
    public C12894e crashlytics;
    public final C7988e firebase;
    public C6541e inmobi;
    public AbstractC16709e isPro;
    public C6541e isVip;
    public C6541e license;
    public final C13935e loadAd;
    public final C0222e metrica;
    public int premium;
    public final C5982e pro;
    public C16755e purchase;
    public final C6779e remoteconfig;
    public C16936e signatures;
    public C0909e subs;
    public C11631e subscription;
    public C6541e tapsense;
    public final HandlerC15673e ad = new HandlerC15673e(this);
    public final HashMap vip = new HashMap();
    public final ArrayList yandex = new ArrayList();
    public final ArrayList startapp = new ArrayList();
    public final HashMap adcel = new HashMap();
    public final HashMap mopub = new HashMap();
    public final ArrayList advert = new ArrayList();
    public final ArrayList smaato = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14090e(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14090e.<init>(android.content.Context):void");
    }

    public final int Signature(C6541e c6541e, C16289e c16289e) {
        int startapp = c6541e.startapp(c16289e);
        if (startapp != 0) {
            int i = startapp & 1;
            HandlerC15673e handlerC15673e = this.ad;
            if (i != 0) {
                handlerC15673e.vip(259, c6541e);
            }
            if ((startapp & 2) != 0) {
                handlerC15673e.vip(260, c6541e);
            }
            if ((startapp & 4) != 0) {
                handlerC15673e.vip(261, c6541e);
            }
        }
        return startapp;
    }

    public final void ad(AbstractC9410e abstractC9410e, boolean z) {
        if (license(abstractC9410e) == null) {
            C9701e c9701e = new C9701e(abstractC9410e, z);
            this.advert.add(c9701e);
            this.ad.vip(513, c9701e);
            loadAd(c9701e, abstractC9410e.f18733e);
            C10085e.vip();
            abstractC9410e.f18731e = this.loadAd;
            abstractC9410e.billing(this.applovin);
        }
    }

    public final void adcel() {
        AbstractC13922e license;
        if (this.license.appmetrica()) {
            List<C6541e> unmodifiableList = DesugarCollections.unmodifiableList(this.license.tapsense);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C6541e) it.next()).metrica);
            }
            HashMap hashMap = this.vip;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    AbstractC13922e abstractC13922e = (AbstractC13922e) entry.getValue();
                    abstractC13922e.yandex(0);
                    abstractC13922e.license();
                    it2.remove();
                }
            }
            for (C6541e c6541e : unmodifiableList) {
                if (!hashMap.containsKey(c6541e.metrica) && (license = c6541e.metrica().license(c6541e.vip, this.license.vip)) != null) {
                    license.appmetrica();
                    hashMap.put(c6541e.metrica, license);
                }
            }
        }
    }

    public final void admob(boolean z) {
        C6541e c6541e = this.tapsense;
        if (c6541e != null && !c6541e.purchase()) {
            Log.i("AxMediaRouter", "Clearing the default route because it is no longer selectable: " + this.tapsense);
            this.tapsense = null;
        }
        C6541e c6541e2 = this.tapsense;
        C6779e c6779e = this.remoteconfig;
        ArrayList arrayList = this.startapp;
        if (c6541e2 == null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6541e c6541e3 = (C6541e) it.next();
                if (c6541e3.metrica() == c6779e && c6541e3.vip.equals("DEFAULT_ROUTE") && c6541e3.purchase()) {
                    this.tapsense = c6541e3;
                    Log.i("AxMediaRouter", "Found default route: " + this.tapsense);
                    break;
                }
            }
        }
        C6541e c6541e4 = this.isVip;
        if (c6541e4 != null && !c6541e4.purchase()) {
            Log.i("AxMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.isVip);
            this.isVip = null;
        }
        if (this.isVip == null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C6541e c6541e5 = (C6541e) it2.next();
                if (c6541e5.metrica() == c6779e && c6541e5.smaato("android.media.intent.category.LIVE_AUDIO") && !c6541e5.smaato("android.media.intent.category.LIVE_VIDEO") && c6541e5.purchase()) {
                    this.isVip = c6541e5;
                    Log.i("AxMediaRouter", "Found bluetooth route: " + this.isVip);
                    break;
                }
            }
        }
        C6541e c6541e6 = this.license;
        if (c6541e6 == null || !c6541e6.billing) {
            Log.i("AxMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.license);
            advert(metrica(), 0, true);
            return;
        }
        if (z) {
            adcel();
            amazon();
        }
    }

    public final void advert(C6541e c6541e, int i, boolean z) {
        C13486e c13486e;
        String str;
        if (this.license == c6541e) {
            return;
        }
        boolean z2 = c6541e == this.tapsense;
        if (this.isVip != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder("- Stacktrace: [");
            int i2 = 3;
            while (i2 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                i2++;
                if (i2 < stackTrace.length) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            C6541e c6541e2 = this.license;
            if (c6541e2 != null) {
                Locale locale = Locale.US;
                String str2 = c6541e2.license;
                C10085e.vip();
                str = str2 + "(BT=" + (C10085e.metrica().isVip == c6541e2) + ", syncMediaRoute1Provider=" + z + ")";
            } else {
                str = null;
            }
            StringBuilder applovin = AbstractC8703e.applovin("Changing selection(", str, ") to default while BT is available: pkgName=");
            applovin.append(this.billing.getPackageName());
            applovin.append((Object) sb);
            Log.w("AxMediaRouter", applovin.toString());
        }
        if (this.inmobi != null) {
            this.inmobi = null;
            AbstractC16709e abstractC16709e = this.isPro;
            if (abstractC16709e != null) {
                abstractC16709e.yandex(3);
                this.isPro.license();
                this.isPro = null;
            }
        }
        if (startapp() && (c13486e = c6541e.ad.appmetrica) != null && c13486e.metrica) {
            AbstractC9410e metrica = c6541e.metrica();
            String str3 = c6541e.vip;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.billing.getPackageName());
            AbstractC16709e ad = metrica.ad(str3, new C17039e(bundle));
            if (ad != null) {
                Executor Signature = AbstractC10077e.Signature(this.billing);
                C7988e c7988e = this.firebase;
                synchronized (ad.ad) {
                    try {
                        if (Signature == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (c7988e == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        ad.vip = Signature;
                        ad.metrica = c7988e;
                        ArrayList arrayList = ad.appmetrica;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            C16289e c16289e = ad.license;
                            ArrayList arrayList2 = ad.appmetrica;
                            ad.license = null;
                            ad.appmetrica = null;
                            ad.vip.execute(new RunnableC6795e(ad, c7988e, c16289e, arrayList2, 10));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.inmobi = c6541e;
                this.isPro = ad;
                ad.appmetrica();
                return;
            }
            Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + c6541e);
        }
        AbstractC9410e metrica2 = c6541e.metrica();
        String str4 = c6541e.vip;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.billing.getPackageName());
        AbstractC13922e metrica3 = metrica2.metrica(str4, new C17039e(bundle2));
        if (metrica3 != null) {
            metrica3.appmetrica();
        }
        if (this.license == null) {
            this.license = c6541e;
            this.appmetrica = metrica3;
            HandlerC15673e handlerC15673e = this.ad;
            handlerC15673e.getClass();
            Message obtainMessage = handlerC15673e.obtainMessage(262, new C12957e(null, c6541e, z));
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
            return;
        }
        C16755e c16755e = this.purchase;
        if (c16755e != null) {
            AbstractC13922e abstractC13922e = c16755e.ad;
            if (!c16755e.startapp && !c16755e.adcel) {
                c16755e.adcel = true;
                if (abstractC13922e != null) {
                    abstractC13922e.yandex(0);
                    abstractC13922e.license();
                }
            }
            this.purchase = null;
        }
        C16755e c16755e2 = new C16755e(this, c6541e, metrica3, i, z, null, null);
        this.purchase = c16755e2;
        c16755e2.ad();
    }

    public final void amazon() {
        C6541e c6541e = this.license;
        if (c6541e == null) {
            C0909e c0909e = this.subs;
            if (c0909e != null) {
                c0909e.applovin();
                return;
            }
            return;
        }
        int i = c6541e.Signature;
        C11199e c11199e = this.amazon;
        c11199e.f22464e = i;
        c11199e.f22463e = c6541e.admob;
        c11199e.f22465e = (!c6541e.appmetrica() || C10085e.billing()) ? c6541e.loadAd : 0;
        c11199e.f22462e = this.license.smaato;
        if (startapp() && this.license.metrica() == this.subscription) {
            c11199e.f22467e = C11631e.adcel(this.appmetrica);
        } else {
            c11199e.f22467e = null;
        }
        Iterator it = this.smaato.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        C0909e c0909e2 = this.subs;
        if (c0909e2 != null) {
            C6541e c6541e2 = this.license;
            C6541e c6541e3 = this.tapsense;
            if (c6541e3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (c6541e2 == c6541e3 || c6541e2 == this.isVip) {
                c0909e2.applovin();
                return;
            }
            int i2 = c11199e.f22465e == 1 ? 2 : 0;
            int i3 = c11199e.f22463e;
            int i4 = c11199e.f22464e;
            String str = (String) c11199e.f22467e;
            C12894e c12894e = (C12894e) c0909e2.f3323e;
            if (c12894e != null) {
                C0423e c0423e = (C0423e) c0909e2.f3322e;
                if (c0423e != null && i2 == 0 && i3 == 0) {
                    c0423e.f2466e = i4;
                    AbstractC9734e.ad(c0423e.metrica(), i4);
                } else {
                    C0423e c0423e2 = new C0423e(c0909e2, i2, i3, i4, str);
                    c0909e2.f3322e = c0423e2;
                    ((C15944e) c12894e.f25751e).ad.setPlaybackToRemote(c0423e2.metrica());
                }
            }
        }
    }

    public final ArrayList appmetrica() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.adcel.values().iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        return arrayList;
    }

    public final AbstractC13922e billing(C6541e c6541e) {
        AbstractC13922e abstractC13922e;
        if (c6541e == this.license && (abstractC13922e = this.appmetrica) != null) {
            return abstractC13922e;
        }
        if ((c6541e instanceof C14756e) && ((C14756e) c6541e).amazon()) {
            purchase();
            return null;
        }
        AbstractC13922e abstractC13922e2 = (AbstractC13922e) this.vip.get(c6541e.metrica);
        if (abstractC13922e2 != null) {
            return abstractC13922e2;
        }
        Iterator it = this.adcel.values().iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        return abstractC13922e2;
    }

    public final C9701e license(AbstractC9410e abstractC9410e) {
        Iterator it = this.advert.iterator();
        while (it.hasNext()) {
            C9701e c9701e = (C9701e) it.next();
            if (c9701e.ad == abstractC9410e) {
                return c9701e;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r21 == r19.remoteconfig.f18733e) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7 A[LOOP:5: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2 A[LOOP:6: B:83:0x01c0->B:84:0x01c2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadAd(defpackage.C9701e r20, defpackage.C13486e r21) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14090e.loadAd(eٍّۘ, eْْۚ):void");
    }

    public final C6541e metrica() {
        Iterator it = this.startapp.iterator();
        while (it.hasNext()) {
            C6541e c6541e = (C6541e) it.next();
            if (c6541e != this.tapsense && c6541e.metrica() == this.remoteconfig && c6541e.smaato("android.media.intent.category.LIVE_AUDIO") && !c6541e.smaato("android.media.intent.category.LIVE_VIDEO") && c6541e.purchase()) {
                return c6541e;
            }
        }
        return this.tapsense;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r0 != 2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mopub(defpackage.C6541e r5, int r6, boolean r7) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.startapp
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = "AxMediaRouter"
            if (r0 != 0) goto L1c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Ignoring attempt to select removed route: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r1, r5)
            return
        L1c:
            boolean r0 = r5.billing
            if (r0 != 0) goto L32
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Ignoring attempt to select disabled route: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r1, r5)
            return
        L32:
            eؙِٞ r0 = r4.license
            if (r0 != r5) goto L37
            goto L64
        L37:
            if (r0 == 0) goto L3e
            eٔٗؖ r0 = r0.ad()
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L76
            java.util.ArrayList r2 = r0.tapsense
            java.util.List r2 = j$.util.DesugarCollections.unmodifiableList(r2)
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L76
            eؓۨۖ r0 = r0.inmobi
            java.lang.String r2 = r5.metrica
            java.lang.Object r0 = r0.get(r2)
            eًؕ٘ r0 = (defpackage.C7712e) r0
            if (r0 == 0) goto L5d
            int r0 = r0.vip
            goto L5e
        L5d:
            r0 = 4
        L5e:
            r2 = 3
            if (r0 == r2) goto L64
            r2 = 2
            if (r0 != r2) goto L76
        L64:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Ignoring attempt to select selected route: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r1, r5)
            return
        L76:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8e
            eٍِؚ r0 = r5.metrica()
            eٍِ r1 = r4.subscription
            if (r0 != r1) goto L8e
            eؙِٞ r0 = r4.license
            if (r0 == r5) goto L8e
            java.lang.String r5 = r5.vip
            r1.smaato(r5)
            return
        L8e:
            r4.advert(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14090e.mopub(eؙِٞ, int, boolean):void");
    }

    public final void purchase() {
        Iterator it = this.adcel.values().iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
    
        if (r24.ads.vip() == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void smaato() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14090e.smaato():void");
    }

    public final boolean startapp() {
        if (!this.admob) {
            return false;
        }
        C16936e c16936e = this.signatures;
        return c16936e == null || c16936e.ad;
    }

    public final String vip(C9701e c9701e, String str) {
        String flattenToShortString = ((ComponentName) c9701e.license.f5914e).flattenToShortString();
        boolean z = c9701e.metrica;
        String isPro = z ? str : AbstractC4653e.isPro(flattenToShortString, ":", str);
        HashMap hashMap = this.mopub;
        if (!z) {
            ArrayList arrayList = this.startapp;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((C6541e) arrayList.get(i)).metrica.equals(isPro)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.w("AxMediaRouter", AbstractC17861e.subscription("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = isPro + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((C6541e) arrayList.get(i3)).metrica.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        hashMap.put(new C15552e(flattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new C15552e(flattenToShortString, str), isPro);
        return isPro;
    }

    public final C6541e yandex() {
        C6541e c6541e = this.license;
        if (c6541e != null) {
            return c6541e;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }
}
