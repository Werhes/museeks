package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7808e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7808e[] f15816e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC7808e f15817e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC7808e f15818e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f15819e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f15820e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f15821e;

    static {
        EnumC7808e enumC7808e = new EnumC7808e(0, R.string.uma_header_mix_type_vk, R.string.uma_header_mix_type_vk_desc, "Vk");
        f15817e = enumC7808e;
        EnumC7808e enumC7808e2 = new EnumC7808e(1, R.string.uma_header_mix_type_uma, R.string.uma_header_mix_type_uma_desc, "Uma");
        f15818e = enumC7808e2;
        EnumC7808e[] enumC7808eArr = {enumC7808e, enumC7808e2};
        f15816e = enumC7808eArr;
        f15819e = new C15937e(enumC7808eArr);
    }

    public EnumC7808e(int i, int i2, int i3, String str) {
        this.f15821e = i2;
        this.f15820e = i3;
    }

    public static EnumC7808e valueOf(String str) {
        return (EnumC7808e) Enum.valueOf(EnumC7808e.class, str);
    }

    public static EnumC7808e[] values() {
        return (EnumC7808e[]) f15816e.clone();
    }
}
