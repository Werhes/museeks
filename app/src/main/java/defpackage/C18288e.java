package defpackage;

/* renamed from: eٟۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum C18288e extends EnumC3066e {
    public C18288e() {
        super("UTF8", 1);
    }

    @Override // defpackage.EnumC3066e
    public final byte[] ad(char[] cArr) {
        return AbstractC9276e.PKCS5PasswordToUTF8Bytes(cArr);
    }

    @Override // defpackage.EnumC3066e
    public final String vip() {
        return "UTF8";
    }
}
