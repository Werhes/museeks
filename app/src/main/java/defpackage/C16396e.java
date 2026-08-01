package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16396e {
    public final C11997e ad;
    public ArrayList license;
    public AbstractC1006e metrica;
    public final int vip;

    public C16396e(C11997e c11997e, int i, C17614e c17614e) {
        this.ad = c11997e;
        this.vip = i;
        this.metrica = c17614e;
    }

    public final void ad(int i, StringBuilder sb) {
        sb.append(AbstractC6507e.admob(i, "  ") + this);
        sb.append('\n');
        ArrayList arrayList = this.license;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C16396e) it.next()).ad(i + 1, sb);
            }
        }
    }

    public final String toString() {
        return AbstractC3149e.billing(this.ad) + ", segment:" + this.vip + " -> " + this.metrica;
    }
}
