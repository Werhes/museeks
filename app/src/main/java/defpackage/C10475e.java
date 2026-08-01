package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10475e {
    public final String ad;
    public final List metrica;
    public final boolean vip;

    public C10475e(String str, List list, boolean z) {
        this.ad = str;
        this.vip = z;
        this.metrica = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10475e.class != obj.getClass()) {
            return false;
        }
        C10475e c10475e = (C10475e) obj;
        String str = c10475e.ad;
        if (this.vip != c10475e.vip || !this.metrica.equals(c10475e.metrica)) {
            return false;
        }
        String str2 = this.ad;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.ad;
        return this.metrica.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.vip ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Index{name='");
        sb.append(this.ad);
        sb.append("', unique=");
        sb.append(this.vip);
        sb.append(", columns=");
        return AbstractC1786e.tapsense(sb, this.metrica, '}');
    }
}
