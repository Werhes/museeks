package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11342e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC11342e f22807e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC11342e f22808e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11342e[] f22809e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC11342e f22810e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٌُۢ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٌُۢ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eٌُۢ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IDLE", 0);
        f22810e = r0;
        ?? r1 = new Enum("PLAYING", 1);
        f22808e = r1;
        ?? r3 = new Enum("PAUSED", 2);
        f22807e = r3;
        f22809e = new EnumC11342e[]{r0, r1, r3};
    }

    public static EnumC11342e valueOf(String str) {
        return (EnumC11342e) Enum.valueOf(EnumC11342e.class, str);
    }

    public static EnumC11342e[] values() {
        return (EnumC11342e[]) f22809e.clone();
    }
}
