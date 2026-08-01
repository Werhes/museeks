package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۨۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6092e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC6092e f12758e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC6092e f12759e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6092e[] f12760e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC6092e f12761e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؘۨۜ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؘۨۜ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؘۨۜ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("START", 0);
        f12761e = r0;
        ?? r1 = new Enum("STOP", 1);
        f12759e = r1;
        ?? r3 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f12758e = r3;
        f12760e = new EnumC6092e[]{r0, r1, r3};
    }

    public static EnumC6092e valueOf(String str) {
        return (EnumC6092e) Enum.valueOf(EnumC6092e.class, str);
    }

    public static EnumC6092e[] values() {
        return (EnumC6092e[]) f12760e.clone();
    }
}
