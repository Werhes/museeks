package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6556e extends AbstractC10060e implements InterfaceC8897e, Map {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f13485e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C9709e f13486e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C10914e f13487e = new C10914e(5);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f13488e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C9780e f13489e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f13490e;

    public C6556e(C9780e c9780e) {
        this.f13489e = c9780e;
        this.f13486e = c9780e.f19326e;
        this.f13490e = c9780e.f19325e;
    }

    @Override // defpackage.AbstractC10060e
    public final Set ad() {
        return new C0475e(0, this);
    }

    @Override // defpackage.AbstractC10060e
    public final Collection appmetrica() {
        return new C15240e(2, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f13486e = C9709e.appmetrica;
        startapp(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f13486e.license(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f13486e.billing(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // defpackage.AbstractC10060e
    public final int metrica() {
        return this.f13490e;
    }

    @Override // defpackage.InterfaceC8897e
    /* renamed from: purchase, reason: merged with bridge method [inline-methods] */
    public C9780e build() {
        C9709e c9709e = this.f13486e;
        C9780e c9780e = this.f13489e;
        if (c9709e != c9780e.f19326e) {
            this.f13487e = new C10914e(5);
            c9780e = new C9780e(this.f13486e, metrica());
        }
        this.f13489e = c9780e;
        return c9780e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f13488e = null;
        this.f13486e = this.f13486e.advert(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f13488e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, eٌؓۧ] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        C9780e c9780e = null;
        C9780e c9780e2 = map instanceof C9780e ? (C9780e) map : null;
        if (c9780e2 == null) {
            C6556e c6556e = map instanceof C6556e ? (C6556e) map : null;
            if (c6556e != null) {
                c9780e = c6556e.build();
            }
        } else {
            c9780e = c9780e2;
        }
        if (c9780e == null) {
            super.putAll(map);
            return;
        }
        ?? obj = new Object();
        obj.ad = 0;
        int i = this.f13490e;
        this.f13486e = this.f13486e.smaato(c9780e.f19326e, 0, obj, this);
        int i2 = (c9780e.f19325e + i) - obj.ad;
        if (i != i2) {
            startapp(i2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f13488e = null;
        C9709e amazon = this.f13486e.amazon(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (amazon == null) {
            amazon = C9709e.appmetrica;
        }
        this.f13486e = amazon;
        return this.f13488e;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int metrica = metrica();
        C9709e loadAd = this.f13486e.loadAd(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (loadAd == null) {
            loadAd = C9709e.appmetrica;
        }
        this.f13486e = loadAd;
        return metrica != metrica();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final void startapp(int i) {
        this.f13490e = i;
        this.f13485e++;
    }

    @Override // defpackage.AbstractC10060e
    public final Set vip() {
        return new C0475e(1, this);
    }
}
