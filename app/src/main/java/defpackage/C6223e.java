package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6223e implements Set, InterfaceC7103e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f13021e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11952e f13022e;

    public C6223e(C11952e c11952e, int i) {
        this.f13021e = i;
        this.f13022e = c11952e;
    }

    private final boolean appmetrica(Collection collection) {
        InterfaceC12449e interfaceC12449e;
        int i;
        AbstractC13717e adcel;
        boolean ad;
        Collection<Map.Entry> collection2 = collection;
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(collection2, 10));
        if (appmetrica < 16) {
            appmetrica = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C11952e c11952e = this.f13022e;
        boolean z = false;
        do {
            synchronized (AbstractC15849e.appmetrica) {
                C5315e c5315e = (C5315e) AbstractC12909e.yandex(c11952e.f23935e);
                interfaceC12449e = c5315e.metrica;
                i = c5315e.license;
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC8897e builder = interfaceC12449e.builder();
            Iterator it = c11952e.f23933e.iterator();
            while (((C9673e) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((C9673e) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC7890e.billing(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            InterfaceC12449e build = builder.build();
            if (AbstractC7890e.billing(build, interfaceC12449e)) {
                break;
            }
            C5315e c5315e2 = c11952e.f23935e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                ad = C11952e.ad(c11952e, (C5315e) AbstractC12909e.inmobi(c5315e2, c11952e, adcel), i, build);
            }
            AbstractC12909e.loadAd(adcel, c11952e);
        } while (!ad);
        return z;
    }

    private final boolean billing(Collection collection) {
        InterfaceC12449e interfaceC12449e;
        int i;
        AbstractC13717e adcel;
        boolean ad;
        Set m3582e = AbstractC13480e.m3582e(collection);
        C11952e c11952e = this.f13022e;
        boolean z = false;
        do {
            synchronized (AbstractC15849e.appmetrica) {
                C5315e c5315e = (C5315e) AbstractC12909e.yandex(c11952e.f23935e);
                interfaceC12449e = c5315e.metrica;
                i = c5315e.license;
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC8897e builder = interfaceC12449e.builder();
            Iterator it = c11952e.f23933e.iterator();
            while (((C9673e) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C9673e) it).next();
                if (!m3582e.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            InterfaceC12449e build = builder.build();
            if (AbstractC7890e.billing(build, interfaceC12449e)) {
                break;
            }
            C5315e c5315e2 = c11952e.f23935e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                ad = C11952e.ad(c11952e, (C5315e) AbstractC12909e.inmobi(c5315e2, c11952e, adcel), i, build);
            }
            AbstractC12909e.loadAd(adcel, c11952e);
        } while (!ad);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f13021e) {
            case 0:
                AbstractC15849e.appmetrica();
                throw null;
            case 1:
                AbstractC15849e.appmetrica();
                throw null;
            default:
                AbstractC15849e.appmetrica();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f13021e) {
            case 0:
                AbstractC15849e.appmetrica();
                throw null;
            case 1:
                AbstractC15849e.appmetrica();
                throw null;
            default:
                AbstractC15849e.appmetrica();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f13022e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f13021e) {
            case 0:
                if (!AbstractC9476e.mopub(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC7890e.billing(this.f13022e.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f13022e.containsKey(obj);
            default:
                return this.f13022e.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f13021e) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.f13022e.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.f13022e.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f13022e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f13021e) {
            case 0:
                C11952e c11952e = this.f13022e;
                return new C9673e(c11952e, ((InterfaceC11155e) ((AbstractC15582e) c11952e.metrica().metrica).entrySet()).iterator(), 0);
            case 1:
                C11952e c11952e2 = this.f13022e;
                return new C9673e(c11952e2, ((InterfaceC11155e) ((AbstractC15582e) c11952e2.metrica().metrica).entrySet()).iterator(), 1);
            default:
                C11952e c11952e3 = this.f13022e;
                return new C9673e(c11952e3, ((InterfaceC11155e) ((AbstractC15582e) c11952e3.metrica().metrica).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.f13021e) {
            case 0:
                return AbstractC9476e.mopub(obj) && this.f13022e.remove(((Map.Entry) obj).getKey()) != null;
            case 1:
                return this.f13022e.remove(obj) != null;
            default:
                C11952e c11952e = this.f13022e;
                Iterator it = c11952e.f23933e.iterator();
                while (true) {
                    if (((C9673e) it).hasNext()) {
                        obj2 = ((C9673e) it).next();
                        if (AbstractC7890e.billing(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                c11952e.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        InterfaceC12449e interfaceC12449e;
        int i;
        AbstractC13717e adcel;
        boolean ad;
        boolean z = false;
        switch (this.f13021e) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f13022e.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.f13022e.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
                break;
            default:
                Set m3582e = AbstractC13480e.m3582e(collection);
                C11952e c11952e = this.f13022e;
                do {
                    synchronized (AbstractC15849e.appmetrica) {
                        C5315e c5315e = (C5315e) AbstractC12909e.yandex(c11952e.f23935e);
                        interfaceC12449e = c5315e.metrica;
                        i = c5315e.license;
                        Unit unit = Unit.INSTANCE;
                    }
                    InterfaceC8897e builder = interfaceC12449e.builder();
                    Iterator it3 = c11952e.f23933e.iterator();
                    while (((C9673e) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C9673e) it3).next();
                        if (m3582e.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z = true;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    InterfaceC12449e build = builder.build();
                    if (!AbstractC7890e.billing(build, interfaceC12449e)) {
                        C5315e c5315e2 = c11952e.f23935e;
                        synchronized (AbstractC12909e.metrica) {
                            adcel = AbstractC12909e.adcel();
                            ad = C11952e.ad(c11952e, (C5315e) AbstractC12909e.inmobi(c5315e2, c11952e, adcel), i, build);
                        }
                        AbstractC12909e.loadAd(adcel, c11952e);
                    }
                    return z;
                } while (!ad);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        InterfaceC12449e interfaceC12449e;
        int i;
        AbstractC13717e adcel;
        boolean ad;
        switch (this.f13021e) {
            case 0:
                return appmetrica(collection);
            case 1:
                return billing(collection);
            default:
                Set m3582e = AbstractC13480e.m3582e(collection);
                C11952e c11952e = this.f13022e;
                boolean z = false;
                do {
                    synchronized (AbstractC15849e.appmetrica) {
                        C5315e c5315e = (C5315e) AbstractC12909e.yandex(c11952e.f23935e);
                        interfaceC12449e = c5315e.metrica;
                        i = c5315e.license;
                        Unit unit = Unit.INSTANCE;
                    }
                    InterfaceC8897e builder = interfaceC12449e.builder();
                    Iterator it = c11952e.f23933e.iterator();
                    while (((C9673e) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C9673e) it).next();
                        if (!m3582e.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z = true;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    InterfaceC12449e build = builder.build();
                    if (!AbstractC7890e.billing(build, interfaceC12449e)) {
                        C5315e c5315e2 = c11952e.f23935e;
                        synchronized (AbstractC12909e.metrica) {
                            adcel = AbstractC12909e.adcel();
                            ad = C11952e.ad(c11952e, (C5315e) AbstractC12909e.inmobi(c5315e2, c11952e, adcel), i, build);
                        }
                        AbstractC12909e.loadAd(adcel, c11952e);
                    }
                    return z;
                } while (!ad);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f13022e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4533e.adcel(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4533e.mopub(this, objArr);
    }
}
