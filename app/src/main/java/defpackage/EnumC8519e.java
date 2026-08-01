package defpackage;

import ealvatag.tag.datatype.DataTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٌؘُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8519e {
    public static final C0315e Companion;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8519e[] f17325e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC8519e f17326e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final Object f17327e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٌؘُ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؑٔۦ] */
    static {
        ?? r0 = new Enum("Sms", 0);
        f17326e = r0;
        f17325e = new EnumC8519e[]{r0, new Enum("Push", 1), new Enum(DataTypes.OBJ_EMAIL, 2), new Enum("CallReset", 3)};
        Companion = new Object();
        f17327e = AbstractC18039e.appmetrica(2, new C8462e(0));
    }

    public static EnumC8519e valueOf(String str) {
        return (EnumC8519e) Enum.valueOf(EnumC8519e.class, str);
    }

    public static EnumC8519e[] values() {
        return (EnumC8519e[]) f17325e.clone();
    }
}
