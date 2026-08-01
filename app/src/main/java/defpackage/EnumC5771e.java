package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٝۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5771e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5771e[] f12201e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC5771e f12202e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC5771e f12203e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC5771e f12204e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC5771e f12205e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؘٝۖ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؘٝۖ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eؘٝۖ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eؘٝۖ] */
    static {
        ?? r0 = new Enum("AwaitingInput", 0);
        f12205e = r0;
        ?? r1 = new Enum("Processing", 1);
        f12203e = r1;
        ?? r3 = new Enum("Success", 2);
        f12202e = r3;
        ?? r5 = new Enum("Error", 3);
        f12204e = r5;
        f12201e = new EnumC5771e[]{r0, r1, r3, r5};
    }

    public static EnumC5771e valueOf(String str) {
        return (EnumC5771e) Enum.valueOf(EnumC5771e.class, str);
    }

    public static EnumC5771e[] values() {
        return (EnumC5771e[]) f12201e.clone();
    }
}
