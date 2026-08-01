package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10982e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10982e[] f21737e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC10982e f21738e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC10982e f21739e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eُٓؐ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eُٓؐ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Gone", 0);
        f21739e = r0;
        ?? r1 = new Enum("NetworkIssue", 1);
        f21738e = r1;
        f21737e = new EnumC10982e[]{r0, r1};
    }

    public static EnumC10982e valueOf(String str) {
        return (EnumC10982e) Enum.valueOf(EnumC10982e.class, str);
    }

    public static EnumC10982e[] values() {
        return (EnumC10982e[]) f21737e.clone();
    }
}
