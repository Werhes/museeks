package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10584e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10584e[] f20883e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC10584e f20884e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC10584e f20885e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC10584e f20886e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC10584e f20887e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eَؚۡ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eَؚۡ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eَؚۡ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eَؚۡ] */
    static {
        ?? r0 = new Enum("Unchanged", 0);
        f20887e = r0;
        ?? r1 = new Enum("Added", 1);
        f20885e = r1;
        ?? r3 = new Enum("Removed", 2);
        f20884e = r3;
        ?? r5 = new Enum("Moved", 3);
        f20886e = r5;
        f20883e = new EnumC10584e[]{r0, r1, r3, r5};
    }

    public static EnumC10584e valueOf(String str) {
        return (EnumC10584e) Enum.valueOf(EnumC10584e.class, str);
    }

    public static EnumC10584e[] values() {
        return (EnumC10584e[]) f20883e.clone();
    }
}
