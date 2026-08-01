package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11952e implements InterfaceC17335e, Map, InterfaceC6770e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C6223e f23932e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6223e f23933e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C6223e f23934e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C5315e f23935e;

    public C11952e() {
        C9780e c9780e = C9780e.f19324e;
        AbstractC13717e adcel = AbstractC12909e.adcel();
        C5315e c5315e = new C5315e(adcel.billing(), c9780e);
        if (!(adcel instanceof C17137e)) {
            c5315e.vip = new C5315e(1, c9780e);
        }
        this.f23935e = c5315e;
        this.f23933e = new C6223e(this, 0);
        this.f23932e = new C6223e(this, 1);
        this.f23934e = new C6223e(this, 2);
    }

    public static final boolean ad(C11952e c11952e, C5315e c5315e, int i, InterfaceC12449e interfaceC12449e) {
        boolean z;
        synchronized (AbstractC15849e.appmetrica) {
            int i2 = c5315e.license;
            if (i2 == i) {
                c5315e.metrica = interfaceC12449e;
                z = true;
                c5315e.license = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static void vip(C5315e c5315e) {
        C9780e c9780e = C9780e.f19324e;
        synchronized (AbstractC15849e.appmetrica) {
            c5315e.metrica = c9780e;
            c5315e.license++;
        }
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f23935e;
    }

    @Override // defpackage.InterfaceC17335e
    public final /* synthetic */ AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC13717e adcel;
        if (C9780e.f19324e != ((C5315e) AbstractC12909e.yandex(this.f23935e)).metrica) {
            C5315e c5315e = this.f23935e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                vip((C5315e) AbstractC12909e.inmobi(c5315e, this, adcel));
            }
            AbstractC12909e.loadAd(adcel, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return metrica().metrica.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return metrica().metrica.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f23933e;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return metrica().metrica.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((AbstractC15582e) metrica().metrica).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f23932e;
    }

    public final C5315e metrica() {
        return (C5315e) AbstractC12909e.signatures(this.f23935e, this);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        InterfaceC12449e interfaceC12449e;
        int i;
        Object put;
        AbstractC13717e adcel;
        boolean ad;
        do {
            synchronized (AbstractC15849e.appmetrica) {
                C5315e c5315e = (C5315e) AbstractC12909e.yandex(this.f23935e);
                interfaceC12449e = c5315e.metrica;
                i = c5315e.license;
                Unit unit = Unit.INSTANCE;
            }
            C6556e c6556e = (C6556e) interfaceC12449e.builder();
            put = c6556e.put(obj, obj2);
            InterfaceC12449e build = c6556e.build();
            if (AbstractC7890e.billing(build, interfaceC12449e)) {
                break;
            }
            C5315e c5315e2 = this.f23935e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                ad = ad(this, (C5315e) AbstractC12909e.inmobi(c5315e2, this, adcel), i, build);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!ad);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        InterfaceC12449e interfaceC12449e;
        int i;
        AbstractC13717e adcel;
        boolean ad;
        do {
            synchronized (AbstractC15849e.appmetrica) {
                C5315e c5315e = (C5315e) AbstractC12909e.yandex(this.f23935e);
                interfaceC12449e = c5315e.metrica;
                i = c5315e.license;
                Unit unit = Unit.INSTANCE;
            }
            C6556e c6556e = (C6556e) interfaceC12449e.builder();
            c6556e.putAll(map);
            InterfaceC12449e build = c6556e.build();
            if (AbstractC7890e.billing(build, interfaceC12449e)) {
                return;
            }
            C5315e c5315e2 = this.f23935e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                ad = ad(this, (C5315e) AbstractC12909e.inmobi(c5315e2, this, adcel), i, build);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!ad);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        InterfaceC12449e interfaceC12449e;
        int i;
        Object remove;
        AbstractC13717e adcel;
        boolean ad;
        do {
            synchronized (AbstractC15849e.appmetrica) {
                C5315e c5315e = (C5315e) AbstractC12909e.yandex(this.f23935e);
                interfaceC12449e = c5315e.metrica;
                i = c5315e.license;
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC8897e builder = interfaceC12449e.builder();
            remove = builder.remove(obj);
            InterfaceC12449e build = builder.build();
            if (AbstractC7890e.billing(build, interfaceC12449e)) {
                break;
            }
            C5315e c5315e2 = this.f23935e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                ad = ad(this, (C5315e) AbstractC12909e.inmobi(c5315e2, this, adcel), i, build);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!ad);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        AbstractC15582e abstractC15582e = (AbstractC15582e) metrica().metrica;
        abstractC15582e.getClass();
        return ((C9780e) abstractC15582e).f19325e;
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((C5315e) AbstractC12909e.yandex(this.f23935e)).metrica + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f23934e;
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        this.f23935e = (C5315e) abstractC8618e;
    }
}
