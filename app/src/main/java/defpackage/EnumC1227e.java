package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؒؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1227e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f3878e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1227e[] f3879e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10861e f3880e;

    static {
        EnumC1227e[] enumC1227eArr = {new EnumC1227e("DECLARATION", 0, 0), new EnumC1227e("FAKE_OVERRIDE", 1, 1), new EnumC1227e("DELEGATION", 2, 2), new EnumC1227e("SYNTHESIZED", 3, 3)};
        f3879e = enumC1227eArr;
        f3878e = new C15937e(enumC1227eArr);
    }

    public EnumC1227e(String str, int i, int i2) {
        this.f3880e = new C10861e(AbstractC1787e.Signature, i2);
    }

    public static EnumC1227e valueOf(String str) {
        return (EnumC1227e) Enum.valueOf(EnumC1227e.class, str);
    }

    public static EnumC1227e[] values() {
        return (EnumC1227e[]) f3879e.clone();
    }
}
