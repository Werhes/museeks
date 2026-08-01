package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3988e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC3988e f8895e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC3988e f8896e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3988e[] f8897e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC3988e f8898e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٌؙؖ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٌؙؖ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٌؙؖ] */
    static {
        ?? r0 = new Enum("Loading", 0);
        f8898e = r0;
        ?? r1 = new Enum("ShowEmptyPage", 1);
        f8896e = r1;
        ?? r3 = new Enum("HideEmptyPage", 2);
        f8895e = r3;
        f8897e = new EnumC3988e[]{r0, r1, r3};
    }

    public static EnumC3988e valueOf(String str) {
        return (EnumC3988e) Enum.valueOf(EnumC3988e.class, str);
    }

    public static EnumC3988e[] values() {
        return (EnumC3988e[]) f8897e.clone();
    }
}
