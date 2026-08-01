package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8020e {
    public final Collection ad;
    public final C5363e appmetrica;
    public final C5363e billing;
    public final C5363e license;
    public final C5363e metrica;
    public final C5363e purchase;
    public final boolean vip;

    public C8020e(Collection collection, boolean z) {
        this.ad = collection;
        this.vip = z;
        final int i = 0;
        this.metrica = new C5363e(new Function0(this) { // from class: eْۜؑ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C8020e f26808e;

            {
                this.f26808e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        C8020e c8020e = this.f26808e;
                        for (AbstractC16510e abstractC16510e : c8020e.ad) {
                            arrayList.add(c8020e.vip ? abstractC16510e.admob : abstractC16510e.subscription);
                            arrayList2.add(abstractC16510e.yandex);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C11469e) it.next()).billing.metrica == 5) {
                                    if (AbstractC9464e.amazon()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C9139e.f18290e;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C14326e c14326e = AbstractC4475e.ad;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C11469e c11469e = (C11469e) it2.next();
                                if (!c11469e.billing.vip.f33330e.containsKey(c14326e) || c11469e.vip().size() == 1) {
                                    if (c11469e.billing.vip.f33330e.containsKey(c14326e)) {
                                        Iterator it3 = arrayList.iterator();
                                        int i2 = 0;
                                        while (it3.hasNext()) {
                                            C11469e c11469e2 = (C11469e) it3.next();
                                            if (((InterfaceC12438e) arrayList3.get(i2)).mo844while() == EnumC12633e.f25353e) {
                                                AbstractC4265e.yandex("MeteringRepeating should contain a surface", !c11469e2.vip().isEmpty());
                                                linkedHashMap.put(c11469e2.vip().get(0), 1L);
                                            } else if (c11469e2.billing.vip.f33330e.containsKey(c14326e) && !c11469e2.vip().isEmpty()) {
                                                linkedHashMap.put(c11469e2.vip().get(0), c11469e2.billing.vip.subscription(c14326e));
                                            }
                                            i2++;
                                        }
                                    }
                                } else if (AbstractC9464e.amazon()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c11469e.vip().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (AbstractC9464e.smaato("CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        return linkedHashMap;
                    case 1:
                        C8020e c8020e2 = this.f26808e;
                        Collection<AbstractC16510e> collection2 = c8020e2.ad;
                        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(collection2, 10));
                        for (AbstractC16510e abstractC16510e2 : collection2) {
                            arrayList4.add(c8020e2.vip ? abstractC16510e2.admob : abstractC16510e2.subscription);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            C11469e c11469e3 = (C11469e) it4.next();
                            List<AbstractC5113e> vip = c11469e3.vip();
                            C9937e c9937e = c11469e3.billing;
                            for (AbstractC5113e abstractC5113e : vip) {
                                C17015e c17015e = c9937e.vip;
                                C14326e c14326e2 = C11456e.f23056e;
                                if (!c17015e.f33330e.containsKey(c14326e2) || c17015e.subscription(c14326e2) == null) {
                                    linkedHashMap2.put(abstractC5113e, Long.valueOf(AbstractC7890e.billing(abstractC5113e.adcel, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC5113e, c17015e.subscription(c14326e2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C17018e c17018e = new C17018e();
                        C8020e c8020e3 = this.f26808e;
                        for (AbstractC16510e abstractC16510e3 : c8020e3.ad) {
                            c17018e.ad(c8020e3.vip ? abstractC16510e3.admob : abstractC16510e3.subscription);
                        }
                        return c17018e;
                    case 3:
                        C5363e c5363e = this.f26808e.appmetrica;
                        if (((C17018e) c5363e.getValue()).metrica()) {
                            return ((C17018e) c5363e.getValue()).vip();
                        }
                        throw new IllegalStateException("Check failed.");
                    default:
                        C8020e c8020e4 = this.f26808e;
                        C5363e c5363e2 = c8020e4.purchase;
                        if (!((C17018e) c8020e4.appmetrica.getValue()).metrica()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        C1673e c1673e = ((C11469e) c5363e2.getValue()).vip;
                        if (c1673e != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C11469e) c5363e2.getValue()).vip());
                            arrayList5.add(c1673e.ad);
                            List unmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((C11469e) c5363e2.getValue()).vip();
                }
            }
        });
        final int i2 = 1;
        this.license = new C5363e(new Function0(this) { // from class: eْۜؑ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C8020e f26808e;

            {
                this.f26808e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        C8020e c8020e = this.f26808e;
                        for (AbstractC16510e abstractC16510e : c8020e.ad) {
                            arrayList.add(c8020e.vip ? abstractC16510e.admob : abstractC16510e.subscription);
                            arrayList2.add(abstractC16510e.yandex);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C11469e) it.next()).billing.metrica == 5) {
                                    if (AbstractC9464e.amazon()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C9139e.f18290e;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C14326e c14326e = AbstractC4475e.ad;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C11469e c11469e = (C11469e) it2.next();
                                if (!c11469e.billing.vip.f33330e.containsKey(c14326e) || c11469e.vip().size() == 1) {
                                    if (c11469e.billing.vip.f33330e.containsKey(c14326e)) {
                                        Iterator it3 = arrayList.iterator();
                                        int i22 = 0;
                                        while (it3.hasNext()) {
                                            C11469e c11469e2 = (C11469e) it3.next();
                                            if (((InterfaceC12438e) arrayList3.get(i22)).mo844while() == EnumC12633e.f25353e) {
                                                AbstractC4265e.yandex("MeteringRepeating should contain a surface", !c11469e2.vip().isEmpty());
                                                linkedHashMap.put(c11469e2.vip().get(0), 1L);
                                            } else if (c11469e2.billing.vip.f33330e.containsKey(c14326e) && !c11469e2.vip().isEmpty()) {
                                                linkedHashMap.put(c11469e2.vip().get(0), c11469e2.billing.vip.subscription(c14326e));
                                            }
                                            i22++;
                                        }
                                    }
                                } else if (AbstractC9464e.amazon()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c11469e.vip().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (AbstractC9464e.smaato("CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        return linkedHashMap;
                    case 1:
                        C8020e c8020e2 = this.f26808e;
                        Collection<AbstractC16510e> collection2 = c8020e2.ad;
                        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(collection2, 10));
                        for (AbstractC16510e abstractC16510e2 : collection2) {
                            arrayList4.add(c8020e2.vip ? abstractC16510e2.admob : abstractC16510e2.subscription);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            C11469e c11469e3 = (C11469e) it4.next();
                            List<AbstractC5113e> vip = c11469e3.vip();
                            C9937e c9937e = c11469e3.billing;
                            for (AbstractC5113e abstractC5113e : vip) {
                                C17015e c17015e = c9937e.vip;
                                C14326e c14326e2 = C11456e.f23056e;
                                if (!c17015e.f33330e.containsKey(c14326e2) || c17015e.subscription(c14326e2) == null) {
                                    linkedHashMap2.put(abstractC5113e, Long.valueOf(AbstractC7890e.billing(abstractC5113e.adcel, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC5113e, c17015e.subscription(c14326e2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C17018e c17018e = new C17018e();
                        C8020e c8020e3 = this.f26808e;
                        for (AbstractC16510e abstractC16510e3 : c8020e3.ad) {
                            c17018e.ad(c8020e3.vip ? abstractC16510e3.admob : abstractC16510e3.subscription);
                        }
                        return c17018e;
                    case 3:
                        C5363e c5363e = this.f26808e.appmetrica;
                        if (((C17018e) c5363e.getValue()).metrica()) {
                            return ((C17018e) c5363e.getValue()).vip();
                        }
                        throw new IllegalStateException("Check failed.");
                    default:
                        C8020e c8020e4 = this.f26808e;
                        C5363e c5363e2 = c8020e4.purchase;
                        if (!((C17018e) c8020e4.appmetrica.getValue()).metrica()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        C1673e c1673e = ((C11469e) c5363e2.getValue()).vip;
                        if (c1673e != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C11469e) c5363e2.getValue()).vip());
                            arrayList5.add(c1673e.ad);
                            List unmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((C11469e) c5363e2.getValue()).vip();
                }
            }
        });
        final int i3 = 2;
        this.appmetrica = new C5363e(new Function0(this) { // from class: eْۜؑ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C8020e f26808e;

            {
                this.f26808e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        C8020e c8020e = this.f26808e;
                        for (AbstractC16510e abstractC16510e : c8020e.ad) {
                            arrayList.add(c8020e.vip ? abstractC16510e.admob : abstractC16510e.subscription);
                            arrayList2.add(abstractC16510e.yandex);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C11469e) it.next()).billing.metrica == 5) {
                                    if (AbstractC9464e.amazon()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C9139e.f18290e;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C14326e c14326e = AbstractC4475e.ad;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C11469e c11469e = (C11469e) it2.next();
                                if (!c11469e.billing.vip.f33330e.containsKey(c14326e) || c11469e.vip().size() == 1) {
                                    if (c11469e.billing.vip.f33330e.containsKey(c14326e)) {
                                        Iterator it3 = arrayList.iterator();
                                        int i22 = 0;
                                        while (it3.hasNext()) {
                                            C11469e c11469e2 = (C11469e) it3.next();
                                            if (((InterfaceC12438e) arrayList3.get(i22)).mo844while() == EnumC12633e.f25353e) {
                                                AbstractC4265e.yandex("MeteringRepeating should contain a surface", !c11469e2.vip().isEmpty());
                                                linkedHashMap.put(c11469e2.vip().get(0), 1L);
                                            } else if (c11469e2.billing.vip.f33330e.containsKey(c14326e) && !c11469e2.vip().isEmpty()) {
                                                linkedHashMap.put(c11469e2.vip().get(0), c11469e2.billing.vip.subscription(c14326e));
                                            }
                                            i22++;
                                        }
                                    }
                                } else if (AbstractC9464e.amazon()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c11469e.vip().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (AbstractC9464e.smaato("CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        return linkedHashMap;
                    case 1:
                        C8020e c8020e2 = this.f26808e;
                        Collection<AbstractC16510e> collection2 = c8020e2.ad;
                        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(collection2, 10));
                        for (AbstractC16510e abstractC16510e2 : collection2) {
                            arrayList4.add(c8020e2.vip ? abstractC16510e2.admob : abstractC16510e2.subscription);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            C11469e c11469e3 = (C11469e) it4.next();
                            List<AbstractC5113e> vip = c11469e3.vip();
                            C9937e c9937e = c11469e3.billing;
                            for (AbstractC5113e abstractC5113e : vip) {
                                C17015e c17015e = c9937e.vip;
                                C14326e c14326e2 = C11456e.f23056e;
                                if (!c17015e.f33330e.containsKey(c14326e2) || c17015e.subscription(c14326e2) == null) {
                                    linkedHashMap2.put(abstractC5113e, Long.valueOf(AbstractC7890e.billing(abstractC5113e.adcel, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC5113e, c17015e.subscription(c14326e2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C17018e c17018e = new C17018e();
                        C8020e c8020e3 = this.f26808e;
                        for (AbstractC16510e abstractC16510e3 : c8020e3.ad) {
                            c17018e.ad(c8020e3.vip ? abstractC16510e3.admob : abstractC16510e3.subscription);
                        }
                        return c17018e;
                    case 3:
                        C5363e c5363e = this.f26808e.appmetrica;
                        if (((C17018e) c5363e.getValue()).metrica()) {
                            return ((C17018e) c5363e.getValue()).vip();
                        }
                        throw new IllegalStateException("Check failed.");
                    default:
                        C8020e c8020e4 = this.f26808e;
                        C5363e c5363e2 = c8020e4.purchase;
                        if (!((C17018e) c8020e4.appmetrica.getValue()).metrica()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        C1673e c1673e = ((C11469e) c5363e2.getValue()).vip;
                        if (c1673e != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C11469e) c5363e2.getValue()).vip());
                            arrayList5.add(c1673e.ad);
                            List unmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((C11469e) c5363e2.getValue()).vip();
                }
            }
        });
        final int i4 = 3;
        this.purchase = new C5363e(new Function0(this) { // from class: eْۜؑ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C8020e f26808e;

            {
                this.f26808e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        C8020e c8020e = this.f26808e;
                        for (AbstractC16510e abstractC16510e : c8020e.ad) {
                            arrayList.add(c8020e.vip ? abstractC16510e.admob : abstractC16510e.subscription);
                            arrayList2.add(abstractC16510e.yandex);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C11469e) it.next()).billing.metrica == 5) {
                                    if (AbstractC9464e.amazon()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C9139e.f18290e;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C14326e c14326e = AbstractC4475e.ad;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C11469e c11469e = (C11469e) it2.next();
                                if (!c11469e.billing.vip.f33330e.containsKey(c14326e) || c11469e.vip().size() == 1) {
                                    if (c11469e.billing.vip.f33330e.containsKey(c14326e)) {
                                        Iterator it3 = arrayList.iterator();
                                        int i22 = 0;
                                        while (it3.hasNext()) {
                                            C11469e c11469e2 = (C11469e) it3.next();
                                            if (((InterfaceC12438e) arrayList3.get(i22)).mo844while() == EnumC12633e.f25353e) {
                                                AbstractC4265e.yandex("MeteringRepeating should contain a surface", !c11469e2.vip().isEmpty());
                                                linkedHashMap.put(c11469e2.vip().get(0), 1L);
                                            } else if (c11469e2.billing.vip.f33330e.containsKey(c14326e) && !c11469e2.vip().isEmpty()) {
                                                linkedHashMap.put(c11469e2.vip().get(0), c11469e2.billing.vip.subscription(c14326e));
                                            }
                                            i22++;
                                        }
                                    }
                                } else if (AbstractC9464e.amazon()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c11469e.vip().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (AbstractC9464e.smaato("CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        return linkedHashMap;
                    case 1:
                        C8020e c8020e2 = this.f26808e;
                        Collection<AbstractC16510e> collection2 = c8020e2.ad;
                        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(collection2, 10));
                        for (AbstractC16510e abstractC16510e2 : collection2) {
                            arrayList4.add(c8020e2.vip ? abstractC16510e2.admob : abstractC16510e2.subscription);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            C11469e c11469e3 = (C11469e) it4.next();
                            List<AbstractC5113e> vip = c11469e3.vip();
                            C9937e c9937e = c11469e3.billing;
                            for (AbstractC5113e abstractC5113e : vip) {
                                C17015e c17015e = c9937e.vip;
                                C14326e c14326e2 = C11456e.f23056e;
                                if (!c17015e.f33330e.containsKey(c14326e2) || c17015e.subscription(c14326e2) == null) {
                                    linkedHashMap2.put(abstractC5113e, Long.valueOf(AbstractC7890e.billing(abstractC5113e.adcel, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC5113e, c17015e.subscription(c14326e2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C17018e c17018e = new C17018e();
                        C8020e c8020e3 = this.f26808e;
                        for (AbstractC16510e abstractC16510e3 : c8020e3.ad) {
                            c17018e.ad(c8020e3.vip ? abstractC16510e3.admob : abstractC16510e3.subscription);
                        }
                        return c17018e;
                    case 3:
                        C5363e c5363e = this.f26808e.appmetrica;
                        if (((C17018e) c5363e.getValue()).metrica()) {
                            return ((C17018e) c5363e.getValue()).vip();
                        }
                        throw new IllegalStateException("Check failed.");
                    default:
                        C8020e c8020e4 = this.f26808e;
                        C5363e c5363e2 = c8020e4.purchase;
                        if (!((C17018e) c8020e4.appmetrica.getValue()).metrica()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        C1673e c1673e = ((C11469e) c5363e2.getValue()).vip;
                        if (c1673e != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C11469e) c5363e2.getValue()).vip());
                            arrayList5.add(c1673e.ad);
                            List unmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((C11469e) c5363e2.getValue()).vip();
                }
            }
        });
        final int i5 = 4;
        this.billing = new C5363e(new Function0(this) { // from class: eْۜؑ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C8020e f26808e;

            {
                this.f26808e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        C8020e c8020e = this.f26808e;
                        for (AbstractC16510e abstractC16510e : c8020e.ad) {
                            arrayList.add(c8020e.vip ? abstractC16510e.admob : abstractC16510e.subscription);
                            arrayList2.add(abstractC16510e.yandex);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C11469e) it.next()).billing.metrica == 5) {
                                    if (AbstractC9464e.amazon()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    return C9139e.f18290e;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C14326e c14326e = AbstractC4475e.ad;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C11469e c11469e = (C11469e) it2.next();
                                if (!c11469e.billing.vip.f33330e.containsKey(c14326e) || c11469e.vip().size() == 1) {
                                    if (c11469e.billing.vip.f33330e.containsKey(c14326e)) {
                                        Iterator it3 = arrayList.iterator();
                                        int i22 = 0;
                                        while (it3.hasNext()) {
                                            C11469e c11469e2 = (C11469e) it3.next();
                                            if (((InterfaceC12438e) arrayList3.get(i22)).mo844while() == EnumC12633e.f25353e) {
                                                AbstractC4265e.yandex("MeteringRepeating should contain a surface", !c11469e2.vip().isEmpty());
                                                linkedHashMap.put(c11469e2.vip().get(0), 1L);
                                            } else if (c11469e2.billing.vip.f33330e.containsKey(c14326e) && !c11469e2.vip().isEmpty()) {
                                                linkedHashMap.put(c11469e2.vip().get(0), c11469e2.billing.vip.subscription(c14326e));
                                            }
                                            i22++;
                                        }
                                    }
                                } else if (AbstractC9464e.amazon()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + c11469e.vip().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (AbstractC9464e.smaato("CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        return linkedHashMap;
                    case 1:
                        C8020e c8020e2 = this.f26808e;
                        Collection<AbstractC16510e> collection2 = c8020e2.ad;
                        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(collection2, 10));
                        for (AbstractC16510e abstractC16510e2 : collection2) {
                            arrayList4.add(c8020e2.vip ? abstractC16510e2.admob : abstractC16510e2.subscription);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            C11469e c11469e3 = (C11469e) it4.next();
                            List<AbstractC5113e> vip = c11469e3.vip();
                            C9937e c9937e = c11469e3.billing;
                            for (AbstractC5113e abstractC5113e : vip) {
                                C17015e c17015e = c9937e.vip;
                                C14326e c14326e2 = C11456e.f23056e;
                                if (!c17015e.f33330e.containsKey(c14326e2) || c17015e.subscription(c14326e2) == null) {
                                    linkedHashMap2.put(abstractC5113e, Long.valueOf(AbstractC7890e.billing(abstractC5113e.adcel, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(abstractC5113e, c17015e.subscription(c14326e2));
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        C17018e c17018e = new C17018e();
                        C8020e c8020e3 = this.f26808e;
                        for (AbstractC16510e abstractC16510e3 : c8020e3.ad) {
                            c17018e.ad(c8020e3.vip ? abstractC16510e3.admob : abstractC16510e3.subscription);
                        }
                        return c17018e;
                    case 3:
                        C5363e c5363e = this.f26808e.appmetrica;
                        if (((C17018e) c5363e.getValue()).metrica()) {
                            return ((C17018e) c5363e.getValue()).vip();
                        }
                        throw new IllegalStateException("Check failed.");
                    default:
                        C8020e c8020e4 = this.f26808e;
                        C5363e c5363e2 = c8020e4.purchase;
                        if (!((C17018e) c8020e4.appmetrica.getValue()).metrica()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        C1673e c1673e = ((C11469e) c5363e2.getValue()).vip;
                        if (c1673e != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(((C11469e) c5363e2.getValue()).vip());
                            arrayList5.add(c1673e.ad);
                            List unmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((C11469e) c5363e2.getValue()).vip();
                }
            }
        });
    }

    public final void ad(AbstractC5113e abstractC5113e) {
        InterfaceC5083e interfaceC5083e;
        Object obj;
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Unavailable " + abstractC5113e + ", notify SessionConfig invalid");
        }
        Iterator it = this.ad.iterator();
        while (true) {
            interfaceC5083e = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            AbstractC16510e abstractC16510e = (AbstractC16510e) obj;
            if ((this.vip ? abstractC16510e.admob : abstractC16510e.subscription).vip().contains(abstractC5113e)) {
                break;
            }
        }
        AbstractC16510e abstractC16510e2 = (AbstractC16510e) obj;
        C11469e c11469e = abstractC16510e2 != null ? abstractC16510e2.admob : null;
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(AbstractC9743e.ad(AbstractC1497e.ad.f25795e), null, 0, new C18474e(c11469e, interfaceC5083e, 9), 3);
    }
}
