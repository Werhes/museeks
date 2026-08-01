package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0297e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0297e[] f2302e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC0297e f2303e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٕؑٓ] */
    static {
        ?? r0 = new Enum("Visible", 0);
        f2303e = r0;
        f2302e = new EnumC0297e[]{r0, new Enum("Invisible", 1), new Enum("Gone", 2)};
    }

    public static EnumC0297e valueOf(String str) {
        return (EnumC0297e) Enum.valueOf(EnumC0297e.class, str);
    }

    public static EnumC0297e[] values() {
        return (EnumC0297e[]) f2302e.clone();
    }
}
