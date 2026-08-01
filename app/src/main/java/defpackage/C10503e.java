package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10503e {
    public final C9872e ad;
    public final C6714e adcel;
    public boolean amazon;
    public final C12528e appmetrica;
    public final InterfaceC16964e billing;
    public final Set inmobi;
    public final InterfaceC9550e license;
    public final C16911e metrica;
    public final C12309e pro;
    public final C5241e purchase;
    public final C14132e remoteconfig;
    public final C4373e startapp;
    public final C17086e subscription;
    public volatile C11694e tapsense;
    public final C9576e vip;
    public final InterfaceC16964e yandex;
    public final Object mopub = new Object();
    public final LinkedHashSet advert = new LinkedHashSet();
    public final LinkedHashSet smaato = new LinkedHashSet();
    public boolean loadAd = true;
    public boolean Signature = true;
    public final LinkedHashSet admob = new LinkedHashSet();
    public final C17955e signatures = new C17955e(22, this);
    public final ArrayList isVip = new ArrayList();

    public C10503e(C9872e c9872e, C9576e c9576e, C16911e c16911e, InterfaceC9550e interfaceC9550e, C12528e c12528e, Set set, C9255e c9255e, C5241e c5241e, C7850e c7850e, InterfaceC16964e interfaceC16964e, InterfaceC6744e interfaceC6744e, C13825e c13825e, C4373e c4373e, C6714e c6714e, Context context, C0477e c0477e) {
        this.ad = c9872e;
        this.vip = c9576e;
        this.metrica = c16911e;
        this.license = interfaceC9550e;
        this.appmetrica = c12528e;
        this.purchase = c5241e;
        this.billing = c7850e;
        this.yandex = interfaceC16964e;
        this.startapp = c4373e;
        this.adcel = c6714e;
        this.subscription = new C17086e(c13825e, new C2405e(), c0477e);
        this.remoteconfig = new C14132e(context, c13825e.vip, interfaceC6744e, InterfaceC4716e.inmobi);
        this.pro = new C12309e(c13825e.vip);
        Set m3581e = AbstractC13480e.m3581e(set);
        m3581e.add(c9255e);
        this.inmobi = m3581e;
    }

    public final void ad(AbstractC16510e abstractC16510e) {
        synchronized (this.mopub) {
            try {
                if (this.smaato.add(abstractC16510e)) {
                    smaato();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void adcel() {
        synchronized (this.mopub) {
        }
    }

    public final void advert(LinkedHashSet linkedHashSet) {
        purchase();
        List m3575continue = AbstractC13480e.m3575continue(linkedHashSet);
        if (m3575continue.isEmpty()) {
            for (InterfaceC14230e interfaceC14230e : this.inmobi) {
                interfaceC14230e.vip(null);
                interfaceC14230e.reset();
            }
            return;
        }
        if (!this.loadAd) {
            Iterator it = this.inmobi.iterator();
            while (it.hasNext()) {
                ((InterfaceC14230e) it.next()).vip(null);
            }
        }
        C5373e c5373e = new C5373e(this.purchase);
        adcel();
        C8020e c8020e = new C8020e(m3575continue, this.Signature);
        C6714e c6714e = this.adcel;
        C17955e c17955e = this.signatures;
        adcel();
        C17964e c17964e = new C17964e(c17955e, c5373e, c8020e, new C5363e(new Csynchronized(28, c8020e, c6714e, c5373e)));
        if (!this.loadAd) {
            C9576e c9576e = this.vip;
            InterfaceC12424e interfaceC12424e = (InterfaceC12424e) this.yandex.get();
            synchronized (c9576e.vip) {
                try {
                    if (c9576e.purchase) {
                        ArrayList arrayList = c9576e.license;
                        InterfaceC2531e interfaceC2531e = (InterfaceC2531e) AbstractC7205e.purchase(interfaceC12424e, AbstractC3820e.ad.vip(InterfaceC2531e.class));
                        String str = interfaceC2531e != null ? ((C9000e) interfaceC2531e).f18066e : null;
                        C5060e c5060e = str != null ? new C5060e(str) : null;
                        if (c5060e == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(c5060e.ad);
                        c9576e.license();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        C16911e c16911e = this.metrica;
        this.tapsense = new C11694e((C7646e) c16911e.f33137e, (C5084e) c16911e.f33136e, c17964e);
        C6455e yandex = yandex();
        if (yandex == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AbstractC5336e.purchase(yandex.vip.appmetrica, null, 0, new C18474e(null, yandex), 3);
        Iterator it2 = this.inmobi.iterator();
        while (it2.hasNext()) {
            ((InterfaceC14230e) it2.next()).vip(yandex.metrica);
        }
        AbstractC5336e.purchase(yandex.vip.appmetrica, null, 0, new C11441e((InterfaceC5083e) null, yandex, this.amazon), 3);
        amazon(AbstractC13480e.m3578extends(this.advert, this.smaato));
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Notifying " + this.admob + " camera control ready");
        }
        Iterator it3 = this.admob.iterator();
        while (it3.hasNext()) {
            ((AbstractC16510e) it3.next()).pro();
        }
        this.admob.clear();
    }

    public final void amazon(LinkedHashSet linkedHashSet) {
        C6455e yandex = yandex();
        if (yandex != null) {
            yandex.metrica.yandex(linkedHashSet, this.Signature);
            for (InterfaceC14230e interfaceC14230e : this.inmobi) {
                if (interfaceC14230e instanceof InterfaceC11149e) {
                    ((InterfaceC11149e) interfaceC14230e).ad(linkedHashSet);
                }
            }
        }
    }

    public final Object appmetrica(AbstractC7185e abstractC7185e) {
        List m3575continue;
        synchronized (this.mopub) {
            purchase();
            this.subscription.ads();
            m3575continue = AbstractC13480e.m3575continue(this.isVip);
        }
        Object vip = AbstractC12475e.vip(m3575continue, abstractC7185e);
        return vip == EnumC2821e.f6782e ? vip : Unit.INSTANCE;
    }

    public final void billing(List list) {
        synchronized (this.mopub) {
            if (list.isEmpty()) {
                if (AbstractC9464e.admob()) {
                    Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.smaato.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
                if (this.advert.contains(abstractC16510e)) {
                    abstractC16510e.inmobi();
                }
            }
            if (this.advert.removeAll(list)) {
                if (vip(AbstractC13480e.m3578extends(this.advert, this.smaato))) {
                    return;
                }
                if (this.advert.isEmpty()) {
                    this.license.license(false);
                    this.appmetrica.ad(C13664e.f27089e);
                } else {
                    loadAd();
                    this.appmetrica.ad(AbstractC13480e.m3575continue(this.advert));
                }
                advert(this.advert);
            }
            this.admob.removeAll(list);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void license(List list) {
        synchronized (this.mopub) {
            if (list.isEmpty()) {
                if (AbstractC9464e.admob()) {
                    Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.advert.contains((AbstractC16510e) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC16510e) it.next()).isVip();
            }
            if (this.advert.addAll(list) && !vip(AbstractC13480e.m3578extends(this.advert, this.smaato))) {
                loadAd();
                this.appmetrica.ad(AbstractC13480e.m3575continue(this.advert));
                advert(this.advert);
            }
            if (this.loadAd) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC16510e) it2.next()).pro();
                }
            } else {
                this.admob.addAll(arrayList);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void loadAd() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.advert;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC16510e) it.next()).yandex.mo840return()) {
                    z = true;
                    break;
                }
            }
        }
        this.license.license(z);
    }

    public final void metrica() {
        InterfaceC2881e interfaceC2881e = (InterfaceC2881e) this.billing.get();
        C17086e c17086e = this.subscription;
        c17086e.vip(interfaceC2881e, null, null, null);
        c17086e.m4244native();
        license(Collections.singletonList(c17086e));
        ad(c17086e);
    }

    public final boolean mopub(LinkedHashSet linkedHashSet) {
        boolean z;
        C14132e c14132e;
        int i;
        boolean z2;
        boolean ad;
        InterfaceC12438e interfaceC12438e;
        List singletonList;
        if (((Boolean) this.startapp.f9518e.smaato(C4373e.f9508e, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
                C17086e c17086e = this.subscription;
                if (!AbstractC7890e.billing(abstractC16510e, c17086e) && !abstractC16510e.admob.vip().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : this.advert) {
                        if (!AbstractC7890e.billing((AbstractC16510e) obj, c17086e)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                        C17018e c17018e = new C17018e();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c17018e.ad(((AbstractC16510e) it2.next()).admob);
                        }
                        C11469e vip = c17018e.vip();
                        List unmodifiableList = DesugarCollections.unmodifiableList(vip.billing.ad);
                        List vip2 = vip.vip();
                        if (!vip2.isEmpty()) {
                            if (!vip2.isEmpty()) {
                                Iterator it3 = vip2.iterator();
                                while (it3.hasNext()) {
                                    if (!AbstractC7890e.billing(((AbstractC5113e) it3.next()).adcel, MediaCodec.class)) {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            z = true;
                            boolean isEmpty = unmodifiableList.isEmpty();
                            if (z || isEmpty) {
                                if (c17086e.metrica() == null) {
                                    c17086e.m4244native();
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    boolean hasNext = it4.hasNext();
                                    c14132e = this.remoteconfig;
                                    if (!hasNext) {
                                        break;
                                    }
                                    AbstractC16510e abstractC16510e2 = (AbstractC16510e) it4.next();
                                    Size metrica = abstractC16510e2.metrica();
                                    C6884e c6884e = abstractC16510e2.startapp;
                                    if (metrica == null || c6884e == null) {
                                        break;
                                    }
                                    int startapp = startapp();
                                    int advert = abstractC16510e2.yandex.advert();
                                    EnumC2392e mo837native = abstractC16510e2.yandex.mo837native();
                                    c14132e.getClass();
                                    EnumC2392e enumC2392e = C4637e.appmetrica;
                                    C4637e pro = C16728e.pro(advert, metrica, c14132e.smaato(advert), startapp, 2, mo837native);
                                    int advert2 = abstractC16510e2.yandex.advert();
                                    C14677e c14677e = c6884e.metrica;
                                    if (abstractC16510e2 instanceof C14402e) {
                                        C10413e c10413e = (C10413e) ((C14402e) abstractC16510e2).yandex;
                                        c10413e.getClass();
                                        singletonList = (List) AbstractC0054e.loadAd(c10413e, C10413e.f20583e);
                                    } else {
                                        singletonList = Collections.singletonList(abstractC16510e2.yandex.mo844while());
                                    }
                                    List list = singletonList;
                                    InterfaceC12330e interfaceC12330e = c6884e.purchase;
                                    if (interfaceC12330e == null) {
                                        interfaceC12330e = C4069e.license();
                                    }
                                    arrayList2.add(new C6355e(pro, advert2, metrica, c14677e, list, interfaceC12330e, c6884e.license, c6884e.appmetrica, abstractC16510e2.yandex.mo838private(), abstractC16510e2.yandex.mo839protected(metrica)));
                                }
                                if (AbstractC9464e.admob()) {
                                    Log.w("CXCP", "Invalid surface resolution or stream spec is found.");
                                }
                                arrayList2.clear();
                                if (arrayList2.isEmpty()) {
                                    ad = false;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it5 = arrayList.iterator();
                                    while (it5.hasNext()) {
                                        AbstractC16510e abstractC16510e3 = (AbstractC16510e) it5.next();
                                        for (AbstractC5113e abstractC5113e : abstractC16510e3.admob.vip()) {
                                            int startapp2 = startapp();
                                            int advert3 = abstractC16510e3.yandex.advert();
                                            Size size = abstractC5113e.yandex;
                                            EnumC2392e mo837native2 = abstractC16510e3.yandex.mo837native();
                                            c14132e.getClass();
                                            EnumC2392e enumC2392e2 = C4637e.appmetrica;
                                            arrayList3.add(C16728e.pro(advert3, size, c14132e.smaato(advert3), startapp2, 2, mo837native2));
                                        }
                                    }
                                    int startapp3 = startapp();
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        Iterator it6 = this.pro.isPro(arrayList2, Collections.singletonList(c17086e.yandex), Collections.singletonList(0)).entrySet().iterator();
                                        while (it6.hasNext()) {
                                            i = 10;
                                            if (((C14677e) ((Map.Entry) it6.next()).getValue()).vip == 10) {
                                                break;
                                            }
                                        }
                                    }
                                    i = 8;
                                    int i2 = i;
                                    Iterator it7 = arrayList.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            z2 = false;
                                            break;
                                        }
                                        AbstractC16510e abstractC16510e4 = (AbstractC16510e) it7.next();
                                        if (abstractC16510e4 != null && AbstractC13350e.license(abstractC16510e4)) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    int metrica2 = AbstractC13350e.metrica(arrayList, new C13887e(18));
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it8 = arrayList.iterator();
                                    while (it8.hasNext()) {
                                        Object next = it8.next();
                                        if (next instanceof C3373e) {
                                            arrayList4.add(next);
                                        }
                                    }
                                    C3373e c3373e = (C3373e) AbstractC13480e.m3604this(arrayList4);
                                    C18327e c18327e = new C18327e(startapp3, i2, z2, metrica2, (c3373e == null || (interfaceC12438e = c3373e.yandex) == null || interfaceC12438e.advert() != 4101) ? false : true, false, false, false, C6884e.yandex, false);
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList3);
                                    int startapp4 = startapp();
                                    int advert4 = c17086e.yandex.advert();
                                    Size metrica3 = c17086e.metrica();
                                    EnumC2392e mo837native3 = c17086e.yandex.mo837native();
                                    c14132e.getClass();
                                    EnumC2392e enumC2392e3 = C4637e.appmetrica;
                                    arrayList5.add(C16728e.pro(advert4, metrica3, c14132e.smaato(advert4), startapp4, 2, mo837native3));
                                    Unit unit = Unit.INSTANCE;
                                    C13664e c13664e = C13664e.f27089e;
                                    ad = c14132e.ad(c18327e, arrayList5, C9139e.f18290e, c13664e, c13664e);
                                    if (AbstractC9464e.smaato("CXCP")) {
                                        Log.d("CXCP", "Combination of " + arrayList3 + " + " + c17086e + " is supported: " + ad);
                                    }
                                }
                                if (ad) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void purchase() {
        InterfaceC10500e ad;
        C6455e yandex = yandex();
        this.tapsense = null;
        C9576e c9576e = this.vip;
        InterfaceC12424e interfaceC12424e = (InterfaceC12424e) this.yandex.get();
        synchronized (c9576e.vip) {
            try {
                if (c9576e.purchase) {
                    ArrayList arrayList = c9576e.license;
                    InterfaceC2531e interfaceC2531e = (InterfaceC2531e) AbstractC7205e.purchase(interfaceC12424e, AbstractC3820e.ad.vip(InterfaceC2531e.class));
                    String str = interfaceC2531e != null ? ((C9000e) interfaceC2531e).f18066e : null;
                    C5060e c5060e = str != null ? new C5060e(str) : null;
                    if (c5060e == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.remove(c5060e.ad);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yandex != null) {
            if (yandex.yandex.ad()) {
                yandex.metrica.close();
                ad = AbstractC5336e.purchase(yandex.vip.appmetrica, null, 0, new C17071e(null, yandex), 3);
            } else {
                ad = AbstractC16565e.ad(Unit.INSTANCE);
            }
            this.isVip.add(ad);
            ad.mo692else(new C13942e(this, ad, 12));
        }
        adcel();
    }

    public final void smaato() {
        if (this.advert.isEmpty()) {
            return;
        }
        LinkedHashSet m3578extends = AbstractC13480e.m3578extends(this.advert, this.smaato);
        if (((Boolean) this.startapp.f9518e.smaato(C4373e.f9508e, Boolean.TRUE)).booleanValue() && !this.advert.contains(this.subscription) && mopub(m3578extends)) {
            metrica();
            return;
        }
        if (!m3578extends.contains(this.subscription) || mopub(m3578extends)) {
            amazon(m3578extends);
            return;
        }
        C17086e c17086e = this.subscription;
        synchronized (this.mopub) {
            try {
                if (this.smaato.remove(c17086e)) {
                    smaato();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        billing(Collections.singletonList(c17086e));
        c17086e.firebase((InterfaceC2881e) this.billing.get());
    }

    public final int startapp() {
        synchronized (this.mopub) {
            if (this.vip.vip() == 2) {
                return 1;
            }
            Unit unit = Unit.INSTANCE;
            return 0;
        }
    }

    public final String toString() {
        return "UseCaseManager<" + this.adcel + '>';
    }

    public final boolean vip(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.startapp.f9518e.smaato(C4373e.f9508e, Boolean.TRUE)).booleanValue() && !this.advert.contains(this.subscription) && mopub(linkedHashSet)) {
            metrica();
            return true;
        }
        if (!linkedHashSet.contains(this.subscription) || mopub(linkedHashSet)) {
            return false;
        }
        C17086e c17086e = this.subscription;
        synchronized (this.mopub) {
            try {
                if (this.smaato.remove(c17086e)) {
                    smaato();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        billing(Collections.singletonList(c17086e));
        c17086e.firebase((InterfaceC2881e) this.billing.get());
        return true;
    }

    public final C6455e yandex() {
        C11694e c11694e = this.tapsense;
        if (c11694e != null) {
            return (C6455e) c11694e.smaato.get();
        }
        return null;
    }
}
