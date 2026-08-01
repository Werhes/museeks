package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3177e {
    public final InterfaceC8346e ad;
    public final int vip;

    public C3177e(InterfaceC8346e interfaceC8346e, int i) {
        this.ad = interfaceC8346e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3177e)) {
            return false;
        }
        C3177e c3177e = (C3177e) obj;
        return AbstractC7890e.billing(this.ad, c3177e.ad) && this.vip == c3177e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingQueueState(queue=");
        sb.append(this.ad);
        sb.append(", index=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
