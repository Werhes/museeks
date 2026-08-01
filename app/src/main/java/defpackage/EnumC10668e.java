package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10668e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC10668e f21008e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC10668e f21009e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC10668e f21010e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC10668e f21011e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC10668e f21012e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10668e[] f21013e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eَۦٙ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eَۦٙ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eَۦٙ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eَۦٙ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, eَۦٙ] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        f21012e = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        f21010e = r1;
        ?? r3 = new Enum("CREATED", 2);
        f21009e = r3;
        ?? r5 = new Enum("STARTED", 3);
        f21011e = r5;
        ?? r7 = new Enum("RESUMED", 4);
        f21008e = r7;
        f21013e = new EnumC10668e[]{r0, r1, r3, r5, r7};
    }

    public static EnumC10668e valueOf(String str) {
        return (EnumC10668e) Enum.valueOf(EnumC10668e.class, str);
    }

    public static EnumC10668e[] values() {
        return (EnumC10668e[]) f21013e.clone();
    }
}
