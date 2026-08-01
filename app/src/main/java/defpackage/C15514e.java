package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15514e {
    public final int ad;
    public C4660e appmetrica;
    public final String vip;
    public final TreeSet metrica = new TreeSet();
    public final ArrayList license = new ArrayList();

    public C15514e(int i, String str, C4660e c4660e) {
        this.ad = i;
        this.vip = str;
        this.appmetrica = c4660e;
    }

    public final boolean ad(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.license;
            if (i >= arrayList.size()) {
                return false;
            }
            C2384e c2384e = (C2384e) arrayList.get(i);
            long j3 = c2384e.ad;
            long j4 = c2384e.vip;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15514e.class == obj.getClass()) {
            C15514e c15514e = (C15514e) obj;
            if (this.ad == c15514e.ad && this.vip.equals(c15514e.vip) && this.metrica.equals(c15514e.metrica) && this.appmetrica.equals(c15514e.appmetrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC1786e.advert(this.ad * 31, 31, this.vip);
    }
}
