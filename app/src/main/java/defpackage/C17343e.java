package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17343e {
    public final int ad;
    public final int vip;
    public static final C17343e metrica = new C17343e(0, 2);
    public static final Set license = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final C15721e appmetrica = new C15721e(new C17343e(0, 1));

    public C17343e(int i, int i2) {
        this.ad = i;
        if (i2 == 0) {
            throw new NullPointerException("Null streamState");
        }
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17343e)) {
            return false;
        }
        C17343e c17343e = (C17343e) obj;
        return this.ad == c17343e.ad && AbstractC8703e.adcel(this.vip, c17343e.vip);
    }

    public final int hashCode() {
        return (((this.ad ^ 1000003) * 1000003) ^ AbstractC8703e.m2467class(this.vip)) * 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.ad);
        sb.append(", streamState=");
        int i = this.vip;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=null}");
        return sb.toString();
    }
}
