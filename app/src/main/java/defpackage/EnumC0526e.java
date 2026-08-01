package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۘۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0526e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0526e[] f2672e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC0526e f2673e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC0526e f2674e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؑۘۦ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eؑۘۦ] */
    static {
        ?? r0 = new Enum("Tabs", 0);
        f2674e = r0;
        Enum r1 = new Enum("Divider", 1);
        ?? r3 = new Enum("Indicator", 2);
        f2673e = r3;
        f2672e = new EnumC0526e[]{r0, r1, r3};
    }

    public static EnumC0526e valueOf(String str) {
        return (EnumC0526e) Enum.valueOf(EnumC0526e.class, str);
    }

    public static EnumC0526e[] values() {
        return (EnumC0526e[]) f2672e.clone();
    }
}
