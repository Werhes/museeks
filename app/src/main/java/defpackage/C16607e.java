package defpackage;

import android.database.Cursor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16607e implements InterfaceC15377e {
    public final long ad;
    public final C12817e metrica;
    public final String vip;

    public C16607e(Cursor cursor, C12817e c12817e) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        this.ad = j;
        this.vip = string;
        this.metrica = c12817e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16607e)) {
            return false;
        }
        C16607e c16607e = (C16607e) obj;
        return this.ad == c16607e.ad && AbstractC7890e.billing(this.vip, c16607e.vip) && AbstractC7890e.billing(this.metrica, c16607e.metrica);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getAd() {
        return String.valueOf(this.ad);
    }

    public final int hashCode() {
        long j = this.ad;
        return this.metrica.hashCode() + AbstractC1786e.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.vip);
    }

    public final String toString() {
        return "MediaStoreArtist(id=" + this.ad + ", artistName=" + this.vip + ", firstTrack=" + this.metrica + ')';
    }
}
