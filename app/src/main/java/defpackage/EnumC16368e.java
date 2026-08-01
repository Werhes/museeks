package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC16368e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC16368e f32157e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final int[] f32158e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC16368e[] f32159e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f32160e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC16368e f32161e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16368e[] f32162e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC16368e f32163e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f32164e;

    static {
        EnumC16368e enumC16368e = new EnumC16368e("READ", 0, 1);
        f32161e = enumC16368e;
        EnumC16368e enumC16368e2 = new EnumC16368e("WRITE", 1, 4);
        f32157e = enumC16368e2;
        EnumC16368e enumC16368e3 = new EnumC16368e("ACCEPT", 2, 16);
        f32163e = enumC16368e3;
        EnumC16368e[] enumC16368eArr = {enumC16368e, enumC16368e2, enumC16368e3, new EnumC16368e("CONNECT", 3, 8)};
        f32162e = enumC16368eArr;
        C15937e c15937e = new C15937e(enumC16368eArr);
        f32160e = c15937e;
        f32159e = (EnumC16368e[]) AbstractC4533e.mopub(c15937e, new EnumC16368e[0]);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c15937e, 10));
        C1630e c1630e = new C1630e(0, c15937e);
        while (c1630e.hasNext()) {
            arrayList.add(Integer.valueOf(((EnumC16368e) c1630e.next()).f32164e));
        }
        f32158e = AbstractC13480e.m3586for(arrayList);
        f32160e.subs();
    }

    public EnumC16368e(String str, int i, int i2) {
        this.f32164e = i2;
    }

    public static EnumC16368e valueOf(String str) {
        return (EnumC16368e) Enum.valueOf(EnumC16368e.class, str);
    }

    public static EnumC16368e[] values() {
        return (EnumC16368e[]) f32162e.clone();
    }
}
