package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۛؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9747e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC9747e f19267e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC9747e f19268e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9747e[] f19269e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC9747e f19270e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٍۛؔ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٍۛؔ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٍۛؔ] */
    static {
        ?? r0 = new Enum("Focused", 0);
        f19270e = r0;
        ?? r1 = new Enum("UnfocusedEmpty", 1);
        f19268e = r1;
        ?? r3 = new Enum("UnfocusedNotEmpty", 2);
        f19267e = r3;
        f19269e = new EnumC9747e[]{r0, r1, r3};
    }

    public static EnumC9747e valueOf(String str) {
        return (EnumC9747e) Enum.valueOf(EnumC9747e.class, str);
    }

    public static EnumC9747e[] values() {
        return (EnumC9747e[]) f19269e.clone();
    }
}
