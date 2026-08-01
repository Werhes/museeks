package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10348e {
    public static final C10348e appmetrica = new C10348e(-1, -1, -1);
    public final int ad;
    public final int license;
    public final int metrica;
    public final int vip;

    public C10348e(int i, int i2, int i3) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = AbstractC9413e.m2572try(i3) ? AbstractC9413e.tapsense(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10348e)) {
            return false;
        }
        C10348e c10348e = (C10348e) obj;
        return this.ad == c10348e.ad && this.vip == c10348e.vip && this.metrica == c10348e.metrica;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.ad), Integer.valueOf(this.vip), Integer.valueOf(this.metrica));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.ad);
        sb.append(", channelCount=");
        sb.append(this.vip);
        sb.append(", encoding=");
        return AbstractC1786e.pro(sb, this.metrica, ']');
    }
}
