package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10899e extends AbstractC1602e {
    public final String ad;
    public final List metrica;
    public final int vip;

    public C10899e(int i, String str, List list) {
        this.ad = str;
        this.vip = i;
        this.metrica = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1602e) {
            C10899e c10899e = (C10899e) ((AbstractC1602e) obj);
            if (this.ad.equals(c10899e.ad) && this.vip == c10899e.vip && this.metrica.equals(c10899e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.ad + ", importance=" + this.vip + ", frames=" + this.metrica + "}";
    }
}
