package defpackage;

import org.conscrypt.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6410e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f13288e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6410e[] f13289e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f13290e;

    static {
        EnumC6410e[] enumC6410eArr = {new EnumC6410e("ALBUM", 0, "album"), new EnumC6410e("PLAYLIST", 1, "playlist"), new EnumC6410e("TRACK_MIX", 2, "track_mix"), new EnumC6410e("ARTIST_MIX", 3, "artist_mix"), new EnumC6410e("PLAYLIST_MIX", 4, "_playlist_mix"), new EnumC6410e("UNKNOWN", 5, BuildConfig.FLAVOR)};
        f13289e = enumC6410eArr;
        f13288e = new C15937e(enumC6410eArr);
    }

    public EnumC6410e(String str, int i, String str2) {
        this.f13290e = str2;
    }

    public static EnumC6410e valueOf(String str) {
        return (EnumC6410e) Enum.valueOf(EnumC6410e.class, str);
    }

    public static EnumC6410e[] values() {
        return (EnumC6410e[]) f13289e.clone();
    }
}
