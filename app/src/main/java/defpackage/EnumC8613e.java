package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8613e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC8613e f17427e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC8613e f17428e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8613e[] f17429e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC8613e f17430e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٌَۣ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٌَۣ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٌَۣ] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        f17430e = r0;
        ?? r1 = new Enum("Expanded", 1);
        f17428e = r1;
        ?? r3 = new Enum("PartiallyExpanded", 2);
        f17427e = r3;
        f17429e = new EnumC8613e[]{r0, r1, r3};
    }

    public static EnumC8613e valueOf(String str) {
        return (EnumC8613e) Enum.valueOf(EnumC8613e.class, str);
    }

    public static EnumC8613e[] values() {
        return (EnumC8613e[]) f17429e.clone();
    }
}
