package defpackage;

import io.realm.kotlin.internal.RealmInitializer;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14918e {
    public final C14694e ad;
    public final LinkedHashMap appmetrica;
    public final C1035e billing;
    public final String license;
    public final String metrica;
    public final C17974e purchase;
    public final C12687e startapp;
    public final C14911e vip;
    public final C1035e yandex;

    public C14918e(String str, String str2, Set set, long j, C1035e c1035e, C1035e c1035e2, long j2, C14694e c14694e, C14911e c14911e) {
        C11565e c11565e;
        this.ad = c14694e;
        this.vip = c14911e;
        if (str.length() == 0) {
            File file = RealmInitializer.ad;
            str = (file == null ? null : file).getAbsolutePath();
        }
        String str3 = AbstractC6766e.ad;
        if (AbstractC6507e.pro(str, "." + str3, false)) {
            String Signature = AbstractC17861e.Signature(".", str3);
            File file2 = RealmInitializer.ad;
            str = AbstractC6507e.remoteconfig(str, Signature, (file2 != null ? file2 : null).getAbsolutePath() + str3);
        }
        File absoluteFile = new File(str).getAbsoluteFile();
        if (!absoluteFile.exists() && !absoluteFile.mkdirs()) {
            throw new IllegalStateException("Directories for Realm file could not be created: ".concat(str));
        }
        if (absoluteFile.isFile()) {
            throw new IllegalArgumentException("Provided directory is a file: ".concat(str));
        }
        this.metrica = new File(str, str2).getAbsolutePath();
        this.license = str2;
        Set set2 = set;
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica < 16 ? 16 : appmetrica);
        for (Object obj : set2) {
            linkedHashMap.put(obj, AbstractC2863e.vip((InterfaceC7227e) obj));
        }
        this.appmetrica = linkedHashMap;
        this.billing = c1035e;
        this.yandex = c1035e2;
        C14694e c14694e2 = this.ad;
        AbstractC8677e abstractC8677e = null;
        if (c14694e2 == null) {
            c11565e = null;
        } else {
            if (!(c14694e2 instanceof C14694e)) {
                throw new C14803e(10);
            }
            c11565e = new C11565e(this, c14694e2, 5);
        }
        Collection values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC3055e) it.next()).appmetrica().metrica);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            Object obj2 = linkedHashMap2.get(str4);
            if (obj2 == null && !linkedHashMap2.containsKey(str4)) {
                obj2 = new Object();
            }
            C3967e c3967e = (C3967e) obj2;
            c3967e.f8852e++;
            linkedHashMap2.put(str4, c3967e);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            AbstractC9476e.license(entry);
            entry.setValue(Integer.valueOf(((C3967e) entry.getValue()).f8852e));
        }
        Map metrica = AbstractC9476e.metrica(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : metrica.entrySet()) {
            if (((Number) entry2.getValue()).intValue() > 1) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        Set keySet = linkedHashMap3.keySet();
        if (!keySet.isEmpty()) {
            throw new IllegalArgumentException(AbstractC17861e.Signature("The schema has declared the following class names multiple times: ", AbstractC13480e.m3608try(keySet, null, null, null, null, 63)));
        }
        this.startapp = new C12687e(this, 1, j2, abstractC8677e, j, c11565e);
        this.purchase = new C17974e(7, this);
    }

    public final NativePointer ad() {
        int i = AbstractC6026e.ad;
        return (NativePointer) this.startapp.invoke(new LongPointerWrapper(realmcJNI.realm_config_new(), false, 2, null));
    }
}
