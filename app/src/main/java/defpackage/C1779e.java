package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1779e {
    public final String ad;
    public final C6325e vip;

    public C1779e(Set set, C6325e c6325e) {
        this.ad = vip(set);
        this.vip = c6325e;
    }

    public static String vip(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C7934e c7934e = (C7934e) it.next();
            sb.append(c7934e.ad);
            sb.append('/');
            sb.append(c7934e.vip);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String ad() {
        Set unmodifiableSet;
        String str = this.ad;
        C6325e c6325e = this.vip;
        synchronized (((HashSet) c6325e.f13170e)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) c6325e.f13170e);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + vip(c6325e.firebase());
    }
}
