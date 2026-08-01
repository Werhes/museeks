package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17571e implements Parcelable {
    public static final Parcelable.Creator<C17571e> CREATOR = new C1928e(20);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Bitmap f34416e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final CharSequence f34417e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public MediaDescription f34418e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final CharSequence f34419e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Bundle f34420e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final CharSequence f34421e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Uri f34422e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f34423e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Uri f34424e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte[] f34425e;

    public C17571e(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f34423e = str;
        this.f34419e = charSequence;
        this.f34417e = charSequence2;
        this.f34421e = charSequence3;
        this.f34416e = bitmap;
        this.f34424e = uri;
        this.f34420e = bundle;
        this.f34422e = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17571e ad(android.media.MediaDescription r13) {
        /*
            java.lang.String r1 = r13.getMediaId()
            java.lang.CharSequence r2 = r13.getTitle()
            java.lang.CharSequence r3 = r13.getSubtitle()
            java.lang.CharSequence r4 = r13.getDescription()
            android.graphics.Bitmap r5 = r13.getIconBitmap()
            android.net.Uri r6 = r13.getIconUri()
            android.os.Bundle r0 = r13.getExtras()
            android.os.Bundle r0 = defpackage.AbstractC9413e.Signature(r0)
            if (r0 == 0) goto L28
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r0)
            r0 = r7
        L28:
            r7 = 0
            if (r0 == 0) goto L4d
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r9 = r0.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L4b
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r0.containsKey(r10)
            if (r11 == 0) goto L45
            int r11 = r0.size()
            r12 = 2
            if (r11 != r12) goto L45
            goto L4f
        L45:
            r0.remove(r8)
            r0.remove(r10)
        L4b:
            r7 = r0
            goto L4f
        L4d:
            r9 = r7
            goto L4b
        L4f:
            if (r9 == 0) goto L53
        L51:
            r8 = r9
            goto L58
        L53:
            android.net.Uri r9 = r13.getMediaUri()
            goto L51
        L58:
            e٘ؗٔ r0 = new e٘ؗٔ
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.f34418e = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17571e.ad(android.media.MediaDescription):e٘ؗٔ");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f34419e) + ", " + ((Object) this.f34417e) + ", " + ((Object) this.f34421e);
    }

    public final MediaDescription vip() {
        MediaDescription mediaDescription = this.f34418e;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f34423e);
        builder.setTitle(this.f34419e);
        builder.setSubtitle(this.f34417e);
        builder.setDescription(this.f34421e);
        builder.setIconBitmap(this.f34416e);
        builder.setIconUri(this.f34424e);
        builder.setExtras(this.f34420e);
        builder.setMediaUri(this.f34422e);
        MediaDescription build = builder.build();
        this.f34418e = build;
        return build;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        vip().writeToParcel(parcel, i);
    }
}
