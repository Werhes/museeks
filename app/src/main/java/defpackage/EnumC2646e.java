package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2646e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2646e[] f6518e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC2646e f6519e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f6520e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f6521e;

    static {
        EnumC2646e enumC2646e = new EnumC2646e("Playlists", 0, R.string.fake_catalog_playlists);
        f6519e = enumC2646e;
        EnumC2646e[] enumC2646eArr = {enumC2646e, new EnumC2646e("Albums", 1, R.string.fake_catalog_albums)};
        f6518e = enumC2646eArr;
        f6520e = new C15937e(enumC2646eArr);
    }

    public EnumC2646e(String str, int i, int i2) {
        this.f6521e = i2;
    }

    public static EnumC2646e valueOf(String str) {
        return (EnumC2646e) Enum.valueOf(EnumC2646e.class, str);
    }

    public static EnumC2646e[] values() {
        return (EnumC2646e[]) f6518e.clone();
    }
}
