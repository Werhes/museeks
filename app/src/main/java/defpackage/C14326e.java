package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۢۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14326e {
    public final String ad;
    public final Object metrica;
    public final Class vip;

    public C14326e(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.ad = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.vip = cls;
        this.metrica = key;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14326e) {
            C14326e c14326e = (C14326e) obj;
            Object obj3 = c14326e.metrica;
            if (this.ad.equals(c14326e.ad) && this.vip.equals(c14326e.vip) && ((obj2 = this.metrica) != null ? obj2.equals(obj3) : obj3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003;
        Object obj = this.metrica;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.ad + ", valueClass=" + this.vip + ", token=" + this.metrica + "}";
    }
}
