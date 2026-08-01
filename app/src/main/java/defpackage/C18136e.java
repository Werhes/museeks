package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۦً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18136e {
    public final long ad;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final long metrica;
    public final long purchase;
    public final long vip;
    public final long yandex;

    public C18136e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
        this.purchase = j6;
        this.billing = j7;
        this.yandex = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18136e.class != obj.getClass()) {
            return false;
        }
        C18136e c18136e = (C18136e) obj;
        return C3618e.metrica(this.ad, c18136e.ad) && C3618e.metrica(this.vip, c18136e.vip) && C3618e.metrica(this.metrica, c18136e.metrica) && C3618e.metrica(this.license, c18136e.license) && C3618e.metrica(this.appmetrica, c18136e.appmetrica) && C3618e.metrica(this.purchase, c18136e.purchase) && C3618e.metrica(this.billing, c18136e.billing) && C3618e.metrica(this.yandex, c18136e.yandex);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.yandex) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31), this.purchase, 31), this.billing, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableSurfaceColors(containerColor=");
        AbstractC5087e.m1754try(this.ad, ", contentColor=", sb);
        AbstractC5087e.m1754try(this.vip, ", focusedContainerColor=", sb);
        AbstractC5087e.m1754try(this.metrica, ", focusedContentColor=", sb);
        AbstractC5087e.m1754try(this.license, ", pressedContainerColor=", sb);
        AbstractC5087e.m1754try(this.appmetrica, ", pressedContentColor=", sb);
        AbstractC5087e.m1754try(this.purchase, ", disabledContainerColor=", sb);
        AbstractC5087e.m1754try(this.billing, ", disabledContentColor=", sb);
        sb.append((Object) C3618e.startapp(this.yandex));
        sb.append(')');
        return sb.toString();
    }
}
