package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3856e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC3856e f8687e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC3856e f8688e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3856e[] f8689e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC3856e f8690e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؖؔ٘, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؖؔ٘, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؖؔ٘, java.lang.Enum] */
    static {
        ?? r0 = new Enum("StartToEnd", 0);
        f8690e = r0;
        ?? r1 = new Enum("EndToStart", 1);
        f8688e = r1;
        ?? r3 = new Enum("Settled", 2);
        f8687e = r3;
        f8689e = new EnumC3856e[]{r0, r1, r3};
    }

    public static EnumC3856e valueOf(String str) {
        return (EnumC3856e) Enum.valueOf(EnumC3856e.class, str);
    }

    public static EnumC3856e[] values() {
        return (EnumC3856e[]) f8689e.clone();
    }
}
