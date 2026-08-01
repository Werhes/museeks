package defpackage;

import android.graphics.Color;
import ua.itaysonlab.vkx.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC11609e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11609e[] f23319e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC11609e f23320e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f23321e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f23322e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f23323e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f23324e;

    static {
        EnumC11609e enumC11609e = new EnumC11609e("NEW_RELEASE", 0, 0, R.drawable.ic_new_16, 0);
        EnumC11609e enumC11609e2 = new EnumC11609e("NO_CHANGE", 1, 1, R.drawable.ic_minus_16, Color.parseColor("#A3ADB8"));
        EnumC11609e enumC11609e3 = new EnumC11609e("MOVED_UP", 2, 2, R.drawable.ic_arrow_triangle_up_16, Color.parseColor("#4BB34B"));
        EnumC11609e enumC11609e4 = new EnumC11609e("MOVED_DOWN", 3, 3, R.drawable.ic_arrow_triangle_down_16, Color.parseColor("#FF3347"));
        EnumC11609e enumC11609e5 = new EnumC11609e("CROWN", 4, 4, R.drawable.ic_crown_16, Color.parseColor("#FFA000"));
        EnumC11609e enumC11609e6 = new EnumC11609e("UNKNOWN", 5, -1, R.drawable.ic_minus_16, Color.parseColor("#A3ADB8"));
        f23320e = enumC11609e6;
        EnumC11609e[] enumC11609eArr = {enumC11609e, enumC11609e2, enumC11609e3, enumC11609e4, enumC11609e5, enumC11609e6};
        f23319e = enumC11609eArr;
        f23321e = new C15937e(enumC11609eArr);
    }

    public EnumC11609e(String str, int i, int i2, int i3, int i4) {
        this.f23324e = i2;
        this.f23323e = i3;
        this.f23322e = i4;
    }

    public static EnumC11609e valueOf(String str) {
        return (EnumC11609e) Enum.valueOf(EnumC11609e.class, str);
    }

    public static EnumC11609e[] values() {
        return (EnumC11609e[]) f23319e.clone();
    }
}
