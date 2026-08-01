package defpackage;

import ealvatag.tag.datatype.DataTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؙْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC16168e {
    public static final C0435e Companion;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC16168e f31769e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC16168e f31770e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC16168e f31771e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16168e[] f31772e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC16168e f31773e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final Object f31774e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC16168e f31775e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC16168e f31776e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؙْٖ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [eؑٝؔ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, eؙْٖ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؙْٖ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eؙْٖ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, eؙْٖ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, eؙْٖ] */
    static {
        ?? r0 = new Enum("Sms", 0);
        f31771e = r0;
        ?? r1 = new Enum("Push", 1);
        f31770e = r1;
        ?? r3 = new Enum(DataTypes.OBJ_EMAIL, 2);
        f31773e = r3;
        Enum r5 = new Enum("App", 3);
        ?? r7 = new Enum("LibVerify", 4);
        f31769e = r7;
        ?? r9 = new Enum("CallReset", 5);
        f31776e = r9;
        ?? r11 = new Enum("ReserveCode", 6);
        f31775e = r11;
        f31772e = new EnumC16168e[]{r0, r1, r3, r5, r7, r9, r11};
        Companion = new Object();
        f31774e = AbstractC18039e.appmetrica(2, new C13117e(29));
    }

    public static EnumC16168e valueOf(String str) {
        return (EnumC16168e) Enum.valueOf(EnumC16168e.class, str);
    }

    public static EnumC16168e[] values() {
        return (EnumC16168e[]) f31772e.clone();
    }
}
