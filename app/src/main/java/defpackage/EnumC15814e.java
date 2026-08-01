package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۣۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC15814e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC15814e[] f31186e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC15814e f31187e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٕۣۛ] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        f31187e = r0;
        f31186e = new EnumC15814e[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static EnumC15814e valueOf(String str) {
        return (EnumC15814e) Enum.valueOf(EnumC15814e.class, str);
    }

    public static EnumC15814e[] values() {
        return (EnumC15814e[]) f31186e.clone();
    }
}
