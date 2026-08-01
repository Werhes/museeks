package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7259e {
    public final String ad;
    public final int appmetrica;
    public final Set billing;
    public final int license;
    public final Set metrica;
    public final InterfaceC5808e purchase;
    public final Set vip;

    public C7259e(String str, Set set, Set set2, int i, int i2, InterfaceC5808e interfaceC5808e, Set set3) {
        this.ad = str;
        this.vip = DesugarCollections.unmodifiableSet(set);
        this.metrica = DesugarCollections.unmodifiableSet(set2);
        this.license = i;
        this.appmetrica = i2;
        this.purchase = interfaceC5808e;
        this.billing = DesugarCollections.unmodifiableSet(set3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؕٓ, java.lang.Object] */
    public static C9237e ad(C16786e c16786e) {
        C16786e[] c16786eArr = new C16786e[0];
        ?? obj = new Object();
        obj.ad = null;
        HashSet hashSet = new HashSet();
        obj.license = hashSet;
        obj.appmetrica = new HashSet();
        obj.vip = 0;
        obj.metrica = 0;
        obj.purchase = new HashSet();
        hashSet.add(c16786e);
        for (C16786e c16786e2 : c16786eArr) {
            AbstractC11138e.metrica(c16786e2, "Null interface");
        }
        Collections.addAll((HashSet) obj.license, c16786eArr);
        return obj;
    }

    public static C7259e metrica(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C16786e.ad(cls));
        for (Class cls2 : clsArr) {
            AbstractC11138e.metrica(cls2, "Null interface");
            hashSet.add(C16786e.ad(cls2));
        }
        return new C7259e(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0211e(16, obj), hashSet3);
    }

    public static C9237e vip(Class cls) {
        return new C9237e(cls, new Class[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.vip.toArray()) + ">{" + this.license + ", type=" + this.appmetrica + ", deps=" + Arrays.toString(this.metrica.toArray()) + "}";
    }
}
