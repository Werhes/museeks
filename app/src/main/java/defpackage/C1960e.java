package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1960e {
    public final File ad;
    public final Object vip;

    public C1960e(File file, List list) {
        this.ad = file;
        this.vip = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1960e)) {
            return false;
        }
        C1960e c1960e = (C1960e) obj;
        return this.ad.equals(c1960e.ad) && this.vip.equals(c1960e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.ad + ", segments=" + this.vip + ')';
    }
}
