package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4345e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4345e[] f9474e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC4345e f9475e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC4345e f9476e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؖۙ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٌؖۙ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("MANUAL_SEEK", 0);
        f9476e = r0;
        ?? r1 = new Enum("HEARTBEAT", 1);
        f9475e = r1;
        f9474e = new EnumC4345e[]{r0, r1};
    }

    public static EnumC4345e valueOf(String str) {
        return (EnumC4345e) Enum.valueOf(EnumC4345e.class, str);
    }

    public static EnumC4345e[] values() {
        return (EnumC4345e[]) f9474e.clone();
    }
}
