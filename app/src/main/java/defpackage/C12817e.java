package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۡ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12817e extends AbstractC16049e implements InterfaceC14744e, InterfaceC15377e {
    public final long ad;
    public final long appmetrica;
    public final long billing;
    public final String license;
    public final int metrica;
    public final String purchase;
    public final Uri startapp;
    public final String vip;
    public final String yandex;

    public C12817e(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        int i = cursor.getInt(2);
        String string2 = cursor.getString(3);
        long j2 = cursor.getLong(4);
        String string3 = cursor.getString(5);
        long j3 = cursor.getLong(6);
        String string4 = cursor.getString(7);
        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, cursor.getLong(0));
        this.ad = j;
        this.vip = string;
        this.metrica = i;
        this.license = string2;
        this.appmetrica = j2;
        this.purchase = string3;
        this.billing = j3;
        this.yandex = string4;
        this.startapp = withAppendedId;
    }

    @Override // defpackage.AbstractC16049e
    public final C4721e admob() {
        return new C4721e("ms", String.valueOf(this.ad), this.startapp.toString());
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: advert */
    public final String getMetrica() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC16049e
    public final int amazon() {
        return this.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C12817e.class.equals(obj.getClass()) && this.ad == ((C12817e) obj).ad;
    }

    @Override // defpackage.InterfaceC15377e
    public final String getItemId() {
        return String.valueOf(this.ad);
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    @Override // defpackage.InterfaceC14744e
    public final boolean license() {
        return true;
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: loadAd */
    public final String getAd() {
        return String.valueOf(this.ad);
    }

    @Override // defpackage.AbstractC16049e
    public final String mopub() {
        return this.license;
    }

    @Override // defpackage.AbstractC16049e
    public final String pro() {
        return null;
    }

    @Override // defpackage.AbstractC16049e
    public final String remoteconfig() {
        return "device";
    }

    @Override // defpackage.AbstractC16049e
    public final String smaato() {
        return ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), this.appmetrica).toString();
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: subscription */
    public final String getVip() {
        return this.vip;
    }

    public final String toString() {
        return "MediaStoreTrack(id=" + this.ad + ", title=" + this.vip + ", duration=" + this.metrica + ", album=" + this.license + ", albumID=" + this.appmetrica + ", artist=" + this.purchase + ", artistID=" + this.billing + ", data=" + this.yandex + ", uri=" + this.startapp + ')';
    }
}
