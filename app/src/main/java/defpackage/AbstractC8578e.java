package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8578e extends C1548e {
    public static final HashSet appmetrica;
    public final Hashtable license;

    static {
        HashSet hashSet = new HashSet();
        appmetrica = hashSet;
        hashSet.add(C7056e.smaato);
    }

    public AbstractC8578e(C7056e c7056e, long j, BigInteger bigInteger) {
        super(c7056e, j, bigInteger);
        this.license = new Hashtable();
    }

    @Override // defpackage.C1548e
    public String ad(String str) {
        return metrica(str, BuildConfig.FLAVOR);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    public final String metrica(String str, String str2) {
        Collection bridge_synchronizedCollection;
        StringBuilder sb = new StringBuilder(super.ad(str));
        sb.append(str2);
        sb.append(str);
        sb.append("  |");
        sb.append(AbstractC12394e.ad);
        ArrayList arrayList = new ArrayList();
        bridge_synchronizedCollection = DesugarCollections.bridge_synchronizedCollection(r3.values(), this.license);
        Iterator it = bridge_synchronizedCollection.iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new Object());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append(((C1548e) it2.next()).ad(str + "  |"));
            sb.append(str);
            sb.append("  |");
            sb.append(AbstractC12394e.ad);
        }
        return sb.toString();
    }

    public final C1548e vip(C7056e c7056e, Class cls) {
        List list = (List) this.license.get(c7056e);
        if (list == null || list.isEmpty()) {
            return null;
        }
        C1548e c1548e = (C1548e) list.get(0);
        if (cls.isAssignableFrom(c1548e.getClass())) {
            return c1548e;
        }
        return null;
    }
}
