package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0604e extends AbstractC10674e {
    public final InterfaceC7227e ad;
    public final LinkedHashMap appmetrica;
    public final Map license;
    public final Object metrica;
    public final List vip;

    public C0604e(String str, InterfaceC7227e interfaceC7227e, InterfaceC7227e[] interfaceC7227eArr, InterfaceC5372e[] interfaceC5372eArr) {
        this.ad = interfaceC7227e;
        this.vip = C13664e.f27089e;
        this.metrica = AbstractC18039e.appmetrica(2, new C5565e(str, this, 7));
        if (interfaceC7227eArr.length != interfaceC5372eArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + interfaceC7227e.mopub() + " should be marked @Serializable");
        }
        Map mopub = AbstractC10064e.mopub(AbstractC1660e.m665catch(interfaceC7227eArr, interfaceC5372eArr));
        this.license = mopub;
        Set<Map.Entry> entrySet = mopub.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            String ad = ((InterfaceC5372e) entry.getValue()).appmetrica().ad();
            Object obj = linkedHashMap.get(ad);
            if (obj == null) {
                linkedHashMap.containsKey(ad);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.ad + "' have the same serial name '" + ad + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(ad, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC10064e.appmetrica(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (InterfaceC5372e) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.appmetrica = linkedHashMap2;
    }

    public C0604e(String str, InterfaceC7227e interfaceC7227e, InterfaceC7227e[] interfaceC7227eArr, InterfaceC5372e[] interfaceC5372eArr, Annotation[] annotationArr) {
        this(str, interfaceC7227e, interfaceC7227eArr, interfaceC5372eArr);
        this.vip = Arrays.asList(annotationArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return (InterfaceC9998e) this.metrica.getValue();
    }

    @Override // defpackage.AbstractC10674e
    public final InterfaceC5372e billing(InterfaceC5757e interfaceC5757e, Object obj) {
        InterfaceC5372e interfaceC5372e;
        InterfaceC5372e interfaceC5372e2 = (InterfaceC5372e) this.license.get(AbstractC3820e.ad.vip(obj.getClass()));
        if (interfaceC5372e2 != null) {
            interfaceC5372e = interfaceC5372e2;
        } else {
            super.billing(interfaceC5757e, obj);
            interfaceC5372e = null;
        }
        if (interfaceC5372e != null) {
            return interfaceC5372e;
        }
        return null;
    }

    @Override // defpackage.AbstractC10674e
    public final InterfaceC5372e purchase(InterfaceC2043e interfaceC2043e, String str) {
        InterfaceC5372e interfaceC5372e = (InterfaceC5372e) this.appmetrica.get(str);
        if (interfaceC5372e != null) {
            return interfaceC5372e;
        }
        super.purchase(interfaceC2043e, str);
        return null;
    }

    @Override // defpackage.AbstractC10674e
    public final InterfaceC7227e yandex() {
        return this.ad;
    }
}
