package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7792e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7792e[] f15792e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC7792e f15793e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC7792e f15794e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eًؚٙ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eًؚٙ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Ltr", 0);
        f15794e = r0;
        ?? r1 = new Enum("Rtl", 1);
        f15793e = r1;
        f15792e = new EnumC7792e[]{r0, r1};
    }

    public static EnumC7792e valueOf(String str) {
        return (EnumC7792e) Enum.valueOf(EnumC7792e.class, str);
    }

    public static EnumC7792e[] values() {
        return (EnumC7792e[]) f15792e.clone();
    }
}
