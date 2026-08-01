package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۥۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC15845e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC15845e[] f31266e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f31267e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f31268e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f31269e;

    static {
        EnumC15845e[] enumC15845eArr = {new EnumC15845e(0, "Popular", "Популярные", "main"), new EnumC15845e(1, "Top", "Топ-песни", "top"), new EnumC15845e(2, "Feat", "Совместные", "featured")};
        f31266e = enumC15845eArr;
        f31267e = new C15937e(enumC15845eArr);
    }

    public EnumC15845e(int i, String str, String str2, String str3) {
        this.f31269e = str2;
        this.f31268e = str3;
    }

    public static EnumC15845e valueOf(String str) {
        return (EnumC15845e) Enum.valueOf(EnumC15845e.class, str);
    }

    public static EnumC15845e[] values() {
        return (EnumC15845e[]) f31266e.clone();
    }
}
