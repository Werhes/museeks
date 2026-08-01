package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14163e implements InterfaceC15377e {
    public final long ad;
    public final int appmetrica;
    public final String billing;
    public final String license;
    public final int metrica;
    public final int purchase;
    public final Uri startapp;
    public final String vip;
    public final boolean yandex;

    public C14163e(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        int i = cursor.getInt(2);
        String string2 = cursor.getString(3);
        int i2 = cursor.getInt(4);
        int i3 = cursor.getInt(5);
        String string3 = cursor.isNull(6) ? null : cursor.getString(6);
        string3 = string3 == null ? BuildConfig.FLAVOR : string3;
        this.ad = j;
        this.vip = string;
        this.metrica = i;
        this.license = string2;
        this.appmetrica = i2;
        this.purchase = i3;
        this.billing = string3;
        this.yandex = true;
        this.startapp = ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14163e)) {
            return false;
        }
        C14163e c14163e = (C14163e) obj;
        return this.ad == c14163e.ad && AbstractC7890e.billing(this.vip, c14163e.vip) && this.metrica == c14163e.metrica && AbstractC7890e.billing(this.license, c14163e.license) && this.appmetrica == c14163e.appmetrica && this.purchase == c14163e.purchase && AbstractC7890e.billing(this.billing, c14163e.billing) && this.yandex == c14163e.yandex;
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getVip() {
        return String.valueOf(this.ad);
    }

    public final int hashCode() {
        long j = this.ad;
        return AbstractC1786e.advert((((AbstractC1786e.advert((AbstractC1786e.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.vip) + this.metrica) * 31, 31, this.license) + this.appmetrica) * 31) + this.purchase) * 31, 31, this.billing) + (this.yandex ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaStorePlaylist(id=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", artistID=");
        sb.append(this.metrica);
        sb.append(", artist=");
        sb.append(this.license);
        sb.append(", numberOfSongs=");
        sb.append(this.appmetrica);
        sb.append(", year=");
        sb.append(this.purchase);
        sb.append(", artworkPath=");
        sb.append(this.billing);
        sb.append(", isAlbum=");
        return AbstractC1786e.isVip(sb, this.yandex, ')');
    }
}
