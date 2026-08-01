package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6335e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6335e[] f13176e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC6335e f13177e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC6335e f13178e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؙُۦ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؙُۦ] */
    static {
        ?? r0 = new Enum("PREVIEW_VIEW", 0);
        f13178e = r0;
        ?? r1 = new Enum("SCREEN_FLASH_VIEW", 1);
        f13177e = r1;
        f13176e = new EnumC6335e[]{r0, r1};
    }

    public static EnumC6335e valueOf(String str) {
        return (EnumC6335e) Enum.valueOf(EnumC6335e.class, str);
    }

    public static EnumC6335e[] values() {
        return (EnumC6335e[]) f13176e.clone();
    }
}
