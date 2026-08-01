package defpackage;

import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.startapp;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14052e {
    public final /* synthetic */ int ad;
    public Object appmetrica;
    public Serializable billing;
    public ArrayList license;
    public final ArrayList metrica;
    public Object purchase;
    public Object startapp;
    public int vip;
    public Object yandex;

    public C14052e() {
        this.ad = 1;
        this.purchase = BuildConfig.FLAVOR;
        this.billing = BuildConfig.FLAVOR;
        this.vip = -1;
        this.metrica = AbstractC6874e.mopub(BuildConfig.FLAVOR);
    }

    public C14052e(C17199e c17199e, C13875e c13875e) {
        this.ad = 0;
        this.metrica = new ArrayList();
        this.billing = new IdentityHashMap();
        this.license = new ArrayList();
        this.yandex = new crashlytics((char) 0, 5);
        this.appmetrica = c17199e;
        if (c13875e.f27485e) {
            C13572e c13572e = new C13572e(23, false);
            c13572e.f26878e = new SparseArray();
            c13572e.f26879e = 0;
            this.purchase = c13572e;
        } else {
            C17974e c17974e = new C17974e(28, false);
            c17974e.f35233e = new SparseArray();
            this.purchase = c17974e;
        }
        this.vip = 1;
        this.startapp = new C0444e(23);
    }

    public static ArrayList mopub(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int m1865interface = AbstractC5304e.m1865interface(str, '&', i, 4);
            if (m1865interface == -1) {
                m1865interface = str.length();
            }
            int m1865interface2 = AbstractC5304e.m1865interface(str, '=', i, 4);
            if (m1865interface2 == -1 || m1865interface2 > m1865interface) {
                arrayList.add(str.substring(i, m1865interface));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, m1865interface2));
                arrayList.add(str.substring(m1865interface2 + 1, m1865interface));
            }
            i = m1865interface + 1;
        }
        return arrayList;
    }

    public boolean ad(int i, startapp startappVar) {
        ArrayList arrayList = this.license;
        if (i < 0 || i > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i);
        }
        if (this.vip != 1) {
            AbstractC4265e.license(startappVar.f589e, "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (startappVar.f589e) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int startapp = startapp(startappVar);
        if ((startapp == -1 ? null : (C7431e) arrayList.get(startapp)) != null) {
            return false;
        }
        C7431e c7431e = new C7431e(startappVar, this, (InterfaceC17064e) this.purchase, (C7249e) ((C0444e) this.startapp).f2491e);
        arrayList.add(i, c7431e);
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                startappVar.subscription(recyclerView);
            }
        }
        if (c7431e.appmetrica > 0) {
            ((C17199e) this.appmetrica).Signature(appmetrica(c7431e), c7431e.appmetrica);
        }
        license();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0208, code lost:
    
        if (r7 < 65536) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void adcel(defpackage.C15718e r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14052e.adcel(eٕۛؕ, java.lang.String):void");
    }

    public int appmetrica(C7431e c7431e) {
        C7431e c7431e2;
        Iterator it = this.license.iterator();
        int i = 0;
        while (it.hasNext() && (c7431e2 = (C7431e) it.next()) != c7431e) {
            i += c7431e2.appmetrica;
        }
        return i;
    }

    public crashlytics billing(int i) {
        crashlytics crashlyticsVar = (crashlytics) this.yandex;
        if (crashlyticsVar.f1118e) {
            crashlyticsVar = new crashlytics((char) 0, 5);
        } else {
            crashlyticsVar.f1118e = true;
        }
        Iterator it = this.license.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C7431e c7431e = (C7431e) it.next();
            int i3 = c7431e.appmetrica;
            if (i3 > i2) {
                crashlyticsVar.f1119e = c7431e;
                crashlyticsVar.f1117e = i2;
                break;
            }
            i2 -= i3;
        }
        if (((C7431e) crashlyticsVar.f1119e) != null) {
            return crashlyticsVar;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "Cannot find wrapper for "));
    }

    public void license() {
        int i;
        Iterator it = this.license.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            C7431e c7431e = (C7431e) it.next();
            int i2 = c7431e.metrica.f588e;
            i = 3;
            if (i2 == 3 || (i2 == 2 && c7431e.appmetrica == 0)) {
                break;
            }
        }
        C17199e c17199e = (C17199e) this.appmetrica;
        if (i != c17199e.f588e) {
            c17199e.f588e = i;
            c17199e.f590e.billing();
        }
    }

    public C15718e metrica() {
        ArrayList arrayList;
        String str = (String) this.appmetrica;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String adcel = AbstractC11309e.adcel(0, 0, 7, (String) this.purchase);
        String adcel2 = AbstractC11309e.adcel(0, 0, 7, (String) this.billing);
        String str2 = (String) this.yandex;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int purchase = purchase();
        ArrayList arrayList2 = this.metrica;
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC11309e.adcel(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.license;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC0746e.subscription(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? AbstractC11309e.adcel(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.startapp;
        return new C15718e(str, adcel, adcel2, str2, purchase, arrayList3, arrayList, str4 != null ? AbstractC11309e.adcel(0, 0, 7, str4) : null, toString());
    }

    public int purchase() {
        int i = this.vip;
        if (i != -1) {
            return i;
        }
        String str = (String) this.appmetrica;
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public int startapp(startapp startappVar) {
        ArrayList arrayList = this.license;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C7431e) arrayList.get(i)).metrica == startappVar) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14052e.toString():java.lang.String");
    }

    public void vip(String str, String str2) {
        if (this.license == null) {
            this.license = new ArrayList();
        }
        this.license.add(AbstractC11309e.vip(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        this.license.add(str2 != null ? AbstractC11309e.vip(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }

    public C7431e yandex(loadAd loadad) {
        C7431e c7431e = (C7431e) ((IdentityHashMap) this.billing).get(loadad);
        if (c7431e != null) {
            return c7431e;
        }
        throw new IllegalStateException("Cannot find wrapper for " + loadad + ", seems like it is not bound by this adapter: " + this);
    }
}
