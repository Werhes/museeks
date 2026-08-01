package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC13734e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC13734e[] f27212e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC13734e f27213e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC13734e f27214e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC13734e f27215e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC13734e f27216e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٓؓ٘] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٓؓ٘] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٓؓ٘] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eٓؓ٘] */
    static {
        ?? r0 = new Enum("ALWAYS_OVERRIDE", 0);
        f27216e = r0;
        ?? r1 = new Enum("HIGH_PRIORITY_REQUIRED", 1);
        f27214e = r1;
        ?? r3 = new Enum("REQUIRED", 2);
        f27213e = r3;
        ?? r5 = new Enum("OPTIONAL", 3);
        f27215e = r5;
        f27212e = new EnumC13734e[]{r0, r1, r3, r5};
    }

    public static EnumC13734e valueOf(String str) {
        return (EnumC13734e) Enum.valueOf(EnumC13734e.class, str);
    }

    public static EnumC13734e[] values() {
        return (EnumC13734e[]) f27212e.clone();
    }
}
