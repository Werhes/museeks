package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1673e {
    public final AbstractC5113e ad;
    public final C14677e appmetrica;
    public final int license;
    public final int metrica;
    public final List vip;

    public C1673e(AbstractC5113e abstractC5113e, List list, int i, int i2, C14677e c14677e) {
        this.ad = abstractC5113e;
        this.vip = list;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = c14677e;
    }

    public static C18464e ad(AbstractC5113e abstractC5113e) {
        C18464e c18464e = new C18464e(2, false);
        if (abstractC5113e == null) {
            throw new NullPointerException("Null surface");
        }
        c18464e.f36191e = abstractC5113e;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        c18464e.f36190e = list;
        c18464e.f36192e = -1;
        c18464e.f36189e = -1;
        c18464e.f36194e = C14677e.license;
        return c18464e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1673e)) {
            return false;
        }
        C1673e c1673e = (C1673e) obj;
        return this.ad.equals(c1673e.ad) && this.vip.equals(c1673e.vip) && this.metrica == c1673e.metrica && this.license == c1673e.license && this.appmetrica.equals(c1673e.appmetrica);
    }

    public final int hashCode() {
        return ((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * (-721379959)) ^ this.metrica) * 1000003) ^ this.license) * 1000003) ^ this.appmetrica.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.ad + ", sharedSurfaces=" + this.vip + ", physicalCameraId=null, mirrorMode=" + this.metrica + ", surfaceGroupId=" + this.license + ", dynamicRange=" + this.appmetrica + "}";
    }
}
