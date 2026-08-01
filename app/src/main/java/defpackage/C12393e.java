package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12393e extends AbstractC10947e {
    public final C11278e ad;
    public final int vip;

    public C12393e(C11278e c11278e, int i) {
        this.ad = c11278e;
        this.vip = i;
    }

    public static C12393e vip(C11278e c11278e, int i) {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new C12393e(c11278e, i);
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.ad != C11278e.f22660e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12393e)) {
            return false;
        }
        C12393e c12393e = (C12393e) obj;
        return c12393e.ad == this.ad && c12393e.vip == this.vip;
    }

    public final int hashCode() {
        return Objects.hash(C12393e.class, this.ad, Integer.valueOf(this.vip));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb.append(this.ad);
        sb.append("salt_size_bytes: ");
        return AbstractC17861e.smaato(this.vip, ")", sb);
    }
}
