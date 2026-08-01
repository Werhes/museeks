package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10320e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10320e[] f20364e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC10320e f20365e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC10320e f20366e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eَٗۧ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eَٗۧ] */
    static {
        ?? r0 = new Enum("BACKWARD", 0);
        f20366e = r0;
        ?? r1 = new Enum("FORWARD", 1);
        f20365e = r1;
        f20364e = new EnumC10320e[]{r0, r1};
    }

    public static EnumC10320e valueOf(String str) {
        return (EnumC10320e) Enum.valueOf(EnumC10320e.class, str);
    }

    public static EnumC10320e[] values() {
        return (EnumC10320e[]) f20364e.clone();
    }
}
