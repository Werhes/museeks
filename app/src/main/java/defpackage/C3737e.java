package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3737e implements Parcelable {
    public static final Parcelable.Creator<C3737e> CREATOR;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final String[] f8320e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2271e f8321e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f8322e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public MediaMetadata f8323e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Bundle f8324e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕ٘ؔ, eؓۨۖ] */
    static {
        ?? c17519e = new C17519e(0);
        f8321e = c17519e;
        c17519e.put("android.media.metadata.TITLE", 1);
        c17519e.put("android.media.metadata.ARTIST", 1);
        c17519e.put("android.media.metadata.DURATION", 0);
        c17519e.put("android.media.metadata.ALBUM", 1);
        c17519e.put("android.media.metadata.AUTHOR", 1);
        c17519e.put("android.media.metadata.WRITER", 1);
        c17519e.put("android.media.metadata.COMPOSER", 1);
        c17519e.put("android.media.metadata.COMPILATION", 1);
        c17519e.put("android.media.metadata.DATE", 1);
        c17519e.put("android.media.metadata.YEAR", 0);
        c17519e.put("android.media.metadata.GENRE", 1);
        c17519e.put("android.media.metadata.TRACK_NUMBER", 0);
        c17519e.put("android.media.metadata.NUM_TRACKS", 0);
        c17519e.put("android.media.metadata.DISC_NUMBER", 0);
        c17519e.put("android.media.metadata.ALBUM_ARTIST", 1);
        c17519e.put("android.media.metadata.ART", 2);
        c17519e.put("android.media.metadata.ART_URI", 1);
        c17519e.put("android.media.metadata.ALBUM_ART", 2);
        c17519e.put("android.media.metadata.ALBUM_ART_URI", 1);
        c17519e.put("android.media.metadata.USER_RATING", 3);
        c17519e.put("android.media.metadata.RATING", 3);
        c17519e.put("android.media.metadata.DISPLAY_TITLE", 1);
        c17519e.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c17519e.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c17519e.put("android.media.metadata.DISPLAY_ICON", 2);
        c17519e.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c17519e.put("android.media.metadata.MEDIA_ID", 1);
        c17519e.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c17519e.put("android.media.metadata.MEDIA_URI", 1);
        c17519e.put("android.media.metadata.ADVERTISEMENT", 0);
        c17519e.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f8320e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new C1928e(22);
    }

    public C3737e(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f8324e = bundle2;
        ClassLoader classLoader = C13391e.class.getClassLoader();
        classLoader.getClass();
        bundle2.setClassLoader(classLoader);
    }

    public C3737e(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(C13391e.class.getClassLoader());
        readBundle.getClass();
        this.f8324e = readBundle;
    }

    public final long ad(String str) {
        return this.f8324e.getLong(str, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Bitmap vip() {
        String[] strArr = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            Bundle bundle = this.f8324e;
            if (bundle.containsKey(str)) {
                try {
                    return (Bitmap) bundle.getParcelable(str);
                } catch (Exception e) {
                    AbstractC2803e.amazon("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8324e);
    }
}
