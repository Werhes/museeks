package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7300e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC7300e f14899e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC7300e f14900e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC7300e f14901e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC7300e f14902e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC7300e f14903e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7300e[] f14904e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC7300e f14905e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٜٞ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؚٜٞ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؚٜٞ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eؚٜٞ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eؚٜٞ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [eؚٜٞ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ENQUEUED", 0);
        f14903e = r0;
        ?? r1 = new Enum("RUNNING", 1);
        f14901e = r1;
        ?? r3 = new Enum("SUCCEEDED", 2);
        f14900e = r3;
        ?? r5 = new Enum("FAILED", 3);
        f14902e = r5;
        ?? r7 = new Enum("BLOCKED", 4);
        f14899e = r7;
        ?? r9 = new Enum("CANCELLED", 5);
        f14905e = r9;
        f14904e = new EnumC7300e[]{r0, r1, r3, r5, r7, r9};
    }

    public static EnumC7300e valueOf(String str) {
        return (EnumC7300e) Enum.valueOf(EnumC7300e.class, str);
    }

    public static EnumC7300e[] values() {
        return (EnumC7300e[]) f14904e.clone();
    }

    public final boolean ad() {
        return this == f14900e || this == f14902e || this == f14905e;
    }
}
