package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC12498e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC12498e[] f25028e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC12498e f25029e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC12498e f25030e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eّٕٟ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eّٕٟ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("RENDER_OVERRIDE", 0);
        f25030e = r0;
        ?? r1 = new Enum("RENDER_OPEN", 1);
        f25029e = r1;
        f25028e = new EnumC12498e[]{r0, r1, new Enum("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static EnumC12498e valueOf(String str) {
        return (EnumC12498e) Enum.valueOf(EnumC12498e.class, str);
    }

    public static EnumC12498e[] values() {
        return (EnumC12498e[]) f25028e.clone();
    }
}
