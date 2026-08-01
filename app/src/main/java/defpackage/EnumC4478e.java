package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۤۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4478e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4478e[] f9686e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC4478e f9687e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC4478e f9688e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؖۤۖ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؖۤۖ] */
    static {
        ?? r0 = new Enum("EditableText", 0);
        f9688e = r0;
        ?? r1 = new Enum("StaticText", 1);
        f9687e = r1;
        f9686e = new EnumC4478e[]{r0, r1};
    }

    public static EnumC4478e valueOf(String str) {
        return (EnumC4478e) Enum.valueOf(EnumC4478e.class, str);
    }

    public static EnumC4478e[] values() {
        return (EnumC4478e[]) f9686e.clone();
    }
}
