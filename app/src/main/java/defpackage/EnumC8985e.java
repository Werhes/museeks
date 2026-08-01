package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8985e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8985e[] f18039e = {new Enum("NEED_PASSWORD_AND_VALIDATION", 0), new Enum("NEED_VALIDATION", 1), new Enum("NEED_PASSWORD", 2), new Enum("NEED_REGISTRATION", 3), new Enum("NEED_LOGIN_VALIDATION", 4), new Enum("NEED_PASSKEY", 5), new Enum("NEED_PASSKEY_OTP", 6), new Enum("NEED_WEBAUTHN", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8985e EF5;

    public static EnumC8985e valueOf(String str) {
        return (EnumC8985e) Enum.valueOf(EnumC8985e.class, str);
    }

    public static EnumC8985e[] values() {
        return (EnumC8985e[]) f18039e.clone();
    }
}
