package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: eٟؕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC3066e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3066e[] f7133e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C18288e f7134e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C1285e f7135e;

    static {
        C1285e c1285e = new C1285e();
        f7135e = c1285e;
        C18288e c18288e = new C18288e();
        f7134e = c18288e;
        f7133e = new EnumC3066e[]{c1285e, c18288e, new EnumC3066e() { // from class: eَ٘ؑ
            @Override // defpackage.EnumC3066e
            public final byte[] ad(char[] cArr) {
                return AbstractC9276e.PKCS12PasswordToBytes(cArr);
            }

            @Override // defpackage.EnumC3066e
            public final String vip() {
                return "PKCS12";
            }
        }};
    }

    public static EnumC3066e valueOf(String str) {
        return (EnumC3066e) Enum.valueOf(EnumC3066e.class, str);
    }

    public static EnumC3066e[] values() {
        return (EnumC3066e[]) f7133e.clone();
    }

    public abstract byte[] ad(char[] cArr);

    public abstract String vip();
}
