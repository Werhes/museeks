package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC16322e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16322e[] f32066e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC16322e f32067e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC16322e f32068e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٖٚۦ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٖٚۦ] */
    static {
        ?? r0 = new Enum("READ_ONLY", 0);
        f32068e = r0;
        ?? r1 = new Enum("MUTABLE", 1);
        f32067e = r1;
        f32066e = new EnumC16322e[]{r0, r1};
    }

    public static EnumC16322e valueOf(String str) {
        return (EnumC16322e) Enum.valueOf(EnumC16322e.class, str);
    }

    public static EnumC16322e[] values() {
        return (EnumC16322e[]) f32066e.clone();
    }
}
