package defpackage;

/* renamed from: eٕؒۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum C1285e extends EnumC3066e {
    public C1285e() {
        super("ASCII", 0);
    }

    @Override // defpackage.EnumC3066e
    public final byte[] ad(char[] cArr) {
        return AbstractC9276e.PKCS5PasswordToBytes(cArr);
    }

    @Override // defpackage.EnumC3066e
    public final String vip() {
        return "ASCII";
    }
}
