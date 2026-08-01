package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؐۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0009e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0009e[] f1138e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC0009e f1139e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f1140e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10861e f1141e;

    static {
        EnumC0009e enumC0009e = new EnumC0009e("INTERNAL", 0, 0);
        EnumC0009e enumC0009e2 = new EnumC0009e("PRIVATE", 1, 1);
        EnumC0009e enumC0009e3 = new EnumC0009e("PROTECTED", 2, 2);
        EnumC0009e enumC0009e4 = new EnumC0009e("PUBLIC", 3, 3);
        f1139e = enumC0009e4;
        EnumC0009e[] enumC0009eArr = {enumC0009e, enumC0009e2, enumC0009e3, enumC0009e4, new EnumC0009e("PRIVATE_TO_THIS", 4, 4), new EnumC0009e("LOCAL", 5, 5)};
        f1138e = enumC0009eArr;
        f1140e = new C15937e(enumC0009eArr);
    }

    public EnumC0009e(String str, int i, int i2) {
        this.f1141e = new C10861e(AbstractC1787e.license, i2);
    }

    public static EnumC0009e valueOf(String str) {
        return (EnumC0009e) Enum.valueOf(EnumC0009e.class, str);
    }

    public static EnumC0009e[] values() {
        return (EnumC0009e[]) f1138e.clone();
    }
}
