package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0721e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0721e[] f3014e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC0721e f3015e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC0721e f3016e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC0721e f3017e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC0721e f3018e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٖؑۧ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٖؑۧ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٖؑۧ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eٖؑۧ] */
    static {
        ?? r0 = new Enum("Up", 0);
        f3018e = r0;
        ?? r1 = new Enum("Drag", 1);
        f3016e = r1;
        ?? r3 = new Enum("Timeout", 2);
        f3015e = r3;
        ?? r5 = new Enum("Cancel", 3);
        f3017e = r5;
        f3014e = new EnumC0721e[]{r0, r1, r3, r5};
    }

    public static EnumC0721e valueOf(String str) {
        return (EnumC0721e) Enum.valueOf(EnumC0721e.class, str);
    }

    public static EnumC0721e[] values() {
        return (EnumC0721e[]) f3014e.clone();
    }
}
