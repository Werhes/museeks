package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15958e {
    public final CopyOnWriteArrayList Signature;
    public final C3771e admob;
    public final C11419e ads;
    public final ArrayList amazon;
    public AbstractComponentCallbacksC17875e applovin;
    public ArrayList appmetrica;
    public C6194e billing;

    /* renamed from: break, reason: not valid java name */
    public final RunnableC12991e f31417break;

    /* renamed from: class, reason: not valid java name */
    public ArrayDeque f31418class;
    public C15172e crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public boolean f31419extends;
    public C15172e firebase;

    /* renamed from: goto, reason: not valid java name */
    public boolean f31420goto;
    public AbstractC0815e inmobi;

    /* renamed from: interface, reason: not valid java name */
    public boolean f31421interface;
    public AbstractComponentCallbacksC17875e isPro;
    public C2386e isVip;
    public final C18540e loadAd;

    /* renamed from: native, reason: not valid java name */
    public boolean f31422native;
    public final C10215e premium;
    public final C3771e pro;

    /* renamed from: protected, reason: not valid java name */
    public C16301e f31423protected;
    public final C3771e remoteconfig;
    public final C17982e signatures;
    public C15172e subs;
    public final C3771e subscription;
    public int tapsense;

    /* renamed from: this, reason: not valid java name */
    public boolean f31424this;

    /* renamed from: throw, reason: not valid java name */
    public ArrayList f31425throw;

    /* renamed from: try, reason: not valid java name */
    public ArrayList f31426try;
    public boolean vip;

    /* renamed from: while, reason: not valid java name */
    public ArrayList f31427while;
    public final ArrayList ad = new ArrayList();
    public final C11106e metrica = new C11106e(10);
    public ArrayList license = new ArrayList();
    public final LayoutInflaterFactory2C12133e purchase = new LayoutInflaterFactory2C12133e(0, this);
    public C10159e yandex = null;
    public boolean startapp = false;
    public final C11109e adcel = new C11109e(2, this);
    public final AtomicInteger mopub = new AtomicInteger();
    public final Map advert = DesugarCollections.synchronizedMap(new HashMap());
    public final Map smaato = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [eٌؕۧ] */
    /* JADX WARN: Type inference failed for: r0v17, types: [eٌؕۧ] */
    /* JADX WARN: Type inference failed for: r0v18, types: [eٌؕۧ] */
    /* JADX WARN: Type inference failed for: r0v19, types: [eٌؕۧ] */
    public AbstractC15958e() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.amazon = new ArrayList();
        this.loadAd = new C18540e(this);
        this.Signature = new CopyOnWriteArrayList();
        final int i = 0;
        this.admob = new InterfaceC0867e(this) { // from class: eٌؕۧ
            public final /* synthetic */ AbstractC15958e vip;

            {
                this.vip = this;
            }

            @Override // defpackage.InterfaceC0867e
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC15958e abstractC15958e = this.vip;
                        if (abstractC15958e.m4068throw()) {
                            abstractC15958e.startapp(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC15958e abstractC15958e2 = this.vip;
                        if (abstractC15958e2.m4068throw() && num.intValue() == 80) {
                            abstractC15958e2.smaato(false);
                            return;
                        }
                        return;
                    case 2:
                        C6948e c6948e = (C6948e) obj;
                        AbstractC15958e abstractC15958e3 = this.vip;
                        if (abstractC15958e3.m4068throw()) {
                            boolean z = c6948e.ad;
                            abstractC15958e3.amazon(false);
                            return;
                        }
                        return;
                    default:
                        C0089e c0089e = (C0089e) obj;
                        AbstractC15958e abstractC15958e4 = this.vip;
                        if (abstractC15958e4.m4068throw()) {
                            boolean z2 = c0089e.ad;
                            abstractC15958e4.remoteconfig(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        this.subscription = new InterfaceC0867e(this) { // from class: eٌؕۧ
            public final /* synthetic */ AbstractC15958e vip;

            {
                this.vip = this;
            }

            @Override // defpackage.InterfaceC0867e
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC15958e abstractC15958e = this.vip;
                        if (abstractC15958e.m4068throw()) {
                            abstractC15958e.startapp(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC15958e abstractC15958e2 = this.vip;
                        if (abstractC15958e2.m4068throw() && num.intValue() == 80) {
                            abstractC15958e2.smaato(false);
                            return;
                        }
                        return;
                    case 2:
                        C6948e c6948e = (C6948e) obj;
                        AbstractC15958e abstractC15958e3 = this.vip;
                        if (abstractC15958e3.m4068throw()) {
                            boolean z = c6948e.ad;
                            abstractC15958e3.amazon(false);
                            return;
                        }
                        return;
                    default:
                        C0089e c0089e = (C0089e) obj;
                        AbstractC15958e abstractC15958e4 = this.vip;
                        if (abstractC15958e4.m4068throw()) {
                            boolean z2 = c0089e.ad;
                            abstractC15958e4.remoteconfig(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 2;
        this.remoteconfig = new InterfaceC0867e(this) { // from class: eٌؕۧ
            public final /* synthetic */ AbstractC15958e vip;

            {
                this.vip = this;
            }

            @Override // defpackage.InterfaceC0867e
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC15958e abstractC15958e = this.vip;
                        if (abstractC15958e.m4068throw()) {
                            abstractC15958e.startapp(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC15958e abstractC15958e2 = this.vip;
                        if (abstractC15958e2.m4068throw() && num.intValue() == 80) {
                            abstractC15958e2.smaato(false);
                            return;
                        }
                        return;
                    case 2:
                        C6948e c6948e = (C6948e) obj;
                        AbstractC15958e abstractC15958e3 = this.vip;
                        if (abstractC15958e3.m4068throw()) {
                            boolean z = c6948e.ad;
                            abstractC15958e3.amazon(false);
                            return;
                        }
                        return;
                    default:
                        C0089e c0089e = (C0089e) obj;
                        AbstractC15958e abstractC15958e4 = this.vip;
                        if (abstractC15958e4.m4068throw()) {
                            boolean z2 = c0089e.ad;
                            abstractC15958e4.remoteconfig(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 3;
        this.pro = new InterfaceC0867e(this) { // from class: eٌؕۧ
            public final /* synthetic */ AbstractC15958e vip;

            {
                this.vip = this;
            }

            @Override // defpackage.InterfaceC0867e
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC15958e abstractC15958e = this.vip;
                        if (abstractC15958e.m4068throw()) {
                            abstractC15958e.startapp(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC15958e abstractC15958e2 = this.vip;
                        if (abstractC15958e2.m4068throw() && num.intValue() == 80) {
                            abstractC15958e2.smaato(false);
                            return;
                        }
                        return;
                    case 2:
                        C6948e c6948e = (C6948e) obj;
                        AbstractC15958e abstractC15958e3 = this.vip;
                        if (abstractC15958e3.m4068throw()) {
                            boolean z = c6948e.ad;
                            abstractC15958e3.amazon(false);
                            return;
                        }
                        return;
                    default:
                        C0089e c0089e = (C0089e) obj;
                        AbstractC15958e abstractC15958e4 = this.vip;
                        if (abstractC15958e4.m4068throw()) {
                            boolean z2 = c0089e.ad;
                            abstractC15958e4.remoteconfig(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.signatures = new C17982e(this);
        this.tapsense = -1;
        this.ads = new C11419e(this);
        this.premium = new C10215e(1);
        this.f31418class = new ArrayDeque();
        this.f31417break = new RunnableC12991e(12, this);
    }

    /* renamed from: extends, reason: not valid java name */
    public static boolean m4043extends(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        abstractComponentCallbacksC17875e.getClass();
        Iterator it = abstractComponentCallbacksC17875e.f35093e.metrica.m3003class().iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = (AbstractComponentCallbacksC17875e) it.next();
            if (abstractComponentCallbacksC17875e2 != null) {
                z = m4043extends(abstractComponentCallbacksC17875e2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static HashSet firebase(C10159e c10159e) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c10159e.ad.size(); i++) {
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = ((C7659e) c10159e.ad.get(i)).vip;
            if (abstractComponentCallbacksC17875e != null && c10159e.billing) {
                hashSet.add(abstractComponentCallbacksC17875e);
            }
        }
        return hashSet;
    }

    /* renamed from: import, reason: not valid java name */
    public static void m4044import(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (m4045native(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC17875e);
        }
        if (abstractComponentCallbacksC17875e.f35090e) {
            abstractComponentCallbacksC17875e.f35090e = false;
            abstractComponentCallbacksC17875e.f35109e = !abstractComponentCallbacksC17875e.f35109e;
        }
    }

    /* renamed from: native, reason: not valid java name */
    public static boolean m4045native(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: try, reason: not valid java name */
    public static boolean m4046try(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (abstractComponentCallbacksC17875e == null) {
            return true;
        }
        AbstractC15958e abstractC15958e = abstractComponentCallbacksC17875e.f35112e;
        return abstractComponentCallbacksC17875e.equals(abstractC15958e.applovin) && m4046try(abstractC15958e.isPro);
    }

    /* renamed from: while, reason: not valid java name */
    public static boolean m4047while(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (abstractComponentCallbacksC17875e == null) {
            return true;
        }
        if (abstractComponentCallbacksC17875e.f35079e) {
            return abstractComponentCallbacksC17875e.f35112e == null || m4047while(abstractComponentCallbacksC17875e.f35101e);
        }
        return false;
    }

    public final boolean Signature() {
        if (this.tapsense >= 1) {
            for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
                if (abstractComponentCallbacksC17875e != null) {
                    if (!abstractComponentCallbacksC17875e.f35090e ? abstractComponentCallbacksC17875e.f35093e.Signature() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: abstract, reason: not valid java name */
    public final boolean m4048abstract() {
        return m4053default(-1, 0);
    }

    public final C5221e ad(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        String str = abstractComponentCallbacksC17875e.f35069e;
        if (str != null) {
            AbstractC11220e.metrica(abstractComponentCallbacksC17875e, str);
        }
        if (m4045native(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC17875e);
        }
        C5221e billing = billing(abstractComponentCallbacksC17875e);
        abstractComponentCallbacksC17875e.f35112e = this;
        C11106e c11106e = this.metrica;
        c11106e.m3017private(billing);
        if (!abstractComponentCallbacksC17875e.f35096e) {
            c11106e.yandex(abstractComponentCallbacksC17875e);
            abstractComponentCallbacksC17875e.f35071e = false;
            if (abstractComponentCallbacksC17875e.f35098e == null) {
                abstractComponentCallbacksC17875e.f35109e = false;
            }
            if (m4043extends(abstractComponentCallbacksC17875e)) {
                this.f31421interface = true;
            }
        }
        return billing;
    }

    public final boolean adcel() {
        if (this.tapsense >= 1) {
            for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
                if (abstractComponentCallbacksC17875e != null) {
                    if (!abstractComponentCallbacksC17875e.f35090e ? abstractComponentCallbacksC17875e.f35093e.adcel() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void admob() {
        if (this.tapsense < 1) {
            return;
        }
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null && !abstractComponentCallbacksC17875e.f35090e) {
                abstractComponentCallbacksC17875e.f35093e.admob();
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:142:0x0258. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:176:0x0335. Please report as an issue. */
    public final void ads(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object obj;
        String str;
        boolean z;
        ArrayList arrayList3;
        boolean z2;
        int i3;
        boolean z3;
        ArrayList arrayList4;
        boolean z4;
        int i4;
        int i5;
        int i6 = i;
        C11106e c11106e = this.metrica;
        ArrayList arrayList5 = this.amazon;
        boolean z5 = ((C10159e) arrayList.get(i6)).loadAd;
        ArrayList arrayList6 = this.f31426try;
        if (arrayList6 == null) {
            this.f31426try = new ArrayList();
        } else {
            arrayList6.clear();
        }
        this.f31426try.addAll(c11106e.m3025throw());
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.applovin;
        int i7 = i6;
        boolean z6 = false;
        while (i7 < i2) {
            C10159e c10159e = (C10159e) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                arrayList3 = arrayList5;
                z2 = z5;
                i3 = i7;
                z3 = z6;
                int i8 = 1;
                ArrayList arrayList7 = this.f31426try;
                ArrayList arrayList8 = c10159e.ad;
                int size = arrayList8.size() - 1;
                while (size >= 0) {
                    C7659e c7659e = (C7659e) arrayList8.get(size);
                    int i9 = c7659e.ad;
                    if (i9 != i8) {
                        if (i9 != 3) {
                            switch (i9) {
                                case 8:
                                    abstractComponentCallbacksC17875e = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC17875e = c7659e.vip;
                                    break;
                                case 10:
                                    c7659e.startapp = c7659e.yandex;
                                    break;
                            }
                            size--;
                            i8 = 1;
                        }
                        arrayList7.add(c7659e.vip);
                        size--;
                        i8 = 1;
                    }
                    arrayList7.remove(c7659e.vip);
                    size--;
                    i8 = 1;
                }
            } else {
                ArrayList arrayList9 = this.f31426try;
                ArrayList arrayList10 = c10159e.ad;
                int i10 = 0;
                while (i10 < arrayList10.size()) {
                    C7659e c7659e2 = (C7659e) arrayList10.get(i10);
                    boolean z7 = z5;
                    int i11 = c7659e2.ad;
                    int i12 = i7;
                    int i13 = 1;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3 || i11 == 6) {
                                z4 = z6;
                                arrayList9.remove(c7659e2.vip);
                                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = c7659e2.vip;
                                if (abstractComponentCallbacksC17875e2 == abstractComponentCallbacksC17875e) {
                                    arrayList10.add(i10, new C7659e(9, abstractComponentCallbacksC17875e2));
                                    i10++;
                                    arrayList4 = arrayList5;
                                    abstractComponentCallbacksC17875e = null;
                                } else {
                                    arrayList4 = arrayList5;
                                }
                            } else if (i11 == 7) {
                                i13 = 1;
                                z4 = z6;
                                arrayList4 = arrayList5;
                            } else if (i11 != 8) {
                                arrayList4 = arrayList5;
                                z4 = z6;
                            } else {
                                z4 = z6;
                                arrayList10.add(i10, new C7659e(9, abstractComponentCallbacksC17875e, 0));
                                c7659e2.metrica = true;
                                i10++;
                                arrayList4 = arrayList5;
                                abstractComponentCallbacksC17875e = c7659e2.vip;
                            }
                            i13 = 1;
                        } else {
                            z4 = z6;
                            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e3 = c7659e2.vip;
                            int i14 = abstractComponentCallbacksC17875e3.f35092e;
                            int size2 = arrayList9.size() - 1;
                            boolean z8 = false;
                            while (size2 >= 0) {
                                int i15 = size2;
                                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e4 = (AbstractComponentCallbacksC17875e) arrayList9.get(size2);
                                ArrayList arrayList11 = arrayList5;
                                if (abstractComponentCallbacksC17875e4.f35092e != i14) {
                                    i4 = i14;
                                } else if (abstractComponentCallbacksC17875e4 == abstractComponentCallbacksC17875e3) {
                                    i4 = i14;
                                    z8 = true;
                                } else {
                                    if (abstractComponentCallbacksC17875e4 == abstractComponentCallbacksC17875e) {
                                        i4 = i14;
                                        arrayList10.add(i10, new C7659e(9, abstractComponentCallbacksC17875e4, 0));
                                        i10++;
                                        i5 = 0;
                                        abstractComponentCallbacksC17875e = null;
                                    } else {
                                        i4 = i14;
                                        i5 = 0;
                                    }
                                    C7659e c7659e3 = new C7659e(3, abstractComponentCallbacksC17875e4, i5);
                                    c7659e3.license = c7659e2.license;
                                    c7659e3.purchase = c7659e2.purchase;
                                    c7659e3.appmetrica = c7659e2.appmetrica;
                                    c7659e3.billing = c7659e2.billing;
                                    arrayList10.add(i10, c7659e3);
                                    arrayList9.remove(abstractComponentCallbacksC17875e4);
                                    i10++;
                                    abstractComponentCallbacksC17875e = abstractComponentCallbacksC17875e;
                                }
                                size2 = i15 - 1;
                                i14 = i4;
                                arrayList5 = arrayList11;
                            }
                            arrayList4 = arrayList5;
                            i13 = 1;
                            if (z8) {
                                arrayList10.remove(i10);
                                i10--;
                            } else {
                                c7659e2.ad = 1;
                                c7659e2.metrica = true;
                                arrayList9.add(abstractComponentCallbacksC17875e3);
                            }
                        }
                        i10 += i13;
                        z5 = z7;
                        i7 = i12;
                        z6 = z4;
                        arrayList5 = arrayList4;
                    } else {
                        arrayList4 = arrayList5;
                        z4 = z6;
                    }
                    arrayList9.add(c7659e2.vip);
                    i10 += i13;
                    z5 = z7;
                    i7 = i12;
                    z6 = z4;
                    arrayList5 = arrayList4;
                }
                arrayList3 = arrayList5;
                z2 = z5;
                i3 = i7;
                z3 = z6;
            }
            z6 = z3 || c10159e.billing;
            i7 = i3 + 1;
            z5 = z2;
            arrayList5 = arrayList3;
        }
        ArrayList arrayList12 = arrayList5;
        boolean z9 = z5;
        boolean z10 = z6;
        this.f31426try.clear();
        if (!z9 && this.tapsense >= 1) {
            for (int i16 = i6; i16 < i2; i16++) {
                Iterator it = ((C10159e) arrayList.get(i16)).ad.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e5 = ((C7659e) it.next()).vip;
                    if (abstractComponentCallbacksC17875e5 != null && abstractComponentCallbacksC17875e5.f35112e != null) {
                        c11106e.m3017private(billing(abstractComponentCallbacksC17875e5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i17 = i6;
        while (i17 < i2) {
            C10159e c10159e2 = (C10159e) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                c10159e2.metrica(-1);
                AbstractC15958e abstractC15958e = c10159e2.admob;
                ArrayList arrayList13 = c10159e2.ad;
                boolean z11 = true;
                int size3 = arrayList13.size() - 1;
                while (size3 >= 0) {
                    C7659e c7659e4 = (C7659e) arrayList13.get(size3);
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e6 = c7659e4.vip;
                    if (abstractComponentCallbacksC17875e6 != null) {
                        if (abstractComponentCallbacksC17875e6.f35105e != null) {
                            abstractComponentCallbacksC17875e6.appmetrica().ad = z11;
                        }
                        int i18 = c10159e2.purchase;
                        int i19 = 8194;
                        int i20 = 4097;
                        if (i18 != 4097) {
                            if (i18 != 8194) {
                                i20 = 4100;
                                if (i18 != 8197) {
                                    i19 = 4099;
                                    if (i18 != 4099) {
                                        i19 = i18 != 4100 ? 0 : 8197;
                                    }
                                }
                            }
                            i19 = i20;
                        }
                        if (abstractComponentCallbacksC17875e6.f35105e != null || i19 != 0) {
                            abstractComponentCallbacksC17875e6.appmetrica();
                            abstractComponentCallbacksC17875e6.f35105e.purchase = i19;
                        }
                        abstractComponentCallbacksC17875e6.appmetrica();
                        abstractComponentCallbacksC17875e6.f35105e.getClass();
                    }
                    switch (c7659e4.ad) {
                        case 1:
                            abstractComponentCallbacksC17875e6.m4465class(c7659e4.license, c7659e4.appmetrica, c7659e4.purchase, c7659e4.billing);
                            z = true;
                            abstractC15958e.m4064strictfp(abstractComponentCallbacksC17875e6, true);
                            abstractC15958e.m4050case(abstractComponentCallbacksC17875e6);
                            size3--;
                            z11 = z;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + c7659e4.ad);
                        case 3:
                            abstractComponentCallbacksC17875e6.m4465class(c7659e4.license, c7659e4.appmetrica, c7659e4.purchase, c7659e4.billing);
                            abstractC15958e.ad(abstractComponentCallbacksC17875e6);
                            z = true;
                            size3--;
                            z11 = z;
                        case 4:
                            abstractComponentCallbacksC17875e6.m4465class(c7659e4.license, c7659e4.appmetrica, c7659e4.purchase, c7659e4.billing);
                            abstractC15958e.getClass();
                            m4044import(abstractComponentCallbacksC17875e6);
                            z = true;
                            size3--;
                            z11 = z;
                        case 5:
                            abstractComponentCallbacksC17875e6.m4465class(c7659e4.license, c7659e4.appmetrica, c7659e4.purchase, c7659e4.billing);
                            abstractC15958e.m4064strictfp(abstractComponentCallbacksC17875e6, true);
                            abstractC15958e.m4067this(abstractComponentCallbacksC17875e6);
                            z = true;
                            size3--;
                            z11 = z;
                        case 6:
                            abstractComponentCallbacksC17875e6.m4465class(c7659e4.license, c7659e4.appmetrica, c7659e4.purchase, c7659e4.billing);
                            abstractC15958e.metrica(abstractComponentCallbacksC17875e6);
                            z = true;
                            size3--;
                            z11 = z;
                        case 7:
                            abstractComponentCallbacksC17875e6.m4465class(c7659e4.license, c7659e4.appmetrica, c7659e4.purchase, c7659e4.billing);
                            abstractC15958e.m4064strictfp(abstractComponentCallbacksC17875e6, true);
                            abstractC15958e.yandex(abstractComponentCallbacksC17875e6);
                            z = true;
                            size3--;
                            z11 = z;
                        case 8:
                            abstractC15958e.m4060package(null);
                            z = true;
                            size3--;
                            z11 = z;
                        case 9:
                            abstractC15958e.m4060package(abstractComponentCallbacksC17875e6);
                            z = true;
                            size3--;
                            z11 = z;
                        case 10:
                            c7659e4.startapp = abstractComponentCallbacksC17875e6.f35077e;
                            abstractC15958e.m4061private(abstractComponentCallbacksC17875e6, c7659e4.yandex);
                            z = true;
                            size3--;
                            z11 = z;
                    }
                }
            } else {
                c10159e2.metrica(1);
                AbstractC15958e abstractC15958e2 = c10159e2.admob;
                ArrayList arrayList14 = c10159e2.ad;
                int size4 = arrayList14.size();
                int i21 = 0;
                while (i21 < size4) {
                    C7659e c7659e5 = (C7659e) arrayList14.get(i21);
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e7 = c7659e5.vip;
                    if (abstractComponentCallbacksC17875e7 != null) {
                        if (abstractComponentCallbacksC17875e7.f35105e != null) {
                            abstractComponentCallbacksC17875e7.appmetrica().ad = false;
                        }
                        int i22 = c10159e2.purchase;
                        if (abstractComponentCallbacksC17875e7.f35105e != null || i22 != 0) {
                            abstractComponentCallbacksC17875e7.appmetrica();
                            abstractComponentCallbacksC17875e7.f35105e.purchase = i22;
                        }
                        abstractComponentCallbacksC17875e7.appmetrica();
                        abstractComponentCallbacksC17875e7.f35105e.getClass();
                    }
                    switch (c7659e5.ad) {
                        case 1:
                            str = str2;
                            abstractComponentCallbacksC17875e7.m4465class(c7659e5.license, c7659e5.appmetrica, c7659e5.purchase, c7659e5.billing);
                            abstractC15958e2.m4064strictfp(abstractComponentCallbacksC17875e7, false);
                            abstractC15958e2.ad(abstractComponentCallbacksC17875e7);
                            i21++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + c7659e5.ad);
                        case 3:
                            str = str2;
                            abstractComponentCallbacksC17875e7.m4465class(c7659e5.license, c7659e5.appmetrica, c7659e5.purchase, c7659e5.billing);
                            abstractC15958e2.m4050case(abstractComponentCallbacksC17875e7);
                            i21++;
                            str2 = str;
                        case 4:
                            str = str2;
                            abstractComponentCallbacksC17875e7.m4465class(c7659e5.license, c7659e5.appmetrica, c7659e5.purchase, c7659e5.billing);
                            abstractC15958e2.m4067this(abstractComponentCallbacksC17875e7);
                            i21++;
                            str2 = str;
                        case 5:
                            str = str2;
                            abstractComponentCallbacksC17875e7.m4465class(c7659e5.license, c7659e5.appmetrica, c7659e5.purchase, c7659e5.billing);
                            abstractC15958e2.m4064strictfp(abstractComponentCallbacksC17875e7, false);
                            m4044import(abstractComponentCallbacksC17875e7);
                            i21++;
                            str2 = str;
                        case 6:
                            str = str2;
                            abstractComponentCallbacksC17875e7.m4465class(c7659e5.license, c7659e5.appmetrica, c7659e5.purchase, c7659e5.billing);
                            abstractC15958e2.yandex(abstractComponentCallbacksC17875e7);
                            i21++;
                            str2 = str;
                        case 7:
                            str = str2;
                            abstractComponentCallbacksC17875e7.m4465class(c7659e5.license, c7659e5.appmetrica, c7659e5.purchase, c7659e5.billing);
                            abstractC15958e2.m4064strictfp(abstractComponentCallbacksC17875e7, false);
                            abstractC15958e2.metrica(abstractComponentCallbacksC17875e7);
                            i21++;
                            str2 = str;
                        case 8:
                            abstractC15958e2.m4060package(abstractComponentCallbacksC17875e7);
                            str = str2;
                            i21++;
                            str2 = str;
                        case 9:
                            abstractC15958e2.m4060package(null);
                            str = str2;
                            i21++;
                            str2 = str;
                        case 10:
                            c7659e5.yandex = abstractComponentCallbacksC17875e7.f35077e;
                            abstractC15958e2.m4061private(abstractComponentCallbacksC17875e7, c7659e5.startapp);
                            str = str2;
                            i21++;
                            str2 = str;
                    }
                }
            }
            i17++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z10 && !arrayList12.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(firebase((C10159e) it2.next()));
            }
            if (this.yandex == null) {
                Iterator it3 = arrayList12.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        throw new ClassCastException();
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList12.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        throw new ClassCastException();
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i23 = i6; i23 < i2; i23++) {
            C10159e c10159e3 = (C10159e) arrayList.get(i23);
            if (booleanValue) {
                for (int size5 = c10159e3.ad.size() - 1; size5 >= 0; size5--) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e8 = ((C7659e) c10159e3.ad.get(size5)).vip;
                    if (abstractComponentCallbacksC17875e8 != null) {
                        billing(abstractComponentCallbacksC17875e8).mopub();
                    }
                }
            } else {
                Iterator it7 = c10159e3.ad.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e9 = ((C7659e) it7.next()).vip;
                    if (abstractComponentCallbacksC17875e9 != null) {
                        billing(abstractComponentCallbacksC17875e9).mopub();
                    }
                }
            }
        }
        m4062protected(this.tapsense, true);
        Iterator it8 = purchase(arrayList, i6, i2).iterator();
        while (it8.hasNext()) {
            C9290e c9290e = (C9290e) it8.next();
            c9290e.appmetrica = booleanValue;
            synchronized (c9290e.vip) {
                try {
                    c9290e.mopub();
                    ArrayList arrayList15 = c9290e.vip;
                    ListIterator listIterator = arrayList15.listIterator(arrayList15.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object previous = listIterator.previous();
                            C14635e c14635e = (C14635e) previous;
                            View view = c14635e.metrica.f35098e;
                            char c = 4;
                            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                int visibility = view.getVisibility();
                                if (visibility == 0) {
                                    c = 2;
                                } else if (visibility != 4) {
                                    if (visibility != 8) {
                                        throw new IllegalArgumentException("Unknown visibility " + visibility);
                                    }
                                    c = 3;
                                }
                                if (c14635e.ad != 2 && c != 2) {
                                    obj = previous;
                                }
                            }
                            if (c14635e.ad != 2) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    c9290e.purchase = false;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c9290e.appmetrica();
        }
        while (i6 < i2) {
            C10159e c10159e4 = (C10159e) arrayList.get(i6);
            if (((Boolean) arrayList2.get(i6)).booleanValue() && c10159e4.remoteconfig >= 0) {
                c10159e4.remoteconfig = -1;
            }
            if (c10159e4.Signature != null) {
                for (int i24 = 0; i24 < c10159e4.Signature.size(); i24++) {
                    ((Runnable) c10159e4.Signature.get(i24)).run();
                }
                c10159e4.Signature = null;
            }
            i6++;
        }
        if (!z10 || arrayList12.size() <= 0) {
            return;
        }
        arrayList12.get(0).getClass();
        throw new ClassCastException();
    }

    public final void advert() {
        boolean z;
        this.f31422native = true;
        applovin(true);
        isVip();
        C2386e c2386e = this.isVip;
        C11106e c11106e = this.metrica;
        if (c2386e != null) {
            z = ((C16301e) c11106e.f22006e).purchase;
        } else {
            z = AbstractC0869e.premium(c2386e.f6096e) ? !r1.isChangingConfigurations() : true;
        }
        if (z) {
            Iterator it = this.advert.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C16931e) it.next()).f33163e.iterator();
                while (it2.hasNext()) {
                    ((C16301e) c11106e.f22006e).license((String) it2.next(), false);
                }
            }
        }
        signatures(-1);
        C2386e c2386e2 = this.isVip;
        if (c2386e2 != null) {
            c2386e2.f6093e.f31249e.remove(this.subscription);
        }
        C2386e c2386e3 = this.isVip;
        if (c2386e3 != null) {
            c2386e3.f6093e.f31241e.remove(this.admob);
        }
        C2386e c2386e4 = this.isVip;
        if (c2386e4 != null) {
            c2386e4.f6093e.f31238e.remove(this.remoteconfig);
        }
        C2386e c2386e5 = this.isVip;
        if (c2386e5 != null) {
            c2386e5.f6093e.f31242e.remove(this.pro);
        }
        C2386e c2386e6 = this.isVip;
        if ((c2386e6 != null) && this.isPro == null) {
            C0909e c0909e = c2386e6.f6093e.f31240e;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c0909e.f3322e;
            C17982e c17982e = this.signatures;
            copyOnWriteArrayList.remove(c17982e);
            if (((HashMap) c0909e.f3321e).remove(c17982e) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0909e.f3323e).run();
        }
        this.isVip = null;
        this.inmobi = null;
        this.isPro = null;
        if (this.billing != null) {
            this.adcel.license();
            this.billing = null;
        }
        C15172e c15172e = this.subs;
        if (c15172e != null) {
            c15172e.license();
            this.crashlytics.license();
            this.firebase.license();
        }
    }

    public final void amazon(boolean z) {
        if (z && this.isVip != null) {
            m4063static(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null && z) {
                abstractComponentCallbacksC17875e.f35093e.amazon(true);
            }
        }
    }

    public final boolean applovin(boolean z) {
        boolean z2;
        C10159e c10159e;
        isPro(z);
        if (!this.startapp && (c10159e = this.yandex) != null) {
            c10159e.subscription = false;
            c10159e.license();
            if (m4045native(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.yandex + " as part of execPendingActions for actions " + this.ad);
            }
            this.yandex.appmetrica(false, false);
            this.ad.add(0, this.yandex);
            Iterator it = this.yandex.ad.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = ((C7659e) it.next()).vip;
                if (abstractComponentCallbacksC17875e != null) {
                    abstractComponentCallbacksC17875e.f35070e = false;
                }
            }
            this.yandex = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f31425throw;
            ArrayList arrayList2 = this.f31427while;
            synchronized (this.ad) {
                if (this.ad.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.ad.size();
                        z2 = false;
                        for (int i = 0; i < size; i++) {
                            z2 |= ((InterfaceC11152e) this.ad.get(i)).ad(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.vip = true;
            try {
                m4051catch(this.f31425throw, this.f31427while);
            } finally {
                license();
            }
        }
        m4066synchronized();
        if (this.f31419extends) {
            this.f31419extends = false;
            m4057instanceof();
        }
        ((HashMap) this.metrica.f22007e).values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final HashSet appmetrica() {
        C9290e c9290e;
        HashSet hashSet = new HashSet();
        Iterator it = this.metrica.firebase().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C5221e) it.next()).metrica.f35078e;
            if (viewGroup != null) {
                m4055goto();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C9290e) {
                    c9290e = (C9290e) tag;
                } else {
                    c9290e = new C9290e(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c9290e);
                }
                hashSet.add(c9290e);
            }
        }
        return hashSet;
    }

    public final C5221e billing(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        String str = abstractComponentCallbacksC17875e.f35068e;
        C11106e c11106e = this.metrica;
        C5221e c5221e = (C5221e) ((HashMap) c11106e.f22007e).get(str);
        if (c5221e != null) {
            return c5221e;
        }
        C5221e c5221e2 = new C5221e(this.loadAd, c11106e, abstractComponentCallbacksC17875e);
        c5221e2.smaato(this.isVip.f6096e.getClassLoader());
        c5221e2.appmetrica = this.tapsense;
        return c5221e2;
    }

    /* renamed from: break, reason: not valid java name */
    public final void m4049break() {
        if (this.isVip == null) {
            return;
        }
        this.f31420goto = false;
        this.f31424this = false;
        this.f31423protected.billing = false;
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null) {
                abstractComponentCallbacksC17875e.f35093e.m4049break();
            }
        }
    }

    /* renamed from: case, reason: not valid java name */
    public final void m4050case(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (m4045native(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC17875e + " nesting=" + abstractComponentCallbacksC17875e.f35097e);
        }
        boolean loadAd = abstractComponentCallbacksC17875e.loadAd();
        if (abstractComponentCallbacksC17875e.f35096e && loadAd) {
            return;
        }
        C11106e c11106e = this.metrica;
        synchronized (((ArrayList) c11106e.f22008e)) {
            ((ArrayList) c11106e.f22008e).remove(abstractComponentCallbacksC17875e);
        }
        abstractComponentCallbacksC17875e.f35091e = false;
        if (m4043extends(abstractComponentCallbacksC17875e)) {
            this.f31421interface = true;
        }
        abstractComponentCallbacksC17875e.f35071e = true;
        m4069transient(abstractComponentCallbacksC17875e);
    }

    /* renamed from: catch, reason: not valid java name */
    public final void m4051catch(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C10159e) arrayList.get(i)).loadAd) {
                if (i2 != i) {
                    ads(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C10159e) arrayList.get(i2)).loadAd) {
                        i2++;
                    }
                }
                ads(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            ads(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final ViewGroup m4052class(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        ViewGroup viewGroup = abstractComponentCallbacksC17875e.f35078e;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC17875e.f35092e <= 0 || !this.inmobi.loadAd()) {
            return null;
        }
        View amazon = this.inmobi.amazon(abstractComponentCallbacksC17875e.f35092e);
        if (amazon instanceof ViewGroup) {
            return (ViewGroup) amazon;
        }
        return null;
    }

    public final void crashlytics() {
        Iterator it = appmetrica().iterator();
        while (it.hasNext()) {
            C9290e c9290e = (C9290e) it.next();
            if (c9290e.purchase) {
                if (m4045native(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c9290e.purchase = false;
                c9290e.appmetrica();
            }
        }
    }

    /* renamed from: default, reason: not valid java name */
    public final boolean m4053default(int i, int i2) {
        applovin(false);
        isPro(true);
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.applovin;
        if (abstractComponentCallbacksC17875e != null && i < 0 && abstractComponentCallbacksC17875e.purchase().m4048abstract()) {
            return true;
        }
        boolean m4056implements = m4056implements(this.f31425throw, this.f31427while, i, i2);
        if (m4056implements) {
            this.vip = true;
            try {
                m4051catch(this.f31425throw, this.f31427while);
            } finally {
                license();
            }
        }
        m4066synchronized();
        if (this.f31419extends) {
            this.f31419extends = false;
            m4057instanceof();
        }
        ((HashMap) this.metrica.f22007e).values().removeAll(Collections.singleton(null));
        return m4056implements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [eًؑۡ, java.lang.Object] */
    /* renamed from: final, reason: not valid java name */
    public final void m4054final(Bundle bundle) {
        C18540e c18540e;
        int i;
        boolean z;
        int i2;
        C5221e c5221e;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.isVip.f6096e.getClassLoader());
                this.smaato.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.isVip.f6096e.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        C11106e c11106e = this.metrica;
        HashMap hashMap2 = (HashMap) c11106e.f22009e;
        HashMap hashMap3 = (HashMap) c11106e.f22007e;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        C2665e c2665e = (C2665e) bundle.getParcelable("state");
        if (c2665e == null) {
            return;
        }
        hashMap3.clear();
        Iterator it = c2665e.f6538e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c18540e = this.loadAd;
            i = 2;
            if (!hasNext) {
                break;
            }
            Bundle m3006else = c11106e.m3006else((String) it.next(), null);
            if (m3006else != null) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = (AbstractComponentCallbacksC17875e) this.f31423protected.vip.get(((C7509e) m3006else.getParcelable("state")).f15311e);
                if (abstractComponentCallbacksC17875e != null) {
                    if (m4045native(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC17875e);
                    }
                    c5221e = new C5221e(c18540e, c11106e, abstractComponentCallbacksC17875e, m3006else);
                } else {
                    c5221e = new C5221e(this.loadAd, this.metrica, this.isVip.f6096e.getClassLoader(), m4058interface(), m3006else);
                }
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = c5221e.metrica;
                abstractComponentCallbacksC17875e2.f35080e = m3006else;
                abstractComponentCallbacksC17875e2.f35112e = this;
                if (m4045native(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC17875e2.f35068e + "): " + abstractComponentCallbacksC17875e2);
                }
                c5221e.smaato(this.isVip.f6096e.getClassLoader());
                c11106e.m3017private(c5221e);
                c5221e.appmetrica = this.tapsense;
            }
        }
        C16301e c16301e = this.f31423protected;
        c16301e.getClass();
        Iterator it2 = new ArrayList(c16301e.vip.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e3 = (AbstractComponentCallbacksC17875e) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC17875e3.f35068e) == null) {
                if (m4045native(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC17875e3 + " that was not found in the set of active Fragments " + c2665e.f6538e);
                }
                this.f31423protected.purchase(abstractComponentCallbacksC17875e3);
                abstractComponentCallbacksC17875e3.f35112e = this;
                C5221e c5221e2 = new C5221e(c18540e, c11106e, abstractComponentCallbacksC17875e3);
                c5221e2.appmetrica = 1;
                c5221e2.mopub();
                abstractComponentCallbacksC17875e3.f35071e = true;
                c5221e2.mopub();
            }
        }
        ArrayList<String> arrayList = c2665e.f6535e;
        ((ArrayList) c11106e.f22008e).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC17875e isPro = c11106e.isPro(str3);
                if (isPro == null) {
                    throw new IllegalStateException(AbstractC5087e.m1746extends("No instantiated fragment for (", str3, ")"));
                }
                if (m4045native(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + isPro);
                }
                c11106e.yandex(isPro);
            }
        }
        if (c2665e.f6534e != null) {
            this.license = new ArrayList(c2665e.f6534e.length);
            int i3 = 0;
            while (true) {
                C4741e[] c4741eArr = c2665e.f6534e;
                if (i3 >= c4741eArr.length) {
                    break;
                }
                C4741e c4741e = c4741eArr[i3];
                ArrayList arrayList2 = c4741e.f10149e;
                C10159e c10159e = new C10159e(this);
                int[] iArr = c4741e.f10154e;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    ?? obj = new Object();
                    int i6 = i4 + 1;
                    int i7 = i;
                    obj.ad = iArr[i4];
                    if (m4045native(i7)) {
                        Log.v("FragmentManager", "Instantiate " + c10159e + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    obj.yandex = EnumC7785e.values()[c4741e.f10146e[i5]];
                    obj.startapp = EnumC7785e.values()[c4741e.f10152e[i5]];
                    int i8 = i4 + 2;
                    obj.metrica = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    obj.license = i9;
                    int i10 = iArr[i4 + 3];
                    obj.appmetrica = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    obj.purchase = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    obj.billing = i13;
                    c10159e.vip = i9;
                    c10159e.metrica = i10;
                    c10159e.license = i12;
                    c10159e.appmetrica = i13;
                    c10159e.vip(obj);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                c10159e.purchase = c4741e.f10143e;
                c10159e.yandex = c4741e.f10156e;
                c10159e.billing = true;
                c10159e.startapp = c4741e.f10150e;
                c10159e.adcel = c4741e.f10153e;
                c10159e.mopub = c4741e.f10147e;
                c10159e.advert = c4741e.f10151e;
                c10159e.smaato = c4741e.f10145e;
                c10159e.amazon = c4741e.f10144e;
                c10159e.loadAd = c4741e.f10148e;
                c10159e.remoteconfig = c4741e.f10155e;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((C7659e) c10159e.ad.get(i15)).vip = c11106e.isPro(str4);
                    }
                }
                c10159e.metrica(1);
                if (m4045native(i14)) {
                    StringBuilder premium = AbstractC4653e.premium("restoreAllState: back stack #", i3, " (index ");
                    premium.append(c10159e.remoteconfig);
                    premium.append("): ");
                    premium.append(c10159e);
                    Log.v("FragmentManager", premium.toString());
                    PrintWriter printWriter = new PrintWriter(new C13947e());
                    c10159e.billing("  ", printWriter, false);
                    printWriter.close();
                }
                this.license.add(c10159e);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.license = new ArrayList();
        }
        this.mopub.set(c2665e.f6537e);
        String str5 = c2665e.f6533e;
        if (str5 != null) {
            AbstractComponentCallbacksC17875e isPro2 = c11106e.isPro(str5);
            this.applovin = isPro2;
            subscription(isPro2);
        }
        ArrayList arrayList3 = c2665e.f6540e;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.advert.put((String) arrayList3.get(i16), (C16931e) c2665e.f6539e.get(i16));
            }
        }
        this.f31418class = new ArrayDeque(c2665e.f6536e);
    }

    /* renamed from: goto, reason: not valid java name */
    public final C10215e m4055goto() {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.isPro;
        return abstractComponentCallbacksC17875e != null ? abstractComponentCallbacksC17875e.f35112e.m4055goto() : this.premium;
    }

    /* renamed from: implements, reason: not valid java name */
    public final boolean m4056implements(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int i3 = -1;
        if (!this.license.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.license.size() - 1;
            } else {
                int size = this.license.size() - 1;
                while (size >= 0) {
                    C10159e c10159e = (C10159e) this.license.get(size);
                    if (i >= 0 && i == c10159e.remoteconfig) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        C10159e c10159e2 = (C10159e) this.license.get(i3 - 1);
                        if (i < 0 || i != c10159e2.remoteconfig) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.license.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.license.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C10159e) this.license.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void inmobi(InterfaceC11152e interfaceC11152e, boolean z) {
        if (!z) {
            if (this.isVip == null) {
                if (!this.f31422native) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f31420goto || this.f31424this) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.ad) {
            try {
                if (this.isVip == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.ad.add(interfaceC11152e);
                    m4059new();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m4057instanceof() {
        Iterator it = this.metrica.firebase().iterator();
        while (it.hasNext()) {
            C5221e c5221e = (C5221e) it.next();
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
            if (abstractComponentCallbacksC17875e.f35095e) {
                if (this.vip) {
                    this.f31419extends = true;
                } else {
                    abstractComponentCallbacksC17875e.f35095e = false;
                    c5221e.mopub();
                }
            }
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final C11419e m4058interface() {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.isPro;
        return abstractComponentCallbacksC17875e != null ? abstractComponentCallbacksC17875e.f35112e.m4058interface() : this.ads;
    }

    public final void isPro(boolean z) {
        if (this.vip) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.isVip == null) {
            if (!this.f31422native) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.isVip.f6094e.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.f31420goto || this.f31424this)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f31425throw == null) {
            this.f31425throw = new ArrayList();
            this.f31427while = new ArrayList();
        }
    }

    public final void isVip() {
        Iterator it = appmetrica().iterator();
        while (it.hasNext()) {
            ((C9290e) it.next()).yandex();
        }
    }

    public final void license() {
        this.vip = false;
        this.f31427while.clear();
        this.f31425throw.clear();
    }

    public final void loadAd() {
        Iterator it = this.metrica.m3003class().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = (AbstractComponentCallbacksC17875e) it.next();
            if (abstractComponentCallbacksC17875e != null) {
                abstractComponentCallbacksC17875e.amazon();
                abstractComponentCallbacksC17875e.f35093e.loadAd();
            }
        }
    }

    public final void metrica(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (m4045native(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC17875e);
        }
        if (abstractComponentCallbacksC17875e.f35096e) {
            abstractComponentCallbacksC17875e.f35096e = false;
            if (abstractComponentCallbacksC17875e.f35091e) {
                return;
            }
            this.metrica.yandex(abstractComponentCallbacksC17875e);
            if (m4045native(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC17875e);
            }
            if (m4043extends(abstractComponentCallbacksC17875e)) {
                this.f31421interface = true;
            }
        }
    }

    public final boolean mopub() {
        if (this.tapsense < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null && m4047while(abstractComponentCallbacksC17875e)) {
                if (!abstractComponentCallbacksC17875e.f35090e ? abstractComponentCallbacksC17875e.f35093e.mopub() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC17875e);
                    z = true;
                }
            }
        }
        if (this.appmetrica != null) {
            for (int i = 0; i < this.appmetrica.size(); i++) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = (AbstractComponentCallbacksC17875e) this.appmetrica.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC17875e2)) {
                    abstractComponentCallbacksC17875e2.getClass();
                }
            }
        }
        this.appmetrica = arrayList;
        return z;
    }

    /* renamed from: new, reason: not valid java name */
    public final void m4059new() {
        synchronized (this.ad) {
            try {
                if (this.ad.size() == 1) {
                    this.isVip.f6094e.removeCallbacks(this.f31417break);
                    this.isVip.f6094e.post(this.f31417break);
                    m4066synchronized();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: package, reason: not valid java name */
    public final void m4060package(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (abstractComponentCallbacksC17875e != null) {
            if (!abstractComponentCallbacksC17875e.equals(this.metrica.isPro(abstractComponentCallbacksC17875e.f35068e)) || (abstractComponentCallbacksC17875e.f35074e != null && abstractComponentCallbacksC17875e.f35112e != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC17875e + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = this.applovin;
        this.applovin = abstractComponentCallbacksC17875e;
        subscription(abstractComponentCallbacksC17875e2);
        subscription(this.applovin);
    }

    public final AbstractComponentCallbacksC17875e premium(int i) {
        C11106e c11106e = this.metrica;
        ArrayList arrayList = (ArrayList) c11106e.f22008e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = (AbstractComponentCallbacksC17875e) arrayList.get(size);
            if (abstractComponentCallbacksC17875e != null && abstractComponentCallbacksC17875e.f35104e == i) {
                return abstractComponentCallbacksC17875e;
            }
        }
        for (C5221e c5221e : ((HashMap) c11106e.f22007e).values()) {
            if (c5221e != null) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = c5221e.metrica;
                if (abstractComponentCallbacksC17875e2.f35104e == i) {
                    return abstractComponentCallbacksC17875e2;
                }
            }
        }
        return null;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m4061private(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, EnumC7785e enumC7785e) {
        if (abstractComponentCallbacksC17875e.equals(this.metrica.isPro(abstractComponentCallbacksC17875e.f35068e)) && (abstractComponentCallbacksC17875e.f35074e == null || abstractComponentCallbacksC17875e.f35112e == this)) {
            abstractComponentCallbacksC17875e.f35077e = enumC7785e;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC17875e + " is not an active fragment of FragmentManager " + this);
    }

    public final boolean pro() {
        if (this.tapsense < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null && m4047while(abstractComponentCallbacksC17875e)) {
                if (!abstractComponentCallbacksC17875e.f35090e ? abstractComponentCallbacksC17875e.f35093e.pro() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m4062protected(int i, boolean z) {
        C2386e c2386e;
        if (this.isVip == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.tapsense) {
            this.tapsense = i;
            C11106e c11106e = this.metrica;
            HashMap hashMap = (HashMap) c11106e.f22007e;
            Iterator it = ((ArrayList) c11106e.f22008e).iterator();
            while (it.hasNext()) {
                C5221e c5221e = (C5221e) hashMap.get(((AbstractComponentCallbacksC17875e) it.next()).f35068e);
                if (c5221e != null) {
                    c5221e.mopub();
                }
            }
            for (C5221e c5221e2 : hashMap.values()) {
                if (c5221e2 != null) {
                    c5221e2.mopub();
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e2.metrica;
                    if (abstractComponentCallbacksC17875e.f35071e && !abstractComponentCallbacksC17875e.loadAd()) {
                        c11106e.m3016package(c5221e2);
                    }
                }
            }
            m4057instanceof();
            if (this.f31421interface && (c2386e = this.isVip) != null && this.tapsense == 7) {
                c2386e.f6093e.invalidateOptionsMenu();
                this.f31421interface = false;
            }
        }
    }

    public final HashSet purchase(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        C9290e c9290e;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C10159e) arrayList.get(i)).ad.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = ((C7659e) it.next()).vip;
                if (abstractComponentCallbacksC17875e != null && (viewGroup = abstractComponentCallbacksC17875e.f35078e) != null) {
                    m4055goto();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof C9290e) {
                        c9290e = (C9290e) tag;
                    } else {
                        c9290e = new C9290e(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, c9290e);
                    }
                    hashSet.add(c9290e);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void remoteconfig(boolean z) {
        if (z && this.isVip != null) {
            m4063static(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null && z) {
                abstractComponentCallbacksC17875e.f35093e.remoteconfig(true);
            }
        }
    }

    public final void signatures(int i) {
        try {
            this.vip = true;
            for (C5221e c5221e : ((HashMap) this.metrica.f22007e).values()) {
                if (c5221e != null) {
                    c5221e.appmetrica = i;
                }
            }
            m4062protected(i, false);
            Iterator it = appmetrica().iterator();
            while (it.hasNext()) {
                ((C9290e) it.next()).yandex();
            }
            this.vip = false;
            applovin(true);
        } catch (Throwable th) {
            this.vip = false;
            throw th;
        }
    }

    public final void smaato(boolean z) {
        if (z && this.isVip != null) {
            m4063static(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null) {
                abstractComponentCallbacksC17875e.f35094e = true;
                if (z) {
                    abstractComponentCallbacksC17875e.f35093e.smaato(true);
                }
            }
        }
    }

    public final void startapp(boolean z, Configuration configuration) {
        if (z && this.isVip != null) {
            m4063static(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : this.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null) {
                abstractComponentCallbacksC17875e.onConfigurationChanged(configuration);
                if (z) {
                    abstractComponentCallbacksC17875e.f35093e.startapp(true, configuration);
                }
            }
        }
    }

    /* renamed from: static, reason: not valid java name */
    public final void m4063static(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C13947e());
        C2386e c2386e = this.isVip;
        if (c2386e == null) {
            try {
                tapsense("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c2386e.f6093e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m4064strictfp(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        ViewGroup m4052class = m4052class(abstractComponentCallbacksC17875e);
        if (m4052class == null || !(m4052class instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) m4052class).setDrawDisappearingViewsLast(!z);
    }

    public final AbstractComponentCallbacksC17875e subs(String str) {
        C11106e c11106e = this.metrica;
        ArrayList arrayList = (ArrayList) c11106e.f22008e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = (AbstractComponentCallbacksC17875e) arrayList.get(size);
            if (abstractComponentCallbacksC17875e != null && str.equals(abstractComponentCallbacksC17875e.f35089e)) {
                return abstractComponentCallbacksC17875e;
            }
        }
        for (C5221e c5221e : ((HashMap) c11106e.f22007e).values()) {
            if (c5221e != null) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = c5221e.metrica;
                if (str.equals(abstractComponentCallbacksC17875e2.f35089e)) {
                    return abstractComponentCallbacksC17875e2;
                }
            }
        }
        return null;
    }

    public final void subscription(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (abstractComponentCallbacksC17875e != null) {
            if (abstractComponentCallbacksC17875e.equals(this.metrica.isPro(abstractComponentCallbacksC17875e.f35068e))) {
                abstractComponentCallbacksC17875e.f35112e.getClass();
                boolean m4046try = m4046try(abstractComponentCallbacksC17875e);
                Boolean bool = abstractComponentCallbacksC17875e.f35073e;
                if (bool == null || bool.booleanValue() != m4046try) {
                    abstractComponentCallbacksC17875e.f35073e = Boolean.valueOf(m4046try);
                    C1154e c1154e = abstractComponentCallbacksC17875e.f35093e;
                    c1154e.m4066synchronized();
                    c1154e.subscription(c1154e.applovin);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.os.Parcelable, eؔٙؖ, java.lang.Object] */
    /* renamed from: super, reason: not valid java name */
    public final Bundle m4065super() {
        ArrayList arrayList;
        C4741e[] c4741eArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        crashlytics();
        isVip();
        applovin(true);
        this.f31420goto = true;
        this.f31423protected.billing = true;
        C11106e c11106e = this.metrica;
        c11106e.getClass();
        HashMap hashMap = (HashMap) c11106e.f22007e;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (C5221e c5221e : hashMap.values()) {
            if (c5221e != null) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
                String str = abstractComponentCallbacksC17875e.f35068e;
                c5221e.getClass();
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = c5221e.metrica;
                if (abstractComponentCallbacksC17875e2.f35107e == -1 && (bundle = abstractComponentCallbacksC17875e2.f35080e) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new C7509e(abstractComponentCallbacksC17875e2));
                if (abstractComponentCallbacksC17875e2.f35107e > 0) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC17875e2.inmobi(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c5221e.ad.m4575native(abstractComponentCallbacksC17875e2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC17875e2.f35100e.m1999protected(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle m4065super = abstractComponentCallbacksC17875e2.f35093e.m4065super();
                    if (!m4065super.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", m4065super);
                    }
                    if (abstractComponentCallbacksC17875e2.f35098e != null) {
                        c5221e.loadAd();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC17875e2.f35072e;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC17875e2.f35099e;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC17875e2.f35111e;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c11106e.m3006else(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC17875e.f35068e);
                if (m4045native(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC17875e + ": " + abstractComponentCallbacksC17875e.f35080e);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.metrica.f22009e;
        if (!hashMap2.isEmpty()) {
            C11106e c11106e2 = this.metrica;
            synchronized (((ArrayList) c11106e2.f22008e)) {
                try {
                    if (((ArrayList) c11106e2.f22008e).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c11106e2.f22008e).size());
                        Iterator it = ((ArrayList) c11106e2.f22008e).iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e3 = (AbstractComponentCallbacksC17875e) it.next();
                            arrayList.add(abstractComponentCallbacksC17875e3.f35068e);
                            if (m4045native(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC17875e3.f35068e + "): " + abstractComponentCallbacksC17875e3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.license.size();
            if (size > 0) {
                c4741eArr = new C4741e[size];
                for (int i = 0; i < size; i++) {
                    c4741eArr[i] = new C4741e((C10159e) this.license.get(i));
                    if (m4045native(2)) {
                        StringBuilder premium = AbstractC4653e.premium("saveAllState: adding back stack #", i, ": ");
                        premium.append(this.license.get(i));
                        Log.v("FragmentManager", premium.toString());
                    }
                }
            } else {
                c4741eArr = null;
            }
            ?? obj = new Object();
            obj.f6533e = null;
            ArrayList arrayList3 = new ArrayList();
            obj.f6540e = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.f6539e = arrayList4;
            obj.f6538e = arrayList2;
            obj.f6535e = arrayList;
            obj.f6534e = c4741eArr;
            obj.f6537e = this.mopub.get();
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e4 = this.applovin;
            if (abstractComponentCallbacksC17875e4 != null) {
                obj.f6533e = abstractComponentCallbacksC17875e4.f35068e;
            }
            arrayList3.addAll(this.advert.keySet());
            arrayList4.addAll(this.advert.values());
            obj.f6536e = new ArrayList(this.f31418class);
            bundle2.putParcelable("state", obj);
            for (String str2 : this.smaato.keySet()) {
                bundle2.putBundle(AbstractC17861e.Signature("result_", str2), (Bundle) this.smaato.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(AbstractC17861e.Signature("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (m4045native(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m4066synchronized() {
        synchronized (this.ad) {
            try {
                if (!this.ad.isEmpty()) {
                    this.adcel.appmetrica(true);
                    if (m4045native(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.license.size() + (this.yandex != null ? 1 : 0) > 0 && m4046try(this.isPro);
                if (m4045native(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.adcel.appmetrica(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void tapsense(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String adcel = AbstractC10257e.adcel(str, "    ");
        C11106e c11106e = this.metrica;
        ArrayList arrayList = (ArrayList) c11106e.f22008e;
        String adcel2 = AbstractC10257e.adcel(str, "    ");
        HashMap hashMap = (HashMap) c11106e.f22007e;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C5221e c5221e : hashMap.values()) {
                printWriter.print(str);
                if (c5221e != null) {
                    AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
                    printWriter.println(abstractComponentCallbacksC17875e);
                    abstractComponentCallbacksC17875e.getClass();
                    printWriter.print(adcel2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC17875e.f35104e));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC17875e.f35092e));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC17875e.f35089e);
                    printWriter.print(adcel2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35107e);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35068e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC17875e.f35097e);
                    printWriter.print(adcel2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35091e);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35071e);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35075e);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC17875e.f35083e);
                    printWriter.print(adcel2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35090e);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35096e);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35079e);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(adcel2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC17875e.f35087e);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC17875e.f35084e);
                    if (abstractComponentCallbacksC17875e.f35112e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35112e);
                    }
                    if (abstractComponentCallbacksC17875e.f35074e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35074e);
                    }
                    if (abstractComponentCallbacksC17875e.f35101e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35101e);
                    }
                    if (abstractComponentCallbacksC17875e.f35111e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35111e);
                    }
                    if (abstractComponentCallbacksC17875e.f35080e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35080e);
                    }
                    if (abstractComponentCallbacksC17875e.f35072e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35072e);
                    }
                    if (abstractComponentCallbacksC17875e.f35099e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35099e);
                    }
                    Object obj = abstractComponentCallbacksC17875e.f35110e;
                    if (obj == null) {
                        AbstractC15958e abstractC15958e = abstractComponentCallbacksC17875e.f35112e;
                        obj = (abstractC15958e == null || (str2 = abstractComponentCallbacksC17875e.f35088e) == null) ? null : abstractC15958e.metrica.isPro(str2);
                    }
                    if (obj != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35102e);
                    }
                    printWriter.print(adcel2);
                    printWriter.print("mPopDirection=");
                    C0190e c0190e = abstractComponentCallbacksC17875e.f35105e;
                    printWriter.println(c0190e == null ? false : c0190e.ad);
                    C0190e c0190e2 = abstractComponentCallbacksC17875e.f35105e;
                    if ((c0190e2 == null ? 0 : c0190e2.vip) != 0) {
                        printWriter.print(adcel2);
                        printWriter.print("getEnterAnim=");
                        C0190e c0190e3 = abstractComponentCallbacksC17875e.f35105e;
                        printWriter.println(c0190e3 == null ? 0 : c0190e3.vip);
                    }
                    C0190e c0190e4 = abstractComponentCallbacksC17875e.f35105e;
                    if ((c0190e4 == null ? 0 : c0190e4.metrica) != 0) {
                        printWriter.print(adcel2);
                        printWriter.print("getExitAnim=");
                        C0190e c0190e5 = abstractComponentCallbacksC17875e.f35105e;
                        printWriter.println(c0190e5 == null ? 0 : c0190e5.metrica);
                    }
                    C0190e c0190e6 = abstractComponentCallbacksC17875e.f35105e;
                    if ((c0190e6 == null ? 0 : c0190e6.license) != 0) {
                        printWriter.print(adcel2);
                        printWriter.print("getPopEnterAnim=");
                        C0190e c0190e7 = abstractComponentCallbacksC17875e.f35105e;
                        printWriter.println(c0190e7 == null ? 0 : c0190e7.license);
                    }
                    C0190e c0190e8 = abstractComponentCallbacksC17875e.f35105e;
                    if ((c0190e8 == null ? 0 : c0190e8.appmetrica) != 0) {
                        printWriter.print(adcel2);
                        printWriter.print("getPopExitAnim=");
                        C0190e c0190e9 = abstractComponentCallbacksC17875e.f35105e;
                        printWriter.println(c0190e9 == null ? 0 : c0190e9.appmetrica);
                    }
                    if (abstractComponentCallbacksC17875e.f35078e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35078e);
                    }
                    if (abstractComponentCallbacksC17875e.f35098e != null) {
                        printWriter.print(adcel2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC17875e.f35098e);
                    }
                    if (abstractComponentCallbacksC17875e.startapp() != null) {
                        C11106e c11106e2 = new C11106e(abstractComponentCallbacksC17875e.billing(), C12905e.metrica, C8567e.vip);
                        InterfaceC7227e vip = AbstractC3820e.ad.vip(C12905e.class);
                        String license = vip.license();
                        if (license == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        C14338e c14338e = ((C12905e) c11106e2.m2999abstract(vip, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(license))).vip;
                        if (c14338e.f28363e > 0) {
                            printWriter.print(adcel2);
                            printWriter.println("Loaders:");
                            if (c14338e.f28363e > 0) {
                                if (c14338e.appmetrica(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(adcel2);
                                printWriter.print("  #");
                                printWriter.print(c14338e.f28365e[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(adcel2);
                    printWriter.println("Child " + abstractComponentCallbacksC17875e.f35093e + ":");
                    abstractComponentCallbacksC17875e.f35093e.tapsense(AbstractC10257e.adcel(adcel2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = (AbstractComponentCallbacksC17875e) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC17875e2.toString());
            }
        }
        ArrayList arrayList2 = this.appmetrica;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e3 = (AbstractComponentCallbacksC17875e) this.appmetrica.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC17875e3.toString());
            }
        }
        int size3 = this.license.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C10159e c10159e = (C10159e) this.license.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c10159e.toString());
                c10159e.billing(adcel, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mopub.get());
        synchronized (this.ad) {
            try {
                int size4 = this.ad.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (InterfaceC11152e) this.ad.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.isVip);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.inmobi);
        if (this.isPro != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.isPro);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.tapsense);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f31420goto);
        printWriter.print(" mStopped=");
        printWriter.print(this.f31424this);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f31422native);
        if (this.f31421interface) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f31421interface);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final void m4067this(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (m4045native(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC17875e);
        }
        if (abstractComponentCallbacksC17875e.f35090e) {
            return;
        }
        abstractComponentCallbacksC17875e.f35090e = true;
        abstractComponentCallbacksC17875e.f35109e = true ^ abstractComponentCallbacksC17875e.f35109e;
        m4069transient(abstractComponentCallbacksC17875e);
    }

    /* renamed from: throw, reason: not valid java name */
    public final boolean m4068throw() {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.isPro;
        if (abstractComponentCallbacksC17875e == null) {
            return true;
        }
        return abstractComponentCallbacksC17875e.f35074e != null && abstractComponentCallbacksC17875e.f35091e && abstractComponentCallbacksC17875e.mopub().m4068throw();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.isPro;
        if (abstractComponentCallbacksC17875e != null) {
            sb.append(abstractComponentCallbacksC17875e.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.isPro)));
            sb.append("}");
        } else {
            C2386e c2386e = this.isVip;
            if (c2386e != null) {
                sb.append(c2386e.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.isVip)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m4069transient(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        ViewGroup m4052class = m4052class(abstractComponentCallbacksC17875e);
        if (m4052class != null) {
            C0190e c0190e = abstractComponentCallbacksC17875e.f35105e;
            if ((c0190e == null ? 0 : c0190e.appmetrica) + (c0190e == null ? 0 : c0190e.license) + (c0190e == null ? 0 : c0190e.metrica) + (c0190e == null ? 0 : c0190e.vip) > 0) {
                if (m4052class.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    m4052class.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC17875e);
                }
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = (AbstractComponentCallbacksC17875e) m4052class.getTag(R.id.visible_removing_fragment_view_tag);
                C0190e c0190e2 = abstractComponentCallbacksC17875e.f35105e;
                boolean z = c0190e2 != null ? c0190e2.ad : false;
                if (abstractComponentCallbacksC17875e2.f35105e == null) {
                    return;
                }
                abstractComponentCallbacksC17875e2.appmetrica().ad = z;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vip(C2386e c2386e, AbstractC0815e abstractC0815e, AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (this.isVip != null) {
            throw new IllegalStateException("Already attached");
        }
        this.isVip = c2386e;
        this.inmobi = abstractC0815e;
        this.isPro = abstractComponentCallbacksC17875e;
        CopyOnWriteArrayList copyOnWriteArrayList = this.Signature;
        if (abstractComponentCallbacksC17875e != 0) {
            copyOnWriteArrayList.add(new C11784e(abstractComponentCallbacksC17875e));
        } else if (c2386e != null) {
            copyOnWriteArrayList.add(c2386e);
        }
        if (this.isPro != null) {
            m4066synchronized();
        }
        if (c2386e != null) {
            C6194e ad = c2386e.f6093e.ad();
            this.billing = ad;
            ad.ad(this.adcel, abstractComponentCallbacksC17875e != 0 ? abstractComponentCallbacksC17875e : c2386e);
        }
        if (abstractComponentCallbacksC17875e != 0) {
            C16301e c16301e = abstractComponentCallbacksC17875e.f35112e.f31423protected;
            HashMap hashMap = c16301e.metrica;
            C16301e c16301e2 = (C16301e) hashMap.get(abstractComponentCallbacksC17875e.f35068e);
            if (c16301e2 == null) {
                c16301e2 = new C16301e(c16301e.appmetrica);
                hashMap.put(abstractComponentCallbacksC17875e.f35068e, c16301e2);
            }
            this.f31423protected = c16301e2;
        } else if (c2386e != null) {
            C11106e c11106e = new C11106e(c2386e.f6093e.billing(), C16301e.yandex, C8567e.vip);
            InterfaceC7227e vip = AbstractC3820e.ad.vip(C16301e.class);
            String license = vip.license();
            if (license == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f31423protected = (C16301e) c11106e.m2999abstract(vip, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(license));
        } else {
            this.f31423protected = new C16301e(false);
        }
        C16301e c16301e3 = this.f31423protected;
        c16301e3.billing = this.f31420goto || this.f31424this;
        this.metrica.f22006e = c16301e3;
        C2386e c2386e2 = this.isVip;
        if (c2386e2 != null && abstractComponentCallbacksC17875e == 0) {
            C3168e yandex = c2386e2.yandex();
            yandex.m1261e("android:support:fragments", new C14574e(4, this));
            Bundle isPro = yandex.isPro("android:support:fragments");
            if (isPro != null) {
                m4054final(isPro);
            }
        }
        C2386e c2386e3 = this.isVip;
        if (c2386e3 != null) {
            C6127e c6127e = c2386e3.f6093e.f31252e;
            String Signature = AbstractC17861e.Signature("FragmentManager:", abstractComponentCallbacksC17875e != 0 ? AbstractC1786e.signatures(new StringBuilder(), abstractComponentCallbacksC17875e.f35068e, ":") : BuildConfig.FLAVOR);
            this.subs = c6127e.metrica(AbstractC10257e.adcel(Signature, "StartActivityForResult"), new C4094e(4), new C6325e(13, this));
            this.crashlytics = c6127e.metrica(AbstractC10257e.adcel(Signature, "StartIntentSenderForResult"), new C4094e(5), new C0444e(this));
            this.firebase = c6127e.metrica(AbstractC10257e.adcel(Signature, "RequestPermissions"), new C4094e(2), new C6594e(13, this));
        }
        C2386e c2386e4 = this.isVip;
        if (c2386e4 != null) {
            c2386e4.f6093e.mopub(this.admob);
        }
        C2386e c2386e5 = this.isVip;
        if (c2386e5 != null) {
            c2386e5.f6093e.f31249e.add(this.subscription);
        }
        C2386e c2386e6 = this.isVip;
        if (c2386e6 != null) {
            c2386e6.f6093e.f31238e.add(this.remoteconfig);
        }
        C2386e c2386e7 = this.isVip;
        if (c2386e7 != null) {
            c2386e7.f6093e.f31242e.add(this.pro);
        }
        C2386e c2386e8 = this.isVip;
        if (c2386e8 == null || abstractComponentCallbacksC17875e != 0) {
            return;
        }
        C0909e c0909e = c2386e8.f6093e.f31240e;
        ((CopyOnWriteArrayList) c0909e.f3322e).add(this.signatures);
        ((Runnable) c0909e.f3323e).run();
    }

    public final void yandex(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (m4045native(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC17875e);
        }
        if (abstractComponentCallbacksC17875e.f35096e) {
            return;
        }
        abstractComponentCallbacksC17875e.f35096e = true;
        if (abstractComponentCallbacksC17875e.f35091e) {
            if (m4045native(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC17875e);
            }
            C11106e c11106e = this.metrica;
            synchronized (((ArrayList) c11106e.f22008e)) {
                ((ArrayList) c11106e.f22008e).remove(abstractComponentCallbacksC17875e);
            }
            abstractComponentCallbacksC17875e.f35091e = false;
            if (m4043extends(abstractComponentCallbacksC17875e)) {
                this.f31421interface = true;
            }
            m4069transient(abstractComponentCallbacksC17875e);
        }
    }
}
